package usbangla.us_bangla_autoamtion;

import java.time.Duration;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
    //Testcase_001 Verify US-Bangla logo
    @Test
    public void verifyLogo(){
        boolean logo = driver.findElement(By.xpath("//img[@alt='US-Bangla Airlines']")).isDisplayed();
    }
    //Testcase_002 Verify US-Bangla logo
    @Test
    public void verifyTitle(){
        String actualTitle = driver.getTitle();
        String expectedTitle ="US-Bangla Airlines | US-Bangla Airlines";
        Assert.assertEquals(actualTitle, expectedTitle);

    }
    //Testcase_003 Verify US-Bangla login
    @Test
    public void verifyLogin() throws InterruptedException{
        //Click on Login
        driver.findElement(By.xpath("//p[@class='font-normal font-roboto text-footerDescriptionBottomPart']")).click();
        //Select Sky Star from the dynamic catagory
        driver.findElement(By.xpath("//div[normalize-space()='Sky Star']")).click();
        //Put user id 
        Thread.sleep(2000);
        driver.findElement(By.id("Login")).sendKeys("User@Zahid");
        //Put user password
        Thread.sleep(2000);
        driver.findElement(By.id("Password")).sendKeys("Zahid Bro wants to Fly");
        Thread.sleep(2000);
        driver.findElement(By.id("btnLoginAction")).click();
        Thread.sleep(2000);

    }
    

    //Testcase_005 Verify US-Bangla ticket purchase
    @Test
    public void BookTicket() throws InterruptedException{
        driver.findElement(By.xpath("//div[normalize-space()='Hazrat Shahjalal International Airport']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='font-roboto text-[#333333] text-navBarTitle font-normal text-black/30']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='py-2 px-4 w-full border-b rounded rounded-b-none flex space-x-2 hover:cursor-pointer text-slate-700 ']//input[@id='auto_com']")).sendKeys("China");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='__next']/div/div/section[@class='relative z-20']/div[@class='rounded lg:-mt-14 lg:pt-1 md:pt-1 md:-mt-12 -mt-0 pt-0']/div[@class='bg-white py-4 px-4 md:px-8 space-y-4 rounded-b']/div[@class='grid grid-cols-1 sm:grid-cols-2 md:grid-cols-3 lg:grid-cols-8 space-y-4 lg:space-y-0']/div[@class='col-span-2 md:col-span-4 lg:col-span-4 relative']/div[@class='grid grid-cols-1 sm:grid-cols-2 divide-y sm:divide-y-0 divide-bottom-border']/div[contains(@class,'sm:space-y-2')]/div[@class='relative']/div[@class='absolute !z-[99999999] mt-1 transition duration-1000 ease-in-out rounded-md min-w-full left-0 md:right-0 md:left-auto lg:w-[580px] md:w-[400px]']/div[@class='rounded shadow-lg overflow-hidden bg-white']/ul[@class='list-none list-inside divide-y divide-hover max-h-[340px] w-full overflow-auto relative']/li[@class='px-6 py-4 outline-none hover:bg-hover hover:cursor-pointer focus:text-primary-dark focus-visible:bg-hover focus-visible:outline-none transition-all duration-200 focus-visible:transition-all focus-visible:duration-200 false']/div[@class='flex justify-between items-center focus:bg-primary']/div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[normalize-space()='Thursday']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/section[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[3]/button[14]/span[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='w-full h-[60px] px-4 flex flex-col justify-center border border-[#D7D7D7] hover:bg-input-bg hover:cursor-pointer bg-input-bg border-l-0 rounded-r md:rounded-r lg:rounded-none']//div[@class='font-roboto text-[#333333] text-navBarTitle font-normal']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//div[normalize-space()='1 Passenger']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='px-2 w-full flex flex-col spcae-y-2 divide-y rounded-md']//div[1]//div[2]//div[2]//*[name()='svg']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[normalize-space()='Confirm']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(@class,'whitespace-pre-wrap font-roboto text-navBarTitle font-normal')]")).click();
        Thread.sleep(9000);

    }



    @AfterMethod
	public void tearDown()
	{
	driver.quit();
	}
}
