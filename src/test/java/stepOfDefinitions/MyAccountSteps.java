package stepOfDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import CoreCapStone.BaseClass;
import Utilities.UtilitiesClass;
import capStonePageObjects.MyAccount;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class MyAccountSteps extends BaseClass {
	
	MyAccount myaccount = new MyAccount();
	
	@Given("User click  on MyAccount")
	public void user_click_on_my_account() {
	    myaccount.clickOnMyAccount();
	    logger.info("User click on MyAccount in retail page");
	}

	@When("User click on Login")
	public void user_click_on_login() {
	    myaccount.clickOnLogin();
	    logger.info("User click on login");
	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String userName, String password) {
	   myaccount.enterUserName(userName);
	   myaccount.enterPassword(password);
	   logger.info("user enter user_name and password for login.");
	}

	@When("User click on Login button")
	public void user_click_on_login_button() throws InterruptedException {
	    myaccount.clickOnLoginButton();
	    logger.info("User click on login button.");
	    Thread.sleep(2000);
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() throws IOException {
	    myaccount.userInAccountPage();
	    UtilitiesClass.takeScreenShot("MyAccount1");
	    logger.info("User is now in my account page.");
	}

	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() throws InterruptedException {
	    myaccount.registerAffiliate();
	    logger.info("User will click on Register for an affiliate account.");
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		myaccount.enterCompanyName(data.get(0).get("company"));
		myaccount.enterWebsite(data.get(0).get("website"));
		myaccount.enterIDTax(data.get(0).get("taxID"));
		myaccount.enterPayeeName(data.get(0).get("payeeName"));
		logger.info("User will enter the information.");
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() throws InterruptedException {
	   myaccount.clickAboutUs();
	   logger.info("User click on about us check box.");
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() throws InterruptedException {
		myaccount.clickContiuneButton();
		logger.info("User will click on continue button to process.");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() throws IOException {
	    myaccount.getSuccessMessage();
	    UtilitiesClass.takeScreenShot("MyAccount2");
	    logger.info("User will get a message.");
	}

	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
	    myaccount.clickEditAffiliate();
	    logger.info("User click on Edit affiliate information link.");
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() throws InterruptedException {
	    myaccount.clickOnBankTransfer();
	    logger.info("user will click on bank Transer Radio Button.");
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		myaccount.enterBankName(data.get(0).get("bankName"));
		myaccount.enterABAnumber(data.get(0).get("abaNumber"));
		myaccount.enterSwiftCode(data.get(0).get("swiftCode"));
		myaccount.enterAccountName(data.get(0).get("accountName"));
		myaccount.enterAccountNumber(data.get(0).get("accountNumber"));
		logger.info("User will enter bank information.");
	}

	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
	    myaccount.editAccountInformation();
	    logger.info("User will edit account info.");
	}

	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		myaccount.enterFirstName(data.get(0).get("firstname"));
		myaccount.enterLastName(data.get(0).get("lastName"));
		myaccount.enterEmail(data.get(0).get("email"));
		myaccount.enterPhoneNo(data.get(0).get("telephone"));
		logger.info("User will update the account info.");

	}

	@Then("User should see a message ‘Success: Your account has been successfully updated.’")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() throws IOException {
	    myaccount.getSuccessMessage();
	    UtilitiesClass.takeScreenShot("MyAccount3");
	    logger.info("User will get a message of success.");
	}


}
