package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicDemo {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent Reports.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test1 = extent.createTest("Google Search Test One", "Google Search Functionality");
		System.setProperty("webdriver.chrome.driver", "E:\\mahesh\\selenium\\SeleniumPrograms\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		test1.log(Status.INFO,"Starting Test Case");
		driver.get("https://google.com/");
		test1.pass("Navigated to google.com");
		driver . findElement(By.name("q")).sendKeys("Automation Step Step By Step");
		test1.pass("Enter text in Searchbox");
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("pressed keyboard enter key");
		driver.close();
		test1.pass("close the browser");
		test1.info("Test completed"); 
		extent.flush();
	}
}