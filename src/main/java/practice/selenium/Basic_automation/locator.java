package practice.selenium.Basic_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class locator extends BaseDriver {
	@BeforeClass
	public void openUrl() {
		driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
	}
	@Test
	public void locatorByClass() throws InterruptedException {
		WebElement form = driver.findElement(By.linkText("New User"));
		Thread.sleep(2000);
		form.click();
	}
//	public void locatorById() throws InterruptedException {
//		WebElement login_Button = driver.findElement(By.id("name"));
////		Thread.sleep(5000);
//		login_Button.sendKeys("bayzidcom");
//		
//	}
}

