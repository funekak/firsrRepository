package pageObjectsGuruTelecom;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.interactions.Actions;

import frameWorkClasses.BasePage;

public class AddCustomer extends BasePage {

	public void addCustomer() {
		ClickElement(By.linkText("Add Customer"));
	}

	public String checkHeading1() {
		return getElementText(By.linkText("Guru99 telecom"));

	}

	public String checkHeading2() {
		return getElementText(By.tagName("h1"));
	}

	public void selectDoneRadioButton() {
		// ClickElement(By.xpath("//input[@id = 'done']"));
		ClickElement(By.xpath("//label[contains(text(), 'Done')]"));

	}

	public void CapturePersonalDetails(String fname, String lname) {
		EnterText(By.id("fname"), fname);
		EnterText(By.name("lname"), lname);
	}

	public void CaptureAddresses(String email, String address) {
		EnterText(By.id("email"), email);
		EnterText(By.name("addr"), address);
	}

	public void CaptureContactDetails(String contactno) {
		EnterText(By.id("telephoneno"), contactno);

	}

	public String InvalidMessage() {
		String message = getElementText(By.id("message3"));
		return message;

	}

	public void ClickSubmit() {

		ClickElement(By.name("submit"));
	}

	public void SubmitErrorAlert() {
		String AlertError = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(AlertError);

	}

	public String getCustID() {
		String CustID = getElementText(By.tagName("h3"));
		return CustID;

	}

	public void goHome() {
		driver.get(getDataConfigPropeties("URL"));
	}

	public void ClickBackButon() {
		driver.navigate().back();

	}

}
