package Basictest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Dom {
	WebDriver driver;
	
	
	
  @Test
  public void f() throws MalformedURLException {
	  DesiredCapabilities cap=new DesiredCapabilities();
		 cap.setCapability("deviceName","J668A1ZR5B101972");
		 cap.setCapability(CapabilityType.BROWSER_NAME,"Android");
		 cap.setCapability(CapabilityType.VERSION,"5.1");
      cap.setCapability("platformName","Android");
		 cap.setCapability("appPackage","commontestware.com.delieveryordermgmt");
		//cap.setCapability("appActivity","com.example.bliss.mychecklist.Splash");
		//cap.setCapability("appActivity","com.example.bliss.mychecklist.Login");
		 cap.setCapability("appActivity","commontestware.com.delieveryordermgmt.view.MainActivity.RegisterPage");
		 driver=new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("android.widget.ImageView[@resource-id=':id/photoimage'")).click();
		 driver.findElement(By.name("Choose from gallery")).click();
		 driver.findElement(By.name("Photo (13 April 2015)")).click();
  }
}
