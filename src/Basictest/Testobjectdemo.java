package Basictest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Testobjectdemo {
	WebDriver driver;
  @Test
  public void f() throws MalformedURLException {
	  DesiredCapabilities cap=new DesiredCapabilities();
	  
		
		 cap.setCapability("testobject_api_key","856FE7E69889478A84565D39EFFEB085");
		 cap.setCapability("testobject_app_id","1");
		 cap.setCapability("testobject_device","LG_Nexus_4_E960_real");
		 cap.setCapability("testobject_appium_version","1.5.0");
		//cap.setCapability("browserName","Android");
			// cap.setCapability("platformVersion","5.1");
			// cap.setCapability("platformName","Android");
		// cap.setCapability("testobject_suite_name","Default Appium Suite");
		// cap.setCapability("testobject_test_name","Default Appium Test");
		 //cap.setCapability("browserName","Android");
		 cap.setCapability("platformVersion","4.3.0");
		cap.setCapability("platformName","Android");
	 cap.setCapability("appPackage","com.example.android.testing.unittesting.BasicSample");
			
	 cap.setCapability("appActivity","com.example.android.testing.unittesting.BasicSample.MainActivity");
			driver=new RemoteWebDriver(new URL("https://app.testobject.com:443/api/appium/wd/hub"),cap);
			 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			 System.out.println("installing app on device from jenkins workspace");
			 cap.setCapability("appPackage","com.example.android.testing.unittesting.BasicSample");
			// cap.setCapability("app", cap.getAbsolutePath());
		     cap.setCapability("appActivity","com.example.android.testing.unittesting.BasicSample.MainActivity");
			driver=new RemoteWebDriver(new URL("https://app.testobject.com:443/api/appium/wd/hub"),cap);
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,':id/userNameInput')]")).sendKeys("PRAVEEN");
		
			// driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,':id/userNameInput')]")).sendKeys("ashok")
			// driver.findElement(By.name("Save")).click();
			 driver.quit();
			// driver.quit();	
			 //driver.findElement(By.name("Sign Up")).click();
	  
	  
  }
}
