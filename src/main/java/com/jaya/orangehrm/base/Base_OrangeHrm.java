package com.jaya.orangehrm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_OrangeHrm {
public static Properties pro;
public static WebDriver driver;

public Base_OrangeHrm()
{
 
 try {
	 pro=new Properties();
	FileInputStream fi=new FileInputStream("C:\\Users\\dell\\OlderEclipse\\Selenium_OrangeHrm\\src\\main\\java\\com\\jaya\\orangehrm\\config\\config.property");
	try {
		pro.load(fi);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
}


public static void initialization()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\chromedriver\\chromedriver.exe");
	String browserName=pro.getProperty("browser");
	if(browserName.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if (browserName.equals("FF")) 
	{
	  driver=new FirefoxDriver();	
	}
	driver.manage().window().maximize();
	//driver.manage().deleteAllCookies();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(pro.getProperty("url"));
	
}










}
