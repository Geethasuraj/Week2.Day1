package week2.day1assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// Step 5: Locate the username and type "demosalesmanager"
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		// Step 6: Locate the password and type "crmsfa"
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Step 7: Locate the Login button and click it
		driver.findElement(By.className("decorativeSubmit")).click();
		// Step 8: Click CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Step10: Click Leads tab
		driver.findElement(By.linkText("Leads")).click();
		// Step11: Click CreateLead
		driver.findElement(By.linkText("Create Lead")).click();
		// Step12: Enter Company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("VCS");

		// Step13: Enter FirstName
		WebElement first = driver.findElement(By.id("createLeadForm_firstName"));
		first.sendKeys("Geetha");
		System.out.println(first);
		// Step14: Enter LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		// To clear countrycode and enter the value

		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpdwn = new Select(source);
		drpdwn.selectByIndex(2);

		WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drpdwn1 = new Select(marketing);
		drpdwn1.selectByValue("CATRQ_CARNDRIVER");

		WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select drpdwn2 = new Select(currency);
		drpdwn2.selectByVisibleText("AUD - Australian Dollar");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Geetha");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs.");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/25/1991");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Admin");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("50");

		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drpdwn3 = new Select(industry);
		drpdwn3.selectByValue("IND_GEN_SERVICES");

		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drpdwn4 = new Select(ownership);
		drpdwn4.selectByIndex(3);

		driver.findElement(By.id("createLeadForm_description")).sendKeys("test");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Important");

		WebElement CountryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		CountryCode.clear();
		CountryCode.sendKeys("23");

		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("23");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9884025910");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Gee");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("geethasuraj61@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.abc.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Vaishu");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Va");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("North car street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("park venuw");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("New York");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("603209");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("98");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("United States");

		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drpdwn5 = new Select(state);
		drpdwn5.selectByValue("AR");

		WebElement country1 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drpdwn6 = new Select(country1);
		drpdwn6.selectByValue("AIA");

		// Step15: Click CreateLead button
		driver.findElement(By.className("smallSubmit")).click();

		// Get and Verify the Title of the resulting Page(View Lead)
		String Title = driver.getTitle();
		String view = "View Lead | opentaps CRM";

		if (view.equals(Title)) {
			System.out.println("In the View page");

		} else {
			System.out.println(("Not in view page"));
		}
	}

}
