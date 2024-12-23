package org.dragAndDropConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://practice.expandtesting.com/drag-and-drop#google_vignette");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		
		WebElement drag = driver.findElement(By.xpath("//div[starts-with(@id,'column-a')]"));
		WebElement drop = driver.findElement(By.xpath("//div[starts-with(@id,'column-b')]"));
		Actions as = new Actions(driver);
		as.dragAndDrop(drag, drop).perform();
}
}
