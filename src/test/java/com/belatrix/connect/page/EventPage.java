package com.belatrix.connect.page;

import org.openqa.selenium.By;

import com.belatrix.connect.framework.ParentPage;

import io.appium.java_client.AppiumDriver;

public class EventPage extends ParentPage{

	public EventPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By TAB_EVENT = By.xpath("//android.widget.TextView[@text='EVENTS']");
	By REGISTER_BUTTOM = By.id("com.belatrixsf.connect:id/btn_register");
	By CONFIRMATION_BUTTOM = By.id("android:id/button1");
	By GOT_IT_BUTTOM = By.id("android:id/button1");
	
	public void goToEventsPage(String name) {
		handlingWaitToElement(TAB_EVENT);
		click(TAB_EVENT);
	}
	
	public void registerToEvent() {
		handlingWaitToElement(REGISTER_BUTTOM);
		click(REGISTER_BUTTOM); 
		handlingWaitToElement(CONFIRMATION_BUTTOM);
		click(CONFIRMATION_BUTTOM);
	}
	
	public boolean messageDisplayed(String message) {
		return true;
	}
	
}
