package loans;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoan1 {
	
	
	@Test
	public void homeLoan1()
	{
		System.out.println("FNB - HomeLoanApplication");
	}
	
	@Test
	public void fNBHoneLoans()
	{
		System.out.println("Loan declined");
		
		Assert.assertTrue(false);
	}
	@Test
	public void fNBFraudTestCase()
	{
	
		System.out.println("Fraud Test case 1");
	}

	@BeforeTest
	@AfterTest
	public void cleanDB() {

		System.out.println("Run the database before we start");

	}
}

