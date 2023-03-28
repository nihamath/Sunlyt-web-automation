package StepDefinitions;

import org.junit.Assert;

import PageObjects.LoginPage;
import Utilities.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps extends BaseClass {

	private LoginPage login = new LoginPage(driver);

	@When("Enter valid credentials")
	public void enter_valid_credential() {

		login.enterEmail();
		login.enterPassword();
		login.submitSignIn();

	}

	@Then("User redirected home page")
	public void user_redirected_home_page() {

		Assert.assertEquals(login.verifyProfileName(), "sree-nih");

	}

	@When("Enter invalid credentials")
	public void enter_invalid_credential() {

		login.enterInvalidCredentials();
		login.submitSignIn();

	}


	@Then("User get error message")
	public void user_get_error_message() {
		System.out.println(login.verifyErrorMessage());
		Assert.assertEquals(login.verifyErrorMessage(), "Incorrect email or password.");

	}

	@And("Click on the create account link")
	public void click_on_the_create_account_link() {
		login.clickCreateAccountLink();
	}
	
	@Then("User redirected to the login page")
	public void user_redirected_to_the_login_page() {
	    login.verifyLoginPage();
	}


}
