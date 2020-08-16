package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		googleSearchTest();


	}
	private static void googleSearchTest() {
		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ProjectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		driver.get("https://google.com/");
		searchPageObj.setTestInSearchBox("ABCD");
		searchPageObj.clickSearchButton();
		driver.close();

	}

}
