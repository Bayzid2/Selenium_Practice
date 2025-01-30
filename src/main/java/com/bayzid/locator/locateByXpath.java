package com.bayzid.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import practice.selenium.Basic_automation.BaseDriver;

public class locateByXpath extends BaseDriver {
	@BeforeClass
	public void openUrl() {
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	}
	@Test

	
	public void locatorByXPath() throws InterruptedException {
		WebElement name_field = driver.findElement(By.xpath("//form[@id='practiceForm']/div[1]/div/input"));
		Thread.sleep(2000);
		name_field.sendKeys("Bayzid");
		
		WebElement email = driver.findElement(By.xpath("//form[@id='practiceForm']/div[2]/div/input"));
		System.out.println(email.getAttribute("placeholder"));
		email.sendKeys("Bayzid@gmail.com");
		
		
		
		WebElement gender_male = driver.findElement(By.xpath("//form/div[3]/div[1]/div[1]/div[1]/input"));
		gender_male.click();
		Thread.sleep(2000);
	}
}