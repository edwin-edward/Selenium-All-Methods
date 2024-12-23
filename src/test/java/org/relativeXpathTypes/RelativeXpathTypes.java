package org.relativeXpathTypes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathTypes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("");
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='first-name']"));
		firstName.sendKeys("Kumaran");
		
		WebElement lastName = driver.findElement(By.xpath("//input[starts-with(@id,'last-name')]"));
		lastName.sendKeys("Karuppannan");
		
		WebElement jobTitle = driver.findElement(By.xpath("//input[contains(@id,'job-title')]"));
		jobTitle.sendKeys("Software Test Engineer");
		
		WebElement firstNameGetText = driver.findElement(By.xpath("//label[text()='First name']"));
		System.out.println(firstNameGetText.getText());
		
		WebElement getText2 = driver.findElement(By.xpath("//label[contains(text(),'Highest level of educ')]"));
		System.out.println(getText2.getText());
		
		WebElement schoolClick = driver.findElement(By.xpath("//div[starts-with(@class,'col-sm-8 col-sm-offset-2')]//input[starts-with(@id,'radio-button-1')]"));
		schoolClick.click();
		
		
	}
}
