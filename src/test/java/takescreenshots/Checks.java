package takescreenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(takescreenshots.ListenerTest.class)

public class Checks {
	WebDriver driver;
	
	@BeforeClass
	public void browserinit()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	
		
	}
  @Test(priority=1)
  public void launchMyApp() {
		driver.get("https://www.demoblaze.com/");
  }
  @Test(priority=4)
  public void title() {
	  System.out.println(driver.getTitle());
  }

  @Test(priority=3,enabled=true)
 // @Ignore
  public void productclick() throws InterruptedException {
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id='tbodyid']/div[1]/div/a/img")).click();
	  
  }
  @Test(priority=2)
  public void urlofmypage(){
	  System.out.println(driver.getCurrentUrl());
	  
  }
  @AfterClass
  public void teardown()
  {
	  driver.quit();
  }
}
