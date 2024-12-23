package org.dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownConcept1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement selectSingleDropdowm1 = driver.findElement(By.xpath("//select[starts-with(@id,'oldSelectMenu')]"));
		Select s = new Select(selectSingleDropdowm1);
		s.selectByValue("4");
		
		List<WebElement> selectSingleDropdowm2 = s.getOptions();
		for(WebElement all : selectSingleDropdowm2) {
			if(all.getText().equals("Indigo")) {
				all.click();
				break;
			}
		}
		
		List<WebElement> allOptions1 = s.getOptions();
		for(WebElement all : allOptions1) {
			System.out.println(all.getText());
		}
		
		List<WebElement> allOptions2 = driver.findElements(By.xpath("//select[starts-with(@id,'oldSelectMenu')]//option"));
		for(WebElement all : allOptions2) {
			System.out.println(all.getText());
		}
		
		WebElement selectMultipleDropdowm1 = driver.findElement(By.xpath("//select[starts-with(@id,'cars')]"));
		Select s1 = new Select(selectMultipleDropdowm1);
		s1.selectByValue("audi");
		
		List<WebElement> allOptions3 = s1.getOptions();
		for(WebElement all : allOptions3) {
			if(all.getText().equals("Saab")) {
				all.click();
				break;
			}
		}
		
		List<WebElement> allOptions4 = s1.getOptions();
		for(WebElement all : allOptions4) {
			System.out.println(all.getText());
		}
		
		List<WebElement> allOptions5 = driver.findElements(By.xpath("//select[starts-with(@id,'cars')]//option"));
		for(WebElement all : allOptions5) {
			System.out.println(all.getText());
		}
		
	}
}
