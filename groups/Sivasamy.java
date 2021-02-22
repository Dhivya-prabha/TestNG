package base;

import org.testng.annotations.Test;

public class Sivasamy {

	@Test(groups = { "Regression", "smoke" })
	public void create() {
		System.out.println("Create Method");

	}

	@Test(groups = {"Functional" })
	private void edit() {
		System.out.println("Edit method");
	}

	@Test(groups = "Regression")
	private void delete() {
		System.out.println("Delete method");
	}

	@Test(groups = { "Functional", "smoke" })
	private void find() {
		System.out.println("Find method");
	}

}
