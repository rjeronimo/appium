package com.belatrix.connect.page;

import org.openqa.selenium.By;

import com.belatrix.connect.framework.ParentPage;

import io.appium.java_client.AppiumDriver;

public class KudoPage extends ParentPage{

 	public KudoPage(AppiumDriver driver){
        super(driver);
    }
	
	By KUDO_BUTTOM = By.id("com.belatrixsf.connect:id/action_recommend");
    By DONE_KUDO = By.id("com.belatrixsf.connect:id/action_done");
	By COMMENT_FIELD = By.id("com.belatrixsf.connect:id/comment");
	By SELECT_LBL_ACTION = By.xpath("//android.widget.TextView");
    By SELECT_LBL_TAG = By.xpath("//android.widget.TextView[@index='0']");	
    String SUCCESSFUL_MESSAGE = "com.belatrixsf.connect:id/bottom_navigation_item_icon";
	
	public void selectKudo() {
		click(KUDO_BUTTOM);
	}
	
	public void selectCategory(String category_name) {
		selectTextViewByText(category_name);
	}
	
	public boolean successfulMessage() {
		return isElementPresent(SUCCESSFUL_MESSAGE);
	}
	
	public void writeComment(String comment) {
	    handlingWaitToElement(COMMENT_FIELD);
	    sendKeys(COMMENT_FIELD,comment);
	    clickDone();
	}
	
	public void clickDone() {
		click(DONE_KUDO);
	}
	
	public void selectAction(String category_value) {
		handlingWaitsToNewElementByText(SELECT_LBL_ACTION,category_value);
		clickElementByTextValue(SELECT_LBL_ACTION,category_value);
	}
	
	public void selectTag(String tag_value) {
		handlingWaitsToNewElementByText(SELECT_LBL_TAG,tag_value);
		clickElementByTextValue(SELECT_LBL_TAG,tag_value);
	}
}
