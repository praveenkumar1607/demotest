package Basictest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class sam {
	
	WebDriver driver;
	 @BeforeTest
	  public void beforeTest() throws MalformedURLException {
		  DesiredCapabilities cap=new DesiredCapabilities();
		 cap.setCapability("testobject_api_key","CEB348B22F7445AE809FF5BFB8CBCF03");
		 cap.setCapability("testobject_app_id","1");
		 cap.setCapability("testobject_device","Samsung_Galaxy_Nexus_I9250_real");
		 cap.setCapability("testobject_appium_version","1.5.0");
		 cap.setCapability("appPackage","com.example.bliss.mychecklist");
		   
		    cap.setCapability("appActivity","com.example.bliss.mychecklist.Register");
		  // cap.setCapability("appActivity","com.example.bliss.mychecklist.Login");
	   
		// cap.setCapability("appActivity","com.example.android.testing.unittesting.BasicSample.MainActivity");
			driver=new RemoteWebDriver(new URL("https://app.testobject.com:443/api/appium/wd/hub"),cap);
			 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// cap.setCapability("platformVersion","4.3.0");
			//cap.setCapability("platformName","Android");
			
	  }

  @Test
  public void f() {
	//driver.findElement(By.name("Enter your email id")).sendKeys("praveen.blisslogix@gmail.com");
	    driver.findElement(By.name("First Name")).sendKeys("ashok");
	      driver.findElement(By.name("Last Name")).sendKeys("kumar");
	     driver.findElement(By.name("Email")).sendKeys("ashok3.blisslogix@gmail.com");

	     //driver.findElement(By.name("Tabs")).click();
	     driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'com.example.bliss.mychecklist:id/edit_Pwd')]")).sendKeys("abc123");
	     driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'com.example.bliss.mychecklist:id/edit_Confirmpwd')]")).sendKeys("abc123");
	     driver.findElement(By.name("Sign Up")).click();
	    driver.findElement(By.name("Ok")).click();
	   
	  
  }
 

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
