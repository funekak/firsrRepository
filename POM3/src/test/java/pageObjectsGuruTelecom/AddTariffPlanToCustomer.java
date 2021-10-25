package pageObjectsGuruTelecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import frameWorkClasses.BasePage;

public class AddTariffPlanToCustomer extends BasePage {

	public void clickAddTariffPlanToCustomer() {
		ClickElement(By.linkText("Add Tariff Plan to Customer"));

	}

	public String checkHeading1() {
		return getElementText(By.linkText("Guru99 telecom"));

	}

	public String checkHeading2() {
		return getElementText(By.tagName("h1"));

	}

	public String EnterCustID(String CustID) {
		EnterText(By.id("customer_id"), CustID);
		return CustID;

	}

	public void ClickSubmit() {
		ClickElement(By.name("submit"));

	}

	public void goHome() {
		driver.get(getDataConfigPropeties("URL"));
	}

	public String ActiveStatus() {
		return getElementText(By.tagName("font"));
	}

	public void selectPendingRadioButton() {
		// ClickElement(By.xpath("//input[@id = 'done']"));
		ClickElement(By.xpath("//label[contains(text(), 'Pending')]"));
	}

	public void ClickHomeButton() {
		ClickElement(By.linkText("Home"));
	}

	public String InactiveStatus() {
		return getElementText(By.tagName("font"));

	}

	public String ApprovedTarrifPLans() {
		return getElementText(By.tagName("h2"));

	}

	public String SelectTarrifPlans() {
		// ClickElement(By.name("tariff_plan"));
		return getElementText(By.xpath("//b[contains(text(), 'Select Tariff Plans')]"));

	}

	public void ClickAddPlanButton() {
		ClickElement(By.xpath("//input[@value = 'Add Tariff Plan to Customer']"));

	}

	public String SuccessMessage() {
		return getElementText(By.tagName("h2"));

	}

}
