package com.bayzid.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import practice.selenium.Basic_automation.BaseDriver;

public class nevigate extends BaseDriver {

	@BeforeClass
	public void getUrl() {
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
	}
	@Test
	public void nevigateDemo() throws InterruptedException {
		WebElement logo = driver.findElement(By.xpath("//header/div[1]/a[1]/*[1]"));
		Thread.sleep(2000);
		logo.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().forward();
		
	}
}
