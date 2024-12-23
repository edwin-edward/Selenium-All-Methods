package org.webpageAllTextOfTheLinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToGetWebpageAllTextOfTheLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		List<WebElement> aTag = driver.findElements(By.tagName("a"));
		System.out.println(aTag.size());
		
		for(WebElement aTags : aTag) {
			System.out.println(aTags.getText()+"<------->"+aTags.getAttribute("href"));
		}
}
}
