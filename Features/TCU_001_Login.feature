
Feature: Test the login functionality

 
  Scenario: Verify login functionality with valid credetials
    Given User launch the application
    And Click on the sign in button
    When Enter valid credentials
   Then User redirected home page
   
   Scenario: Verify login functionality with invalid credetials
    Given User launch the application
    And Click on the sign in button
    When Enter invalid credentials
   Then User get error message
   
 
 

  