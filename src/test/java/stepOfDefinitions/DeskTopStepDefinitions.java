package stepOfDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

//import java.util.List;
//import java.util.Map;

import CoreCapStone.BaseClass;
import capStonePageObjects.Desktop;
import io.cucumber.datatable.DataTable;
//import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import Utilities.UtilitiesClass;

public class DeskTopStepDefinitions extends BaseClass {
	Desktop desktopTab = new Desktop();


	@Given("user is on Retail website")
	public void user_is_on_retail_website() {
		desktopTab.textToValidateHomePage();
		logger.info("home page open successfully");
	}

	@When("user click on Destops tab")
	public void user_click_on_destops_tab() {
		desktopTab.clickOnDesktopTab();
		logger.info("Step 1: user will see a dropdown list.");
	}

	@When("user click on Show all Desktops")
	public void user_click_on_show_all_desktops() {
		desktopTab.clickOnShowAllDesktops();
		logger.info("step 2: user will see all items in desktop tab.");
	}

	@Then("user should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() throws IOException {
		Assert.assertFalse( desktopTab.homeElements());
		UtilitiesClass.takeScreenShot("DesktopPage");

	}

	@When("user click ADD TO CART option on Hp LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktopTab.clickOnAddToCart();
		logger.info("user click add to cart to go for next step.");
	}

	@When("user select quantity one")
	public void user_select_quantity_one() throws InterruptedException {
		desktopTab.inputQuantity();
		logger.info("user first clear the path and then enter quantity.");
	}

	@When("user click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopTab.addToCart();
		logger.info("in this step user add item to the cart.");
	}

	@When("user click ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktopTab.clickAddToCartCanon5D();
		logger.info("user click on add to cart to go for next step.");
	}

	@When("user select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktopTab.selectColor();
		logger.info("user select the color.");
	}

	@When("user click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopTab.clickOnCanonEos5D();
		logger.info("user click on camera EOS 5D.");
	}

	@When("user click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopTab.clickOnReview();
		logger.info("user click on reveiw.");
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		desktopTab.getName(data.get(0).get("name"));
		desktopTab.writeReview(data.get(0).get("review"));
		logger.info("user enter the name and comment.");
	}
	@When("user select good for Rating")
	public void user_select_good_for_rating() {
		desktopTab.selectRating();
		logger.info("user select the rating.");
	}

	@When("user click on Continue button")
	public void user_click_on_continue_button() {
		desktopTab.clickOnContinueButton();
		logger.info("user click the continue button.");
	}

	@Then("User should see a message {string} and {string}")
	public void user_should_see_a_message_and(String messageOne, String screenOne) throws InterruptedException, IOException {
		desktopTab.getSuccessMessage(messageOne,screenOne);

	}

	@Then("User should see a message along {string} and {string}")
	public void user_should_see_a_message_along_and(String messageTwo, String screenTwo) throws InterruptedException, IOException {
		desktopTab.getSuccessMessage(messageTwo,screenTwo);
	}

	@Then("User should see a message with {string} and {string}")
	public void user_should_see_a_message_with_and(String messageThree, String screenThree) throws InterruptedException, IOException {
		desktopTab.getSuccessMessage(messageThree,screenThree);

	}

}
