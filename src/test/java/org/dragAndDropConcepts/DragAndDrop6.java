package org.dragAndDropConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop6 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		
		WebElement frame = driver.findElement(By.xpath("//iframe[starts-with(@class,'demo-frame')]"));
		driver.switchTo().frame(frame);
		
		WebElement drag = driver.findElement(By.xpath("//div[starts-with(@id,'draggable')]"));
		WebElement drop = driver.findElement(By.xpath("//div[starts-with(@id,'droppable')]"));
		Actions as = new Actions(driver);
		as.dragAndDrop(drag,drop).perform();
		
		Thread.sleep(4000);
		driver.close();
}
}
