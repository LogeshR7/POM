package GetExcelDataToPOM;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestSql.BaseForm;
import TestSql.TextBox;

public class TextBoxCase extends BaseForm1 {
	
	@BeforeTest
	public void s() {
		fileName="formdata";
	}
	
	
	
	@Test(dataProvider = "logesh")
	public void form(String []data) {
		new TextBox(driver)
		.ClickText()
		.enterusername(data[0])
		.enterEmail(data[1])
		.enteraddress(data[2])
		.entersureAddress(data[3])
		.submit();
		
		TextBox label =new TextBox(driver);
		boolean name=label.fullName();
		assertTrue(name);
		boolean email = label.email();
		assertTrue(email);
		boolean address = label.address();
		assertTrue(address);
		boolean sureaddress = label.sureaddress();
		assertTrue(sureaddress);
		
		
		
		
		
		
		
		
		
	}
	

}
