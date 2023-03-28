
Feature: Test the suggest campaign functionality

  Scenario: Verify that user can suggest a new campaign
  	Given User launch the application
    And Search the campaign "api test campaign 222"
    When User click on the campaign name in the search result
    Then User redirected to the campaign details page
    When User click on the Suggest Campaign button
    Then User redirected to the login page
    And  Enter valid credentials
    When User click on the Suggest Campaign button
    Then Suggest campaign popup is displayed
    And User enter the mandatory feilds
    Then Success toast message is displayed with message "Created campaign suggestion successfully"
