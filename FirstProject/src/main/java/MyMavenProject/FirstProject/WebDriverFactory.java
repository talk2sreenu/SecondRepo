package MyMavenProject.FirstProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory extends HelperFile{
	public WebDriver driver;
	
	public WebDriverFactory()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\talk2\\Desktop\\Selenium_Tutorials\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
}
