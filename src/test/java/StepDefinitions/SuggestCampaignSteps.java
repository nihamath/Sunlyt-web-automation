package StepDefinitions;

import org.junit.Assert;

import PageObjects.SuggestAcampaignPage;
import Utilities.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SuggestCampaignSteps extends BaseClass {
	
	private SuggestAcampaignPage suggest = new SuggestAcampaignPage(driver);
	
	
	@Then("Suggest campaign popup is displayed")
	public void suggest_campaign_popup_is_displayed() {
		Assert.assertEquals(suggest.verifySuggestPopup(), "Suggest a Campaign");
	    
	}

	@And("User enter the mandatory feilds")
	public void user_enter_the_mandatory_feilds() {
	  suggest.selectCategory("Big Tech");
	  suggest.selectCountry("India");
	  suggest.enterTitle("Test");
	  suggest.enterDescription("Test");
	  suggest.uploadAttachment();
	  suggest.submitSuggestCampaignForm();
	  System.out.println(suggest.verifyToastMessage());
	}
	
	@Then("Success toast message is displayed with message {string}")
	public void success_toast_message_is_displayed_with_message(String msg) {
		Assert.assertEquals(suggest.verifyToastMessage(), msg);
	}


}
