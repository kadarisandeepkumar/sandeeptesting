package Com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//public static webDriverdriver;
public class firstclass {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
	}

	}


