package com.bit.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	
     public static WebDriver driver;
    
	public static WebDriver Open() {
		if (driver==null) {
		driver=new ChromeDriver();
		driver.get("https://www.express.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);}
		
		return driver;
	}
	public static void closeBrowser() {
		driver.quit();
		
	}
}
