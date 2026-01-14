package org.selenium.practice.selenium1framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// 1️⃣ Open application
		driver.get("https://practicetestautomation.com/practice-test-login/");

		// 2️⃣ Login with explicit waits
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")))
		        .sendKeys("student");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")))
		        .sendKeys("Password123");

	}

}
