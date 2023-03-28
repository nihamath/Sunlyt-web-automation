package StepDefinitions;

import org.junit.Assert;

import PageObjects.HowItWorksPage;
import Utilities.BaseClass;
import io.cucumber.java.en.Then;


public class HowItWorksSteps extends BaseClass {
	private HowItWorksPage hwp= new HowItWorksPage(driver);
	
	@Then("User redirecyted to the how it works screen and infomation are dispalyed correctly")
	public void user_redirecyted_to_the_how_it_works_screen_and_infomation_are_dispalyed_correctly() {
	    Assert.assertEquals(hwp.verifyPage(), "How it works");
	    //Assert.assertTrue(hwp.verifyBanner());
	    Assert.assertEquals(hwp.verifyContentSteps(),7);
	}

}
