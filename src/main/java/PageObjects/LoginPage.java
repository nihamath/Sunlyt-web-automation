package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class LoginPage {


	// This class is used to store the web elements and corresponding actions of the Login page

	public WebDriver driver;
	WaitHelper waitHelper;

	public LoginPage(WebDriver rdriver){

		driver= rdriver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	//Web Elements
	@FindBy(xpath="//input[@formcontrolname='username']")  WebElement txtEmail;
	@FindBy(xpath="//input[@formcontrolname='password']")  WebElement txtPassword;
	@FindBy(xpath="//button[text()='Sign in']")  WebElement btnSignIn;
	@FindBy(xpath="//*[@id='dropdownMenuLink']/span")  WebElement labelProfile;
	@FindBy(xpath="//*[@id='toast-container']/div/div")  WebElement toaster;
	@FindBy(xpath="//strong[text()='Create an Account']")  WebElement createAccountLink;
	@FindBy(xpath="//span[text()='Sign In']")  WebElement pageLogin;
	

	//Different action methods of the web elements
	public void enterEmail() {
		waitHelper.WaitForElement(txtEmail);
		txtEmail.sendKeys("nihamathulla@qburst.com");
	}


	public void enterPassword() {
		waitHelper.WaitForElement(txtPassword);
		txtPassword.sendKeys("Nihamath@123");
	}

	public void submitSignIn() {
		waitHelper.WaitForElementClickable(btnSignIn);
		btnSignIn.click();
	}

	public String verifyProfileName() {
		System.out.println(labelProfile.getText());
		waitHelper.WaitForElemntTextToPresent(labelProfile, "sree-nih");
		return labelProfile.getText();
	}

	public void enterInvalidCredentials() {
		waitHelper.WaitForElementClickable(txtPassword);
		txtEmail.sendKeys("op.nihamath0@gmail.com");
		txtPassword.sendKeys("Nihamath@1234");
	}

	public String verifyErrorMessage() {
		waitHelper.WaitForElement(toaster);
		return toaster.getText();
	}

	public void  clickCreateAccountLink() {
		waitHelper.WaitForElement(createAccountLink);
		createAccountLink.click();
	}
	
	public String  verifyLoginPage() {
		waitHelper.WaitForElemntTextToPresent(pageLogin, "Sign In");
		return pageLogin.getText();
	}

}
