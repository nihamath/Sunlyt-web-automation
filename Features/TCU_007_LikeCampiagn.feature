
Feature: Test the like functionality of a campaign

  Scenario: Verify that a registered user can like a campaign
 		Given User launch the application
    And Search the campaign "API-Testing-Campaign"
    When User click on the campaign name in the search result
    Then User redirected to the campaign details page
    And Click on the like button of the campaign
    Then User redirected to the login page
    And  Enter valid credentials
    And Click on the like button of the campaign
    Then Like count is incrimented
    
   Scenario: Verify that a registered user can like a campaign
 		Given User launch the application
    And Search the campaign "API-Testing-Campaign"
    When User click on the campaign name in the search result
    Then User redirected to the campaign details page
    And Click on the dislike button of the campaign
    Then User redirected to the login page
    And  Enter valid credentials
    And Click on the dislike button of the campaign
    Then Like count is decrimented
    

  