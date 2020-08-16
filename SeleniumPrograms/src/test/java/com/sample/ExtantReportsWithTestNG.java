package com.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtantReportsWithTestNG {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	WebDriver driver;
	@BeforeSuite
	public void setUp() {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@BeforeTest
	public void setUpSet() {

		System.setProperty("webdriver.chrome.driver", "E:\\mahesh\\selenium\\SeleniumPrograms\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void test1() throws IOException {   
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		driver.get("https://google.com");
		test.pass("navigated google.com");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("This step shows usage of info(details)");
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
	}
	@AfterTest
	public void tearDownTest() throws InterruptedException{
		Thread.sleep(3000);
		driver.close();
		System.out.println("test completed");
	}

	@AfterSuite
	public void tearDown() {
		extent.flush();
	}
}
