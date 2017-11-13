@MyFirstCucumberFeature  @RegressionNBankingAndroid
Feature: Kudo someone on BX Connect 

	Background: 
		Given I am logged in with "rjeronimo" and "appium" to the App 
		And I search "test" on Contacts Page 
				
 	Scenario: I Kudo a filtered Contact 
		Given I enter to Kudo Page 
		And I write "just playing with the app" as a comment 
		And I select action "Select an action" with value "Great speaker" 
		And I select tag "Select a Tag" with value "peoplecare" 
		When I click on Done Kudo
		Then the Kudo is successfully added
		And I go back to the main menu  
		And I log out of the App 	
		Then the log in is displayed
			
#	Scenario: Log out of the App 
#		Given I go back to the main menu 
#		When I log out of the App
#		Then the log in is displayed
  