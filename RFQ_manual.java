package Final;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class RFQ_manual {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium 64 bit\\chromedriver.exe");
		
		WebDriver driver;
		
		String user= "Tele";
		String user1 = "Engineering/Construction";
		String user2 = "101-500";
		String user3 = "$1 billion - $10 billion";
		String country = "Belarus";
		String Start_date ="2019-10-22";
		String End_date = "2019-10-30";
		String RFQ_date = "24/10/2019 12:00";
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://45.112.2.195:83/");
		
		driver.findElement(By.name("email")).sendKeys("kiran.bhalerao@trigensoft.com");
		driver.findElement(By.name("password")).sendKeys("Tech@123#");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[4]/center/button")).click();
	
		
		

		driver.get("http://45.112.2.195:83/client/create-rfq-campaign/");
		
		driver.findElement(By.name("name")).sendKeys("Test@789");
		driver.findElement(By.name("io_number")).sendKeys("1233211");
		driver.findElement(By.name("description")).sendKeys("demo@19th Oct");
		driver.findElement(By.xpath("//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[4]/div/div/div/div/div/div/button/span")).click();
		
		HashMap<String,String> map= new HashMap<String,String>();
		map.put("Email", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[4]/div/div/div/div/div/div/ul/li[3]/a/label");
		map.put("Tele",  "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[4]/div/div/div/div/div/div/ul/li[4]/a/label");
		map.put("Social", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[4]/div/div/div/div/div/div/ul/li[5]/a/label");
		map.put("Digital", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[4]/div/div/div/div/div/div/ul/li[6]/a/label");
		map.put("Hybrid", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[4]/div/div/div/div/div/div/ul/li[7]/a/label");
		map.put("Others", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[4]/div/div/div/div/div/div/ul/li[8]/a/label");
		
		String[] keys = map.keySet().toArray(new String[map.size()]);
		int s = keys.length;
		for(int i =0; i<s; i++) {
			String ss= keys[i];
			if(ss.equals(user)) {
				driver.findElement(By.xpath(map.get(user))).click();
			                    }
	           } 
		
		driver.findElement(By.xpath("//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[4]/div/div/div/div/div/div/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/button")).click();
	
		HashMap<String,String> industry= new HashMap<String,String>();
		industry.put("Advertising/Media/Publishing", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[3]/a/label/input");
		industry.put("Aerospace/Aviation",           "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[4]/a/label/input");
		industry.put("Agriculture/Forestry",         "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[5]/a/label/input");
		industry.put("Banking/Accounting/Financial", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[6]/a/label/input");
		industry.put("Biotechnology",                "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[7]/a/label/input");
		industry.put("Computer/Technology",          "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[8]/a/label/input");
		industry.put("Engineering/Construction",     "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[9]/a/label/input");
		industry.put("Entertainment/Travel/Hospitality", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[10]/a/label/input");
		industry.put("Automotive",                   "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[11]/a/label/input");
		industry.put("Food/Beverage",                "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[12]/a/label/input");
		industry.put("Government Administration/Public Administration",
				                                      "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[13]/a/label/input");
		industry.put("Healthcare",                   "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[14]/a/label/input");
		industry.put("Insurance",                    "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[15]/a/label/input");
		industry.put("Legal Solutions",              "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[16]/a/label/input");
		//industry.put(" Legal Solutions", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[5]/a/label/input");
		industry.put("Manufacturing",                "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[17]/a/label/input");
		industry.put("Marketing",                    "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[18]/a/label/input");
		industry.put("Non profit Organizations",     "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[19]/a/label/input");
		industry.put("Other Industry Not Listed",    "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[20]/a/label/input");
		industry.put("Public Relations",             "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[21]/a/label/input");
		industry.put("Real Estate",                  "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[22]/a/label/input");
		industry.put("Retail and Wholesale",         "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[23]/a/label/input");
		industry.put("Scientific",                   "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[24]/a/label/input");
		industry.put("Telecommunications",           "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[25]/a/label/input");
		industry.put("Transportation/Shipping",      "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[26]/a/label/input");
		industry.put("Utilities",                    "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[27]/a/label/input");
		industry.put("VAR/VAD/System Integrator",    "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[28]/a/label/input");
		industry.put("Education/Training",           "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/ul/li[29]/a/label/input");
		

		
		String[] keys1 = industry.keySet().toArray(new String[industry.size()]);
		int s1 = keys1.length;
		for(int i =0; i<s1; i++) {
			String ss1= keys1[i];
			if(ss1.equals(user1)) {
				driver.findElement(By.xpath(industry.get(user1))).click();
				                  }
	           } 
		
		driver.findElement(By.xpath("//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[5]/div/div/div/div/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[6]/div/div/div/div/div[1]/div/button")).click();
		
		HashMap<String, String> emp_size = new HashMap<String, String>();
		emp_size.put("1-15", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[6]/div/div/div/div/div[1]/div/ul/li[4]/a/label");
		emp_size.put("15-50", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[6]/div/div/div/div/div[1]/div/ul/li[5]/a/label");
		emp_size.put("51-100", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[6]/div/div/div/div/div[1]/div/ul/li[6]/a/label");
		emp_size.put("101-500", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[6]/div/div/div/div/div[1]/div/ul/li[7]/a/label");
		emp_size.put("501-1000", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[6]/div/div/div/div/div[1]/div/ul/li[8]/a/label");
		emp_size.put("1001-10000", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[6]/div/div/div/div/div[1]/div/ul/li[9]/a/label");
		emp_size.put("+10000", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[6]/div/div/div/div/div[1]/div/ul/li[10]/a/label");
	
		String[] keys2 = emp_size.keySet().toArray(new String[emp_size.size()]);
		int s2= keys2.length;
		for(int i =0; i<s2; i++) {
			String ss2= keys2[i];
			if(ss2.equals(user2)) {
				driver.findElement(By.xpath(emp_size.get(user2))).click();
			}
		}
		
		driver.findElement(By.xpath("//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[6]/div/div/div/div/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[6]/div/div/div/div/div[2]/div/button")).click();
		
		HashMap<String, String> rev_size = new HashMap<String, String>();
		rev_size.put("0 - $999,999", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[6]/div/div/div/div/div[2]/div/ul/li[3]/a/label");
		rev_size.put("$1 mill - $15 mill", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[6]/div/div/div/div/div[2]/div/ul/li[4]/a/label");
		rev_size.put("$16 mill - $50 mill", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[6]/div/div/div/div/div[2]/div/ul/li[5]/a/label");
		rev_size.put("$51 mill - $100 mill", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[6]/div/div/div/div/div[2]/div/ul/li[6]/a/label");
		rev_size.put("$101 mill - $500 mill", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[6]/div/div/div/div/div[2]/div/ul/li[7]/a/label");
		rev_size.put("$501 mill - $1 billion", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[6]/div/div/div/div/div[2]/div/ul/li[8]/a/label");
		rev_size.put("$1 billion - $10 billion", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[6]/div/div/div/div/div[2]/div/ul/li[9]/a/label");
		rev_size.put("$10 billion +", "//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[6]/div/div/div/div/div[2]/div/ul/li[10]/a/label");
		
		String[] keys3 = rev_size.keySet().toArray(new String[rev_size.size()]);
		int s3= keys3.length;
		for(int i =0; i<s3; i++) {
			String ss3= keys3[i];
			if(ss3.equals(user3)) {
				driver.findElement(By.xpath(rev_size.get(user3))).click();
			}}

		 driver.findElement(By.xpath("//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[6]/div/div/div/div/div[2]/div/button")).click();
		 
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("window.scrollBy(0,1000");
//		 
		 driver.findElement(By.xpath("//*[@id=\"id_job_title_function\"]")).sendKeys("testing demo");
		 
		 driver.findElement(By.xpath("//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[8]/div/div/div[1]/input[2]")).click();
			
			

			for(int i=1;i<=8;i++) {
		    String sss= "//*[@data-region="+i+"]";
		    List<WebElement> continents= driver.findElements(By.xpath(sss));
			for (WebElement countries : continents) {
				if(countries.getAttribute("data").equals(country))
				{
                   countries.click();
                 //  System.out.println(countries);
				}
         	}
         	}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[8]/div/div/div[2]/div[2]/button[2]")).click();
			driver.findElement(By.xpath("//*[@name='custom_question']")).clear();
			driver.findElement(By.xpath("//*[@name='custom_question']")).sendKeys("5");
			driver.findElement(By.xpath("//*[@name='cpl_name']")).sendKeys("15.32");
			driver.findElement(By.name("target_q_name")).sendKeys("100");

			WebElement wsss = driver.findElement(By.xpath("//*[@id=\"id_start_date\"]"));
			JavascriptExecutor jseee = (JavascriptExecutor)driver;
			jseee.executeScript("arguments[0].setAttribute('value','"+ Start_date +"')",wsss);
			
			WebElement wssss = driver.findElement(By.xpath("//*[@id=\"id_end_date\"]"));
			JavascriptExecutor jseeee = (JavascriptExecutor)driver;
			jseeee.executeScript("arguments[0].setAttribute('value','"+ End_date +"')",wssss);
			
			WebElement ws = driver.findElement(By.xpath("//*[@id=\"id_rfq_timer\"]"));
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].setAttribute('value','"+ RFQ_date +"')",ws);
			
			driver.findElement(By.xpath("//*[@id=\"rfq_campaign_form\"]/fieldset/div[1]/div[18]/div/div/div[1]/button")).click();
	}
}
