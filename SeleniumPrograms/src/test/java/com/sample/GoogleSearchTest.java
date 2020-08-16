package com.sample;

import java.util.List;
import pages.GoogleSearchPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		googleSearch();

	}
	private static void googleSearch() {
		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ProjectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com/");
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);


	}



}
