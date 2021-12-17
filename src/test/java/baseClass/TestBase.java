package baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
public WebDriver driver;
	
	@BeforeMethod
	public void testBase() throws InterruptedException
	{
      WebDriverManager.chromedriver().setup();
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
      System.out.println("driver intiated");
      driver.get("https://pavanonlinetrainings.com/#");
      Thread.sleep(2000);
      
	}
@AfterMethod
public void teardown()
{
	driver.close();
	driver.quit();
}
}



