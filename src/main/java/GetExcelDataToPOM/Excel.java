package GetExcelDataToPOM;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {
	
	public static String[][] getExcelData (String filename)throws Exception {
		//String fileLocation="./Excel/formdata.xlsx";
		
		XSSFWorkbook wbook=new XSSFWorkbook("./Excel/"+filename+".xlsx");
		
		//Sheet
		XSSFSheet sheet = wbook.getSheetAt(0);
		
		//last row
		int lastRowNum = sheet.getLastRowNum();
		
		//lastcell
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		String[][] data=new String[lastRowNum][lastCellNum];
	
		for(int i=1;i<=lastRowNum;i++) {
		//get row
		XSSFRow row = sheet.getRow(i);
		
		for(int j=0;j<lastCellNum;j++) {
		//get cell
		XSSFCell cell = row.getCell(j);
		
		//data
		DataFormatter formate=new DataFormatter();
		String value = formate.formatCellValue(cell);
		//String value=cell.getStringCellValue();
		System.out.println(value);
		data[i-1][j]=value;
		}
		}
		wbook.close();
		return data;
		
		
	}
	
	

}
