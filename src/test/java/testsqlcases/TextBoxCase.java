package testsqlcases;

import org.testng.annotations.Test;

import TestSql.BaseForm;
import TestSql.TextBox;

public class TextBoxCase extends BaseForm {
	@Test
	public void form() {
		new TextBox(driver)
		.ClickText()
		.enterusername("logesj")
		.enterEmail("logesh@gmail.com")
		.enteraddress("5\345 thoppu chetty st pulivalam")
		.entersureAddress("bhbchgfewfdhc")
		.submit();
		
		TextBox label =new TextBox(driver);
		label.fullName();
		label.email();
		label.address();
		label.sureaddress();
		
		
		
		
		
		
		
		
		
	}
	

}
