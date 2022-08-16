package stepdefinitons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class logindemo {
	WebDriver driver;
	@Given("user is in login page")
	public void user_is_in_login_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("browser is open");
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@When("user enter credentials")
	public void user_enter_credentials() {
		
		driver.get("https://example.testproject.io/web/");
		driver.findElement(By.id("name")).sendKeys("sukumar");
		driver.findElement(By.id("password")).sendKeys("12345");
		
		driver.findElement(By.id("login")).click();
		
	}

	@And("user navigate to home page")
	public void user_navigate_to_home_page() {
		System.out.println("logout");
		driver.findElement(By.id("logout")).isDisplayed();
		driver.close();
	}

}
