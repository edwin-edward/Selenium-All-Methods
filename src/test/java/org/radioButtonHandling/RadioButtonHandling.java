package org.radioButtonHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/r.php");
		
		WebElement radioButtonClick = driver.findElement(By.xpath("(//input[starts-with(@id,'sex')])[2]"));
		
		if(radioButtonClick.isDisplayed()) {
			System.out.println(radioButtonClick.isDisplayed());
			if(radioButtonClick.isEnabled()) {
				System.out.println(radioButtonClick.isEnabled());
				if(!radioButtonClick.isSelected()) {
					System.out.println(radioButtonClick.isSelected());
					radioButtonClick.click();
					if(radioButtonClick.isSelected()) {
						System.out.println(radioButtonClick.isSelected());
					}else {
						System.out.println("Not Selected");
					}
				}else {
					System.out.println("Yes Selected");
				}
			}else {
				System.out.println("Not Enabled");
			}
		}else {
			System.out.println("Not Displayed");
		}
		
		
		
	}
}
