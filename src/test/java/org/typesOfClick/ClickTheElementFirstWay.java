package org.typesOfClick;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickTheElementFirstWay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		WebElement sendKey = driver.findElement(By.xpath("//input[starts-with(@id,'twotabsearchtextbox')]"));
		sendKey.sendKeys("Books");
		
		WebElement click = driver.findElement(By.xpath("//input[starts-with(@id,'nav-search-submit-button')]"));
		click.click();
		
	}
}
