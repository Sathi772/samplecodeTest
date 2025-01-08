package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test(groups={"smoke"})
public class Basic {
	WebDriver driver;
	
	@BeforeClass
	public void browserinit()
	{
	//	WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
	
		
	}
	//String browser="edge";
	//@Test(groups={"smoke"})
	
	@Test
  @Parameters({"browser"})
  public void launchMyApp(String browser) {
	  if(browser.equalsIgnoreCase("chrome"))
	  {
	  WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	  }
	  else if(browser.equalsIgnoreCase("edge"))
	  {
		  WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
	  
	  }
		driver.get("https://magento.softwaretestingboard.com/");
  }
  //@Test(groups={"smoke"})
	@Test
  @Parameters({"product"})
  public void title(String product) {
	 driver.findElement(By.id("search")).sendKeys(product);
	 
  }

  
}
