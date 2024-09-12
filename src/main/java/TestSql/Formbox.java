package TestSql;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import GetExcelDataToPOM.BaseForm1;

public class Formbox extends BaseForm1 {
	WebDriver driver;
	//Action
	public Formbox clickform() {
		driver.findElement(By.xpath("//div[text()='Forms']")).click();
		return this;
		
	}
	
	public Formbox clickpratice() {
		driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
		return this;
	}
	
	
	//label
	public boolean name() {
		return driver.findElement(By.xpath("//label[text()='Name']")).isDisplayed();
	}
	
	
	public boolean email() {
		return driver.findElement(By.xpath("//label[text()='Email']")).isDisplayed();
	}
	
	
	public boolean gender() {
		return driver.findElement(By.xpath("//div[text()='Gender']")).isDisplayed();
	}
	
	
	public boolean mobile() {
       return driver.findElement(By.xpath("//small[text()='(10 Digits)']")).isDisplayed();
	}
	
	
	public boolean dob() {
		return driver.findElement(By.xpath("//label[text()='Date of Birth']")).isDisplayed();
	}
	
	
	public boolean subject() {
		return driver.findElement(By.xpath("//label[text()='Subjects']")).isDisplayed();
	}
	
	
	public boolean hobbies() {
	
		return	driver.findElement(By.xpath("//label[text()='Hobbies']")).isDisplayed();
	}
	
	
	public boolean picture() {
		return driver.findElement(By.xpath("//label[text()='Picture']")).isDisplayed();
	}
	
	public boolean CurrentAddress() {
		return driver.findElement(By.xpath("//label[text()='Current Address']")).isDisplayed();
	}
	
	
	public boolean StateandCity() {
		return driver.findElement(By.xpath("//label[text()='State and City']")).isDisplayed();
	}

}