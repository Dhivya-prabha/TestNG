package base;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Employee {

	
	@Test(groups =  "smoke")
	public void create() {
		System.out.println("Create Method");

	}

	@Test(groups = "Functional")
	private void edit() {
		System.out.println("Edit method");
	}

	@Test(groups = "Regression", dependsOnGroups = "smoke")
	private void delete() {
		System.out.println("Delete method");
	}

	@Test(groups = "Regression", dependsOnGroups = "Functional")
	private void find() {
		System.out.println("Find method");
	}
}