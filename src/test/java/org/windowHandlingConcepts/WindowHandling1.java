package org.windowHandlingConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling1 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		WebElement click = driver.findElement(By.xpath("//button[contains(text(),' click')]"));
		click.click();
		
		Set<String> allWindows = driver.getWindowHandles();
		List list = new ArrayList(allWindows);
		driver.switchTo().window((String) list.get(1));
		
		WebElement learnClick = driver.findElement(By.xpath("//a[contains(text(),'Learn more & submit!')]"));
		learnClick.click();
		
		Set<String> allWindows2 = driver.getWindowHandles();
		List list2 = new ArrayList(allWindows2);
		driver.switchTo().window((String) list2.get(2));
		
		WebElement menuClick = driver.findElement(By.xpath("//span[text()='Menu']"));
		menuClick.click();
		
		WebElement workshopsClick = driver.findElement(By.xpath("//span[contains(text(),'Workshops')]"));
		workshopsClick.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		WebElement learnAboutClick = driver.findElement(By.xpath("//a[text()='Learn about Selenium']"));
		learnAboutClick.click();
		
		Set<String> allWindows3 = driver.getWindowHandles();
		List list3 = new ArrayList(allWindows3);
		driver.switchTo().window((String) list3.get(3));
		
		WebElement learnClick2 = driver.findElement(By.xpath("//a[contains(text(),'Learn more & submit!')]"));
		learnClick2.click();
		
		Set<String> allWindows4 = driver.getWindowHandles();
		List list4 = new ArrayList(allWindows4);
		driver.switchTo().window((String) list4.get(4));
		
		WebElement menuClick2 = driver.findElement(By.xpath("//span[text()='Menu']"));
		menuClick2.click();
		
		WebElement workshopsClick2 = driver.findElement(By.xpath("//span[contains(text(),'Workshops')]"));
		workshopsClick2.click();
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		WebElement learnAboutClick2 = driver.findElement(By.xpath("//a[text()='Learn about Selenium']"));
		learnAboutClick2.click();
		
		Set<String> allWindows5 = driver.getWindowHandles();
		List list5 = new ArrayList(allWindows5);
		driver.switchTo().window((String) list5.get(5));
		
		WebElement learnClick3 = driver.findElement(By.xpath("//a[contains(text(),'Learn more & submit!')]"));
		learnClick3.click();
		
		Set<String> allWindows6 = driver.getWindowHandles();
		List list6 = new ArrayList(allWindows6);
		driver.switchTo().window((String) list6.get(6));
		
		driver.close();
		driver.switchTo().window((String)list6.get(5));
		driver.close();
		driver.switchTo().window((String)list6.get(4));
		driver.close();
		driver.switchTo().window((String)list6.get(3));
		driver.close();
		driver.switchTo().window((String)list6.get(2));
		driver.close();
		driver.switchTo().window((String)list6.get(1));
		driver.close();
		driver.switchTo().window((String)list6.get(0));
		driver.close();
	}
}
