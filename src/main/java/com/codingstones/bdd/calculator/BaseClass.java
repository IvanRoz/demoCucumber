package com.codingstones.bdd.calculator;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;

public class BaseClass {

		static IOSDriver driver;
		
		public void setup() {
			try {
				DesiredCapabilities caps = new DesiredCapabilities();
				
				caps.setCapability("platformName", "iOS");
				caps.setCapability("automationName", "XCUITest");
				caps.setCapability("noReset", true);
				caps.setCapability("fullReset", false);
				caps.setCapability("platformVersion", "15.4");
				caps.setCapability("deviceName", "iPhone 12");
				
				caps.setCapability("app","/Users/jorgeivanrodriguezzarco/Library/Developer/Xcode/DerivedData/ClaroDrive-chxvhamvpvazmcdzsoacfjpduqoy/Build/Products/Debug-iphonesimulator/ClaroDrive.app");
								
				URL url = new URL("http://127.0.0.1:4723/wd/hub");
				
				driver = new IOSDriver(url, caps);
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			
		}

}
