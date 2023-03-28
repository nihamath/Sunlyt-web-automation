package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class CampaignDetailsPage {



	// This class is used to store the web elements and corresponding actions of the Campaign details page


	public WebDriver driver;
	WaitHelper waitHelper;

	public CampaignDetailsPage(WebDriver rdriver){

		driver= rdriver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	//Web elements
	@FindBy(xpath="/html/body/sc-root/div/sc-campaign-details/lib-campaign-details/div[1]/div[1]/span")  WebElement detailsPage;
	@FindBy(xpath="/html/body/sc-root/div/sc-campaign-details/lib-campaign-details/div[1]/div[2]/div[1]/span[1]/span")  WebElement categoryName;
	@FindBy(xpath="//button[@title='Like']/span")  WebElement likeButton;
	@FindBy(xpath="//button[@title='Bookmark']")  WebElement bookmarkButton;
	@FindBy(xpath="//img[@src='/assets/images//campaign-detail/group-1.svg']")  WebElement boomarkHighlight;
	@FindBy(xpath="//img[@src='/assets/images//campaign-detail/group-3.svg']")  WebElement boomarkNotHighlight;
	@FindBy(xpath="//button[text()='Suggest a Campaign']")  WebElement btnSuggestCampaign;
	@FindBy(xpath="//textarea[@placeholder='Enter your comment']")  WebElement textareaComment;
	@FindBy(xpath="//button[text()='Post comment']")  WebElement btnPostComment;
	@FindBy(xpath="//button[@title='Options']")  WebElement btnOptions;
	@FindBy(xpath="//a[text()='Edit comment']")  List<WebElement> btnEditComment;
	@FindBy(xpath="//textarea[@placeholder='Comment']")  WebElement editCommentArea;
	@FindBy(xpath="//button[text()='Save']")  WebElement btnSave;
	@FindBy(xpath="//a[text()='Delete comment']")  List<WebElement> btnDeleteComment;
	@FindBy(xpath="//button[text()='Delete']")  WebElement btnConfirmDelete;
	@FindBy(xpath="//div[@role='alert']")  WebElement deleteAlert;
	
	
	
	//Different action methods of the web elements
	public boolean verifyDetailsPage() {
		waitHelper.WaitForElement(detailsPage);
		return detailsPage.isDisplayed();
	}

	public String verifyCategory() {
		waitHelper.WaitForElement(categoryName);
		return categoryName.getText();
	}
	
	public void likeAcampaign() {
		waitHelper.WaitForElement(likeButton);
		likeButton.click();
	}
	
	public void bookmarkcampaign() {
		waitHelper.WaitForElement(bookmarkButton);
		bookmarkButton.click();
	}
	
	public String verifyLikeCount() {
		return likeButton.getText();
		
	}
	
	public boolean verifyBookmarkEnabled() {
		return boomarkHighlight.isDisplayed();
		
	}
	
	public boolean verifyBookmarkDisabled() {
		return boomarkNotHighlight.isDisplayed();
		
	}
	
	public void clickSuggestCampaignButton() {
		//waitHelper.WaitForElementClickable(btnSuggestCampaign);
		btnSuggestCampaign.click();
		
	}
	
	public void enterComment(String comment) {
		waitHelper.WaitForElement(textareaComment);
		textareaComment.sendKeys(comment);
		
	}
	
	public void submitComment() {
		waitHelper.WaitForElement(btnPostComment);
		btnPostComment.click();
		
	}
	
	public void clickOptionButton() {
		waitHelper.WaitForElement(btnOptions);
		btnOptions.click();
		
	}
	
	public void clickEditOption() {
		
		btnEditComment.get(0).click();
		
	}
	
	public void editTextComment(String comment) {
		waitHelper.WaitForElement(editCommentArea);
		editCommentArea.clear();
		editCommentArea.sendKeys(comment);
		
	}
	
	public void clickSaveButton() {
		waitHelper.WaitForElement(btnSave);
		btnSave.click();
		
	}
	
	public void clickDeleteOption() {
		waitHelper.WaitForElement(btnDeleteComment.get(0));
		btnDeleteComment.get(0).click();
		
	}
	
	public void clickConfirmDelete() {
		waitHelper.WaitForElement(btnConfirmDelete);
		btnConfirmDelete.click();
		
	}
	
	public String verifyAlertMessageDispalyed() {
		waitHelper.WaitForElement(deleteAlert);
		return deleteAlert.getText();
		
	}


}
