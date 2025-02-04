package Leads;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseClass {
	
	//@Test(invocationCount = 2, threadPoolSize = 2) -> threadpoll size will work only for single @test also will work only if invocation count is exists
		//thread-count in xml work for all testcases
	
	
	//@Test(groups = "Regression")
	@Test
	public void runDuplictateLead() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.name("submitButton")).click();
		
	}

}
