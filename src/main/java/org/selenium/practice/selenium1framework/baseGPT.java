package org.selenium.practice.selenium1framework;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseGPT {

	public static void main(String[] args) throws InterruptedException {
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

		wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")))
		        .click();

		// 3️⃣ OPTIONAL: Validate login success
		wait.until(ExpectedConditions.urlContains("logged-in-successfully"));

		// 4️⃣ TOP MENU – Wait + Loop (REAL PROJECT STYLE)
		List<WebElement> menus = wait.until(
		        ExpectedConditions.visibilityOfAllElementsLocatedBy(
		                By.xpath("//li[contains(@class,'menu-item')]//a")));
		                
		          

		// 5️⃣ Loop and click required menu
		for (WebElement menu : menus) {
		    String menuText = menu.getText().trim();

		    if (menuText.equalsIgnoreCase("Practice")) {
		        menu.click();
		        break;	                
		        
		    }
		}

		//6 Add new row
		driver.findElement(By.xpath("//a[normalize-space()='Test Exceptions']")).click();
		driver.findElement(By.id("add_btn")).click();
		
		
		
		/*WebElement  inputBox=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy
				(By.xpath("(//input[@type='text'])[2]"))); */
		WebElement  inputBox=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='text'])[2]")));
		inputBox.sendKeys("Burger");
		
		WebElement ConfirmMsg=driver.findElement(By.xpath("//div[@id='confirmation']"));
		System.out.println(ConfirmMsg.getText());
		
		driver.findElement(By.xpath("(//button[@id='save_btn'])[2]")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
		////System.out.print(driver.findElement(By.id("confirmation")));
	}	

}
