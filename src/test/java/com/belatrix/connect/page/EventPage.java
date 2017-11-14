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
	
	By CONFIRMATION_LABEL = By.id("android:id/message");
	String REGISTER_EVENT_MESSAGE = "android:id/message";
	String UNREGISTER_EVENT_MESSAGE = "android:id/alertTitle";

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
	
	public void clickConfirmationOut() {
		handlingWaitToElement(CONFIRMATION_BUTTOM);
		click(CONFIRMATION_BUTTOM);
	}
	public boolean messageDisplayed(String message_box) {
		boolean state = false;
		if(message_box.equals("Event registration confirmed")){
			state = isElementPresent(REGISTER_EVENT_MESSAGE);
		}else if (message_box.equals("Event unregistration confirmed")) {
			state = isElementPresent(UNREGISTER_EVENT_MESSAGE);
		}
		    return state;
	}
	
	public boolean messagePresent(String message) {
		handlingWaitsToNewElementByText(MESSAGE_LABEL,message);
		return isElementPresentByTextValue(MESSAGE_LABEL,message);
	}
	
	
}
