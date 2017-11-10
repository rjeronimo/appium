@MyFirstCucumberFeature @RegressionNBankingAndroid
Feature: Register Event

   Scenario: Register to Halloween Event
     Given I am logged in with "rjeronimo" and "appium" to the App 
     When I register to "x" event
     Then the message "xx" should be displayed
   
    Scenario: UnRegister to Halloween Event
     Given I am logged in with "rjeronimo" and "appium" to the App 
     When I unregister to "x" event
     Then the message "xx" should be displayed  
     And I log out of the App