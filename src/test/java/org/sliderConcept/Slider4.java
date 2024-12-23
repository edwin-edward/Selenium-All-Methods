package org.sliderConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slider4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://practice.expandtesting.com/horizontal-slider#google_vignette");


		WebElement slider1 = driver.findElement(By.xpath("//div[starts-with(@class,'sliderContainer')]//input"));
		
		for(int i=1; i<=3; i++) {
			slider1.sendKeys(Keys.ARROW_RIGHT);
		}
}
}
