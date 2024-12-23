package org.sliderConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.tutorialspoint.com/selenium/practice/slider.php");


		WebElement slider1 = driver.findElement(By.xpath("//input[starts-with(@id,'ageInputId')]"));
		Actions as = new Actions(driver);
		as.dragAndDropBy(slider1, 30, 0).perform();
		Thread.sleep(2000);
		
		for(int i=1; i<=15; i++) {
			slider1.sendKeys(Keys.ARROW_LEFT);
		}
}
}
