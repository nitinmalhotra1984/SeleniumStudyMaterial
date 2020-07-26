package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchTest 
{
	WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void verifyPageTitle()
	{
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
}
