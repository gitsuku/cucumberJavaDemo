package stepdefinitons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.driverclass;
import io.cucumber.java.en.*;

public class googlesearchSteps {
	WebDriver driver;
	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("browser is open");
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
	}

	@And("user is on google search box")
	public void user_is_on_google_search_box() {
		System.out.println("inside google page");
		driver.get("https://www.google.com");
	}

	@When("user enter a text")
	public void user_enter_a_text() {
		System.out.println("inside google search");
		driver.findElement(By.name("q")).sendKeys("sukumar reddy jntu");
	}

	@And("hits enter")
	public void hits_enter() {
	   driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user should get results")
	public void user_should_get_results() {
	
	}

}
