package org.mouseHoverConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverMoveToElement3 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://econsultancy.com/10-useful-examples-of-mouseover-effects-for-ecommerce-sites/");
		
		WebElement mouseHover = driver.findElement(By.xpath("//span[text()='Why Econsultancy']"));
		Actions as = new Actions(driver);
		as.moveToElement(mouseHover).perform();
		
		WebElement profileClick = driver.findElement(By.xpath("(//span[text()='Team Engagement'])[2]"));
		profileClick.click();
		
		Thread.sleep(4000);
		driver.close();
		
}
}
