package usbangla.us_bangla_autoamtion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class UsBangla {
    
        WebDriver driver;

	@BeforeMethod

	public void setUp()

	{

	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

	driver=new ChromeDriver();
	driver.get("https://usbair.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
}
