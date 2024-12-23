package org.sliderConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Slider.html");


		WebElement slider1 = driver.findElement(By.xpath("//a[starts-with(@class,'ui-slider-handle ui-state-default ui-corner-all')]"));
		Actions as = new Actions(driver);
		as.dragAndDropBy(slider1, 200, 0).perform();
		Thread.sleep(2000);
		
		for(int i=20; i<=45; i++) {
			slider1.sendKeys(Keys.ARROW_LEFT);
		}
}
}
