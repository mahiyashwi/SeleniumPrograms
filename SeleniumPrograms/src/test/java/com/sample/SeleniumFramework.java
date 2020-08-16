package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFramework {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\mahesh\\selenium\\SeleniumPrograms\\drivers\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://fb.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.id("email")).sendKeys("9063234100");
		//driver.findElement(By.name("pass")).sendKeys("maheshbabu");
		//driver.findElement(By.className("inputtext")).sendKeys("mahesh");
		//driver.findElement(By.tagName("input")).sendKeys("hfjfhfidl");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.findElement(By.cssSelector("#u_0_r")).sendKeys("9063234100");
		driver.findElement(By.xpath("//*[@id=\"year\"]")).click();
	}

}
