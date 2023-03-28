package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utilities.WaitHelper;

public class SuggestAcampaignPage {


	// This class is used to store the web elements and corresponding actions of the suggest a campaign page


	public WebDriver driver;
	WaitHelper waitHelper;

	public SuggestAcampaignPage(WebDriver rdriver){

		driver= rdriver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	//Web elements
	@FindBy(xpath="//select[@formcontrolname='campaignCategory']")  WebElement categoryDropdwon;
	@FindBy(xpath="//h5[text()='Suggest a Campaign']")  WebElement popupTitle;
	@FindBy(xpath="//*[@id=\"suggestModal\"]/lib-campaign-suggest/div/div/div[2]/form/div[2]/div/input")  WebElement coutryTextbox;
	@FindBy(xpath="//*[@id=\"suggestModal\"]/lib-campaign-suggest/div/div/div[2]/form/div[2]/div/ul/li[1]")  WebElement countryOption;
	@FindBy(xpath="//input[@formcontrolname='title']")  WebElement txtTitle;
	@FindBy(xpath="//textarea[@formcontrolname='description']")  WebElement txtDescription;
	@FindBy(xpath="//*[@id=\"formFile\"]")  List<WebElement> uploadFile;
	@FindBy(xpath="//*[@id=\"suggestModal\"]/lib-campaign-suggest/div/div/div[2]/form/div[9]/button")  WebElement btnSave;
	@FindBy(xpath="//div[@role='alert']")  WebElement toastMessage;
	//Different action methods of the web elements


	public String verifySuggestPopup() {
		waitHelper.WaitForElement(popupTitle);
		return popupTitle.getText();
	}
	public void selectCategory(String category) {
		Select cat =  new Select(categoryDropdwon);
		cat.selectByVisibleText(category);
	}
	
	public void selectCountry(String country) {
		coutryTextbox.sendKeys(country);
		waitHelper.WaitForElemntTextToPresent(countryOption, "India");
		countryOption.click();
		
	}
	
	public void enterTitle(String title) {
		txtTitle.sendKeys(title);
	}
	
	public void enterDescription(String desc) {
		txtDescription.sendKeys(desc);
	}
	
	public void uploadAttachment() {
		uploadFile.get(0).sendKeys("C:\\Users\\Nihamathulla\\Desktop\\campaign\\OIP (1).jpg");
	}
	
	public void submitSuggestCampaignForm() {
		waitHelper.WaitForElementClickable(btnSave);
		btnSave.click();
	}
	
	public String verifyToastMessage() {
		waitHelper.WaitForElement(toastMessage);
		return toastMessage.getText();
	}


}
