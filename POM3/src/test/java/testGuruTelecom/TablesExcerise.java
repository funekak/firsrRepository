package testGuruTelecom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObjectsDEMOS.TablesExersizeDemoRowsColumns;

@Test
public class TablesExcerise {
	TablesExersizeDemoRowsColumns te = new TablesExersizeDemoRowsColumns();

	@Test
	public void Print_Number_Of_rows_And_Columns() {

		// GIVEN
		te.goToExersiezeURL();
		te.TablesExersizeDemoRowsColumns();
		te.get_row4_column();



	}
}
