package org.frameConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept3 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		WebElement singleFrame1 = driver.findElement(By.xpath("//iframe[starts-with(@id,'singleframe')]"));
		driver.switchTo().frame(singleFrame1);
		
		WebElement textBox = driver.findElement(By.xpath("//input[starts-with(@type,'text')]"));
		textBox.sendKeys("Kumaran");
		Thread.sleep(4000);
		
		driver.switchTo().defaultContent();
		
		WebElement iFrameClick = driver.findElement(By.xpath("//a[contains(text(),'Iframe w')]"));
		iFrameClick.click();
		
		WebElement multipleFrame1 = driver.findElement(By.xpath("//iframe[starts-with(@src,'MultipleFrames.html')]"));
		driver.switchTo().frame(multipleFrame1);
		
		WebElement multipleFrame2 = driver.findElement(By.xpath("//iframe[starts-with(@src,'SingleFrame.html')]"));
		driver.switchTo().frame(multipleFrame2);
		
		WebElement textBox2 = driver.findElement(By.xpath("//input[@type='text']"));
		textBox2.sendKeys("Karuppannan");
		Thread.sleep(4000);
		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		WebElement singleFrameClick = driver.findElement(By.xpath("//a[contains(text(),'Single Iframe ')]"));
		singleFrameClick.click();
}
}
