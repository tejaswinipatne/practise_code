package Final;

import java.util.List;
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


public class DataDrivenTestReg {

	WebDriver driver;

	@Test(dataProvider = "wordpress")

	public void open( String[] colCount) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium 64 bit\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("http://192.168.20.220:85/");

		for(int i=0;i<30;i++) {
		String p[]= colCount;
		System.out.println(p.toString());
		
		/*if(p.equals("Email_Id")) {
			System.out.println(colCount[i]+ "="+ colCount[0]);
			
		}*/
		}
		 /* driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/p/a/button")).click();
		    driver.findElement(By.name("email")).sendKeys(colCount[0]);
		    driver.findElement(By.name("password1")).sendKeys(colCount[1]);
		    driver.findElement(By.name("password2")).sendKeys(colCount[2]);
		    
		    WebElement w= driver.findElement(By.xpath("//*[@id=\"id_user_type\"]"));
		    List<WebElement> allElements = w.findElements(By.tagName("option"));
		    for (WebElement element: allElements) {
		       if(colCount[3].equals(element.getText())) {
		         element.click(); 
		       }
		    }
		    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[5]/center/button")).click();
		  */
		    
	}

	@DataProvider(name = "wordpress")
	public Object[][] passdata() {
		ExcelDataConfig config = new ExcelDataConfig("C:\\Users\\Trigen\\Downloads\\ven.xlsx");
		int rowCount = config.getRowCount(0);
		int colCount = config.getColCount(0);
		Object[][] data = new Object[rowCount + 1][colCount + 1];
		for (int rows = 0; rows < rowCount; rows++) {
			for (int cols = 0; cols < colCount; cols++) {
	
				data[rows][cols] = config.getData(0, rows, cols);
			}
		}

return data;

	}
}