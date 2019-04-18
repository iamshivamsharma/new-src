package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver 
{
	public static String chromepath;
	public static WebDriver driver;
	public void dynamic_launch() 
	{
		chromepath = System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver = new ChromeDriver();
		//driver.get("");
		driver.navigate().to("https://www.facebook.com/");
	}
}