package testRunner;
import MyMavenProject.FirstProject.WebDriverFactory;
import excelUtils.ExcelUtils;

public class testSuiteRunner {
	
	WebDriverFactory wdf;
	ExcelUtils EU;
	
	public testSuiteRunner() {
		super();
		this.wdf = wdf;
		this.EU = EU;
	}



	public static void main(String[] args) {
		ExcelUtils EU = new ExcelUtils();
		EU.testDriverFile();
	}
}
