package com.january2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserlaunch {
public static WebDriver driver;
	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		
		driver=new FirefoxDriver();
driver.get("https://www.amazon.com");
		//System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		
		
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
	}

}
