package org.webElementsMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");

		WebElement sendKey = driver.findElement(By.xpath("//input[starts-with(@id,'twotabsearchtextbox')]"));
		sendKey.sendKeys("Books");
		WebElement click = driver.findElement(By.xpath("//input[starts-with(@id,'nav-search-submit-button')]"));
		click.click();
		Thread.sleep(4000);
		WebElement clear = driver.findElement(By.xpath("//input[starts-with(@id,'twotabsearchtextbox')]"));
		clear.clear();
		WebElement getTheText = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		System.out.println(getTheText.getText());
		
		System.out.println(getTheText.getAttribute("href"));
		
		
		WebElement isDisplay = driver.findElement(By.xpath("//a[starts-with(@id,'nav-logo-sprites')]"));
		System.out.println(isDisplay.isDisplayed());
		
		WebElement isEnable = driver.findElement(By.xpath("//a[starts-with(@id,'nav-logo-sprites')]"));
		System.out.println(isEnable.isEnabled());
		
		WebElement isSelect = driver.findElement(By.xpath("//a[starts-with(@id,'nav-logo-sprites')]"));
		System.out.println(isSelect.isSelected());
		
		
		
	}
}
