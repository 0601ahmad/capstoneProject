package capStonePageObjects;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.UtilitiesClass;

import CoreCapStone.BaseClass;

public class Desktop extends BaseClass {
	
	public Desktop() {
		PageFactory.initElements(driver, this);
			
	}
	@FindBy(xpath= "//a[text()='TEST ENVIRONMENT']")
	private WebElement text_To_Validate;
	public void textToValidateHomePage() {
		
		if(text_To_Validate.getText().equalsIgnoreCase("TEST ENVIRONMENT")) {
			logger.info("Text verified!");
		}else {
			logger.info("Text does not match!");
		}
	}
	@FindBy(xpath="//a[text()='Desktops'  and @class='dropdown-toggle']")
	private WebElement deskTops;
	public void clickOnDesktopTab() {
		deskTops.click();
	}
	@FindBy(xpath = "//*[text()='Show All Desktops']")
	private WebElement show_All_Desktops;
	public void clickOnShowAllDesktops() {
		show_All_Desktops.click();
	}
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]")
	private WebElement add_toCart_HP_LP3065;
	public void clickOnAddToCart() {
		add_toCart_HP_LP3065.click();
	}
	@FindBy(xpath = "//input[@name='quantity']")
	private WebElement quantity;//first we need to clear and then add the quantity in this box..
	public void inputQuantity() throws InterruptedException {
		quantity.clear();
		Thread.sleep(1000);
		quantity.click();
	}
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement add_to_Cart;
	public void addToCart() {
		add_to_Cart.click();
	}
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement get_message;
	public void getSuccessMessage(String string, String screen) throws InterruptedException, IOException {
		UtilitiesClass.highlightelementBorderAndBackground(get_message);
		UtilitiesClass.flash(get_message);
		UtilitiesClass.specificElementTakeScreenShot(get_message, screen);

		String text = get_message.getText();

		logger.info(text);
		Thread.sleep(2000);
	
		
	}
	@FindBy(xpath = "/html/body/div[2]/div/div/div[4]/div[2]/div/div[2]/div[2]/button[1]/span")
	private WebElement add_toCart_Canon_5D;
	public void clickAddToCartCanon5D() {
		add_toCart_Canon_5D.click();
	}
	@FindBy(xpath = "//select[@id='input-option226']//option [@value='15']")
	private WebElement color_Red;
	public void selectColor() {
		color_Red.click();
	}
	@FindBy(xpath = "//img[@title='Canon EOS 5D Camera']")
	private WebElement canon_EOS_5D;
	public void clickOnCanonEos5D() {
		canon_EOS_5D.click();
	}
	@FindBy(xpath = "//a[text()='Reviews (0)']")
	private WebElement reviews;
	public void clickOnReview() {
		reviews.click();
	}
	@FindBy(xpath="//input[@name='name']")
	private WebElement enter_name;
	public void getName(String name) throws InterruptedException {
		//enter_name.sendKeys(name);
		UtilitiesClass.sendKeys(enter_name, name);
		Thread.sleep(3000);
	}
	@FindBy(xpath= "//textarea [@id='input-review']")
	private WebElement enter_review;
	public void writeReview(String review) throws InterruptedException {
		//enter_review.sendKeys(review);
		UtilitiesClass.sendKeys(enter_review, review);
		Thread.sleep(3000);
	}
	@FindBy(xpath = "//input[@value='5']")
	private WebElement select_good_rating;
	public void selectRating() {
		select_good_rating.click();
	}
	@FindBy(xpath = "//button[@id ='button-review']")
	private WebElement continue_Button;
	public void clickOnContinueButton() {
		continue_Button.click();
	}
	@FindBy(tagName = "div")
	private List <WebElement> home_page;

	public boolean homeElements() {
		List<WebElement> list = home_page;
		for (WebElement i: list) {
			String name = i.getText();
			System.out.println(name);

		}
		return false;
		
	}

	
}
	

	
	



	


