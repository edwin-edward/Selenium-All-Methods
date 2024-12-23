package org.dragAndDropConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop4 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draggableboxes/#Simple%20Drag");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		
		WebElement frame = driver.findElement(By.xpath("(//iframe[starts-with(@class,'demo-frame lazyloaded')])[1]"));
		driver.switchTo().frame(frame);
		
		WebElement drag = driver.findElement(By.xpath("(//div[starts-with(@id,'draggable')])[1]"));
		Actions as = new Actions(driver);
		as.dragAndDropBy(drag,100,40).perform();
		
		Thread.sleep(3000);
		driver.close();
}
}
