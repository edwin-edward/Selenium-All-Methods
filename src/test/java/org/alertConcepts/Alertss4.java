package org.alertConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertss4 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement simpleAlert = driver.findElement(By.xpath("//button[starts-with(@id,'alertButton')]"));
		simpleAlert.click();
		driver.switchTo().alert().accept();
		
		WebElement simpleAlert2 = driver.findElement(By.xpath("//button[starts-with(@id,'timerAlertButton')]"));
		simpleAlert2.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		
		WebElement confirmAlert = driver.findElement(By.xpath("//button[starts-with(@id,'confirmButton')]"));
		confirmAlert.click();
		driver.switchTo().alert().accept();
		
		WebElement promptAlert = driver.findElement(By.xpath("//button[starts-with(@id,'promtButton')]"));
		promptAlert.click();
		driver.switchTo().alert().sendKeys("Hi Kumara! How are you?");
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		
}
}
