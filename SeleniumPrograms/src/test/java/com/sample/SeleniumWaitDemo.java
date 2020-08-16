package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWaitDemo {
	public static void main(String[] args) {
		seleniumWaits();
	}
	public static void seleniumWaits() {
		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ProjectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("automation step by step");
		//driver.findElement(By.name("abcd")).click();
		driver.close();
	}

}

