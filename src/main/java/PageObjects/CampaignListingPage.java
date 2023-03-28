package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class CampaignListingPage {

	// This class is used to store the web elements and corresponding actions of the Campaign listing page

	public WebDriver driver;
	WaitHelper waitHelper;

	public CampaignListingPage(WebDriver rdriver){

		driver= rdriver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	//Web elements

	@FindBy(xpath="//h2[text()='Browse Campaigns']")  WebElement CampaignListTitle;
	@FindBy(xpath="//h3[text()='Top Campaigns']")  WebElement topCampaignTitle;
	@FindBy(xpath="//section[@class='col mb-4 mb-md-5']") List<WebElement> campaignTiles;
	@FindBy(xpath="/html/body/sc-root/div/sc-campaign/section[1]/section/div[2]/sc-campaign-filter/div[1]/div[1]/input") WebElement searchBox;
	@FindBy(xpath="//div[@class='px-3 px-md-3 px-sm-3 px-lg-5']/h5") List<WebElement> campaignName;


	//Different action methods of the web elements

	public String verifyCampaignListingPage() {
		waitHelper.WaitForElement(CampaignListTitle);
		return CampaignListTitle.getText();
	}

	public String verifyTopCampaignTitle() {
		waitHelper.WaitForElement(topCampaignTitle);
		return topCampaignTitle.getText();
	}

	public void clickFirstCampaign() {
		waitHelper.WaitForElement(campaignTiles.get(0));

		campaignTiles.get(0).click();
	}

	public void enterSearchValue(String search) {
		waitHelper.WaitForElement(searchBox);
		searchBox.sendKeys(search);
	}

	public boolean verifyName(String search) {
		boolean flag=false;
		System.out.println(campaignName.size());

		for(int i=0; i<campaignName.size();i++) {

			if(campaignName.get(i).getText().contains(search)) {
				flag=true;
			}

		}
		return flag;

	}

}
