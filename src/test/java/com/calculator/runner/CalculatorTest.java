package com.calculator.runner;


	import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

	public class CalculatorTest {
		
		AndroidDriver<WebElement>driver;
		
		  
		 DesiredCapabilities cap = new DesiredCapabilities();
		  
		  
		  @BeforeTest public void calConfig() {
		  cap.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		  cap.setCapability("platformName","emulator-5554");
		  cap.setCapability("appPackage","com.android.calculator2");
		  cap.setCapability("appActivity",".Calculator"); }
		 
		
		@Test
		public void testCal() throws MalformedURLException, InterruptedException {
			WebDriverWait wait;
			
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			
			wait = new WebDriverWait(driver, 30);
			
			
			driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Numbers and basic operations\"]/android.view.ViewGroup[1]/android.widget.Button[4]")).click();;
			
			driver.findElement(By.id("com.android.calculator2:id/op_add")).click();;
			
			driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Numbers and basic operations\"]/android.view.ViewGroup[1]/android.widget.Button[4]")).click();;
			
			driver.findElement(By.id("com.android.calculator2:id/eq")).click();
			
			String total = driver.findElement(By.id("com.android.calculator2:id/result")).getText();
			
			Assert.assertEquals(total,"8");
		}
		


	



}
