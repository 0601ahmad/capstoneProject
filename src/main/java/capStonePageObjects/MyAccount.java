package capStonePageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CoreCapStone.BaseClass;
import Utilities.UtilitiesClass;

public class MyAccount extends BaseClass {
	public MyAccount() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//*[contains(text(),'My Account')])[position()=1]")
	private WebElement my_Account;
	public void clickOnMyAccount() {
		my_Account.click();
	}
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;
	public void clickOnLogin() {
		login.click();
	}
	@FindBy (xpath = "//input[@name='email']")
	private WebElement enter_UserName;
	public void enterUserName(String username) {
	 enter_UserName.sendKeys(username);
	}
	@FindBy (xpath = "//input[@name='password']")
	private WebElement enter_password;
	public void enterPassword(String password) {
		enter_password.sendKeys(password);
	}
	@FindBy (xpath ="//input[@value='Login' and @class='btn btn-primary']")
	private WebElement login_button;
	public void clickOnLoginButton() throws InterruptedException {
		login_button.click();
		Thread.sleep(2000);
	}
	@FindBy (xpath = "//h2[text()='My Account']")
	private WebElement user_in_AccountPage;
	public void userInAccountPage() {
		user_in_AccountPage.getText();
	}
	@FindBy (xpath = "//a[contains(text(),'Register for an aff')]")
	private WebElement affiliate_Register;
	public void registerAffiliate() throws InterruptedException {
		affiliate_Register.click();
		Thread.sleep(2000);
	}
	@FindBy (xpath = "//input[@name='company']")
	private WebElement company_Name;
	public void enterCompanyName(String company) throws InterruptedException {
		company_Name.sendKeys(company);
		Thread.sleep(1000);
	}
	@FindBy(xpath = "//input[@name='website']")
	private WebElement enter_website;
	public void enterWebsite(String website) throws InterruptedException {
		enter_website.sendKeys(website);
		Thread.sleep(1000);
	}
	@FindBy(xpath = "//input[@name='tax']")
	private WebElement enter_IDtax;
	public void enterIDTax(String taxID) throws InterruptedException {
		enter_IDtax.sendKeys(taxID);
		Thread.sleep(1000);
	}
	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement payment_Method;
	public void paymentMethod() throws InterruptedException {
		payment_Method.click();
		Thread.sleep(1000);
	}
	@FindBy (xpath = "//input[@id='input-cheque']")
	private WebElement payee_Name;
	public void enterPayeeName(String payee) throws InterruptedException {
		payee_Name.sendKeys(payee);
		Thread.sleep(1000);
	}
	@FindBy (xpath = "//input[@type='checkbox']")
	private WebElement about_Us;
	public void clickAboutUs() throws InterruptedException {
		about_Us.click();
		Thread.sleep(1000);
	}
	@FindBy (xpath = "//input[@value='Continue']")
	private WebElement continue_button;
	public void clickContiuneButton() throws InterruptedException {
		continue_button.click();
		Thread.sleep(1000);
	}
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement get_message;
	public void getSuccessMessage() {
		String text = get_message.getText();
		UtilitiesClass.highlightelementBorderAndBackground(get_message);
		logger.info(text);
	}
	@FindBy (xpath = "//a[text()='Edit your affiliate information']")
	private WebElement edit_affiliate;
	public void clickEditAffiliate() {
		edit_affiliate.click();
	}
	@FindBy (xpath = "//input[@value ='bank']")
	private WebElement bank_transfer;
	public void clickOnBankTransfer() throws InterruptedException {
		bank_transfer.click();
		Thread.sleep(1000);
	}
	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement enter_BankName;
	public void enterBankName(String bankName) throws InterruptedException {
		enter_BankName.sendKeys(bankName);
		Thread.sleep(2000);
	}
	@FindBy (xpath = "//input[@id='input-bank-branch-number']")
	private WebElement aba_Number;
	public void enterABAnumber(String abaNumber) throws InterruptedException {
		aba_Number.sendKeys(abaNumber);
		Thread.sleep(2000);
	}
	@FindBy (xpath = "//input[@id ='input-bank-swift-code']")
	private WebElement swift_Code;
	public void enterSwiftCode(String swiftCode) throws InterruptedException {
		swift_Code.sendKeys(swiftCode);
		Thread.sleep(1000);
	}
	@FindBy (xpath = "//input[@name ='bank_account_name']")
	private WebElement account_Name;
	public void enterAccountName(String accountName) throws InterruptedException {
		account_Name.sendKeys(accountName);
		Thread.sleep(1000);
	}
	@FindBy (xpath = "//input[@name ='bank_account_number']")
	private WebElement account_Number;
	public void enterAccountNumber(String accountNumber) throws InterruptedException {
		account_Number.sendKeys(accountNumber);
		Thread.sleep(1000);
	}
	@FindBy(xpath = "//a[contains(text(),'Edit your account info')]")
	private WebElement edit_AccountInfo;
	public void editAccountInformation() {
		edit_AccountInfo.click();
	}
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement enter_name;
	public void enterFirstName(String firstName) throws InterruptedException {
		enter_name.clear();
		Thread.sleep(1000);
		enter_name.sendKeys(firstName);
	}
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement enter_lastname;
	public void enterLastName(String lastname) throws InterruptedException {
		enter_lastname.clear();
		Thread.sleep(1000);
		enter_lastname.sendKeys(lastname);
	}
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement enter_Email;
	public void enterEmail(String email) throws InterruptedException {
		enter_Email.clear();
		Thread.sleep(1000);
		enter_Email.sendKeys(email);
	}
	@FindBy(xpath="//input[@id='input-telephone']")
	private WebElement enter_phone;
	public void enterPhoneNo(String telephone) throws InterruptedException {
		enter_phone.clear();
		Thread.sleep(1000);
		enter_phone.sendKeys(telephone);
	}
	
	
}
