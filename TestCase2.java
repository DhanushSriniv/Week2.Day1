package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driverNew = new ChromeDriver();
		
		//Open the Browser
		//Load the Url
		
		driverNew.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the window
		driverNew.manage().window().maximize();
		
		//Enter the User Name
		driverNew.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//Enter the Password
		driverNew.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click the Login button
		driverNew.findElement(By.className("decorativeSubmit")).click();
		
		//Click the CRM/SFA
		driverNew.findElement(By.linkText("CRM/SFA")).click();
		
		//Click Contacts Tab
		driverNew.findElement(By.linkText("Contacts")).click();
		
		//Click Find Contacts Tab
		driverNew.findElement(By.linkText("Find Contacts")).click();
		
		//Click Email Tab
		driverNew.findElement(By.linkText("Email")).click();
		
		//Type Email iD: babu@testleaf.com
		driverNew.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		
		//Click Find Contacts
		driverNew.findElement(By.className("x-btn-text")).click();
		
		//Close the Browser
		driverNew.close();

	}

}
