package second;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basesecond {
	public static Properties ch;
	
	public static String projectpath=System.getProperty("user.dir");
	public static WebDriver driver;
	public static FileInputStream fis;
	public static void inhit() throws Exception
	{
		System.out.println("properties file loading");
		fis=new FileInputStream(projectpath+"//data1.properties");
		ch=new Properties();
		ch.load(fis);
	}
	
	public static void launchingbrowser(String browser) {
	
		if(ch.getProperty(browser).equals("chrome"))
		
		{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(ch.getProperty(browser).equals("firefox")){
		System.setProperty("webdriver.gecko.driver","C:\\selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe" );
      driver=new FirefoxDriver();
      
}}
	public static void navigateurl(String  url) {
	driver.get(ch.getProperty(url));
	}}