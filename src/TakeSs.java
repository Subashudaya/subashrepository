import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSs {

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\seleniumNew\\SeleniumPracti\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		TakesScreenshot tk=(TakesScreenshot) driver;
		File s=tk.getScreenshotAs(OutputType.FILE);
		File d=new File("C:\\Users\\hp\\seleniumNew\\SeleniumPracti\\out.png");
		FileUtils.copyFile(s, d);
		
	}

}
