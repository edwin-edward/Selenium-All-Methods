package org.alertConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertss3 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		WebElement simpleAlert = driver.findElement(By.xpath("//button[starts-with(@id,'alertBox')]"));
		simpleAlert.click();
		driver.switchTo().alert().accept();
		
		WebElement confirmAlert = driver.findElement(By.xpath("//button[starts-with(@id,'confirmBox')]"));
		confirmAlert.click();
		driver.switchTo().alert().accept();
		
		WebElement promptAlert = driver.findElement(By.xpath("//button[starts-with(@id,'promptBox')]"));
		promptAlert.click();
		driver.switchTo().alert().sendKeys("Hi Kumara How are you?");
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
}
}
