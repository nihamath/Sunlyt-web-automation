
Feature: Test the campaign listing functionality


  Scenario: Verify that user able to see the campaign list while clicking the Donate to now button from the home page
   Given User launch the application
   When User click on the Donate now button
   Then User redirected to the campaign listing page

  Scenario: Verify that user able to see the campaign list of a particlar category when choosing the category in the donate for dropdwon
   Given User launch the application
   When User select category "Big Tech" from the donate for dropdwon
   Then User redirected to the campaign listing page
   When User click on any of campaign
   Then User redirected to the campaign details page
   And The category "Big Tech" is diaplyed in the page
   
  Scenario: Verify that user able to search a campaign using search and filter functionality
   Given User launch the application
   When User click on the Donate now button
   Then User redirected to the campaign listing page
   When User search the campaign with value "Make it rain for Fran's brain drain"
   Then Search result will be displayed with value "Make it rain for Fran's brain drain"