package stepOfDefinitions;

import java.io.IOException;

import CoreCapStone.BaseClass;
import Utilities.UtilitiesClass;
import capStonePageObjects.LaptopAndNotebooks;
import io.cucumber.java.en.*;

public class LaptopAndNoteBooksSteps extends BaseClass {
	
	LaptopAndNotebooks item = new LaptopAndNotebooks();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() throws IOException {
		item.textToValidateHomePage();
		   logger.info("home page open successfully");
	}

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
	   item.clickOnLaptopsAndNotebooksTab();
	   logger.info("user click on Laptop tab.");
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
	    item.clickOnShowAllLaptops();
		   logger.info("user click on show all list.");

	}

	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
	   item.clickOnMacbook();
	   logger.info("user click on MacBook item.");

	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
	   item.clickOnAddToCart();
	   logger.info("user click add to Cart button");

	}

	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() throws IOException {
	    item.getSuccessMessage();
		   logger.info("user get the message");
			UtilitiesClass.takeScreenShot("LaptopAndNotebooks2");

	}

	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) throws IOException {
	    item.getTextShowOnCart(string);
		   logger.info("user should the message on cart");

	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
	    item.clickOnCart();
		   logger.info("user click on cart now");

	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() throws IOException {
	   item.clickOnRemoveButton();
	   logger.info("user click on red button");

	}

	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) {
	    item.cartEmptytext(string);
		   logger.info("item should be removed from the cart.");

	}

	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
	    item.mackBookProductComparison();
		   logger.info("user click on compare product on MacBook.");

	}

	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
	   item.mackBookAirProductComparison();
	   logger.info("user click on product compare on MacBook Air.");

	}

	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() throws IOException {
	    item.getSuccessMessage();
		   logger.info("user will see a message display on this page.");
			UtilitiesClass.takeScreenShot("LaptopAndNotebooks4");

	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() throws InterruptedException {
	    item.productComparisonLink();
		   logger.info("user clikc on product comparison link.");

	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() throws IOException {
	    item.productComparisonChart();
		   logger.info("user will see product comparison chart.");
		   UtilitiesClass.takeScreenShot("LaptopAndNotebooks7");

	}

	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
	    item.sonyValoWishList();
		   logger.info("user click on heart icon for Sony Vaio.");

	}

	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() throws IOException {
	    item.getSuccessMessage();
		   logger.info("user should see a message on this page.");
		   UtilitiesClass.takeScreenShot("LatopAndNotebooks");

	}

	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
	   item.clickOnMacBookPro();
	   logger.info("user will click on macBook Pro");

	}

	@Then("User should see  {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) throws IOException {
	    item.getMacBookPriceTag(string);
		   logger.info("user will see price tag for macBook pro.");

	}


}
