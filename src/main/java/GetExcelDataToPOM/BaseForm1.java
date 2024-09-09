package GetExcelDataToPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class BaseForm1 {
	
	protected WebDriver driver;
	

	
	public	String fileName="";
	
	
	@DataProvider(name="logesh",parallel = !true)
	public String[][] details() throws Exception {
		String[][] excelData = Excel.getExcelData(fileName);
		return excelData;
	
	}
	
	
	
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
