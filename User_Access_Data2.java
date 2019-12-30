package Final;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class User_Access_Data2 {
	WebDriver driver;

	@Test(dataProvider = "wordpress")
	public void open(String[] colCount) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium 64 bit\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://18.222.10.190/");

		driver.findElement(By.name("email")).sendKeys(colCount[0]);
		driver.findElement(By.name("password")).sendKeys(colCount[1]);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[4]/center/button")).click();
		driver.get("http://18.222.10.190/client/user_and_groups/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div[1]/div[2]/span/button[2]")).click();
		//create group
		driver.findElement(By.xpath("//*[@id=\"lead_header\"]/div/div/div/div[2]/div/div/input")).sendKeys(colCount[2]);
		driver.findElement(By.xpath("//*[@id=\"add_group\"]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[4]/div/button")).click();
		Thread.sleep(4000);

		//group access
		HashMap<String,String> map= new HashMap<String,String>();
		map.put("Explore Vendors", "//*[@id=\"34\"]/div/label");
		map.put("RFQ Campaigns",  "//*[@id=\"76\"]/div/label");
		map.put("Campaign", "//*[@id=\"12\"]/div/label");
		map.put("Reason List", "//*[@id=\"39\"]/div/label");
		map.put("Access Control", "//*[@id=\"71\"]/div/label");
		map.put("Support", "//*[@id=\"43\"]/div/label ");
		map.put("Settings", "//*[@id=\"81\"]/div/label");
		map.put("Reports", "//*[@id=\"84\"]/div/label");
		
	/*	//for single access
		String[] keyss = map.keySet().toArray(new String[map.size()]);
		int ss = keyss.length;
		for(int i =0; i<ss; i++) {
			String sss= keyss[i];
			if(sss.equals(user)) {
				driver.findElement(By.xpath(map.get(user))).click();
			                    }
	           } 
	*/	//for multiple access
		//String[] access = {colCount[3], colCount[4]};
//		String s = "Explore Vendors, RFQ Campaigns, Campaign, Reason List, Access Control, Support, Settings,Reports";
//		String [] value = s.split(",");
	//	String[] access = {colCount[3], colCount[4]};
		String[] access = colCount[3].split(",");
		int uk = access.length;
		String[] keyss = map.keySet().toArray(new String[map.size()]);
		
		 int ss = keyss.length;
		 
		 for(int i =0; i<uk; i++) {
			 for(Map.Entry<String , String> entry : map.entrySet()) {
				 String k = entry.getKey();
				 String v = entry.getValue();
				
				 if(access[i].equals(k)) {
					 Thread.sleep(4000);
					 driver.findElement(By.xpath(v)).click();
   				 break;
//				 }
			 }
		 }
		
		 }
	
		
		driver.findElement(By.xpath("//*[@id=\"grp_access_form\"]/div[2]/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div[4]/div/button")).click();
		Thread.sleep(4000);
		//create user
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div[1]/div[2]/span/button[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"id_user_name\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"id_user_name\"]")).sendKeys(colCount[5]);
		driver.findElement(By.xpath("//*[@id=\"id_email\"]")).sendKeys(colCount[6]);
		driver.findElement(By.xpath("//*[@id=\"id_password1\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"id_password1\"]")).sendKeys(colCount[7]);
		driver.findElement(By.xpath("//*[@id=\"id_password2\"]")).sendKeys(colCount[8]);
		
		//select group
		WebElement w = driver.findElement(By.xpath("//*[@id=\"add_user\"]/div[1]/div[5]/div/select"));
		w.click();
		 List<WebElement> allElements = w.findElements(By.tagName("option"));
		    for (WebElement element: allElements) {
		       if(colCount[9].equals(element.getText())) {
		         element.click(); 
		       }
		    }
       
		driver.findElement(By.xpath("//*[@id=\"add_user\"]/div[2]/button[1]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[4]/div/button")).click();
		Thread.sleep(4000);
		
	
		driver.findElement(By.xpath("//*[@id=\"toggle_grp_usr\"]")).click();
	
		driver.findElement(By.xpath("//*[@id=\"client_external_users\"]/tbody/tr[4]/td[4]/button[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"705\"]/div/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"702\"]/div/label")).click();
		
		driver.findElement(By.xpath("//*[@id=\"camp_access_form\"]/div[1]/div/ul/li[2]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"866\"]/div/label")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"camp_access_form\"]/div[2]/button[1]")).click();
		
}

	
	@DataProvider(name = "wordpress")
	public Object[][] passdata() {
		ExcelDataConfig config = new ExcelDataConfig("C:\\Users\\Trigen\\Downloads\\User_data.xlsx");
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