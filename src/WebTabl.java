import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabl 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\seleniumNew\\SeleniumDay3\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		for(int i=0;i<tRows.size();i++)
		{
		List<WebElement> tdata=tRows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<tdata.size();j++)
			{
				String name=tdata.get(j).getText();
				System.out.println(name);
			}
		}
		//driver.quit();
	}
}


