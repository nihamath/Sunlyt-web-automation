package StepDefinitions;

import org.junit.Assert;

import PageObjects.CampaignListingPage;
import Utilities.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampaignListSteps extends BaseClass {
	
	private CampaignListingPage campaign = new CampaignListingPage(driver);
	
	
	@Then("User is able to see the top campaign listing page")
	public void User_is_able_to_see_the_top_campaign_listing_page() {
		
		Assert.assertEquals("Browse Campaigns", campaign.verifyCampaignListingPage());
		
		Assert.assertEquals("Top Campaigns", campaign.verifyTopCampaignTitle());
		
	}

	
	@Then("User redirected to the campaign listing page")
	public void user_redirected_to_the_campaign_listing_page() {
		Assert.assertEquals("Browse Campaigns", campaign.verifyCampaignListingPage());
	}
	
	@When("User click on any of campaign")
	public void user_click_on_any_of_campaign() {
	  campaign.clickFirstCampaign();
	}
	
	
	@When("User search the campaign with value {string}")
	public void user_search_the_campaign_with_value(String search) {
		campaign.enterSearchValue(search);
	}

	@Then("Search result will be displayed with value {string}")
	public void search_result_will_be_displayed(String search) {
	    Assert.assertTrue(campaign.verifyName(search));
	}

}
