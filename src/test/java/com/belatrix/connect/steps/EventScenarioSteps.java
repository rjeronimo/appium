package com.belatrix.connect.steps;

import com.belatrix.connect.framework.ParentScenario;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EventScenarioSteps extends ParentScenario {
	
	@When("^I register to \"([^\"]*)\" event$") 
	public void I_register_to_Event(String event_name) {
	     
	}  

	@When("^I unregister to \"([^\"]*)\" event$") 
	public void I_unregister_to_Event(String event_name) {
	    
	}  
	
	@Then("^the message \"([^\"]*)\" should be displayed$") 
	public void the_confirmation_message(String event_name) {
	    
	}   
}
