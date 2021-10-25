package pageObjectsDstv;

import org.openqa.selenium.By;

import frameWorkClasses.BasePage;

public class SignIn extends BasePage{
	
	public void enterPassword(String moviewPassword) {
		EnterText(By.xpath("//input[@id='Password']"), moviewPassword);
	}
	
	public void clickSignInButton() {
		ClickElement(By.xpath("//button[@id = 'btnSubmit']"));
	}
	
	public String checkUserError() {
		return getElementText(By.xpath("//span[@id= 'EmailOrMobileNumber-error']"));
			
	}

}
