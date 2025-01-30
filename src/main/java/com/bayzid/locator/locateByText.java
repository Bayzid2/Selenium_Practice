package com.bayzid.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import practice.selenium.Basic_automation.BaseDriver;

public class locateByText extends BaseDriver {
	@BeforeClass
	public void openUrl() {
		driver.get("https://www.facebook.com/");
	}
	@Test
//	public void locatorByText() throws InterruptedException {
//		
//		WebElement form = driver.findElement(By.linkText("Forgotten password?"));
//		Thread.sleep(2000);
//		form.click();
//	}
	
	public void locatorByPartialText() throws InterruptedException {
		WebElement form = driver.findElement(By.partialLinkText("Forgotten"));
		Thread.sleep(2000);
		form.click();
	}
}