package loans;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PersonalLoan2 {
	
	@Test
	public void CapitecHomeLoans() { System.out.println("Capitec - HomeLoanApplication");
	
	String expected ="Failed test";
	String actual = "Failed test case";
	
	Reporter.log("expected.................." + expected);
	Reporter.log("actual...................." + actual);
	
	Assert.assertTrue(false); 
	
	}
	
	@Test
	public void ApprovedApplication() {System.out.println("Status - Approved Application");}

	@Test(groups={"Smoke"})
public void TestingGroupsOne() {
	System.out.println("Testing groups test 1");
	
	}
	@Test(groups={"Smoke"})
public void TestingGroupsTwo() {
	System.out.println("Testing groups test 2");
}
}