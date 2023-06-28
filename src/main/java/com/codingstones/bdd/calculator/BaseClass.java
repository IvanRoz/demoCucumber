package com.codingstones.bdd.calculator;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Point;

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
				caps.setCapability("platformVersion", "15.0");
				caps.setCapability("deviceName", "iPhone 11 iOS 15");
				
				caps.setCapability("app","/Users/becario/Library/Developer/Xcode/DerivedData/ClaroDrive-dhkamurknolfyofhqmtddwvefphf/Build/Products/Debug-iphonesimulator/ClaroDrive.app");
								
				URL url = new URL("http://127.0.0.1:4723/wd/hub");
				
				driver = new IOSDriver(url, caps);
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//Metodo para esperar n intentos hasta que aparece un elemento

		public boolean waitForElement(By identificator, int intents) {
			
			while(intents > 0) {
				
				if (isVisible(identificator)) {
					return true;
				}
				intents--;
			}
		
			System.out.println("No encontre el elemento "+identificator.toString());
			return false;
		}

		//Metodo que pregunta si es visible un elemento

		public boolean isVisible(By identificator){
	
			if(driver.findElements(identificator).size() > 0) {
				return true;
			} else {
				return false;
			}

		}
		
		//Metodo que da tap en otra parte de la pantalla para cerrar el teclado.
		public void hideKeyboard() {
			Point keyboardPoint = driver.findElement(By.className("XCUIElementTypeKeyboard")).getLocation();

			TouchAction touchAction = new TouchAction(driver);

			touchAction.tap(new PointOption().withCoordinates(keyboardPoint.getX() + 2, keyboardPoint.getY() + 0)).perform();

			}
		
		//Metodo creado para hacer scroll

		public void mobileScrollScreenIOS(String dir) {
			
			System.out.println("mobileScrollScreenIOS(): dir: '" + dir + "'");

			//final int ANIMATION_TIME = 200; // ms

			final HashMap<String, String> scrollObject = new HashMap<String, String>();
			switch (dir) {
				case "DOWN":
					scrollObject.put("direction", "down");
					break;
				case "UP":
					scrollObject.put("direction", "up");
					break;
				default:
					throw new IllegalArgumentException("mobileScrollIOS(): dir: '" + dir + "' NOT supported");
			}
			try {
				driver.executeScript("mobile:swipe", scrollObject);
			// Thread.sleep(ANIMATION_TIME);
			} catch (Exception e) {
				System.err.println("mobileScrollIOS(): FAILED\n" + e.getMessage());
				return;
			}

		}

}
