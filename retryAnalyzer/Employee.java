package base;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Employee {

	
	@Test()
	public void create() {
		System.out.println("Create Method");

	}

	@Test
	private void edit() {
		System.out.println("Edit method");
		throw new NoSuchElementException("Element is available");
	}

	@Test()
	private void delete() {
		System.out.println("Delete method");
	}

	@Test()
	private void find() {
		System.out.println("Find method");
		throw new NoSuchElementException("Element is available");
	}
}