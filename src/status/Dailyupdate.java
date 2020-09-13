package status;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dailyupdate {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\vishwa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://mobilpro.e-softsys.com/forms/userlogin.aspx");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//*[@id=\"txtUserID\"]"));
		e1.sendKeys("vishwanath@esoftsys.com");
		WebElement e2 = driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		e2.sendKeys("147258");
		driver.findElement(By.xpath("//*[@id=\"cmdLogin\"]")).click();
			System.out.print("Logged in successfully.");
		
			WebElement e3 = driver.findElement(By.className("ColToday1"));
			e3.click();
			
			//to Click on the Proj
			
			WebElement e4 = driver.findElement(By.xpath("//*[@id=\"cboProject\"]"));
			e4.click();				
			Select d1 = new Select(e4);
			d1.selectByVisibleText("Administration"); //provide name of the project
			
			Thread.sleep(2000);
			WebElement e5 = driver.findElement(By.xpath("//*[@id=\"cboJob\"]"));
			Actions a1 = new Actions(driver);
			a1.click(e5).perform();
			
			Thread.sleep(2000);
			Select d2 = new Select(e5);
			d2.selectByValue("151");

			//to select the task
			
			Select d3 = new Select(driver.findElement(By.xpath("//*[@id=\"cboTask\"]")));
			d3.selectByVisibleText("MailChecking, MobilPro Entry");
			
			// to enter the time.
			driver.findElement(By.name("txtTetTime")).sendKeys("0.75");
					
			 driver.findElement(By.name("txtTetDiary")).sendKeys("mail checking and mobil pro entry");
			
			//to click on save
			
			driver.findElement(By.name("cmdSave")).click();
			Thread.sleep(1000);
			
			WebElement e9 = driver.findElement(By.xpath("//*[@id=\"lblStatus\"]"));
			System.out.println(e9 + "entry saved successfully");
	
			
			//2nd
			
			
			WebElement e10 = driver.findElement(By.xpath("//*[@id=\"cboProject\"]"));
			e10.click();				
			Select d4 = new Select(e10);
			d4.selectByVisibleText("Administration"); //provide name of the project
			
			Thread.sleep(2000);
			WebElement e11 = driver.findElement(By.xpath("//*[@id=\"cboJob\"]"));
			Actions a2 = new Actions(driver);
			a2.click(e11).perform();
			
			Thread.sleep(2000);
			Select d5 = new Select(e11);
			d5.selectByValue("2828");

			//to select the task
			
			Select d6 = new Select(driver.findElement(By.xpath("//*[@id=\"cboTask\"]")));
			d6.selectByVisibleText("Meeting");
			
			// to enter the time.
			driver.findElement(By.name("txtTetTime")).sendKeys("0.25");
			
			
			driver.findElement(By.name("txtTetDiary")).sendKeys("QA Status Meeting");
		
			
			
			//to click on save
			
			driver.findElement(By.name("cmdSave")).click();
			Thread.sleep(1000);
			
			
			
			//3rd 
			
			WebElement e16 = driver.findElement(By.xpath("//*[@id=\"cboProject\"]"));
			e16.click();				
			Select d7 = new Select(e16);
			d7.selectByVisibleText("JMS All Storage"); //provide name of the project
			
			Thread.sleep(2000);
			WebElement e17 = driver.findElement(By.xpath("//*[@id=\"cboJob\"]"));
			Actions a3 = new Actions(driver);
			a3.click(e17).perform();
			
			Thread.sleep(2000);
			Select d8 = new Select(e17);
			d8.selectByValue("5634");

			//to select the task
			
			Select d9 = new Select(driver.findElement(By.xpath("//*[@id=\"cboTask\"]")));
			d9.selectByVisibleText("Day End Verification");
			
			// to enter the time.
			driver.findElement(By.name("txtTetTime")).sendKeys("0.75");
			
			
			driver.findElement(By.name("txtTetDiary")).sendKeys("Day end verification for JMS");
					
			
			//to click on save
			
			driver.findElement(By.name("cmdSave")).click();
			Thread.sleep(1000);
			
			
			
			
	}

}
