package com.belatrix.connect.page;

import org.openqa.selenium.By;

import com.belatrix.connect.framework.ParentPage;

import io.appium.java_client.AppiumDriver;

public class MenuPage extends ParentPage{
 
	public MenuPage(AppiumDriver driver){
        super(driver);
    }
	                    
	By MENU = By.xpath("//android.widget.ImageButton[@content-desc=\"Open\"]");
	By LOG_OUT = By.xpath("(//android.widget.ImageButton[@content-desc=\"Logout\"]"); 
			//By.id("com.belatrixsf.connect:id/bottom_navigation_container");
    By MESSAGE_YES = By.id("android:id/button1");
    
    public void selectMenu() {
    	handlingWaitToElement(MENU);
    	click(MENU);
    }
    
    public void selectLogOut() {
    	handlingWaitToElement(LOG_OUT);
    	click(LOG_OUT);
    }
    
    public void confirmLogOut() {
    	handlingWaitToElement(MESSAGE_YES);
    	click(MESSAGE_YES);
    }
    
    public void clickOnAndroidBackButton() {
    	clickAndroidBackButton();
    }
    
}
