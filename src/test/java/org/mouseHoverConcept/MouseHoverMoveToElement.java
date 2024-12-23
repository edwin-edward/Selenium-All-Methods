package org.mouseHoverConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverMoveToElement {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://developers.facebook.com/?ref=pf");
		
		WebElement mouseHover = driver.findElement(By.xpath("//p[text()='Resources']"));
		Actions as = new Actions(driver);
		as.moveToElement(mouseHover).perform();
		
		WebElement devToolClick = driver.findElement(By.xpath("//span[text()='Developer tools']"));
		devToolClick.click();
		
}
}
