package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		//Open the Browser
		//Load the Url
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the User Name
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//Enter the Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click the CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click Contacts Tab
		driver.findElement(By.linkText("Contacts")).click();
		
		//Click Create Contact 
		driver.findElement(By.linkText("Create Contact")).click();
		
		//Type first and last name
		driver.findElement(By.id("firstNameField")).sendKeys("Dhanush");
		driver.findElement(By.id("lastNameField")).sendKeys("Srinivasan");
		
		//Click Create Contact Button
		driver.findElement(By.className("smallSubmit")).click();
		
		//Print the Browser title
		String title = driver.getTitle();
		System.out.println(title);
		
		//Print the first name
		WebElement retrieveFN = driver.findElement(By.id("viewContact_firstName_sp"));
		String text = retrieveFN.getText();
		
		System.out.println(text);
		
		//Close the browser
		driver.close();
		
		
	}

}
