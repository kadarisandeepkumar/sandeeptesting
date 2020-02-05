package com.january2020;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

        public class basetest {
	    public static WebDriver driver;
	    public static String projectpath=System.getProperty("user.dir");
	    public static Properties p; 
	    
		public static void inhit() throws IOException{
			FileInputStream fis= new FileInputStream(projectpath+"//data.properties");
			 p=new Properties();
			p.load(fis);
	    System.out.println("PROPERTIES FILES IS LOADING");
	   
	    
		} 
		public static void browserlaunching(String browser) 
		
		{
			if(p.getProperty(browser).equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			   driver=new ChromeDriver();
			}
			   else if(p.getProperty(browser).equals("firefox")) {
				  // System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
				   driver=new FirefoxDriver();
			   }

	}


        
        public static void launchingurl( String url) {
        	driver .get(p.getProperty(url));
        	
        	
        }}  	
        	
        