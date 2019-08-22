package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestBase.TestBase;
import TestPages.Bulk_campaign;

public class Bulk_camp extends TestBase {

	public Bulk_camp() {
		super();
	}
	@BeforeMethod
	public void sett() {
		initial();
	}
	@Test
	public void bcamp() {
		LoginPageTest lt= new LoginPageTest();
		lt.VerifyLogin();
		driver.switchTo().activeElement();
		Bulk_campaign b= new Bulk_campaign();
		b.bulkc(prop.getProperty("path"));
	}
}
