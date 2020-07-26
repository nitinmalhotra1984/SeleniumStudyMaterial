/*
 * In this program, we talk about the usage of forward and back buttons on browser
 */


package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumVideo2 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Nitin\\Programming\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		System.out.println("title of the page is " + driver.getTitle());
		
		driver.navigate().to("http://www.rediff.com");
		System.out.println("the title of the page is changed to " + driver.getTitle());
		
		driver.navigate().back();
		System.out.println("the title of the page is back to " + driver.getTitle());
		
		driver.navigate().forward();
		System.out.println("the title of the page is forwarded to " + driver.getTitle());
		
		driver.quit();
		
		

	}

}
