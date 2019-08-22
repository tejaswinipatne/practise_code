
package TestCases;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestPages.LoginPage;



public class LoginPageTest extends TestBase.TestBase {

	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initial();
	}
	
	@Test
	public void VerifyLogin() {
		LoginPage login= new LoginPage();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
	}
}
	