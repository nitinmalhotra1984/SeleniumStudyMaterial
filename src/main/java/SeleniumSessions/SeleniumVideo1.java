package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumVideo1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Nitin\\Programming\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("http://www.google.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google"))
		{
			System.out.println("test is passed");
		}
		else
		{
			System.out.println("test is failed");
		}
		
		driver.quit();
		
		
		
	}

}
