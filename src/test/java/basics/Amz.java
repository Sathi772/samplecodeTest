package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test(groups={"smoke"})
public class Amz {
	WebDriver driver;
	
	@BeforeClass(alwaysRun=true)
	public void browserinit()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	
		
	}
  //@Test(invocationCount=2)
//	@Test(timeOut=4000)
	@Test(groups={"sathvik"})
	//@Test
  public void launchMyApp() {
		driver.get("https://www.amazon.in/");
  }
 // @Test(dependsOnMethods="launchMyApp")
	@Test(groups={"sathvik"})
//	@Test
  public void title() {
	  System.out.println(driver.getTitle());
  }


	@Test(groups={"sathvik"})
	//@Test
  public void urlofmypage(){
	  System.out.println(driver.getCurrentUrl());
	  
  }
  @AfterClass(alwaysRun=true)
  public void teardown()
  {
	  driver.quit();
  }
}
