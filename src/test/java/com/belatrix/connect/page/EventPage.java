package com.belatrix.connect.page;

import org.openqa.selenium.By;

import com.belatrix.connect.framework.ParentPage;

import io.appium.java_client.AppiumDriver;

public class EventPage extends ParentPage{

	public EventPage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By TAB_EVENT = By.xpath("//android.widget.TextView[@text='Events']");
	//By EVENT_LABEL = By.xpath("//android.widget.TextView");
	By EVENT_LABEL = By.id("com.belatrixsf.connect:id/event_title");
	By MESSAGE_LABEL = By.xpath("//android.widget.TextView");
	By REGISTER_BUTTOM = By.id("com.belatrixsf.connect:id/btn_register");
	By CONFIRMATION_BUTTOM = By.id("android:id/button1");
	By GOT_IT_BUTTOM = By.id("android:id/button1");
	
	public void goToEventsPage() {
		handlingWaitToElement(TAB_EVENT);
		click(TAB_EVENT);
	}
	public void selectEvent(String event_name) {
		//handlingWaitsToNewElementByText(EVENT_LABEL,event_name);
		//clickElementByTextValue(EVENT_LABEL,event_name);
		handlingWaitToElement(EVENT_LABEL);
		click(EVENT_LABEL);
	}
	
	public void registerToEvent() {
		handlingWaitToElement(REGISTER_BUTTOM);
		click(REGISTER_BUTTOM); 
		handlingWaitToElement(CONFIRMATION_BUTTOM);
		click(CONFIRMATION_BUTTOM);
	}
	
	public boolean messageDisplayed(String message) {
		handlingWaitsToNewElementByText(MESSAGE_LABEL,message);
		return isElementPresentByText(message);
		  
	}
	
}
