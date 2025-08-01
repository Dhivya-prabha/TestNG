package Leads;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	
	//Annotation - @DataProvider -> @Beforemethod -> @Test -> @AfterMethod(It'll run Dataprovider first to determine the number of createlead execution based on data set from excel.)
	//-> @DataProvider -> Apache POI ->Excel -> retrive data ->String[][]
	//-> @BeforeMethod -> LaunchBrowser -> Login
	//-> @Test(FirstData)->Create Lead
	//-> @AfterMethod -> close browser

	// @Test(groups = "smoke", dependsOnGroups = "sanity", retryAnalyzer = RetryFailedTest.class)
	@Test(dataProvider = "fetchData", timeOut = 2100, retryAnalyzer = RetryFailedTest.class)
	public void runCreateLeads(String cName, String fName, String lName) throws InterruptedException {
		// ChromeDriver driver = new ChromeDriver();
		Assert.assertEquals(true, false);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		// Click on createLead button
		driver.findElement(By.className("smallSubmit")).click();
		// Getting the title of the return page
		String title = driver.getTitle();
		System.out.println(title);
	}
	

	// Read Data from Excel
	// software -> Apache POI -> Any Microsoft Application(Excel, word, PPT,Outlook)

	// Hierarchy:
	// Workbook -> File -> Sheet -> Row -> cell(column)
	// Steps:
	// Apache poi - > Maven dependency
	// Create Excel File
	// Write program to read the data
	//@DataProvider(name="fetchData", indices = {0, 2})
	@DataProvider(name="fetchData", indices = {0})
	public Object[][] testData() throws InvalidFormatException, IOException {
		String[][] data = ReadExcel.readExcel("Create");
		
		return data;
	
	
	}

	// inputs -> Company name, First name, Last name
	// Data set -> 2 -> 2 rows
	// Data provider - > Object[rows][columns]

	// step1: @DataProvider -> name attribute
	// step2: DataProvider method - > return object[] []
	// step3: TestData Hard code
	// step4: To be received in @Test(dataprovider="name")
	// step5: Take the input arguments and replace the values

//	@DataProvider(name="fetchData")
//	public Object[][] testData() {
//		
//		String[] [] data = new String[2][3];
//		data[0][0] = "Tata";
//		data[0][1] = "Dhivya";
//		data[0][2] = "Sivasamy";
//		
//		data[1][0] = "HCL";
//		data[1][1] = "Kumar";
//		data[1][2] = "Gopal";
//		
//		return data; 
//	}
//	
//	
}
