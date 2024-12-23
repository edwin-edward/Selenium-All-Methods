package org.frameConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept1 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://practice-automation.com/iframes/");
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[starts-with(@id,'iframe-1')]"));
		driver.switchTo().frame(frame1);
		
		WebElement dropdown = driver.findElement(By.xpath("//div[starts-with(@class,'navbar__item dropdown dropdown--hoverable')]//a[@class='navbar__link']"));
		dropdown.click();
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[starts-with(@class,'dropdown__menu')]//li"));
		for(WebElement all : allOptions) {
			System.out.println(all.getText());
		}
		for(WebElement all : allOptions) {
			if(all.getText().equals("Python")) {
				all.click();
				break;
			}
		}
		driver.switchTo().defaultContent();
		
		
		WebElement meTo = driver.findElement(By.xpath("//p[text()='Me too!']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",meTo);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,50)");
		Thread.sleep(2000);
		WebElement frame2 = driver.findElement(By.xpath("//iframe[starts-with(@id,'iframe-2')]"));
		driver.switchTo().frame(frame2);
		
		WebElement dropdown2 = driver.findElement(By.xpath("//a[starts-with(@id,'navbarDropdown')]"));
		dropdown2.click();
		List<WebElement> allOptions1 = driver.findElements(By.xpath("//div[starts-with(@class,'dropdown-menu show')]//a"));
		for(WebElement all : allOptions1) {
			System.out.println(all.getText());
		}
		for(WebElement all : allOptions1) {
			if(all.getText().equals("Events")) {
				all.click();
				break;
			}
		}
		driver.switchTo().defaultContent();
		
		Thread.sleep(4000);
		driver.close();
	}
}
