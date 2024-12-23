package org.oneWebPageAllTagsCount;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneWebPageAllTagsCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		List<WebElement> aTag = driver.findElements(By.tagName("a"));
		List<WebElement> htmlTag = driver.findElements(By.tagName("html"));
		List<WebElement> bodyTag = driver.findElements(By.tagName("body"));
		List<WebElement> ulTag = driver.findElements(By.tagName("ul"));
		List<WebElement> liTag = driver.findElements(By.tagName("li"));
		List<WebElement> divTag = driver.findElements(By.tagName("div"));
		List<WebElement> optionTag = driver.findElements(By.tagName("option"));
		List<WebElement> buttonTag = driver.findElements(By.tagName("button"));
		List<WebElement> inputTag = driver.findElements(By.tagName("input"));
		List<WebElement> selectTag = driver.findElements(By.tagName("select"));
		List<WebElement> frameTag = driver.findElements(By.tagName("iframe"));
		List<WebElement> tableTag = driver.findElements(By.tagName("table"));
		List<WebElement> spanTag = driver.findElements(By.tagName("span"));
		List<WebElement> imgTag = driver.findElements(By.tagName("img"));
		
		System.out.println(aTag.size());
		System.out.println(htmlTag.size());
		System.out.println(bodyTag.size());
		System.out.println(ulTag.size());
		System.out.println(divTag.size());
		System.out.println(optionTag.size());
		System.out.println(buttonTag.size());
		System.out.println(inputTag.size());
		System.out.println(selectTag.size());
		System.out.println(liTag.size());
		System.out.println(frameTag.size());
		System.out.println(tableTag.size());
		System.out.println(spanTag.size());
		System.out.println(imgTag.size());
	}
}
