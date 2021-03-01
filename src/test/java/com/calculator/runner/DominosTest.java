package com.calculator.runner;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DominosTest {
	AndroidDriver<WebElement>driver;
	
	  
	 DesiredCapabilities cap = new DesiredCapabilities();
	  
	  
	  @BeforeTest public void calConfig() {
	  cap.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
	  cap.setCapability("platformName","android");
	  cap.setCapability("appPackage","com.Dominos");
	  cap.setCapability("appActivity",".activity.SplashActivity"); 
	  }
	
	  @Test
		public void testDominos() throws MalformedURLException, InterruptedException {
		
		  WebDriverWait wait;
		  
		  	driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			
			wait = new WebDriverWait(driver, 30);
			
			String vegPizza = driver.findElement(By.id("com.Dominos:id/imageView1")).getText();
			driver.findElement(By.id("com.Dominos:id/imageView1")).click();
			
						
			driver.findElement(By.id("c4c92a4d-703b-4e1c-9c3f-ad4c3618dd5e")).click();;
			
			String actual = driver.findElement(By.xpath("//*[text()='The Unthinkable Pizza']")).getText();
			
			driver.findElement(By.id("com.Dominos:id/view_cart_btn")).click();;
			
			driver.findElement(By.id("com.Dominos:id/iv_close")).click();
			
			
			driver.findElement(By.id("com.Dominos:id/view_cart_btn"));
			
			
	  }

}
