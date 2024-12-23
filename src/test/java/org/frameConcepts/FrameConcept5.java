package org.frameConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept5 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		
		WebElement frame1 = driver.findElement(By.xpath("//frame[starts-with(@src,'frame_1.html')]"));
		driver.switchTo().frame(frame1);
		
		WebElement textBox1 = driver.findElement(By.xpath("//input[starts-with(@name,'mytext1')]"));
		textBox1.sendKeys("Java");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.xpath("//frame[starts-with(@src,'frame_2.html')]"));
		driver.switchTo().frame(frame2);
		
		WebElement textBox2 = driver.findElement(By.xpath("//input[starts-with(@name,'mytext2')]"));
		textBox2.sendKeys("Selenium");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[starts-with(@src,'frame_3.html')]"));
		driver.switchTo().frame(frame3);
		
		WebElement textBox3 = driver.findElement(By.xpath("//input[@name='mytext3']"));
		textBox3.sendKeys("Maven");
		Thread.sleep(2000);
		
		WebElement innerIFrame3 = driver.findElement(By.xpath("//iframe[starts-with(@src,'https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true')]"));
		driver.switchTo().frame(innerIFrame3);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,60)");
		
		WebElement radioButton1 = driver.findElement(By.xpath("(//div[starts-with(@class,'vd3tt')])[1]"));
		radioButton1.click();
		
		driver.switchTo().parentFrame();
		
		WebElement textBox33 = driver.findElement(By.xpath("//input[@name='mytext3']"));
		textBox33.sendKeys("Build");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		WebElement frame4 = driver.findElement(By.xpath("//frame[starts-with(@src,'frame_4.html')]"));
		driver.switchTo().frame(frame4);
		
		WebElement textBox4 = driver.findElement(By.xpath("//input[@name='mytext4']"));
		textBox4.sendKeys("TestNG");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		WebElement frame5 = driver.findElement(By.xpath("//frame[starts-with(@src,'frame_5.html')]"));
		driver.switchTo().frame(frame5);
		
		WebElement textBox5 = driver.findElement(By.xpath("//input[@name='mytext5']"));
		textBox5.sendKeys("Cucumber");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		WebElement frame44 = driver.findElement(By.xpath("//frame[starts-with(@src,'frame_4.html')]"));
		driver.switchTo().frame(frame44);
		
		WebElement textBox44 = driver.findElement(By.xpath("//input[@name='mytext4']"));
		textBox44.sendKeys("1");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		WebElement frame55 = driver.findElement(By.xpath("//frame[starts-with(@src,'frame_5.html')]"));
		driver.switchTo().frame(frame55);
		
		WebElement textBox55 = driver.findElement(By.xpath("//input[@name='mytext5']"));
		textBox55.sendKeys("Plugin");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		WebElement frame444 = driver.findElement(By.xpath("//frame[starts-with(@src,'frame_4.html')]"));
		driver.switchTo().frame(frame444);
		
		WebElement textBox444 = driver.findElement(By.xpath("//input[@name='mytext4']"));
		textBox444.sendKeys("2");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		WebElement frame33 = driver.findElement(By.xpath("//frame[starts-with(@src,'frame_3.html')]"));
		driver.switchTo().frame(frame33);
		
		WebElement textBox333 = driver.findElement(By.xpath("//input[@name='mytext3']"));
		textBox333.sendKeys("2");
		Thread.sleep(2000);
		
		WebElement innerIFrame33 = driver.findElement(By.xpath("//iframe[starts-with(@src,'https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true')]"));
		driver.switchTo().frame(innerIFrame33);
		
		js.executeScript("window.scrollBy(0,80)");
		
		WebElement radioButton2 = driver.findElement(By.xpath("(//div[starts-with(@class,'AB7Lab Id5V1')])[2]"));
		radioButton2.click();
		
		driver.switchTo().parentFrame();
		
		WebElement textBox3333 = driver.findElement(By.xpath("//input[@name='mytext3']"));
		textBox3333.sendKeys("3");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		WebElement frame22 = driver.findElement(By.xpath("//frame[starts-with(@src,'frame_2.html')]"));
		driver.switchTo().frame(frame22);
		
		WebElement textBox22 = driver.findElement(By.xpath("//input[starts-with(@name,'mytext2')]"));
		textBox22.sendKeys("Tool");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		WebElement frame11 = driver.findElement(By.xpath("//frame[starts-with(@src,'frame_1.html')]"));
		driver.switchTo().frame(frame11);
		
		WebElement textBox11 = driver.findElement(By.xpath("//input[starts-with(@name,'mytext1')]"));
		textBox11.sendKeys("Language");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.close();
}
}
