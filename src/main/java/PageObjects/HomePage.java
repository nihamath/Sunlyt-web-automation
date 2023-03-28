package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class HomePage {


	// This class is used to store the web elements and corresponding actions of the Home page

	public WebDriver driver;
	WaitHelper waitHelper;

	public HomePage(WebDriver rdriver){

		driver= rdriver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	//Web elements
	@FindBy(xpath="//button[text()='Sign In']")  WebElement linkSignIn;
	@FindBy(xpath="/html/body/sc-root/section/div/sc-home/section/section[1]/div/div/span[1]")  WebElement labelWelcome;
	@FindBy(xpath="/html/body/sc-root/section/div/sc-home/section/section[2]/span[1]")  WebElement labelTopCampaign;
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")  WebElement searchMenu;
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")  WebElement discoverMenu;
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")  WebElement donateForMenu;
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")  WebElement menuHowitsWork;
	@FindBy(xpath="//section[@class='container-fluid p-0 py-5 campaign']/span")  WebElement topCampaignSection;
	@FindBy(xpath="//span[text()='See more']")  WebElement seeMoreButton;
	@FindBy(xpath="//li[@class='nav-item dropdown'][1]/ul/li[1]")  WebElement topCampaignOption;
	@FindBy(xpath="//button[text()='Donate to a campaign']")  WebElement donatebutton;
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[3]/ul/li[1]")  WebElement bigTechCategory;
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[3]/ul/li[2]")  WebElement medicalCategory;
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[3]/ul/li[3]")  WebElement corpCategory;
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[3]/ul/li[4]")  WebElement governmentCategory;
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[3]/ul/li[5]")  WebElement politicalCategory;
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[3]/ul/li[6]")  WebElement envoirnmentCategory;
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[3]/ul/li[7]")  WebElement otherCategory;
	@FindBy(xpath="/html/body/sc-root/sc-footer/footer/section/div[1]/div/div[1]/ul/li[1]")  WebElement howItWorkFooter;
	@FindBy(name="search")  WebElement searchBox;
	@FindBy(xpath="//li[text()='API-Testing-Campaign'")  WebElement searchResult;
	@FindBy(xpath="//a[@id='dropdownMenuLink']")  WebElement profileDropdown;
	@FindBy(xpath="//a[text()='Profile']")  WebElement profileOption;
	
	//Different action methods of the web elements
	public void clickSignIn() {
		waitHelper.WaitForElementClickable(linkSignIn);
		linkSignIn.click();
	}

	public String verifySearchMenuOption() {
		waitHelper.WaitForElement(searchMenu);
		return searchMenu.getText();
	}

	public String verifyDiscoverMenuOption() {
		waitHelper.WaitForElement(discoverMenu);
		return discoverMenu.getText();
	}

	public String verifyDonateMenuOption() {
		waitHelper.WaitForElement(donateForMenu);
		return donateForMenu.getText();
	}

	public String verifyHowItWorkMenuOption() {
		waitHelper.WaitForElement(menuHowitsWork);
		return menuHowitsWork.getText();
	}

	public boolean verifyTopCampaignHomePage() {
		waitHelper.WaitForElement(topCampaignSection);
		return topCampaignSection.isDisplayed();
	}

	public void clickSeeMore() {
		waitHelper.WaitForElementClickable(seeMoreButton);
		seeMoreButton.click();
	}

	public void clickDonateDropdown() {
		waitHelper.WaitForElement(donateForMenu);
		donateForMenu.click();
	}

	public void clickDiscoverDropdown() {
		waitHelper.WaitForElement(discoverMenu);
		discoverMenu.click();
	}

	public void clickTopCampaign() {
		waitHelper.WaitForElement(topCampaignOption);
		topCampaignOption.click();
	}

	public void clickHowItWorks() {
		waitHelper.WaitForElement(menuHowitsWork);
		menuHowitsWork.click();
	}

	public void clickHowItWorksFooter() {
		waitHelper.WaitForElement(howItWorkFooter);
		howItWorkFooter.click();
	}

	public void clickDonateButton() {
		waitHelper.WaitForElement(donatebutton);
		donatebutton.click();
	}
	
	public void clickSearchButton() {
		waitHelper.WaitForElement(searchMenu);
		searchMenu.click();
	}
	
	public void enterSearchValue(String name) {
		waitHelper.WaitForElement(searchBox);
		searchBox.sendKeys(name);
	}
	
	public void clickSearchResult() {
		waitHelper.WaitForElementClickable(searchResult);
		searchResult.click();
	}
	
	public void clickProfileDropdown() {
		waitHelper.WaitForElementClickable(profileDropdown);
		profileDropdown.click();
	}
	
	public void clickProfileOption() {
		waitHelper.WaitForElement(profileDropdown);
		profileDropdown.click();
	}
	
	



	public void selectBigTechOption(String category) {

		switch(category) {
		case "Big Tech":
			waitHelper.WaitForElement(bigTechCategory);
			bigTechCategory.click();
			break;

		case "Medical":
			waitHelper.WaitForElement(medicalCategory);
			medicalCategory.click();
			break;

		case "Corporate Corruption/Fraud/Bribery":
			waitHelper.WaitForElement(corpCategory);
			corpCategory.click();
			break;

		case "Government Spying/Corruption":
			waitHelper.WaitForElement(governmentCategory);
			governmentCategory.click();
			break;



		case "Political":
			waitHelper.WaitForElement(politicalCategory);
			politicalCategory.click();
			break;

		case "Environmental/Climate":
			waitHelper.WaitForElement(envoirnmentCategory);
			envoirnmentCategory.click();
			break;

		case "Other":
			waitHelper.WaitForElement(otherCategory);
			otherCategory.click();
			break;


		}





	}

}
