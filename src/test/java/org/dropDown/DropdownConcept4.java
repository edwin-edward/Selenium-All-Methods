package org.dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownConcept4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://semantic-ui.com/modules/dropdown.html#/definition");

		WebElement dropDown1 = driver.findElement(By.xpath("//span[text()='3 Themes']"));
		dropDown1.click();

		List<WebElement> allOptions = driver
				.findElements(By.xpath("//div[starts-with(@class,'menu transition visible')]//div"));
		for (WebElement all : allOptions) {
			if (all.getText().equals("GitHub")) {
				all.click();
				break;
			}
		}
		Thread.sleep(2000);
		
		WebElement attValue = driver.findElement(By.xpath("//div[starts-with(@data-value,'Default')]"));
		System.out.println(attValue.getAttribute("data-value"));

		List<WebElement> allOptions1 =driver.findElements(By.xpath("//div[starts-with(@class,'menu transition visible')]//div"));
		
		for (WebElement all : allOptions1) {
			System.out.println(all.getAttribute("data-value"));
		}
		
		

		WebElement dropDown2 = driver.findElement(By.xpath("(//div[starts-with(@class,'ui selection dropdown')])[1]"));
		dropDown2.click();

		List<WebElement> allOptions6 = driver
				.findElements(By.xpath("//div[starts-with(@class,'menu transition visible')]//div"));
		for (WebElement all : allOptions1) {
			if (all.getText().equals("Male")) {
				all.click();
				break;
			}
		}
		Thread.sleep(2000);
		for (WebElement all : allOptions1) {
			System.out.println(all.getText());
		}
		Thread.sleep(2000);
		

		WebElement dropDown3 = driver.findElement(By.xpath("(//input[starts-with(@class,'search')])[2]"));
		dropDown3.click();
		
		List<WebElement> allOptions2 = driver
				.findElements(By.xpath("//div[starts-with(@class,'menu transition visible')]//div"));
		for (WebElement all : allOptions2) {
			if (all.getText().equals("California")) {
				all.click();
				break;
			}
		}
		Thread.sleep(2000);
		for (WebElement all : allOptions2) {
			System.out.println(all.getText());
		}
		Thread.sleep(2000);
		

		WebElement dropDown5 = driver.findElement(By.xpath("//div[starts-with(@class,'ui fluid dropdown selection multiple')]"));
		dropDown5.click();
		
		List<WebElement> allOptions4 = driver
				.findElements(By.xpath("//div[starts-with(@class,'menu transition visible')]//div"));
		for (WebElement all : allOptions4) {
			if (all.getText().equals("HTML")) {
				all.click();
				break;
			}
		}
		for (WebElement all : allOptions4) {
			System.out.println(all.getText());
		}
		Thread.sleep(2000);
		System.out.println();

		
		WebElement dropDown4 = driver.findElement(By.xpath("//div[starts-with(@class,'ui fluid search dropdown selection multiple')]"));
		dropDown4.click();
		
		List<WebElement> allOptions3 = driver
				.findElements(By.xpath("//div[starts-with(@class,'menu transition visible')]//div"));
		for (WebElement all : allOptions3) {
			if (all.getText().equals("New York")) {
				all.click();
				break;
			}
		}
		Thread.sleep(2000);
		for (WebElement all : allOptions3) {
			System.out.println(all.getText());
		}
		Thread.sleep(2000);
		
	}
}
