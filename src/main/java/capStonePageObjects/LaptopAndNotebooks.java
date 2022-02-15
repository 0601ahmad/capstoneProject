package capStonePageObjects;

import java.io.IOException;

//import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CoreCapStone.BaseClass;
import Utilities.UtilitiesClass;
import junit.framework.Assert;


@SuppressWarnings("deprecation")
public class LaptopAndNotebooks extends BaseClass {
	public LaptopAndNotebooks() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//a[text()='TEST ENVIRONMENT']")
	private WebElement text_To_Validate;
	public void textToValidateHomePage() throws IOException {
		
		String text = text_To_Validate.getText();
		String expected = text;
		Assert.assertEquals(text, expected);
		UtilitiesClass.takeScreenShot("LaptoAndNotebooks1");
	}
	@FindBy (xpath = "//a[text()='Laptops & Notebooks' and @data-toggle]")
	private WebElement laptops_And_Notebooks;
	public void clickOnLaptopsAndNotebooksTab() {
		laptops_And_Notebooks.click();
	}
	@FindBy (xpath = "//*[contains(text(),'Show All Laptops & ')]")
	private WebElement show_All_laptops_Notebooks;
	public void clickOnShowAllLaptops() {
		show_All_laptops_Notebooks.click();
	}
	@FindBy(xpath ="//img[@title='MacBook']")
	private WebElement macBook;
	public void clickOnMacbook() {
		macBook.click();
	}
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCart;
	public void clickOnAddToCart() {
		addToCart.click();
	}
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement get_message;
	public void getSuccessMessage() throws IOException {
		String text = get_message.getText();
		String expected = text;
		Assert.assertEquals(text, expected);
		UtilitiesClass.highlightelementBorderAndBackground(get_message);
		UtilitiesClass.takeScreenShot("LaptopAndNotebooks2");
	}
	@FindBy(xpath = "//*[text()=' 1 item(s) - $602.00']")
	private WebElement cart_text;
	public String getTextShowOnCart(String text) throws IOException {
		 text = cart_text.getText();
		 UtilitiesClass.takeScreenShot("LaptopAndNotebooks3");
		return text;
	}
	@FindBy(xpath="//*[text()=' 1 item(s) - $602.00']")
	private WebElement click_On_Cart;
	public void clickOnCart() {
		click_On_Cart.click();
	}
	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement click_On_Red_X;
	public void clickOnRemoveButton() throws IOException {
		click_On_Red_X.click();
	 UtilitiesClass.takeScreenShot("LaptopAndNotebooks5");

	}
	@FindBy(xpath = "//span [@id='cart-total']")
	private WebElement cart_Empty;
	public String cartEmptytext(String text) {
		text = cart_Empty.getText();
		return text;
	}
	@FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[position()=2]")
	private WebElement macBook_Comparison;
	public void mackBookProductComparison() {
		macBook_Comparison.click();
	}
	
	@FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[position()=3]")
	private WebElement macBookAir_Comparison;
	public void mackBookAirProductComparison() {
		macBookAir_Comparison.click();
	}
	@FindBy(xpath = "//*[contains(text(),'product com')]")
	private WebElement product_Com_link;
	public void productComparisonLink() throws InterruptedException {
		Thread.sleep(2000);
		product_Com_link.click();
	}
	@FindBy(xpath = "//strong[text()='Product Details']")
	private WebElement product_chart;
	public void productComparisonChart() {
		String text = product_chart.getText();
		logger.info(text);
	}
	@FindBy(xpath = "(//button[@data-original-title='Add to Wish List'])[position()=5]")
	private WebElement sony_Valo_WishList;
	public void sonyValoWishList() {
		sony_Valo_WishList.click();
	}
	@FindBy(xpath = "//img[@alt='MacBook Pro']")
	private WebElement macBook_Pro;
	public void clickOnMacBookPro() {
		macBook_Pro.click();
	}
	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement macBookPro_priceTag;
	public String getMacBookPriceTag(String price) throws IOException {
		price = macBookPro_priceTag.getText();
		UtilitiesClass.specificElementTakeScreenShot(macBookPro_priceTag, "LatopAndNotebooks6");
		return price;
		
	}
}
