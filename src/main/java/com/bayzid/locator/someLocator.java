package com.bayzid.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import practice.selenium.Basic_automation.BaseDriver;

public class someLocator extends BaseDriver{

//	@BeforeClass
//	public void openUrl() {
//		
//		
//	}
	@Test
    public void Some_locator() throws InterruptedException {
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement useId = driver.findElement(By.id("fullname"));
		useId.sendKeys("Raiyan");
		
		Thread.sleep(2000);
		WebElement Name = driver.findElement(By.name("email"));
		Name.sendKeys("Raiyan@gmail.com");
		
		Thread.sleep(2000);
		WebElement byCSS = driver.findElement(By.cssSelector("textarea#address.form-control"));
		byCSS.sendKeys("Dhaka,Bangladesh");
		
		Thread.sleep(2000);
		WebElement byXPath = driver.findElement(By.xpath("//label[contains(text(),'Password')]"));
		System.out.println(byXPath.getText());
		Thread.sleep(2000);
		
		WebElement placeHolder = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		placeHolder.sendKeys("12345678");
		
		useId.clear();
//		WebElement byText = driver.findElement(By.linkText("Full Name :"));
//		byText.sendKeys("Ayman");
//		Thread.sleep(2000);
		useId.sendKeys("Ayman");
		
}
	
	@Test(priority=1)
	public void SecondClass() {
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
		driver.manage().window().maximize();
		
		WebElement radioButton = driver.findElement(By.xpath("//form/div[3]/input"));
		radioButton.click();
		
		
	}
	
}
