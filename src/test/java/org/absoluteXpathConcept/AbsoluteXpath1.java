package org.absoluteXpathConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://books.vikatan.com/");
		
		WebElement sattam = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div/div/div/div/div/div/div[21]/div/a"));
		sattam.click();
		
		WebElement categories = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div[2]/div/div/div[3]/div[2]/div/p[text()='Categories']"));
		categories.click();
		
		WebElement illaramClick = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div[2]/div/div/div[3]/div[3]/div/input[@id='category-0']"));
		illaramClick.click();
		
		WebElement sattamUnClick = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div[2]/div/div/div[3]/div[3]/div[2]/input[@id=\"category-1\"]"));
		sattamUnClick.click();
	}
}
