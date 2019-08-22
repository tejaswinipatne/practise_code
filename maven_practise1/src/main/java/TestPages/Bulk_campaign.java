package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class Bulk_campaign extends TestBase {

	@FindBy(linkText = "Campaign")
	WebElement Campaign;

	@FindBy(xpath = "//*[@id=\"PendingCampaign\"]/a")
	WebElement pending;

	@FindBy(xpath = "//*[@id=\"centertext\"]/div/button")
	WebElement bulk;

	@FindBy(xpath = "//*[@id=\"bulk_camp_form\"]/label")
	WebElement browse;

	public Bulk_campaign() {
		PageFactory.initElements(driver, this);
	}

	public void bulkc(String givepath) {
		try {
			Campaign.click();
			pending.click();
			Thread.sleep(5000);
			bulk.click();
			Thread.sleep(5000);
			browse.sendKeys(givepath);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}
