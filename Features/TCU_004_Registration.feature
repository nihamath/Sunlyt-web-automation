
Feature: Test the Registration functionality of the application

Background: 

 		Given User launch the application
   	And Click on the sign in button
    And Click on the create account link
    Then User redirected to the Registration form

  Scenario: Verify that the user is able to register with valid email id
   
   And User enter all the mandatory feild
    When User click on the create account button
    Then User will get the toaster with message "For registration completion, please check your email for a verification link."
    
    #Scenario: Verify that the user get a validation message while registering with non verfied email ID
   
    #And User enter all the mandatory feild  with a non verified email ID
    #When User click on the create account button
    #Then User will get the toaster with message "Please complete account verification process. Check your email for a verification link."
    
  
   #Scenario: Verify that the user get a validation message while registering with already used email ID
  
    #And User enter all the mandatory feild  with an already used email ID
    #When User click on the create account button
    #Then User will get the toaster with message "A user with this email is already registered."

