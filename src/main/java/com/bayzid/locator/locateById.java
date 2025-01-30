package com.bayzid.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import practice.selenium.Basic_automation.BaseDriver;

public class locateById extends BaseDriver {
	@BeforeClass
	public void openUrl() {
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	}
	@Test
	public void locatorById() throws InterruptedException {
		
		WebElement form = driver.findElement(By.id("name"));
		Thread.sleep(2000);
		form.sendKeys("Bayzid");
	}
	
}
