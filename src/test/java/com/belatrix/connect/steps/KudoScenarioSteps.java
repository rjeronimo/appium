package com.belatrix.connect.steps;
 
import org.testng.Assert;

import com.belatrix.connect.framework.ParentScenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When; 

public class KudoScenarioSteps extends ParentScenario{
	
	@Given("^I enter to Kudo Page$")
    public void I_enter_to_Kudo_Page() {
		kudoPage.selectKudo();
	}
	
	@When("^I write \"([^\"]*)\" as a comment$")
    public void I_write_comment(String comment) {
	    kudoPage.selectCategory("Write a comment");
	    kudoPage.writeComment(comment);
	}  
	         
	@When("^I select action \"([^\"]*)\" with value \"([^\"]*)\"$")
    public void I_select_Action_value(String category, String value) {
	    kudoPage.selectCategory(category);
	    kudoPage.selectAction(value);
	}  
	
	@When("^I select tag \"([^\"]*)\" with value \"([^\"]*)\"$")
    public void I_select_tag_value(String category, String value) {
	    kudoPage.selectCategory(category);
	    kudoPage.selectTag(value);
	}
	
	@Then("^the Kudo is successfully added$")
	 public void the_Kudo_is_successfully_added() {
		Assert.assertEquals(kudoPage.successfulMessage(), true);
	} 

	@Then("^I click on Done Kudo$")
	 public void I_click_on_Done_Kudo() {
		kudoPage.clickDone();
	} 
	
}
