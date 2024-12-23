package org.frameConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept4 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/frames");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		WebElement singleFrame1 = driver.findElement(By.xpath("//iframe[starts-with(@id,'frame1')]"));
		driver.switchTo().frame(singleFrame1);
		
		WebElement text = driver.findElement(By.xpath("(//h1[contains(text(),'Th')])[1]"));
		System.out.println(text.getText());
		
		driver.switchTo().defaultContent();
		
		WebElement singleFrame2 = driver.findElement(By.xpath("//iframe[starts-with(@id,'frame2')]"));
		driver.switchTo().frame(singleFrame2);
		
		WebElement text2 = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
		System.out.println(text2.getText());
		
		driver.switchTo().defaultContent();
		
		
		WebElement widgetsClick = driver.findElement(By.xpath("(//div[starts-with(@class,'header-text')])[4]"));
		widgetsClick.click();
		Thread.sleep(2000);
		driver.close();
}
}
