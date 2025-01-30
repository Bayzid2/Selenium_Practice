package com.bayzid.locator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import practice.selenium.Basic_automation.BaseDriver;

public class locateByCssSelector extends BaseDriver {
	@BeforeClass
	public void openUrl() {
		driver.get("https://www.daraz.com.bd/");
	}
	@Test
	public void locatorTagName()throws InterruptedException {
		
		WebElement login = driver.findElement(By.cssSelector("a.white"));
		Thread.sleep(2000);
		login.click();
	}
}