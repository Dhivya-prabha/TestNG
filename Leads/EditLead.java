package Leads;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends BaseClass {

	//@Test(timeOut = 5000) -> will work only for @test not to @before and @after method
	//(dependsOnMethods = "Leads.CreateLead.runCreateLeads", "Leads.DuplicateLead.runDuplictateLead")-> define with package.class.method
	//if depended method(create lead)is failed, this edit method will get skipped
	// Verbose="10" gives more test details on console output. default verbose value is 2
	
		//@Test(dependsOnMethods = "Leads.CreateLead.runCreateLeads", groups = "sanity")
	   //@Test(dependsOnMethods = {"Leads.CreateLead.runCreateLeads", "Leads.DeleteLead.runDeleteLead"})
	    @Test(dataProvider = "EditData")
		public void editLead(String phone, String cName) throws InterruptedException {
			
			driver.findElement(By.linkText("Find Leads")).click();
			//Thread.sleep(5000);
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			driver.findElement(By.linkText("Edit")).click();
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cName);
			driver.findElement(By.name("submitButton")).click();
			
		}
	    @DataProvider(name = "EditData")
	    public Object[][] editData() throws InvalidFormatException, IOException{
	    	
	    	String[][] data = ReadExcel.readExcel("Edit");
//	    	String [][] data = new String[2][2];
//
//	    	data[0][0]= "99";
//	    	data[0][1]= "Qeagle";
//	    	
//	    	data[1][0]= "99";
//	    	data[1][1]= "Raji";
	    	
	    	return data;
	    	
	    }
	}
	

