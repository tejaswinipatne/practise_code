package Final;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Reg {

WebDriver driver;

	@Test
	public void open() {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium 64 bit\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    driver.get("http://45.112.2.195:83/");
	//driver.get("http://18.222.10.190/");
    
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/p/a/button")).click();
    driver.findElement(By.name("email")).sendKeys("demo@vendorr25.com");
    driver.findElement(By.name("password1")).sendKeys("Tech@123#");
    driver.findElement(By.name("password2")).sendKeys("Tech@123#");
    Select s= new Select(driver.findElement(By.xpath("//*[@id=\"id_user_type\"]")));
    s.selectByVisibleText("vendor");
    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[5]/center/button")).click();
}
	
	
/*
	@Test
	public void open() {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium 64 bit\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
  //  driver.get("http://45.112.2.195:83/");
	driver.get("http://18.222.10.190/");
    
    driver.findElement(By.xpath("//*[@id=\"id_email\"]")).sendKeys("demo@vendor24.com");
    driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("Tech@123#");
     driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div/div/div[4]/center/button")).click();
	*/
     
}
	
