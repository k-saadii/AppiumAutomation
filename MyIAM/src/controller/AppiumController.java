package controller;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppiumController {

	public static WebDriver driver;
	public static AppiumController instance = new AppiumController();

	public void start() throws MalformedURLException {
		String driverPath = "/Users/saadkhan/Downloads/";
		System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver");
		if (driver != null) {
			return;
		}
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
		
	}
}
