package com.belatrix.connect.steps;

import org.testng.Assert;

import com.belatrix.connect.framework.ParentScenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MenuScenarioSteps extends ParentScenario{

	@Given("^I go back to the main menu$") 
	public void I_go_back_to_the_main_menu() {
		menuPage.clickOnAndroidBackButton();
		menuPage.clickOnAndroidBackButton();
	}
	
	@When("^I log out of the App$")
	public void log_out_of_the_App() {
		menuPage.selectMenu();
		menuPage.selectLogOut();
		menuPage.confirmLogOut();
	}
	@Then("^the log in is displayed$")
	public void log_in_displayed() {
		Assert.assertEquals(loginPage.isLogInButtonPresent(), true);
	} 
}
