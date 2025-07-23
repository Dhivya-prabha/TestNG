package Leads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
//  Parameterization
	//  @Parameters - > Static data -> Single time(common for all tests) -> URL, Credentials, DB, API
	//  @DataProvider -> Dynamic - > Multiple data (unique to tests) -> company name, first name, last name
	//  xml -> parameter-> name, value
	//  @BeforeMethod -> @Parameter - > Method argument -> Replace the value to arguments
	//  Run from xml 
	
	
	
	ChromeDriver driver;
	//@BeforeMethod(groups = "common")
	@Parameters({"url","uname", "password"})
	@BeforeMethod
	public void RunLogin(String url, String uname, String password) throws InterruptedException {
		ChromeOptions options  = new ChromeOptions();
		options.addArguments("--disable-save-password-bubble");
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-popup-blocking");
		//options.setAcceptInsecureCerts(true);
		// Use a temporary profile (no saved passwords, no cache)
		options.addArguments("--guest");

		driver = new ChromeDriver(options);
		
		
				
		driver.get(url);
		driver.manage().window().maximize();		
		WebElement username = driver.findElement(By.xpath("//input[@id = 'username']"));
		username.sendKeys(uname);
		
		WebElement passWord = driver.findElement(By.xpath("//input[@id = 'password']"));
		passWord.sendKeys(password);
		
		WebElement login = driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']"));
		login.click();
		Thread.sleep(3000);    
		driver.findElement(By.xpath("//a[text()[normalize-space() = 'CRM/SFA']]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
