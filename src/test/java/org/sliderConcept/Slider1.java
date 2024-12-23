package org.sliderConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/sliders/#Color%20Picker");

		WebElement frame1 = driver.findElement(By.xpath("//iframe[starts-with(@class,'demo-frame lazyloaded')]"));
		driver.switchTo().frame(frame1);

		WebElement slider1 = driver.findElement(
				By.xpath("(//span[starts-with(@class,'ui-slider-handle ui-corner-all ui-state-default')])[1]"));
		Actions as = new Actions(driver);
		as.dragAndDropBy(slider1, -20, 0).perform();
		Thread.sleep(2000);

		WebElement slider2 = driver.findElement(
				By.xpath("(//span[starts-with(@class,'ui-slider-handle ui-corner-all ui-state-default')])[2]"));
		as.dragAndDropBy(slider2, -10, 0).perform();
		Thread.sleep(2000);

		WebElement slider3 = driver.findElement(
				By.xpath("(//span[starts-with(@class,'ui-slider-handle ui-corner-all ui-state-default')])[3]"));
		as.dragAndDropBy(slider3, 20, 0).perform();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();

		WebElement rangeClick = driver.findElement(By.xpath("//li[starts-with(@id,'Range')]"));
		rangeClick.click();

		WebElement frame2 = driver.findElement(By.xpath("(//iframe[starts-with(@class,'demo-frame lazyloaded')])[2]"));
		driver.switchTo().frame(frame2);

		WebElement slider4 = driver.findElement(
				By.xpath("/html/body/div/span[1]"));
		as.dragAndDropBy(slider4, 30, 0).perform();
		Thread.sleep(2000);
//		for(int i=1; i<=10; i++) {
//			slider4.sendKeys(Keys.ARROW_RIGHT);
//		}

		WebElement slider5 = driver.findElement(
				By.xpath("/html/body/div/span[2]"));
		as.dragAndDropBy(slider5, 30, 0).perform();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();

		WebElement stepsClick = driver.findElement(By.xpath("//li[text()='Steps']"));
		stepsClick.click();

		WebElement frame3 = driver.findElement(By.xpath("(//iframe[starts-with(@class,'demo-frame lazyloaded')])[3]"));
		driver.switchTo().frame(frame3);

		WebElement slider6 = driver.findElement(
				By.xpath("//span[starts-with(@class,'ui-slider-handle ui-corner-all ui-state-default')]"));
		as.dragAndDropBy(slider6, 30, 0).perform();
		Thread.sleep(2000);
		
		driver.close();
	}
}
