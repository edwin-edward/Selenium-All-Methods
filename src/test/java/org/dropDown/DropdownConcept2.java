package org.dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownConcept2 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://formstone.it/components/dropdown/demo/");

		
		WebElement dropDown1 = driver.findElement(By.xpath("(//select[starts-with(@id,'demo_basic')])[1]"));
		Select s = new Select(dropDown1);
		s.selectByVisibleText("Two");
		Thread.sleep(2000);
		
		List<WebElement> allOptions1 = s.getOptions();
		for (WebElement all : allOptions1) {
			System.out.println(all.getText());
		}
		System.out.println();

		List<WebElement> allOptions2 = driver
				.findElements(By.xpath("//select[starts-with(@id,'demo_groups')]//optgroup//option"));
		for (WebElement all : allOptions2) {
			if (all.getText().equals("Six")) {
				all.click();
				break;
			}
		}
		Thread.sleep(2000);
		
		for (WebElement all : allOptions2) {
			System.out.println(all.getText());
		}
		System.out.println();

		WebElement dropDown2 = driver.findElement(By.xpath("//select[starts-with(@id,'demo_label')]"));
		Select s2 = new Select(dropDown2);
		s2.selectByVisibleText("Hawaii");
		Thread.sleep(2000);
		
		List<WebElement> allOptions3 = driver
				.findElements(By.xpath("//select[starts-with(@id,'demo_label')]//option"));
		
		for(WebElement all :allOptions3) {
			System.out.println(all.getText());
		}
		System.out.println();
		
		List<WebElement> allOptions4 = driver.findElements(By.xpath("//select[starts-with(@id,'demo_custom_1')]//option"));
		for(WebElement all : allOptions4) {
			if(all.getText().equals("Option Four")) {
				all.click();
				break;
			}
		}
		Thread.sleep(2000); 
		
		for(WebElement all : allOptions4) {
			System.out.println(all.getText());
		}
		System.out.println();
		
		List<WebElement> allOptions5 = driver.findElements(By.xpath("//select[starts-with(@id,'demo_links')]//option"));
		for(WebElement all : allOptions5) {
			if(all.getText().equals("Boing  Boing")) {
				all.click();
				break;
			}
		}
		Thread.sleep(2000); 
		
		for(WebElement all : allOptions5){
			System.out.println(all.getText());
		}
		System.out.println();
		
		List<WebElement> allOptions6 = driver.findElements(By.xpath("//select[starts-with(@id,'demo_basic_2')]//option"));
		for(WebElement all : allOptions6) {
			if(all.getText().equals("Oregon")) {
				all.click();
				break;
			}
		}
		for(WebElement all : allOptions6){
			System.out.println(all.getText());
		}
		
	}
}
