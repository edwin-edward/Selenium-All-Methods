package org.waitConcepts;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		
		WebElement element = driver.findElement(By.xpath(""));
		
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(25,TimeUnit.SECONDS);
		wait.pollingEvery(5,TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		
	}
}
