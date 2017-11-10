@MyFirstCucumberFeature  @RegressionNBankingAndroid
Feature: Register Event

   Scenario: Register to Halloween Event
     Given I am logged in with "rjeronimo" and "appium" to the App 
     When I register to "Celebremos Halloween y el día de la Canción Criolla" event
     Then the message "Event registration confirmed" should be displayed
   
    Scenario: UnRegister to Halloween Event
     Given I am logged in with "rjeronimo" and "appium" to the App 
     When I unregister to "Celebremos Halloween y el día de la Canción Criolla" event
     Then the message "Event unregistration confirmed" should be displayed  
     And I log out of the App