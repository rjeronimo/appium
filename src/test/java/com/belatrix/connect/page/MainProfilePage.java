package com.belatrix.connect.page;

import org.openqa.selenium.By;

import com.belatrix.connect.framework.ParentPage;
import io.appium.java_client.AppiumDriver;

public class MainProfilePage extends ParentPage {
	   public MainProfilePage(AppiumDriver driver){
	       super(driver);
	   }

	   By LBL_NAME = By.id("com.belatrixsf.connect:id/profile_name");
	   By LBL_EMAIL = By.id("com.belatrixsf.connect:id/profile_email");
	   By LBL_IDSKYPE = By.id("com.belatrixsf.connect:id/skype_id");
	   By LBL_LOCATION = By.id("com.belatrixsf.connect:id/location_name");

	   public String getName()
	   {
	       handlingWaitToElement(LBL_NAME);
	       return getElementValue(LBL_NAME);
	   }

	   public String getEmail()
	   {
	       handlingWaitToElement(LBL_EMAIL);
	       return getElementValue(LBL_EMAIL);
	   }

	   public String getSkypeId()
	   {
	       handlingWaitToElement(LBL_IDSKYPE);
	       return getElementValue(LBL_IDSKYPE);
	   }

	   public String getLocation()
	   {
	       handlingWaitToElement(LBL_LOCATION);
	       return getElementValue(LBL_LOCATION);
	   }
	}

