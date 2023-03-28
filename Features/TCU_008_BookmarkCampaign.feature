
Feature: Test the bookmark functionality of a campaign

  Scenario: Verify that a registered user can boomark a campaign
 		Given User launch the application
    And Search the campaign "API-Testing-Campaign"
    When User click on the campaign name in the search result
    Then User redirected to the campaign details page
    And Click on the bookmark button of the campaign
    Then User redirected to the login page
    And  Enter valid credentials
    And Click on the bookmark button of the campaign
    Then Bookmark button showing in the highlighted format
    And Click on the bookmark button of the campaign
    Then Bookmark button showing in the non higlighted format