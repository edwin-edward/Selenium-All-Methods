package org.dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownConcept3 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");

		
		WebElement dropDown1 = driver.findElement(By.xpath("//button[starts-with(@id,'menu1')]"));
		dropDown1.click();
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[starts-with(@class,'dropdown-menu')]//li"));
		for(WebElement all : allOptions) {
			if(all.getText().equals("CSS")) {
				all.click();
				break;
			}
		}
		WebElement allOptions1 = driver.findElement(By.xpath("//a[text()='HTML']"));
		System.out.println(allOptions1.getText());
		
		List<WebElement> aTags = driver.findElements(By.tagName("a"));
		System.out.println(aTags.size());
		for(WebElement aTag : aTags) {
			System.out.println(aTag.getText()+"<---------->"+aTag.getAttribute("href"));
		}
}
}
