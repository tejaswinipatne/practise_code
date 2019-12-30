package Final;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Data_Driven.ExcelDataConfig;


public class DataDrivenTestVendor1 {

	WebDriver driver;

	@Test(dataProvider = "wordpress")

	public void open( String[] colCount) throws InterruptedException {

	//
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium 64 bit\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("http://45.112.2.195:83/");

		//driver.get("http://18.222.10.190/");
		
		    driver.findElement(By.name("email")).sendKeys("test@vendor25.com");
			driver.findElement(By.name("password")).sendKeys("Tech@123#");
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[4]/center/button")).click();

		// company info
			driver.findElement(By.name("user_name")).clear();
		driver.findElement(By.name("user_name")).sendKeys(colCount[2]);
		
		driver.findElement(By.name("contact")).sendKeys(colCount[3]);
		driver.findElement(By.name("website")).clear();
		driver.findElement(By.name("website")).sendKeys(colCount[4]);
		driver.findElement(By.name("address_line1")).clear();
		driver.findElement(By.name("address_line1")).sendKeys(colCount[5]);
		
		driver.findElement(By.name("address_line2")).clear();
		driver.findElement(By.name("address_line2")).sendKeys(colCount[6]);
		
		driver.findElement(By.name("zip_code")).sendKeys(colCount[7]);

		driver.findElement(By.xpath("//*[@id=\"country_error\"]/span[2]/span[1]/span")).click();
		WebElement w1 = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		w1.sendKeys(colCount[8]);
		w1.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//*[@id=\"select2-state-container\"]")).click();
		WebElement w2 = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		w2.sendKeys(colCount[9]);
		w2.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//*[@id=\"city_error\"]/span/span[1]/span")).click();
		WebElement w3 = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
		w3.sendKeys(colCount[10]);
		w3.sendKeys(Keys.ENTER);

		 JavascriptExecutor js = (JavascriptExecutor) driver;   
		 js.executeScript("window.scrollBy(0,1000)");
		 
		WebElement w =driver.findElement(By.xpath("//*[@id=\"vendor_error\"]/div/span/span[1]/span"));
		w.sendKeys(colCount[11]);
		Thread.sleep(3000);
		w.sendKeys(Keys.ENTER);
			
	
    	WebElement w5 = driver.findElement(By.xpath("//*[@id=\"speciality_error\"]/div/span/span[1]/span/ul/li/input"));
		w5.sendKeys(colCount[12]);
		w5.sendKeys(Keys.ENTER);
		
		WebElement w6= driver.findElement(By.xpath("//*[@id=\"industry_error\"]/div/span/span[1]/span/ul/li/input"));
		w6.sendKeys(colCount[13]);
		w6.sendKeys(Keys.ENTER);
		
		
        driver.findElement(By.xpath("//*[@id=\"onboradingform\"]/div[3]/ul/li[2]/a")).click();
		
		// business card info
        Thread.sleep(4000);
        driver.findElement(By.name("primary_name")).clear();
		driver.findElement(By.name("primary_name")).sendKeys(colCount[14]);
		driver.findElement(By.name("primary_directdial")).clear();
		driver.findElement(By.name("primary_directdial")).sendKeys(colCount[15]);
		
		driver.findElement(By.name("primary_designation")).clear();
		driver.findElement(By.name("primary_designation")).sendKeys(colCount[16]);
		driver.findElement(By.name("primary_email")).clear();
		driver.findElement(By.name("primary_email")).sendKeys(colCount[17]);

		driver.findElement(By.name("secondary_name")).clear();
		driver.findElement(By.name("secondary_name")).sendKeys(colCount[18]);
		driver.findElement(By.name("secondary_directdial")).clear();
		driver.findElement(By.name("secondary_directdial")).sendKeys(colCount[19]);
		driver.findElement(By.name("secondary_designation")).clear();
		driver.findElement(By.name("secondary_designation")).sendKeys(colCount[20]);
		driver.findElement(By.name("secondary_email")).clear();
		driver.findElement(By.name("secondary_email")).sendKeys(colCount[21]);

		driver.findElement(By.xpath("//*[@id=\"onboradingform\"]/div[3]/ul/li[2]/a")).click();
		Thread.sleep(4000);
		
		HashMap<String,String> m= new HashMap<String,String>();
		m.put("English", "//*[@id=\"onboradingform-p-2\"]/div/div[2]/div[7]/div[1]/label/spann");
		m.put("Spanish",  "//*[@id=\"onboradingform-p-2\"]/div/div[2]/div[7]/div[2]/label/span");
		m.put("German", "//*[@id=\"onboradingform-p-2\"]/div/div[2]/div[7]/div[3]/label/span");
		m.put("French", "//*[@id=\"onboradingform-p-2\"]/div/div[2]/div[7]/div[4]/label/span");
		
		String[] k = m.keySet().toArray(new String[m.size()]);
		int s1 = k.length;
		System.out.println(s1);
		for(int i =0; i<s1; i++) {
			String ss1= k[i];
			if(ss1.equals(colCount[22])) {
				driver.findElement(By.xpath(m.get(colCount[22]))).click();
			}
	}
		
		

		HashMap<String,String> m1= new HashMap<String,String>();
		m1.put("Single-Click", "//*[@id=\"onboradingform-p-2\"]/div/div[2]/div[10]/div[1]/label/span");
		m1.put("Form pre-fill",  "//*[@id=\"onboradingform-p-2\"]/div/div[2]/div[10]/div[2]/label/span");
		m1.put("Blank form", "//*[@id=\"onboradingform-p-2\"]/div/div[2]/div[10]/div[3]/label/span");
		
		String[] k1 = m1.keySet().toArray(new String[m1.size()]);
		int s2 = k1.length;
		for(int i =0; i<s2; i++) {
			String ss2= k1[i];
			if(ss2.equals(colCount[23])) {
				driver.findElement(By.xpath(m1.get(colCount[23]))).click();
			}
	}
		

		HashMap<String,String> m2= new HashMap<String,String>();
		m2.put("Integrate", "//*[@id=\"onboradingform-p-2\"]/div/div[2]/div[11]/div[1]/label/span");
		m2.put("NetLine",   "//*[@id=\"onboradingform-p-2\"]/div/div[2]/div[11]/div[2]/label/span");
		m2.put("Other",     "//*[@id=\"onboradingform-p-2\"]/div/div[2]/div[11]/div[3]/label/span");
		
		String[] k2 = m2.keySet().toArray(new String[m2.size()]);
		int s3 = k2.length;
		for(int i =0; i<s3; i++) {
			String ss3= k2[i];
			if(ss3.equals(colCount[24])) {
				driver.findElement(By.xpath(m2.get(colCount[24]))).click();
			}
	}
		
		HashMap<String,String> m3= new HashMap<String,String>();
		m3.put("Email", "//*[@id=\"onboradingform-p-2\"]/div/div[3]/div[7]/div[1]/div[1]/label/span");
		m3.put("Tele", "//*[@id=\"onboradingform-p-2\"]/div/div[3]/div[7]/div[2]/div[1]/label/span");
		m3.put("Social", "//*[@id=\"onboradingform-p-2\"]/div/div[3]/div[7]/div[3]/div[1]/label/span");
		m3.put("Hybrid", "//*[@id=\"onboradingform-p-2\"]/div/div[3]/div[7]/div[5]/div[1]/label/span");
		m3.put("Others", "//*[@id=\"onboradingform-p-2\"]/div/div[3]/div[7]/div[6]/div[1]/label/span");
		
		String[] k13 = m3.keySet().toArray(new String[m3.size()]);
		int s13 = k13.length;
		for(int i =0; i<s13; i++) {
			String ss13= k13[i];
			if(ss13.equals(colCount[25])) {
				driver.findElement(By.xpath(m3.get(colCount[25]))).click();
			}
	}
		

		HashMap<String,String> map1= new HashMap<String,String>();
		map1.put("Built / bought", "//*[@id=\"onboradingform-p-2\"]/div/div[3]/div[5]/div[1]/label/span");
		map1.put("Intent",  "//*[@id=\"onboradingform-p-2\"]/div/div[3]/div[5]/div[2]/label/span");
		map1.put("Install-tech", "//*[@id=\"onboradingform-p-2\"]/div/div[3]/div[5]/div[3]/label/span");
		map1.put("DUNS#", "//*[@id=\"onboradingform-p-2\"]/div/div[3]/div[5]/div[4]/label/span");
		map1.put("SIC/NAICS#", "//*[@id=\"onboradingform-p-2\"]/div/div[3]/div[5]/div[5]/label/span");
		
		String[] ke = map1.keySet().toArray(new String[map1.size()]);
		int s14 = ke.length;
		for(int i =0; i<s14; i++) {
			String ss14= ke[i];
			if(ss14.equals(colCount[26] )) {
				driver.findElement(By.xpath(map1.get(colCount[26]))).click();
			}
	}
		
		HashMap<String,String> mapp= new HashMap<String,String>();
		mapp.put("Verified Data",      "//*[@id=\"onboradingform-p-2\"]/div/div[3]/div[8]/div[1]/div[1]/label/span");
		mapp.put("MQL",                "//*[@id=\"onboradingform-p-2\"]/div/div[3]/div[8]/div[2]/div[1]/label/span");
		mapp.put("HQL",                "//*[@id=\"onboradingform-p-2\"]/div/div[3]/div[8]/div[3]/div[1]/label/span");
		mapp.put("SQL",                "//*[@id=\"onboradingform-p-2\"]/div/div[3]/div[8]/div[4]/div[1]/label/span");
		mapp.put("Survey/QSO",         "//*[@id=\"onboradingform-p-2\"]/div/div[3]/div[8]/div[5]/div[1]/label/span");
		mapp.put("Appointment",         "//*[@id=\"onboradingform-p-2\"]/div/div[3]/div[8]/div[6]/div[1]/label/span");
		
		String[] keyy = mapp.keySet().toArray(new String[mapp.size()]);
		int s15 = keyy.length;
		for(int i =0; i<s15; i++) {
			String ss15= keyy[i];
			if(ss15.equals(colCount[27])) {
				driver.findElement(By.xpath(mapp.get(colCount[27]))).click();
			}
	}
    	driver.findElement(By.xpath("//*[@id=\"onboradingform\"]/div[3]/ul/li[2]/a")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"onboradingform\"]/div[3]/ul/li[2]/a")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"onboradingform\"]/div[3]/ul/li[3]/a")).click();

	}//*[@id="onboradingform"]/div[3]/ul/li[3]/a

	

	@DataProvider(name = "wordpress")
	public Object[][] passdata() {
		ExcelDataConfig config = new ExcelDataConfig("C:\\Users\\Trigen\\Downloads\\ven2.xlsx");
		int rowCount = config.getRowCount(0);

		int colCount = config.getColCount(0);

		Object[][] data = new Object[rowCount + 1][colCount + 1];

		for (int rows = 0; rows < rowCount; rows++) {

			for (int cols = 0; cols < colCount; cols++) {
				// System.out.println(colCount);

				data[rows][cols] = config.getData(0, rows, cols);

			}
			
		}

return data;

	}
}