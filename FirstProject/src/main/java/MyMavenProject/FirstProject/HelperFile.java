package MyMavenProject.FirstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperFile {
	
	public void verifyObject(WebElement element) {
		try {
			
			if(element.isDisplayed()) {
				System.out.println("The element "+element.getText()+" displayed as expected");
			}
			else {
				System.out.println("The element is NOT displayed as expected");
			}
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void performClickOperation(WebElement element) {
		try {
			if(element.isDisplayed()) {
				System.out.println("The element "+element+" displayed as expected");
				element.click();
			}
			else {
				System.out.println("The element "+element+" NOT displayed as expected");
			}
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void takeScreenshot()
	{
		
	}
}
