package loans;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PersonalLoan1 {
	
	@Test
	@Parameters({"URL"})
	public void StandardBankHomeLoans( String URL) { System.out.println("Standard Bank - HomeLoanApplication");
	System.out.println("This is the URL parameter" + URL);}
	
	@Test(enabled=false)
	public void NewApplication() {System.out.println("New Application  - Awaiting documents status");}

}
