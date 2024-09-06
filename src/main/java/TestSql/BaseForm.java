package TestSql;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseForm {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void Startup() {
		String url = "https://demoqa.com/text-box";
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
	
	
	

}
