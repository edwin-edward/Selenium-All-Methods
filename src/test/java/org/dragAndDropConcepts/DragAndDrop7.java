package org.dragAndDropConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop7 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://h5p.org/drag-and-drop#example=68888");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[starts-with(@id,'h5p-iframe-69782')]"));
		driver.switchTo().frame(frame);
		
		WebElement drag = driver.findElement(By.xpath("//div[@class='h5p-content h5p-initialized h5p-frame using-mouse']//div//div[2]//div//div[17]"));
		WebElement drop = driver.findElement(By.xpath("//div[@class='h5p-content h5p-initialized h5p-frame using-mouse']//div//div[2]//div//div[50]"));
		Actions as = new Actions(driver);
		as.dragAndDrop(drag,drop).perform();
		
		Thread.sleep(4000);
		driver.close();
}
}
