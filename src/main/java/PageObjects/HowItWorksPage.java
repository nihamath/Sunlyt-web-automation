package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class HowItWorksPage {



	// This class is used to store the web elements and corresponding actions of the How it works page

	public WebDriver driver;
	WaitHelper waitHelper;

	public HowItWorksPage(WebDriver rdriver){

		driver= rdriver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	//Web elements
	@FindBy(xpath="//h2[@class='text-center margin-title']")  WebElement headingPage;
	@FindBy(xpath="/html/body/sc-root/div/sc-how-it-works/section/section/div/ul/li") List<WebElement> contentList;

	//Different action methods of the web elements
	public String verifyPage() {
		waitHelper.WaitForElement(headingPage);
		return headingPage.getText();
	}


	public int verifyContentSteps() {
		return contentList.size();
	}

}
