package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilites_Demo {
	public static void main(String[] args) {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeStrings",true);
		System.setProperty("webdriver.ie.driver", "E:\\mahesh\\selenium\\SeleniumPrograms\\drivers\\IEdriver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("mahesh how are U");
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		driver.close();

	}

}
