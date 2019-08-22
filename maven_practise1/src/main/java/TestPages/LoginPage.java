package TestPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends TestBase.TestBase {


	@FindBy(name ="email")
	WebElement username;

	@FindBy(name ="password")
	WebElement password;

	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/form/div/div/div[4]/center/button")
	WebElement loginButon;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void login(String un, String pass) {
		username.sendKeys(un);
		password.sendKeys(pass);
		loginButon.click();
	}
}
