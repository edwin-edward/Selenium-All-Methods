package org.frameConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept2 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[starts-with(@src,'default.asp')]"));
		driver.switchTo().frame(frame1);
		
		WebElement tutorialDropdown = driver.findElement(By.xpath("//nav[starts-with(@class,'tnb-desktop-nav w3-bar-item')]//a[@id='navbtn_tutorials']"));
		tutorialDropdown.click();
		
		driver.switchTo().defaultContent();
		
		WebElement sqlClick = driver.findElement(By.xpath("(//a[text()='SQL'])[1]"));
		sqlClick.click();
		
		Thread.sleep(2000);
		driver.close();
}
}