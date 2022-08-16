package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class driverclass {
public static void launchURL(String url) {

	 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe"); 
    WebDriver driver = new ChromeDriver();
    driver.get(url);
    driver.quit();
 }


	
}
