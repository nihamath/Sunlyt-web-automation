
Feature: Test the edit profile functionality

  Scenario: Verify that user can see the personal information in the profile dashboard
  
    Given User launch the application
    And Click on the sign in button
    When Enter valid credentials
    Then User redirected home page
   When User click on the profile option from the home page
   Then User redirected to the edit profile screen

