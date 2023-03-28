package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import PageObjects.CampaignDetailsPage;
import Utilities.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CampaignDetailsSteps extends BaseClass {

	private CampaignDetailsPage details = new CampaignDetailsPage(driver);

	@Then("User redirected to the campaign details page")
	public void user_redirected_to_the_campaign_details_page() {
		Assert.assertTrue(details.verifyDetailsPage());
	}

	@And("The category {string} is diaplyed in the page")
	public void the_category_is_diaplyed_in_the_page(String category) {
		Assert.assertEquals(category, details.verifyCategory());
	}

	@And("Click on the like button of the campaign")
	public void click_on_the_like_button_of_the_campaign() throws InterruptedException {
		Thread.sleep(30000);
		details.likeAcampaign();

	}
	
	@And("Click on the bookmark button of the campaign")
	public void click_on_the_bookmark_button_of_the_campaign() throws InterruptedException {
		Thread.sleep(10000);
		details.bookmarkcampaign();

	}
	
	@And("Click on the dislike button of the campaign")
	public void click_on_the_dislike_button_of_the_campaign() throws InterruptedException {
		Thread.sleep(30000);
		details.likeAcampaign();

	}


	@Then("Like count is incrimented")
	public void like_count_is_incrimented() {
		System.out.println(details.verifyLikeCount());
		Assert.assertEquals(details.verifyLikeCount(),"(1)");
	}
	
	@Then("Like count is decrimented")
	public void like_count_is_decrimented() {
		System.out.println(details.verifyLikeCount());
		Assert.assertEquals(details.verifyLikeCount(),"(0)");
	}

	@Then("Bookmark button showing in the highlighted format")
	public void bookmark_button_showing_in_the_highlighted_format() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(details.verifyBookmarkEnabled());
	}
	
	@Then("Bookmark button showing in the non higlighted format")
	public void bookmark_button_showing_in_the_non_highlighted_format() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(details.verifyBookmarkDisabled());
	}
	
	@When("User click on the Suggest Campaign button")
	public void user_click_on_the_suggest_campaign_button() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 600)");   
        Thread.sleep(5000);
		
		details.clickSuggestCampaignButton();
	}
	
	
	@When("User enter the comment")
	public void user_enter_the_comment() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 1000)");   
        Thread.sleep(5000);
		details.enterComment("test comment");
		Thread.sleep(5000);
		details.submitComment();
	}
	
	@And("User click on the more button")
	public void user_click_on_the_more_button() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 1000)");   
        Thread.sleep(5000);
		details.clickOptionButton();
	}
	
	@Then("Select the edit comment option")
	public void Select_the_edit_comment_option() throws InterruptedException {
		
		Thread.sleep(3000);
		details.clickEditOption();
	}
	
	
	@And("User edit the comment")
	public void user_edit_the_comment() throws InterruptedException {
		
		details.editTextComment("comment - edit");
		details.clickSaveButton();
	}
	
	
	@Then("Select the delete comment option")
	public void select_the_delete_comment_option() {
	    details.clickDeleteOption();
	}

	@And("Confirm the delete functionality")
	public void confirm_the_delete_functionality() {
	   details.clickConfirmDelete();
	}

	@Then("Delete alert is displayed in the screen")
	public void delete_alert_is_displayed_in_the_screen() {
		
		Assert.assertEquals(details.verifyAlertMessageDispalyed(),"This comment is deleted and only visible to you");
	}






}
