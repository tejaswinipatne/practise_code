package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestBase.TestBase;
import TestPages.LoginPage;
import TestPages.add_vendor;

public class add_vendor_test extends TestBase {

	public add_vendor_test() {
		super();

	}

	@BeforeMethod
	public void set() {
		initial();
		LoginPage lp = new LoginPage();
		lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void test_add() {
		add_vendor ad = new add_vendor();
		ad.add(prop.getProperty("uname"), prop.getProperty("emaill"), prop.getProperty("passs"), prop.getProperty("passs1"));

	}
}
