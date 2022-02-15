package CoreCapStone;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Properties property;
	public static Logger logger;
	String propertyPath = ".\\src\\test\\resources\\newInput\\capStone.properties";
	String logPath = ".\\src\\test\\resources\\newInput\\copstoneLogFourJ.properties"; 
	
	@SuppressWarnings("static-access")
	public BaseClass() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(propertyPath));
			property = new Properties();
			property.load(reader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger = logger.getLogger("logger_File");
		PropertyConfigurator.configure(logPath);
	}
	public static String selectUrl() {
		String url = property.getProperty("url");
		return url;
	}
	public static String selectBrowser() {
		String browser = property.getProperty("browser");
		return browser;
	}
	public static void openUrl() {
		driver.get(selectUrl());
	}
	public static void closeBrowser() {
		driver.close();
		driver.quit();
	}
	public static void whichbrowser() {
		
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

}
	
}
