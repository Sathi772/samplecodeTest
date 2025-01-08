package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test(groups={"regression"})
public class Assertss {
	/*
	 * types of assertion
	 * hard assert
	 * 
	 * soft assert
	 * 
	 */
	WebDriver driver;
	SoftAssert s;
	@BeforeClass
	public void browserinit()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		 s=new SoftAssert();
	
	
	}
  //@Test(invocationCount=2)
//	@Test(groups={"regression"})
	@Test
  public void launchMyApp() throws InterruptedException {
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='tbodyid']/div[1]/div/div/h4/a")).click();
		Thread.sleep(4000);
	/*	if(driver.findElement(By.xpath("//h2[text()='Samsung galaxy s6']")).getText().equalsIgnoreCase("Samsung galaxy s"))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
		*/
	//	Assert.assertEquals(driver.findElement(By.xpath("//h2[text()='Samsung galaxy s6']")).getText(), "Samsung galaxy","mismatched information/data");
		                      /// hard assert
		//Assert.assertEquals(driver.findElement(By.xpath("//h2[text()='Samsung galaxy s6']")).getText(), "Samsung galaxy","mismatched information/data");
		
		     ///soft assert
	s.assertEquals(driver.findElement(By.xpath("//h2[text()='Samsung galaxy s6']")).getText(), "Samsung galaxy","mismatched information/data");

		System.out.println("hello team good morning");
		s.assertAll();
		
		
  }
}
