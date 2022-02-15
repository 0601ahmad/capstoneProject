package Utilities;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
//import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import CoreCapStone.BaseClass;
public class UtilitiesClass extends BaseClass {
	
	
	public static WebDriverWait wait;
	public static void waitAndClickElement(WebElement element) {
		boolean clicked = false;
		int attempts = 0;
		while (!clicked && attempts < 10) {
			try {
				wait = new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.elementToBeClickable(element)).click();
				System.out.println("successfully clicked on the WebElement: "+element.toString());
				clicked =true;
			}catch(Exception e){
				try{
				logger.info("Failed to click the element");
				}catch (Exception e2) {	
				}
				Assert.fail("Unable to click the element: "+ "="+ element.toString());
			}
			attempts++;	
			}
			
	}
		public static void compareText(String actualText, String expectedText) {

			if (actualText.equalsIgnoreCase(expectedText)) {
				System.out.println(actualText + " = " + expectedText + "Passed");
			} else {
				System.out.println(actualText + " != " + expectedText + "Failed");
			}
		}
		public static void highlightAndTakeScreenShot(String fileName, WebElement element) throws IOException {
			highlightelementBorderAndBackground( element);
			takeScreenShot(fileName);
			
		}
	
		// method for taking screenshots
		public static void takeScreenShot(String fileName) throws IOException {
			// we need to create a folder at project level and store the path here so that
			// when even we take screenshots, they are all saved in that specific folder
			String path = "D:\\Bootcomp\\Java\\work space for java projet\\com.capStone\\output\\screenShots";
			// I create object of the file class
			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			// After taking the screenshot, take the file and store it in a location in my
			// computer
			// and also I want to provide the file_name and the extension
			FileUtils.copyFile(file, new File(path + fileName + ".png"));
		}
		public static void specificElementTakeScreenShot(WebElement section, String fileName) throws IOException {
			String path = "D:\\Bootcomp\\Java\\work space for java projet\\com.capStone\\output\\screenShots";
			File src = section.getScreenshotAs(OutputType.FILE);
			File target = new File(path+fileName+".png");
			FileUtils.copyFile(src, target);
			
		}

		// JSExecutor methods start
		// .click()
		// if the .click() does not work, then we get the help JSExecuter
		public static void clickWithJSE(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
		}

		// How we can give border to an element on webpage
		public static void highlightelementRedBorder(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.border='2px solid red'", element);
		}

		// How we can highlight an element background
		public static void highlightelementBackground(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].style.background='blue'", element);
		}

		// What if we want to do both/above with same method?
		// give border and highlith
		public static void highlightelementBorderAndBackground(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
		}

		// How we can scroll down the page with JSExecutor
		public static void scrolldownPage() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}

		// how to sendkeys with JSExecutor
		public static void sendKeys(WebElement element, String value) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value='" + value + "'", element);
		}
		
		public static void flash(WebElement element) {
			
			String bgcolor = element.getCssValue("backgroundColor");
			
			for (int i=0;i<5;i++) {
				changeColor("#FF0000", element);
				changeColor(bgcolor, element);
			}
		}
		public static void changeColor(String color, WebElement element) {
			JavascriptExecutor js =((JavascriptExecutor)driver);
			js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
			
			try {
				Thread.sleep(20);
			}catch (InterruptedException e) {
		}


	}
}


