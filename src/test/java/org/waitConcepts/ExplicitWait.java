package org.waitConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("");
	
	WebElement element = driver.findElement(By.xpath(""));
	WebDriverWait wait = new WebDriverWait(driver,25);
	wait.until(ExpectedConditions.visibilityOf(element));
	
	WebDriverWait wait1 = new WebDriverWait(driver,25);
	wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
	
	WebElement element2 = driver.findElement(By.xpath(""));
	WebDriverWait wait2 = new WebDriverWait(driver,25);
	wait2.until(ExpectedConditions.elementToBeClickable(element2));
	
	WebDriverWait wait3 = new WebDriverWait(driver,25);
	wait3.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
	
	WebElement element3 = driver.findElement(By.xpath(""));
	WebDriverWait wait4 = new WebDriverWait(driver,25);
	wait4.until(ExpectedConditions.elementToBeSelected(element3));
	
	WebDriverWait wait5 = new WebDriverWait(driver,25);
	wait5.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));

	}
}
