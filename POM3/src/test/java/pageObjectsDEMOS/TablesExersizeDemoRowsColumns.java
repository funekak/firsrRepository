package pageObjectsDEMOS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import frameWorkClasses.BasePage;

public class TablesExersizeDemoRowsColumns extends BasePage {

	public void goToExersiezeURL() {
		driver.get("http://demo.guru99.com/test/web-table-element.php");
	}

	public void TablesExersizeDemoRowsColumns() {

		//To locate table
		WebElement mytable = getElement(By.xpath("//tbody"));
		
		//To locate rows of table.
		List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
		//To calculate no of rows in table.
		int rows_count = rows_table.size();
		
		List<WebElement> Columns_row = rows_table.get(1).findElements(By.tagName("td"));
		//To calculate no of columns (cells). In that specific row.
		int columns_count = Columns_row.size();
		
		System.out.println("Number of rows " + rows_count + " Number of columns " + columns_count);

	}
	public void get_row4_column() {
			String row_column_value = getElementText(By.xpath("//tbody/tr[4]/td[4]"));
			System.out.println("The value of row 4 column 4 is " + row_column_value);

	}
}