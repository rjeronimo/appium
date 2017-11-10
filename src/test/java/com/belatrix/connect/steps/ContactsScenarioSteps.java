package com.belatrix.connect.steps;

import com.belatrix.connect.framework.ParentScenario; 

import cucumber.api.java.en.When;

public class ContactsScenarioSteps extends ParentScenario {

	@When("^I am logged in with \"([^\"]*)\" and \"([^\"]*)\" to the App$")
    public void I_logged_In_with(String username, String password) {
		startAndroid();
        //loginPage.takingSessionActivity();
        loginPage.loginOnApp(username,password);
        loginPage.clickSingIn();
        newsPage.clickSkipButtom();
	}
	@When("^I search \"([^\"]*)\" on Contacts Page$")
    public void I_search_on_Contact_Page(String name) {
		contactPage.goToContactPage("CONTACTS");
		contactPage.select_search_contact(name);
		 
	}
	
}
