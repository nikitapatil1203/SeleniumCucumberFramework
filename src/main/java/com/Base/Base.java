package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	 public static  WebDriver driver;
	
	 private static ThreadLocal<WebDriver> tlWebDriver = new ThreadLocal<>();
	 
	 
	  public static void setWebDriver(WebDriver driver)
	  {
		  tlWebDriver.set(driver); 
	  }
	  
	  public static WebDriver getDriver()
	  {
		  return tlWebDriver.get();
	  }
	  
	
	   //launch browser
       public static void launchBrowser(String browserName)
       {
    	   if(browserName.equalsIgnoreCase("chrome"))
    	   {
    		   System.setProperty("webdriver.chrome.driver", "/Users/nikitapatil/Downloads/chromedriver-mac-x64/chromedriver");
    		   setWebDriver(new ChromeDriver());      		   
    	   }
    	   else if(browserName.equalsIgnoreCase("firefox"))
    	   {
    		   
    	   }
       }
       
       
       //Get driver 
       public static WebDriver GetDriver()
       {
    	   return getDriver();
       }

}
