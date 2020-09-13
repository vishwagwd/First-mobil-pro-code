package status;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		



		System.setProperty("webdriver.chrome.driver", "E:\\vishwa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://mobilpro.e-softsys.com/forms/userlogin.aspx");
		driver.manage().window().maximize();

		   driver.findElement(By.name("txtUserID")).sendKeys("vishwanath@esoftsys.com");
	  	   driver.findElement(By.name("txtPassword")).sendKeys("123456");
	 	   driver.findElement(By.name("cmdLogin")).click();


	/*	WebElement e1 = driver.findElement(By.xpath("//*[@id=\"txtUserID\"]"));
		e1.sendKeys("vishwanath@esoftsys.com");
		WebElement e2 = driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		e2.sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"cmdLogin\"]")).click(); 
                */


			System.out.print("Logged in successfully.");
		
			WebElement e3 = driver.findElement(By.className("ColToday1"));
			e3.click();
			
			//to Click on the Proj
			
	                /*		WebElement e4 = driver.findElement(By.xpath("//*[@id=\"cboProject\"]"));
			e4.click();				
			Select d1 = new Select(e4);
			d1.selectByVisibleText("Administration"); //provide name of the project
						
			
			
			Select e5 = new Select( driver.findElement(By.xpath("//*[@id=\"cboJob\"]")));
			//e5.click();
			//Select e5 = new Select(e5);
			e5.selectByIndex(151);           
                                */
			


		    Select list2 = new Select (driver.findElement(By.name("cboProject")));            //Job 
		    list2.selectByIndex(2);
			
		   Select list3 = new Select (driver.findElement(By.name("cboJob"))); 
		System.out.println("selected");//Job 
		    list3.selectByIndex(151);
			
			
			
	}

}
