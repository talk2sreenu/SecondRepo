package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {

	@FindBy(how=How.LINK_TEXT, using="Create a Rediffmail account")
	public static WebElement lnkCreateAccount;
	
	@FindBy(how=How.XPATH, using="//td[.='Full Name']/following::input[1]")
	public static WebElement txtFirstName;
}
