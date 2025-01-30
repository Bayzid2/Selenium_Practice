package practice.selenium.Basic_automation;

import org.testng.annotations.Test;

public class openUrl extends BaseDriver{
	@Test
void open() {
	driver.get("https://www.facebook.com");
}
}
