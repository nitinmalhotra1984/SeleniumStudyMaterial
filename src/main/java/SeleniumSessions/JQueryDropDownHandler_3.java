package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropDownHandler_3 
{
	public static void main(String [] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		selectChoices(driver,"All");
		
	}
	
	public static void selectChoices(WebDriver driver, String... choiceValues)
	{
		List<WebElement> choiceList = driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li//span[@class='comboTreeItemTitle']"));
		
		
		if(!choiceValues[0].equalsIgnoreCase("All"))
		{
			for(int i=0; i<choiceList.size(); i++)
			{
				String choiceText = choiceList.get(i).getText();
				
				for(int k=0; k<choiceValues.length; k++)
				{
					if(choiceText.equals(choiceValues[k]))
					{
						choiceList.get(i).click();
						break;
					}
				}
				
			}
			
		}
		else
		{
			try
			{
				for(int all=0; all<choiceList.size();all++)
				{
					choiceList.get(all).click();
				}
			}
			catch(Exception e)
			{
				
			}
			
		}
		
		
	}
}
