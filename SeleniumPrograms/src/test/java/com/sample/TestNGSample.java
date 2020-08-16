package com.sample;

import java.util.List;
import pages.GoogleSearchPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGSample {
	WebDriver driver = null;
	@BeforeTest
	public void setUpTest() {
		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ProjectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void googleSearch() {

		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("hai how are you");
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);

	}

	@AfterTest
	public void tearDownTest() throws InterruptedException{
		Thread.sleep(3000);
		driver.close();
		System.out.println("test completed");


	}

}
