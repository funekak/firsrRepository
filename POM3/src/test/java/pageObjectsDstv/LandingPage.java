package pageObjectsDstv;

import org.openqa.selenium.By;

import frameWorkClasses.BasePage;

public class LandingPage extends BasePage{
	
	public void hiWorld() {
		System.out.println("this works");
	}
	
	public void clickSignIn() {
		ClickElement(By.xpath("//img[@alt='Sign in']"));
		
	
		
		
	}

}
