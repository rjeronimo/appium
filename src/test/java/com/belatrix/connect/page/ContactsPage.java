package com.belatrix.connect.page;

import org.openqa.selenium.By;

import com.belatrix.connect.framework.ParentPage;

import io.appium.java_client.AppiumDriver;

public class ContactsPage extends ParentPage{

	public ContactsPage(AppiumDriver driver){
	       super(driver);
	   }
	//By CONTACT_TAB = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[3]");
	By CONTACT_TAB = By.xpath("//android.widget.TextView[@text='Contacts']");
	By SEARCH_CONTACT = By.id("com.belatrixsf.connect:id/action_search");
	By CONTACT_SEARCH = By.id("com.belatrixsf.connect:id/contact_full_name");
	By CONTACT_FILTER_NAME = By.id("android:id/content");
	//By CONTACT_FILTER_NAME = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.TextView");
	
	public void goToContactPage(String name) {
		handlingWaitToElement(CONTACT_TAB);
		click(CONTACT_TAB);
		//getElementOnPage(name);
	}
	
	public void select_search_contact(String name) {
		handlingWaitToElement(SEARCH_CONTACT);
		click(SEARCH_CONTACT); 
		handlingWaitToElement(CONTACT_FILTER_NAME);
		sendKeys(CONTACT_FILTER_NAME, name);
		handlingWaitToElement(CONTACT_SEARCH);
		click(CONTACT_SEARCH);
	}
}
