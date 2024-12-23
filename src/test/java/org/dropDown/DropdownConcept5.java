package org.dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownConcept5 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/wholesale");

		
		WebElement dropDown1 = driver.findElement(By.xpath("//a[text()='Select Product Type']"));
		dropDown1.click();
		
		List<WebElement> allOptions1 = driver.findElements(By.xpath("//ul[starts-with(@class,'dropdown1 dropdown-menu')]//li"));
		
		for(WebElement all : allOptions1) {
			System.out.println(all.getText());
		}
		
		for(WebElement all : allOptions1) {
			if(all.getText().equals("Cards")) {
				all.click();
				break;
			}
		}
		
		
		WebElement dropDown2 = driver.findElement(By.xpath("//a[text()='Select Product']"));
		dropDown2.click();
		
		List<WebElement> allOptions2 = driver.findElements(By.xpath("//ul[starts-with(@class,'dropdown2 dropdown-menu')]//li"));
		
		for(WebElement all : allOptions2) {
			System.out.println(all.getText());
		}
		
		for(WebElement all : allOptions2) {
			if(all.getText().equals("Commercial Credit Cards")) {
				all.click();
				break;
			}
		}
		
		
		
}
}
