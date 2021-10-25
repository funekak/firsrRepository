package testDstv;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import pageObjectsDstv.LandingPage;
import pageObjectsDstv.SignIn;


public class MovieMagicTest {
	
	public class MovieMagicTests {
		//instatiate the page objects
		LandingPage lp = new LandingPage();
		SignIn sn  = new SignIn();
		
		@Test
		public void GIVEN_NavigationToSigninPage_WHEN_OnlyPasswordEntered_AND_SignInButtonClicked_THEN_Error() {
		
		//Given
			//goHome
			lp.clickSignIn();
			//Enter password("jklpmn")
			sn.enterPassword("garbage");
			
		//WHEN
		
			sn.clickSignInButton();
			
			String actual = sn.checkUserError();
			String expected = "Email or Mobile number is required";
			
			
			//THEN
			Assert.assertEquals(actual, expected);
		}
		@AfterSuite
		public void cleanup() {
			lp.cleanUp();
		}
		
	}

}
