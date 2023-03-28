
Feature: Test the top campaign functionality

  Scenario: Verify that the three top campaigns are displayed in the home page and the user should redirected to the top camapaign listing while clicking on the see more button
    Given User launch the application
    And Observe that the top campaigns are dispalyed in the home page
    When User click on the see more button
    Then User is able to see the top campaign listing page
    
  Scenario: Verify that the  top campaigns option are displayed in the Discover dropdown and the user should redirected to the top camapaign listing while clicking on the this option
    Given User launch the application
    And Click on the Top Campaign option in the donate for dropdown
    Then User is able to see the top campaign listing page
    

  
