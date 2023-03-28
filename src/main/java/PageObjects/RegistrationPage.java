package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class RegistrationPage {

	// This class is used to store the web elements and corresponding actions of the Registration page

	public WebDriver driver;
	WaitHelper waitHelper;

	public RegistrationPage(WebDriver rdriver){

		driver= rdriver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	//Web Elements
	@FindBy(xpath="//span[text()='Sign up']")  WebElement headingSignUp;
	@FindBy(name="firstName")  WebElement txtFname;
	@FindBy(name="lastName")  WebElement txtLname;
	@FindBy(name="email")  WebElement txtEmail;
	@FindBy(name="confirmEmail")  WebElement txtConfrmEmail;
	@FindBy(name="password")  WebElement txtPassword;
	@FindBy(xpath="//input[@id='newsletter']")  WebElement checkboxNewsletter;
	@FindBy(xpath="/html/body/sc-root/sc-header/div/sc-auth/div/div/section/div/div[1]/sc-register/form/div[2]/label")  WebElement checkboxPolicy;
	@FindBy(xpath="//*[@id=\"authModal\"]/sc-auth/div/div/section/div/div[1]/sc-register/form/button")  WebElement btnSignUp;
	@FindBy(xpath="//*[@id=\"toast-container\"]/div/div[1]/div[1]/div")  WebElement succesToaster;


	//Different action methods of the web elements
	public String verifySignUpPage() {
		waitHelper.WaitForElemntTextToPresent(headingSignUp, "Sign up");
		return headingSignUp.getText();

	}

	public void  enterFirstName(String firstname) {
		waitHelper.WaitForElement(txtFname);
		txtFname.sendKeys(firstname);

	}

	public void  enterLastName(String lastname) {
		waitHelper.WaitForElement(txtLname);
		txtLname.sendKeys(lastname);

	}

	public void  enterEmail(String email) {
		waitHelper.WaitForElement(txtEmail);
		txtEmail.sendKeys(email);

	}

	public void  confirmEmail(String email) {
		waitHelper.WaitForElement(txtConfrmEmail);
		txtConfrmEmail.sendKeys(email);

	}

	public void  enterPassword(String password) {
		waitHelper.WaitForElement(txtPassword);
		txtPassword.sendKeys(password);

	}

	public void  clickSubscribeCheckbox() {
		waitHelper.WaitForElement(checkboxNewsletter);
		checkboxNewsletter.click();

	}

	public void  clickAgreementCheckbox() {
		checkboxPolicy.click();

	}

	public void  submitRegistartion() {
		driver.switchTo().defaultContent();
		System.out.println(btnSignUp.isDisplayed());
		System.out.println(btnSignUp.getText());
		btnSignUp.click();

	}

	public void  agreeCaptcha() {
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();


	}

	public String verifySuccesMessage() {
		waitHelper.WaitForElement(succesToaster);
		return succesToaster.getText();

	}


}
