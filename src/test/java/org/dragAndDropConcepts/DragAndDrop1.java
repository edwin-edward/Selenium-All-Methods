package org.dragAndDropConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement drop = driver.findElement(By.xpath("//div[starts-with(@id,'box106')]"));
		Actions as = new Actions(driver);
		as.dragAndDrop(drag, drop).perform();
		
		WebElement drag1 = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement drop1 = driver.findElement(By.xpath("//div[starts-with(@id,'box107')]"));
		as.dragAndDrop(drag1, drop1).perform();
		
		WebElement drag2 = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement drop2 = driver.findElement(By.xpath("//div[starts-with(@id,'box101')]"));
		as.dragAndDrop(drag2, drop2).perform();
		
		WebElement drag3 = driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement drop3 = driver.findElement(By.xpath("//div[starts-with(@id,'box104')]"));
		as.dragAndDrop(drag3, drop3).perform();
		
		WebElement drag4 = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement drop4 = driver.findElement(By.xpath("//div[starts-with(@id,'box105')]"));
		as.dragAndDrop(drag4, drop4).perform();
		
		WebElement drag5 = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement drop5 = driver.findElement(By.xpath("//div[starts-with(@id,'box102')]"));
		as.dragAndDrop(drag5, drop5).perform();
		
		WebElement drag6 = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement drop6 = driver.findElement(By.xpath("//div[starts-with(@id,'box103')]"));
		as.dragAndDrop(drag6, drop6).perform();
	}
}
