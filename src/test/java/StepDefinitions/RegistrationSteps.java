package StepDefinitions;

import org.junit.Assert;

import PageObjects.RegistrationPage;
import Utilities.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps extends BaseClass {

	private RegistrationPage  reg= new RegistrationPage(driver);

	final String email = customFunctons.emailGenerator();

	@Then("User redirected to the Registration form")
	public void user_redirected_to_the_registration_form() {
		Assert.assertEquals(reg.verifySignUpPage(), "Sign up");
	}

	@And("User enter all the mandatory feild")
	public void user_enter_all_the_mandatory_feild() {
		reg.enterFirstName(read.getFname());
		reg.enterLastName(read.getLname());
		reg.enterEmail(email);
		reg.confirmEmail(email);
		reg.enterPassword(read.getPassword());
		reg.clickAgreementCheckbox();
		reg.agreeCaptcha();

	}

	@And("User enter all the mandatory feild  with a non verified email ID")
	public void user_enter_all_the_mandatory_feild_with_a_non_verified_email_id() {
		reg.enterFirstName(read.getFname());
		reg.enterLastName(read.getLname());
		reg.enterEmail("nihamathulla+test1@qburst.com");
		reg.confirmEmail("nihamathulla+test1@qburst.com");
		reg.enterPassword(read.getPassword());
		reg.clickAgreementCheckbox();
		reg.agreeCaptcha();

	}

	@And("User enter all the mandatory feild  with an already used email ID")
	public void user_enter_all_the_mandatory_feild_with_already_used_email_id() {
		reg.enterFirstName(read.getFname());
		reg.enterLastName(read.getLname());
		reg.enterEmail("nihamathulla@qburst.com");
		reg.confirmEmail("nihamathulla@qburst.com");
		reg.enterPassword(read.getPassword());
		reg.clickAgreementCheckbox();
		reg.agreeCaptcha();

	}

	@When("User click on the create account button")
	public void user_click_on_the_create_account_button() {
		reg.submitRegistartion();
	}


	@Then("User will get the toaster with message {string}")
	public void user_will_get_the_toaster_with_message(String message) {

		Assert.assertEquals(reg.verifySuccesMessage(), message);
	}



}
