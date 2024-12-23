package org.webDriverMethods;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		String pageCurrentUrl = driver.getCurrentUrl();
		System.out.println(pageCurrentUrl);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		String window = driver.getWindowHandle();
		System.out.println(window);
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		
		WebElement element = driver.findElement(By.xpath(""));
		
		List<WebElement> elements = driver.findElements(By.xpath(""));
		
		TargetLocator switchTo = driver.switchTo();
		
		Options manage = driver.manage();
		
		Navigation navigate = driver.navigate();
		
		driver.close();
		
		driver.quit();
		
	}
}
