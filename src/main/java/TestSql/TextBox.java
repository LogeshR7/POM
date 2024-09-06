package TestSql;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class TextBox extends BaseForm {
	
	public TextBox(WebDriver driver) {
		 this.driver=driver;
		
	}
	
	//Action 1
	public TextBox ClickText() {
		driver.findElement(By.id("item-0")).click();
		return this;
	}
	
	//(label validtaion)
	
	
	  public boolean fullName() { 
		  return  driver.findElement(By.id("userName-label" )) .isDisplayed();
				
	  }
	  
	  public boolean email() {
		  return driver.findElement(By.id("userEmail-label")).isDisplayed();
	  }
	  
	  
	  public boolean address() {
		  return driver.findElement(By.id("currentAddress-label")).isDisplayed();
	  }
	  
	  public boolean sureaddress() {
		 return driver.findElement(By.id("permanentAddress-label")).isDisplayed();
	  }
	  
	  
	  //Action
	  public TextBox enterusername(String name) {
		  driver.findElement(By.id("userName")).sendKeys(name);
		  return this;
	  }
	  
	  public TextBox enterEmail(String email) {
		  driver.findElement(By.id("userEmail")).sendKeys(email);
		  return this;
	  }
	  
	  public TextBox enteraddress(String address) {
		  driver.findElement(By.id("currentAddress")).sendKeys(address);
		  return this;
	  }
	  
	  public TextBox entersureAddress(String sAdress) {
		  driver.findElement(By.id("permanentAddress")).sendKeys(sAdress);
		  return this;
	  }
	 
	  
	  public TextBox submit() {
		  driver.findElement(By.id("submit")).click();
		  return this;
	  }
	
	
	
	
	
	
	
	
	
	
	

}
