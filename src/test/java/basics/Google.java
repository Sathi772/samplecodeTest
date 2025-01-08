package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test(groups="e2e")
public class Google {
WebDriver driver;
	@BeforeClass(alwaysRun=true)
	public void init()
	{		WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	
	}
	
@Test(groups={"Regression","sanity"})
  public void launchMyApp() {
	//  WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	//
		driver.get("https://www.google.co.in/");
  }
@Test(groups={"Regression","sanity"})
  public void title() {
	  System.out.println(driver.getTitle());
  }

 
@Test(groups={"Regression","sanity"})
  public void urlofmypage(){
	  System.out.println(driver.getCurrentUrl());
	  
  }
 
@AfterClass(alwaysRun=true)
public void teardown()
{
	  driver.quit();
}
}
