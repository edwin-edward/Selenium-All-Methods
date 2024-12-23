package org.actionsConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAndContextClick {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement contextClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions as = new Actions(driver);
		as.contextClick(contextClick).perform();
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[starts-with(@class,'context-menu-list context-menu-root')]//li"));
		for(WebElement all : allOptions) {
			System.out.println(all.getText());
		}
		
		for(WebElement all : allOptions) {
			if(all.getText().equals("Cut")) {
				all.click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		as.contextClick(doubleClick).perform();
	}
}
