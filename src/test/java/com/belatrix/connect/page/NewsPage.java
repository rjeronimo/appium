package com.belatrix.connect.page;

import org.openqa.selenium.By;

import com.belatrix.connect.framework.ParentPage;

import io.appium.java_client.AppiumDriver;

public class NewsPage extends ParentPage{

	public NewsPage(AppiumDriver driver){
        super(driver);
    }
	
	By SKIP_BUTTOM = By.id("com.belatrixsf.connect:id/tvSkip");
	
	public void clickSkipButtom (){
		handlingWaitToElement(SKIP_BUTTOM);
        click(SKIP_BUTTOM);
    }
}
