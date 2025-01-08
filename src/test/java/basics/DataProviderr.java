package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderr {
	WebDriver driver;
	SoftAssert s=new SoftAssert();
	
	 @BeforeClass
     public void openBrowser() {

   	  WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
           driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

     }

  @DataProvider
  public Object[][] credentials() {
    return new Object[][] {
    	
    	                   { "naveen", "pwdnaveen" },
    	                   {"subha","test@123"},
    	                   {"sathvik","aA@sat"}
    	
    };
    }
    @Test(dataProvider = "credentials",groups={"regression"})
    public void login(String username,String password) throws InterruptedException
    {
    	driver.get("https://magento.softwaretestingboard.com/");
    	driver.manage().window().maximize();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("(//a[normalize-space()='Sign In'])[1]")).click();
    	driver.findElement(By.id("email")).sendKeys(username);
    	driver.findElement(By.id("pass")).sendKeys(password);
    
    
    
    	
    }
}
