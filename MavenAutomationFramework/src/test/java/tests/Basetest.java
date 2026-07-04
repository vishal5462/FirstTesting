package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basetest {
	
	@Test
	public void launchurl() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.astrovidhan.com/");
	}

}
