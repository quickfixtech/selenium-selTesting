package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class google {
	 WebDriver driver;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.gecko.driver", "/Users/ravi/Downloads/geckodriver");
		  driver = new FirefoxDriver();
		  driver.get("http://www.google.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
  @Test
  public void google1() throws InterruptedException {
	  
	  if (driver.getPageSource().contains("I'm Feeling Lucky")) {
          System.out.println("Pass");
  } else {
          System.out.println("Fail");
}
     
      Thread.sleep(600);	 	  	  
  }
  
  @Test
  public void google2() throws InterruptedException {
	  
	  if (driver.getPageSource().contains("I'm Feeling Lucky")) {
          System.out.println("Pass");
  } else {
          System.out.println("Fail");
}
     
      Thread.sleep(600);	 	  	  
  }
  @Test
  public void google3() throws InterruptedException {
	  
	  if (driver.getPageSource().contains("I'm Feeling Lucky")) {
          System.out.println("Pass");
  } else {
          System.out.println("Fail");
}
     
      Thread.sleep(600);	 	  	  
  }
 
   @AfterMethod
    public void logout() {
	    driver.quit();
   }
}
