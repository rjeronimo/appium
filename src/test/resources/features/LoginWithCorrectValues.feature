Feature: Login with correct values
  #Scenario 1
   Scenario Outline: Login with User and Password
    Given I open the APP
    When I enter my "<username>" and "<password>"
    And I click in sigin button
    Then I see the profile screen
    Then I see the complete name "<completeName>" in the profile screen
    And I see the email "<email>" in the profile screen
    And I see the skypeId "<skypeId>" in the profile screen
    And I see the location "<location>" in the profile screen

    Examples:
    | username              | password      | completeName   | email                    | skypeId   | location |
    | rjeronimo             | appium        | Rut Jeronimo   | rjeronimo@belatrixsf.com | dd        | Lima     |