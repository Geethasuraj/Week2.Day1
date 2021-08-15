package week2.day1assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// Step 6: Fill in all the text boxes

		driver.findElement(By.name("UserFirstName")).sendKeys("Geethanjali");

		driver.findElement(By.name("UserLastName")).sendKeys("S");

		driver.findElement(By.name("UserEmail")).sendKeys("geethasuraj61@gmail.com");

		driver.findElement(By.name("CompanyName")).sendKeys("VCS");

		driver.findElement(By.name("UserPhone")).sendKeys("9884025910");

		// Step 7: Handle all the dropdowns

		WebElement Title = driver.findElement(By.name("UserTitle"));
		Select drpdwn = new Select(Title);
		drpdwn.selectByIndex(2);

		WebElement Employees = driver.findElement(By.name("CompanyEmployees"));
		Select drpdwn1 = new Select(Employees);
		drpdwn1.selectByValue("75");

		WebElement Country = driver.findElement(By.name("CompanyCountry"));
		Select drpdwn2 = new Select(Country);
		drpdwn2.selectByVisibleText("United States");

		WebElement State = driver.findElement(By.name("CompanyState"));
		Select drpdwn3 = new Select(State);
		drpdwn3.selectByValue("AZ");

		driver.findElement(By.className("checkbox-ui")).click();

		driver.close();

	}

}
