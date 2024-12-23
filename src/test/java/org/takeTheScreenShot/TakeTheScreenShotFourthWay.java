package org.takeTheScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeTheScreenShotFourthWay {

	public static void main(String[] args) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		WebElement element = driver.findElement(By.xpath("//a[starts-with(@id,'nav-logo-sprites')]"));
		File source = element.getScreenshotAs(OutputType.FILE);
		File destination = new File(".\\Screenshot\\Amazon5.png");
		FileUtils.copyFile(source, destination);
}
}
