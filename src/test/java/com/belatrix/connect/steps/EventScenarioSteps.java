package com.belatrix.connect.steps;

import static org.testng.Assert.assertEquals;

import com.belatrix.connect.framework.ParentScenario;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EventScenarioSteps extends ParentScenario {

	@When("^I register to \"([^\"]*)\" event$") 
	public void I_register_to_Event(String event_name) {
	     eventPage.goToEventsPage();
	     eventPage.selectEvent(event_name);
	     eventPage.registerToEvent();
	}  

	@When("^I unregister to \"([^\"]*)\" event$") 
	public void I_unregister_to_Event(String event_name) {
		 eventPage.goToEventsPage();
	     eventPage.selectEvent(event_name);
	     eventPage.registerToEvent();
	}  
	
	@Then("^the message \"([^\"]*)\" should be displayed$") 
	public void the_confirmation_message(String event_name) {
	    assertEquals(eventPage.messageDisplayed(event_name), true); 
	    eventPage.clickConfirmationOut();
	}
	
	@When("^I log out to Event Page$") 
	public void i_log_outto_EventPage() {
		menuPage.clickOnAndroidBackButton();
		menuPage.selectMenu();
		menuPage.selectLogOut();
		menuPage.confirmLogOut();
	}  

	
} 
