package testGuruTelecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectsDEMOS.TableScraping;
import pageObjectsGuruTelecom.AddTariffPlanToCustomer;
import pageObjectsGuruTelecom.AddCustomer;

public class GuruTelecomTests {

	public String CustID;
	
	public class AddPlanToCustomers {
		// instatiate the page objects
		AddTariffPlanToCustomer addtariff = new AddTariffPlanToCustomer();
		AddCustomer newcustomer = new AddCustomer();
		TableScraping ts = new TableScraping();
		
		//EXERSISE 1 TESTS
		
		@Test
		public void TestSetUp_Assert_That_The_Heading_Is_Guru99_Telcom_And_Add_Customer() {
			// GIVEN
			newcustomer.addCustomer();

			// Checkheading1
			String actual = newcustomer.checkHeading1();
			String expected = "Guru99 telecom";

			// Checkheading2
			String actual2 = newcustomer.checkHeading2();
			String expected2 = "Add Customer";

			// THEN
			Assert.assertEquals(actual, expected);
			Assert.assertEquals(actual2, expected2);
			System.out.println("Assignment 1, Test SetUp passed");
			newcustomer.goHome();

		}

		@Test
		public void GIVEN_Invalid_Data_Entered_Then_Warning_Message_Should_Display() {

			//GIVEN
			newcustomer.addCustomer();
			newcustomer.selectDoneRadioButton();
			newcustomer.CapturePersonalDetails("Funie", "KoliTA");
			newcustomer.CaptureAddresses("fkoliTA@gmail.com", "10, Testing Street-- Centurion");
			newcustomer.CaptureContactDetails("08255221122");
			
			//Check invalid message
			String actualMessage = newcustomer.InvalidMessage();
			String expectedMessage = "Special characters are not allowed";

			//THEN
			Assert.assertEquals(actualMessage, expectedMessage);
			System.out.println("Assignment 1, Test case 1 passed - " + actualMessage + " is displayed");
			newcustomer.goHome();
		}

		@Test
		public void GIVEN_Invalid_Data_Entered_THEN_Alert_WHEN_Submit_Button_Is_Pressed() {

			// GIVEN
			newcustomer.addCustomer();
			newcustomer.selectDoneRadioButton();
			newcustomer.CapturePersonalDetails("Funie", "KoliTA");
			newcustomer.CaptureAddresses("fkoliTA@gmail.com", "10, Testing Street-- Centurion");
			newcustomer.CaptureContactDetails("08255221122");
			newcustomer.ClickSubmit();

			// THEN
			newcustomer.SubmitErrorAlert();
			System.out.println("Assignment 1, Test case 2 passed");
			newcustomer.goHome();

		}

		@Test
		public void GIVEN_Valid_Data_Entered_THEN_Id_Displayed_WHEN_Submit_Button_Is_Pressed() {
			// GIVEN
			newcustomer.addCustomer();
			newcustomer.selectDoneRadioButton();
			newcustomer.CapturePersonalDetails("Funie", "KoliTA");
			newcustomer.CaptureAddresses("fkoliTA@gmail.com", "10 Testing Street Centurion");
			newcustomer.CaptureContactDetails("08255221122");
			newcustomer.ClickSubmit();

			// THEN
			CustID = newcustomer.getCustID();
			System.out.println("Assignment 1, Test case 3 passed " + "Customer ID is: " + CustID);
			newcustomer.goHome();
		}
		
    //ASSIGNMENT 2 TESTS
		
		@Test
		public void TestSetUpAddTarrifToPlan() {

			// GIVEN
			addtariff.clickAddTariffPlanToCustomer();

			// WHEN_Checkheading1
			String actual = addtariff.checkHeading1();
			String expected = "Guru99 telecom";

			// AND_Checkheading2
			String actual2 = addtariff.checkHeading2();
			String expected2 = "Add Tariff Plan to Customer";

			// THEN
			Assert.assertEquals(actual, expected);
			Assert.assertEquals(actual2, expected2);
			System.out.println("Assignment 2 Test SetUp passed");
			addtariff.goHome();
			
		}
		
      
		@Test
		public void GIVEN_Active_Customer_WHEN_submit_THEN_Active_Is_Displayed() {
			
			// GIVEN
			newcustomer.addCustomer();
			newcustomer.selectDoneRadioButton();
			newcustomer.CapturePersonalDetails("Funie", "KoliTA");
			newcustomer.CaptureAddresses("fkoliTA@gmail.com", "10 Testing Street Centurion");
			newcustomer.CaptureContactDetails("0825522112");
			newcustomer.ClickSubmit();

			// WHEN
			newcustomer.getCustID();
			CustID = newcustomer.getCustID();
			newcustomer.ClickBackButon();
			newcustomer.ClickBackButon();
			
			//THEN
			 addtariff.clickAddTariffPlanToCustomer();
			 addtariff.EnterCustID(CustID);
			 addtariff.ClickSubmit();
			 
			 String actualIndicator = addtariff.ActiveStatus();
			 String expectedIndicator = "ACTIVE";
			 Assert.assertEquals(actualIndicator, expectedIndicator);
			 System.out.println("Assignment 2, Test 1 PASS - " + actualIndicator + " is displayed");
			 addtariff.goHome();
		
		}
		@Test
		public void GIVEN_Inactive_Customer_WHEN_Submit_THEN_INactive_Is_displayed () {
			
			//GIVEN
			newcustomer.addCustomer();
			addtariff.selectPendingRadioButton();
			newcustomer.CapturePersonalDetails("Susie", "Automation");
			newcustomer.CaptureAddresses("susieA@gmail.com", "12 Mahle Street Mdantsane");
			newcustomer.CaptureContactDetails("0425522112");
			newcustomer.ClickSubmit();
			
			
			//WHEN
			 newcustomer.getCustID();
			 CustID = newcustomer.getCustID();
			 newcustomer.ClickBackButon();
			 newcustomer.ClickBackButon();
			 	 
			 //THEN
			 addtariff.clickAddTariffPlanToCustomer();
			 addtariff.EnterCustID(CustID);
			 addtariff.ClickSubmit();
			 
			 String actualIndicator = addtariff.InactiveStatus();
			 String expectedIndicator = "INACTIVE";
			 Assert.assertEquals(actualIndicator, expectedIndicator);
			 System.out.println("Assignment 2, Test 2 PASS - " + actualIndicator + " is displayed");
			 addtariff.goHome();
			
		}
		@Test
		public void  GIVEN_Active_Customer_WHEN_Submit_THEN_At_Least_One_pproved_TariffPlan_Is_Displayed() {
			
			//GIVEN
			newcustomer.addCustomer();
			newcustomer.selectDoneRadioButton();
			newcustomer.CapturePersonalDetails("Funie", "KoliTA");
			newcustomer.CaptureAddresses("fkoliTA@gmail.com", "10 Testing Street Centurion");
			newcustomer.CaptureContactDetails("08255221122");
			newcustomer.ClickSubmit();

			//WHEN
			newcustomer.getCustID();
			CustID = newcustomer.getCustID();
			newcustomer.ClickBackButon();
			newcustomer.ClickBackButon();
			
			 //THEN
			 addtariff.clickAddTariffPlanToCustomer();
			 addtariff.EnterCustID(CustID);
			 addtariff.ClickSubmit();
			 
			 String actualIndicator = addtariff.ApprovedTarrifPLans();
			 String expectedIndicator = "Approved Tariff Plans";
			 Assert.assertEquals(actualIndicator, expectedIndicator);
			 System.out.println("Assignment 2, Test 3 PASS - "  + actualIndicator + " is displayed");
			 addtariff.goHome();
		}
		@Test
		public void GIVEN_At_Least_One_Approved_Tariff_Plan_Is_Selected_WHEN_Add_Tariff_THEN_Success_Message_Displayed() {
			
			//GIVEN
			newcustomer.addCustomer();
			newcustomer.selectDoneRadioButton();
			newcustomer.CapturePersonalDetails("Funie", "KoliTA");
			newcustomer.CaptureAddresses("fkoliTA@gmail.com", "10 Testing Street Centurion");
			newcustomer.CaptureContactDetails("08255221122");
			newcustomer.ClickSubmit();

			//WHEN
			newcustomer.getCustID();
			CustID = newcustomer.getCustID();
			newcustomer.ClickBackButon();
			newcustomer.ClickBackButon();
			
			 //THEN
			 addtariff.clickAddTariffPlanToCustomer();
			 addtariff.EnterCustID(CustID);
			 addtariff.ClickSubmit();
			 addtariff.SelectTarrifPlans();
			 addtariff.ClickAddPlanButton();
			 
			 String actualIndicator = addtariff.SuccessMessage();
			 String expectedIndicator = "Congratulation Tariff Plan assigned";
			 Assert.assertEquals(actualIndicator, expectedIndicator);
			 System.out.println("Assignment 2, Test 4 PASS - " + actualIndicator + " is displayed");
			 addtariff.goHome();
		}
//		@Test
		public void TableDemo() {
			ts.goToTablesDemo();
			ts.TablesDemo();
			
			
		}
	}
}
