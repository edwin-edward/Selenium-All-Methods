package org.radioButtonHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RadioButtonHandling2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/r.php");
		
		WebElement radioButtonClick = driver.findElement(By.xpath("(//input[starts-with(@id,'sex')])[2]"));
		
		boolean isDisplay = radioButtonClick.isDisplayed();
		Assert.assertTrue(isDisplay);
		System.out.println(isDisplay);
		
		boolean isEnable = radioButtonClick.isEnabled();
		Assert.assertTrue(isEnable);
		System.out.println(isEnable);
		
		boolean isSelect = radioButtonClick.isSelected();
		Assert.assertFalse(isSelect);
		System.out.println(isSelect);
		radioButtonClick.click();
		
		boolean isSelect2 = radioButtonClick.isSelected();
		Assert.assertTrue(isSelect2);
		System.out.println(isSelect2);
}
}
