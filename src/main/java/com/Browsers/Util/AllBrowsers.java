package com.Browsers.Util;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.Utils.Properties.PropertiesClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllBrowsers extends PropertiesClass{
	
	public static WebDriver driver;
	
	public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE = "\u001B[34m";
    
	public static WebDriver startBrowser(String browserName, String Weburl) {

		if (browserName.equals("chrome")) {
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(co);
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equals("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else if (browserName.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		else {
			System.out.println("Browser is not found");
		}

		driver.manage().window().maximize();
		driver.get(Weburl);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		return driver;
	}

	public static void quitBrowser() {
		driver.quit();
	}

}
