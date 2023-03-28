
Feature: Test the comment functionality
  
  Scenario: Verify that user can add a new comment
  	Given User launch the application
    And Search the campaign "api test campaign 222"
    When User click on the campaign name in the search result
    Then User redirected to the campaign details page
    When User enter the comment
    Then User redirected to the login page
    And  Enter valid credentials
    When User enter the comment
     
    Scenario: Verify that user can edit a new comment
  	Given User launch the application
  	And Click on the sign in button
    When Enter valid credentials
    Then User redirected home page
    And Search the campaign "api test campaign 222"
    When User click on the campaign name in the search result
    Then User redirected to the campaign details page
    And User click on the more button
    Then Select the edit comment option
    And User edit the comment
    
    
    Scenario: Verify that user can delete a comment
  	Given User launch the application
  	And Click on the sign in button
    When Enter valid credentials
    Then User redirected home page
    And Search the campaign "api test campaign 222"
    When User click on the campaign name in the search result
    Then User redirected to the campaign details page
    And User click on the more button
    Then Select the delete comment option
    And Confirm the delete functionality
    Then Delete alert is displayed in the screen
    
  