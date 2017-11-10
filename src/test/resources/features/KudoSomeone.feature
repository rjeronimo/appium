@MyFirstCucumberFeature  @RegressionNBankingAndroid
Feature: Kudo someone on BX Connect 

	Background: 
		Given I am logged in with "rjeronimo" and "appium" to the App 
		And I search "test" on Contacts Page 
		
	#Scenario: I filter a Contact Successfully 
#		Then I see the complete name "Test User" in the profile screen 
		#And I see the email "demo@belatrixsf.com" in the profile screen 
		
 	Scenario: I Kudo a filtered Contact 
		Given I enter to Kudo Page 
		And I write "just playing with the app" as a comment 
		And I select action "Select an action" with value "Great speaker" 
		And I select tag "Select a Tag" with value "peoplecare" 
		When I click on Done Kudo
		Then the Kudo is successfully added  	
			
	Scenario: Log out of the App 
		Given I go back to the main menu 
		When I log out of the App
		Then the log in is displayed
  