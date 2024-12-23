package org.dragAndDropConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/droppable/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		WebElement drag = driver.findElement(By.xpath("//div[starts-with(@id,'draggable')]"));
		WebElement drop = driver.findElement(By.xpath("(//div[starts-with(@id,'droppable')])[3]"));
		Actions as = new Actions(driver);
		as.dragAndDrop(drag, drop).perform();
		
		WebElement acceptClick = driver.findElement(By.xpath("//a[starts-with(@id,'droppableExample-tab-accept')]"));
		acceptClick.click();
		
		WebElement drag2 = driver.findElement(By.xpath("//div[starts-with(@id,'acceptable')]"));
		WebElement drop2 = driver.findElement(By.xpath("(//div[starts-with(@id,'droppable')])[5]"));
		as.dragAndDrop(drag2, drop2).perform();
		
		WebElement drag3 = driver.findElement(By.xpath("(//div[starts-with(@id,'notAcceptable')])"));
		WebElement drop3 = driver.findElement(By.xpath("(//div[starts-with(@id,'droppable')])[5]"));
		as.dragAndDrop(drag3, drop3).perform();

		WebElement propogationClick = driver.findElement(By.xpath("//a[starts-with(@id,'droppableExample-tab-preventPropogation')]"));
		propogationClick.click();
		
		WebElement drag4 = driver.findElement(By.xpath("//div[starts-with(@id,'dragBox')]"));
		WebElement drop4 = driver.findElement(By.xpath("//div[starts-with(@id,'notGreedyInnerDropBox')]"));
		as.dragAndDrop(drag4, drop4).perform();
		
		WebElement revertClick = driver.findElement(By.xpath("//a[starts-with(@id,'droppableExample-tab-revertable')]"));
		revertClick.click();
		
		WebElement drag5 = driver.findElement(By.xpath("(//div[starts-with(@id,'revertable')])[2]"));
		WebElement drop5 = driver.findElement(By.xpath("(//div[starts-with(@id,'droppable')])[8]"));
		as.dragAndDrop(drag5, drop5).perform();
		
		WebElement drag6 = driver.findElement(By.xpath("(//div[starts-with(@id,'notRevertable')])"));
		WebElement drop6 = driver.findElement(By.xpath("(//div[starts-with(@id,'droppable')])[8]"));
		as.dragAndDrop(drag6, drop6).perform();
}
}
