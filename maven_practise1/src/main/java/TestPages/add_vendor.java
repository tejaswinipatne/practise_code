package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class add_vendor extends TestBase {

	@FindBy(xpath = "//*[@id=\"explore-vendors\"]/a/span")
	WebElement Evendor;

	@FindBy(xpath = "//*[@id=\"VendorList\"]/a")
	WebElement vendor_list;

	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div/div/div[1]/div[1]/h1/button[2]")
	WebElement addvendor;

	@FindBy(xpath = "//*[@id=\"id_user_name\"]")
	WebElement username;

	@FindBy(name = "email")
	WebElement email;

	@FindBy(id = "id_password1")
	WebElement pass;

	@FindBy(id = "id_password2")
	WebElement pass1;

	@FindBy(xpath="//*[@id=\"addvendor\"]/div/button[1]")
	WebElement submit;
	
	public add_vendor() {
		PageFactory.initElements(driver, this);
	}

	public void add(String uname, String emaill, String passs, String passs1) {

		try {
			Evendor.click();
			vendor_list.click();
			
			Thread.sleep(5000);
			addvendor.click();

			Thread.sleep(4000);
			username.sendKeys(uname);
			email.sendKeys(emaill);
			pass.sendKeys(passs);
			pass1.sendKeys(passs1);
			
			//submit.click();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

}
