package loans;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvisersPractise {
	
	@Test(dataProvider="memberData")
	public void HomeLoan1FraudTest(String Name, String Surname, String Dependants) {
		System.out.println("Home Loan1 Fraud Test");
		System.out.println(Name + Surname + " " + Dependants);
		
	}
	@DataProvider
	public Object[][] memberData()
	{
		//Iterations
		//1st user aname and pass - good credit history
		//2nd user name and pass  - no credit history
		//3rd user name and pass - fraudelant credit history
		
		//define an multi dimensional object erray with 3 rows and 2 columns
		//3 rows for the number of test cases
		//2 columns for the number of values passed in
		
		Object[][] data = new Object[3][2];  //instatiating a table 3 rows and 2 columns
		
		//1st set
		data[0][0]="firstusername";  ///row 0, column 0
		data[0][1]="firstusername";
		
		//2nd set
		data[1][0]="secondusername";
		data[1][1]="secondusername";
		
		//3rd set
		data[2][0]="thirdusername";   //row 2, column 0
		data[2][1]="thirusername";
		
		return data;
	}
}