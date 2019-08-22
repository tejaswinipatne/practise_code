package TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class RFQ_campaign extends TestBase {

	@FindBy(linkText = "RFQ Campaigns")
	WebElement RFQ_camp;

	@FindBy(xpath = "//*[@id=\"CampaignList\"]/a")
	WebElement Clist;

	@FindBy(xpath = "//*[@id=\"Client_live_campaign_table\"]/tbody/tr/td[1]/i[1]")
	WebElement i;

	@FindBy(xpath = "//*[@id=\"Client_live_campaign_table\"]/tbody/tr/td[1]/i[2]")
	WebElement plus;

	public RFQ_campaign() {
		PageFactory.initElements(driver, this);
	}

	public void rfq() {
		try {
			RFQ_camp.click();
			Clist.click();

			Thread.sleep(4000);
			i.click();
			plus.click();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}
}
