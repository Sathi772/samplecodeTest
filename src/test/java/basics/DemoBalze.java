package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test(groups="e2e")
public class DemoBalze {
	WebDriver driver;
	
	  @Test(groups="Smoke")
	  public void launchMyApp() {
		  WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		
			driver.get("https://www.demoblaze.com/");
	  }
	  @Test(groups="Smoke")
	  public void title() {
		  System.out.println(driver.getTitle());
	  }

	  @Test(groups="Smoke")

	  public void productclick() throws InterruptedException {
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='tbodyid']/div[1]/div/a/img")).click();
		  
	  }
	  @Test(groups="Smoke")
	  public void urlofmypage(){
		  System.out.println(driver.getCurrentUrl());
		  
	  }
}
