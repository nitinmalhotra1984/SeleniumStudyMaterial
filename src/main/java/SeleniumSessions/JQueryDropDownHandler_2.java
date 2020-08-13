package SeleniumSessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropDownHandler_2 
{
	public static void main(String [] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		selectChoiceValue(driver,"choice 2","choice 2 3", "choice 6 2 3");
		selectChoiceValue(driver,"choice 7");
		

	}
	
	public static void selectChoiceValue(WebDriver driver, String... choiceValue) //string array parameter
	{
		List<WebElement> choiceValuesList = driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));
		
		for(int i=0; i<choiceValuesList.size();i++)
		{
			String choiceValueText = choiceValuesList.get(i).getText();
			
			for(int k=0; k<choiceValue.length; k++)
			{
				if(choiceValueText.equals(choiceValue[k]))
				{
					choiceValuesList.get(i).click();
					break;
				}
			}
			
			
			
		}
		
	}
	
	
	
}
