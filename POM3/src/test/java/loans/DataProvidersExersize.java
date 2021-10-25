package loans;

	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class DataProvidersExersize {
		
		@Test(dataProvider="personalData")
		public void HomeLoan1FraudTest(String username, String lastname, String Column3, String Column4, Boolean Column5) {
			System.out.println("Home Loan1 Fraud Test");
			
		}
		@DataProvider(name = "personalData")
		public Object[][] getData()
		{
			//Iterations
			//1st user aname and pass - good credit history
			//2nd user name and pass  - no credit history
			//3rd user name and pass - fraudelant credit history
			
			//define an multi dimensional object erray with 3 rows and 2 columns
			//3 rows for the number of test cases
			//2 columns for the number of values passed in
			
			Object[][] data = new Object[10][5];  //instatiating a table 3 rows and 2 columns
			
			//1st set
			data[0][0]="firstusername";  ///row 0, column 0
			data[0][1]="firstlastname";
			data[0][2]="Address1";
			data[0][3]="Adress2";
			data[0][4]= true;
			
			//2nd set
			data[1][0]="secondusername";
			data[1][1]="secondlastname";
			data[1][2]="Address1";
			data[1][3]="Adress2";
			data[1][4]=false;
			
			//3rd set
			data[2][0]="thirdusername";   //row 2, column 0
			data[2][1]="thirlastname";
			data[2][2]="Address1";
			data[2][3]="Adress2";
			data[2][4]=true;
			
			//4th set
			data[3][0]="forthusername";
			data[3][1]="forthlastname";
			data[3][2]="Address1";
			data[3][3]="Adress2";
			data[3][4]=false;
			
			//5th set
			data[4][0]="fifthusername";
			data[4][1]="fifthlastname";
			data[4][2]="Address1";
			data[4][3]="Adress2";
			data[4][4]=true;
			
			//6th set
			data[5][0]="sisthusername";
			data[5][1]="sisthlastname";
			data[5][2]="Address1";
			data[5][3]="Adress2";
			data[5][4]=false;
			
			//7th set
			data[6][0]="seventhusername";
			data[6][1]="seventhlastname";
			data[6][2]="Address1";
			data[6][3]="Adress2";
			data[6][4]=true;
			
			//8th set
			data[7][0]="eigthusername";
			data[7][1]="eigthlastname";
			data[7][2]="Address1";
			data[7][3]="Adress2";
			data[7][4]=false;
			
			//9th set
			data[8][0]="ninthusername";
			data[8][1]="ninthlastname";
			data[8][2]="Address1";
			data[8][3]="Adress2";
			data[8][4]=true;
			
			//10th set
			data[9][0]="tenthusername";
			data[9][1]="tenghlastname";
			data[9][2]="Address1";
			data[9][3]="Adress2";
			data[9][4]=false;
			
			return data;
		}
	}


