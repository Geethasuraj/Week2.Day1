package week2.day1assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step 1: Download and set the path
		WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL https://en-gb.facebook.com/

		driver.get("https://en-gb.facebook.com/");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Step 6: Click on Create New Account button
		driver.findElement(By.linkText("Create New Account")).click();

		// Step 7: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Geetha");

		// Step 8: Enter the last name

		driver.findElement(By.name("lastname")).sendKeys("Suraj");

		// Step 9: Enter the mobile number

		driver.findElement(By.name("reg_email__")).sendKeys("9884025910");

		// Step 10: Enterthe password

		driver.findElement(By.name("reg_passwd__")).sendKeys("geethasuraj91@gmail.com");

		// Step 11: Handle all the three drop downs

		WebElement Date = driver.findElement(By.id("day"));
		Select drpdwn = new Select(Date);
		drpdwn.selectByIndex(25);

		WebElement Month = driver.findElement(By.id("month"));
		Select drpdwn1 = new Select(Month);
		drpdwn1.selectByValue("6");

		WebElement Year = driver.findElement(By.id("year"));
		Select drpdwn2 = new Select(Year);
		drpdwn2.selectByValue("1991");

		// Step 12: Select the radio button "Female"

		driver.findElement(By.className("_58mt")).click();

	}

}
