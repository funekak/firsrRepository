package loans;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomeLoan2 {

	@Test
	public void ABSAHomeLoans() {
		System.out.println("ABSA - HomeLoanApplication");
	}

	@Test
	public void NewHomeLoanApplication() {
		System.out.println("Loan approved");
	}
	@Test
	public void ABSAFraudTestCases() {

		System.out.println("Fraud test case 2");
	}
	@BeforeSuite
	public void GlobalVariables() {
		System.out.println("Set global vars before we start");
		
	}
	@AfterSuite
	public void GlobalVariablesReset() {
		System.out.println("Reset global vars");
		
			}
		
	}

