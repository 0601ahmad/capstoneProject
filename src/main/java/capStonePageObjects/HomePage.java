package capStonePageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import CoreCapStone.BaseClass;
import Utilities.UtilitiesClass;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class HomePage extends BaseClass {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//span[text()='Currency']")
	private WebElement currency;
	public void clickOnCurrency() {
		
		UtilitiesClass.waitAndClickElement(currency);
	}
	@FindBy(xpath = "//button[@class = 'currency-select btn btn-link btn-block']")
	private List<WebElement> euro;
	public void clickOnEuro() {
		List<WebElement> list = euro;
		for (WebElement element: list) {
			String name= element.getText();
			if (name.equalsIgnoreCase("Euro")) {
				UtilitiesClass.waitAndClickElement(element);
				break;
			}
		}
	}
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currencyValue;
	public void currencyValue() throws IOException {
		String value =currencyValue.getText();
		String expected = "Currency";
		Assert.assertEquals(value, expected);
		
		UtilitiesClass.specificElementTakeScreenShot(currencyValue, "currencyValue");
	}
	@FindBy (xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement shopping_Cart;
	public void clickOnShoppingCart() {
		shopping_Cart.click();
	}
	@FindBy(xpath = "//p[contains(text(),'Your shopping')]")
	private WebElement text_From_shopping_Cart;
	public void textFromShoppingCart() {
		text_From_shopping_Cart.getText();
		
	}
}
