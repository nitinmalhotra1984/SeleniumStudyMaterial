package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropDownHandler_1 
{

	public static void main(String [] args)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		selectChoice(driver, "choice 1");
		selectChoice(driver, "choice 2 3");
		selectChoice(driver, "choice 6 2 3");
		
	}
	
	public static void selectChoice(WebDriver driver, String choiceValue)
	{
		List<WebElement> choiceList = driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));
		
		for(int i=0; i<choiceList.size();i++)
		{
			System.out.println(choiceList.get(i).getText());
			
			String choiceText = choiceList.get(i).getText();
			
			if(choiceText.equals(choiceValue))
			{
				choiceList.get(i).click();
				break;
			}
			
		}
	}
	
	
	
}
