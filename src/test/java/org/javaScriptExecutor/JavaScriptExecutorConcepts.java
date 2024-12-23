package org.javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcepts {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://books.vikatan.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		WebElement nammalvaar = driver.findElement(By.xpath("//div[starts-with(@class,'carousel_author__TOaTb')]/p[text()='டாக்டர் கோ.நம்மாழ்வார்']"));
		js.executeScript("arguments[0].scrollIntoView()",nammalvaar);
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(2000);
		
		WebElement sendKey = driver.findElement(By.xpath("(//input[starts-with(@placeholder,'Books name')])[1]"));
		js.executeScript("arguments[0].value='sa'",sendKey);
		Thread.sleep(2000);
		
		WebElement click = driver.findElement(By.xpath("//a[starts-with(@class,'Header_login__rJBZS Header_pointer__WhVYM')]"));
		js.executeScript("arguments[0].click()",click);
		Thread.sleep(2000);
		
		WebElement click2 = driver.findElement(By.xpath("//div[starts-with(@class,'login_login-close__vzUah')]"));
		js.executeScript("arguments[0].click()",click2);
		Thread.sleep(4000);

		
		js.executeScript("history.go(0)");
		
		
		
		
		
	}
}
