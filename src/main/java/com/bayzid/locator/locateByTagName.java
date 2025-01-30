package com.bayzid.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import practice.selenium.Basic_automation.BaseDriver;
import java.util.List;


public class locateByTagName extends BaseDriver {
	@BeforeClass
	public void openUrl() {
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void locatorByTagName() throws InterruptedException {
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		
		Thread.sleep(2000);
		System.out.println("Size:"+tags.size());
	}
}