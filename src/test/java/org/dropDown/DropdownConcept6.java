package org.dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownConcept6 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://formy-project.herokuapp.com/dropdown");

		
		WebElement dropDown1 = driver.findElement(By.xpath("//button[starts-with(@id,'dropdownMenuButton')]"));
		dropDown1.click();
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//div[starts-with(@class,'dropdown-menu show')]//a"));
		for(WebElement all : allOptions) {
			System.out.println(all.getText());
		}
		
		for(WebElement all : allOptions) {
			if(all.getText().equals("Key and Mouse Press")) {
				all.click();
				break;
			}
		}
}
}
