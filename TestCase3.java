package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {

	public static void main(String[] args) {
		
		// To setup the Driver
		WebDriverManager.chromedriver().setup();
		
		//To Launch the Driver
		ChromeDriver webDriver = new ChromeDriver();
		
		// To load The URL
		webDriver.get("http://leaftaps.com/opentaps/control/main");
		
		// To Maximize the Browser Window
		webDriver.manage().window().maximize();
		
		//To enter the username
		webDriver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//To enter the password
		webDriver.findElement(By.id("password")).sendKeys("crmsfa");
				
		// Click on the login button		
		webDriver.findElement(By.className("decorativeSubmit")).click();
				
		//Click on the text link CRM/SFA
		webDriver.findElement(By.linkText("CRM/SFA")).click();
		
		//To Click on the Leads Tab
		webDriver.findElement(By.linkText("Leads")).click();
		
		//To click on the Create Lead
		webDriver.findElement(By.linkText("Create Lead")).click();
		
		//Enter All the Fields
		//To enter text inside the Company Name text box
		//WebElement element = webDriver.findElement(By.id("createLeadForm_companyName"));
		webDriver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC PVT.LTD");
							
		//To enter text in the First and Last Name
	  	webDriver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhanush");
		webDriver.findElement(By.id("createLeadForm_lastName")).sendKeys("Srinivasan");
				
		//To select from the DropDown
		WebElement dropDown = webDriver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(dropDown);
		dd.selectByVisibleText("Direct Mail");
		
		WebElement marketingDropDown = webDriver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mD = new Select(marketingDropDown);
		mD.selectByVisibleText("Automobile");
		
		//To Enter Date of Birth
		webDriver.findElement(By.id("createLeadForm_birthDate")).sendKeys("03/23/00");
		
		//To Enter Title
		webDriver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Assistant Engineer");
		
		//To Enter Department
		webDriver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Vehicle Construction");
		
		//To enter Annual revenue
		webDriver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("50 Million Dollars");
		
		//To Select Industry
		WebElement industry = webDriver.findElement(By.id("createLeadForm_industryEnumId"));
		Select iD = new Select (industry);
		iD.selectByVisibleText("Manufacturing");
		
		// To enter Number of employees
		webDriver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("5000");
		
		//To select ownership
		WebElement ownerShip = webDriver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select oS = new Select(ownerShip);
		oS.selectByVisibleText("Public Corporation");
		
		//To enter Contact Information
		//To enter Area Code
		webDriver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600008");
		//To enter Phone Number
		webDriver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("36378648734");
		//To enter e-mail address
		webDriver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("tryit23@super.com");
		//To enter web URL
		webDriver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/crmsfa/control/createLeadForm;jsessionid=6B1C7922456E19323658EAC6AACA3D99.jvm1");
		
		//To enter Primary Address
		//To enter To Name
		webDriver.findElement(By.id("createLeadForm_generalToName")).sendKeys("AZ vehicle frame builder");
		//To enter Attention name
		webDriver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("CEO TryIT");
		//To enter Address Line 1 & 2
		webDriver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("23, 6th Try lane");
		webDriver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Oxford Avenue, SuperMan");
		//To enter City
		webDriver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Massachusetts");
		//To enter State/Province
		WebElement state = webDriver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select s = new Select(state);
		s.selectByVisibleText("Massachusetts");
		//To enter postal code
		webDriver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("2424234");
		
		//To Click on Lead Button
		webDriver.findElement(By.className("smallSubmit")).click();
		
		//To get the First name
		WebElement firstName = webDriver.findElement(By.id("viewLead_firstName_sp"));
		String fnText = firstName.getText();
		System.out.println(fnText);
		
		//To get the Title of the page
		String title = webDriver.getTitle();
		System.out.println(title);
		if (webDriver.getTitle().contains("View Lead | opentaps CRM")) {
			System.out.println("Title confirmed");		
		}else {
			System.out.println("Title is not the expected");
		}
		
		//Close the Browser
		webDriver.close();

	}

}
