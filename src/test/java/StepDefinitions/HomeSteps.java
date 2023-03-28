package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import PageObjects.HomePage;
import Utilities.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomeSteps extends BaseClass {
	
	private HomePage home = new HomePage(setUp());
	
	@Given("User launch the application")
	public void launch_the_Browser() {
		
		driver.manage().window().maximize();
		driver.get("https://sunlytcrowdfunding-qa.qburst.build/");
		
	}
	
	@And("Click on the sign in button")
	public void click_on_the_signin_button() {
		
		home.clickSignIn();
		
	}
	
	@And("Observe that all elements are displayed properly")
	public void Observe_that_all_elements_are_displayed_properly() {
		
		Assert.assertEquals("Search", home.verifySearchMenuOption());
		Assert.assertEquals("Discover", home.verifyDiscoverMenuOption());
		Assert.assertEquals("Corruption in", home.verifyDonateMenuOption());
		Assert.assertEquals("How it works", home.verifyHowItWorkMenuOption());
		
	}
	
	@And("Observe that the top campaigns are dispalyed in the home page")
	public void Observe_that_top_campaigns_are_dispalyed_in_the_home_page() throws InterruptedException {
		
		
		
		Assert.assertTrue(home.verifyTopCampaignHomePage());
		
		
	}
	
	@When("User click on the see more button")
	public void User_click_on_the_see_more_button() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 1000)");   
        Thread.sleep(3000);
		home.clickSeeMore();
		
		
	}
	
	
	@And("Click on the Top Campaign option in the donate for dropdown")
	public void Click_on_the_Top_Campaign_option_in_the_donate_for_dropdown() {
		
		home.clickDiscoverDropdown();
		home.clickTopCampaign();
		
		
	}
	@And("Click on the how it works menu in the header")
	public void click_on_the_how_it_works_menu_in_the_header() {
	    home.clickHowItWorks();
	}
	
	@And("Click on the how it works menu in the footer")
	public void click_on_the_how_it_works_menu_in_the_footer() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 4000)");   
        Thread.sleep(3000);
        
	    home.clickHowItWorksFooter();
	}
	
	@When("User click on the Donate now button")
	public void user_click_on_the_donate_now_button() {
	    home.clickDonateButton();
	}
	
	@When("User select category {string} from the donate for dropdwon")
	public void user_select_category_from_the_donate_for_dropdwon(String category) {
		home.clickDonateDropdown();
	    home.selectBigTechOption(category);
	}
	
	@And("Search the campaign {string}")
	public void search_the_campaign(String name) {
	    home.clickSearchButton();
	    home.enterSearchValue(name);
	}
	
	@When("User click on the campaign name in the search result")
	public void user_click_on_the_campaign_name_in_the_search_result() {
	    home.clickSearchResult();
	}
	
	@And("User click on the profile option from the home page")
	public void user_click_on_the_profile_option_from_the_home_page() {
	    home.clickProfileDropdown();
	    home.clickProfileOption();
	}

	@Then("User redirected to the edit profile screen")
	public void user_redirected_to_the_edit_profile_screen() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
