package MyMavenProject.FirstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageFactory.LoginPageObjects;

/**
 * Hello world!
 *
 */
public class Functions extends WebDriverFactory
{
	
	public Functions() {
		super();
	}
	public void invokeBrowser()
	{
		try {
		PageFactory.initElements(driver, LoginPageObjects.class);
		driver.get("https://www.rediff.com");
		Thread.sleep(5000);
		verifyObject(LoginPageObjects.lnkCreateAccount);
		if(LoginPageObjects.lnkCreateAccount.isDisplayed()) {
			System.out.println("Create account hyperlink displayed");
			performClickOperation(LoginPageObjects.lnkCreateAccount);
			LoginPageObjects.txtFirstName.sendKeys("Hello");
		}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	
}
