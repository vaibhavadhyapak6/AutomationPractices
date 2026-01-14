package org.selenium.practice.selenium1framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseTest {

	public static void main(String[] args) throws InterruptedException {
		

		// TODO Auto-generated method stub
		
		WebDriver driver=new EdgeDriver();
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	   //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		// Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Practice']")).click();
		//driver.findElement(By.xpath("//a[normalize-space()='Practice']")).click();
		
		Thread.sleep(5000);
		driver.close();

	}

}
