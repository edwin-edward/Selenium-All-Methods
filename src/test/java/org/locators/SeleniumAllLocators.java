package org.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAllLocators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");

		WebElement id = driver.findElement(By.id("twotabsearchtextbox"));
		id.sendKeys("Books");

		Thread.sleep(2000);
		WebElement id2 = driver.findElement(By.id("twotabsearchtextbox"));
		id2.clear();

		WebElement name = driver.findElement(By.name("field-keywords"));
		name.sendKeys("Mobiles");
		Thread.sleep(2000);
		WebElement name2 = driver.findElement(By.name("field-keywords"));
		name2.clear();

//		WebElement className = driver.findElement(By.className("nav-input nav-progressive-attribute"));
//		className.sendKeys("headphones");

		WebElement tagName = driver.findElement(By.tagName("a"));
		System.out.println(tagName);

		WebElement cssSelector = driver.findElement(By.cssSelector("a#nav-logo-sprites"));
		cssSelector.click();

		Thread.sleep(2000);
		WebElement xPath = driver.findElement(By.xpath("//div[starts-with(@id,'nav-search-dropdown-card')]"));
		xPath.click();
		Thread.sleep(2000);
		xPath.click();
		
		Thread.sleep(4000);
		WebElement linkText = driver.findElement(By.linkText("Electronics"));
		linkText.click();
		Thread.sleep(4000);
		WebElement partialLinkText = driver.findElement(By.partialLinkText("Home &"));
		partialLinkText.click();
		
	}
}
