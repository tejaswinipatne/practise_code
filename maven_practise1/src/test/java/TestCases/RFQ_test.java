package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestBase.TestBase;
import TestPages.LoginPage;
import TestPages.RFQ_campaign;

public class RFQ_test extends TestBase {

	public RFQ_test() {
		super();
	}

	@BeforeMethod
	public void tes() {
		initial();

	}

	@Test
	public void demo() {
		LoginPageTest tp = new LoginPageTest();
		tp.VerifyLogin();
		RFQ_campaign rf = new RFQ_campaign();
		rf.rfq();
	}
}
