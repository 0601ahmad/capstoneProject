package stepOfDefinitions;

import java.io.IOException;

import CoreCapStone.BaseClass;
import Utilities.UtilitiesClass;
import capStonePageObjects.HomePage;
import io.cucumber.java.en.*;

public class HomePageSteps extends BaseClass {
	
	HomePage home = new HomePage();
	
	@When("User click on Currency")
	public void user_click_on_currency() {
	    home.clickOnCurrency();
	    logger.info("User click on Currency Button.");
	}

	@When("User Choose Euro from dropdown")
	public void user_choose_euro_from_dropdown() {
	    home.clickOnEuro();
	    logger.info("user select the Euro option from the list.");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() throws IOException {
	    home.currencyValue();
	    logger.info("currency change to Euro sign.");
	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		home.clickOnShoppingCart();
		logger.info("user now click on shopping cart.");
	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() throws IOException {
		home.textFromShoppingCart();
		UtilitiesClass.takeScreenShot("hompageText");
		logger.info("shoppting cart is empty.");
	}

}
