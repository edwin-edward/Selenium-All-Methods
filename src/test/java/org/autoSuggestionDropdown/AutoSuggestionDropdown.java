package org.autoSuggestionDropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

		WebElement element = driver.findElement(By.xpath("//textarea[starts-with(@name,'q')]"));
		element.sendKeys("java");
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[starts-with(@class,'G43f7e')]//li"));
		for(WebElement all : allOptions) {
			System.out.println(all.getText());
		}
		for(WebElement all : allOptions) {
			if(all.getText().equalsIgnoreCase("java interview questions")) {
				all.click();
				break;
			}
		}
	}
}
