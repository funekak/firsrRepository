package loans;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frameWorkClasses.ReadExcel;

public class ExamTestScript {
	
	ReadExcel rExcel = new ReadExcel();
	
	@Test(dataProvider="getDataFromExcel")
	public void HomeLoan1FraudTest(String Name, String Surname, String Dependants) {
		System.out.println(Name + Surname + " " + Dependants);
		
	}
	@DataProvider
	public Object[][] getDataFromExcel() throws IOException{
		//retun rExcel.excellDP("excelDataDir", "ExcelData.xlsx", "Sheet");
		String excelDirectory = rExcel.getDataConfigPropeties("excelDataDir");
		Object[][] errObj = rExcel.getExcelData(excelDirectory+"ExcelData.xlsx", "Sheet1");
		
		
		
		return errObj;
	}

}
