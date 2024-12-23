package org.datePicker;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendertask {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://www.omtamilcalendar.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement cal = driver.findElement(By.xpath("//div[@class='calendar-inner']"));
		js.executeScript("arguments[0].scrollIntoView()",cal);
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-95)");
		
		List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='calendar-table']//tbody//tr"));
		int tableRowsSize = tableRows.size();
		
		for(int i=3; i<=tableRowsSize; i++) {
			List<WebElement> totalColumnCount = driver.findElements(By.xpath("//table[@class='calendar-table']//tbody//tr["+i+"]//td"));
			int columnSize = totalColumnCount.size();
			for(int j=1; j<=columnSize; j++) {
				WebElement tableDate = driver.findElement(By.xpath("//table[@class='calendar-table']//tbody//tr["+i+"]//td["+j+"]"));
				System.out.print(tableDate.getText()+"|");
			}
			System.out.println();
		}
		System.out.println("==============");
		for(int i=3; i<=tableRowsSize; i++) {
			List<WebElement> totalColumnCount = driver.findElements(By.xpath("//table[@class='calendar-table']//tbody//tr["+i+"]//td"));
			int columnSize = totalColumnCount.size();
			for(int j=1; j<=columnSize; j++) {
				WebElement tableDate = driver.findElement(By.xpath("//table[@class='calendar-table']//tbody//tr["+i+"]//td["+j+"]"));
				if(tableDate.getText().equalsIgnoreCase("15")) {
					tableDate.click();
					break;
				}
			}
			System.out.println();
		}
	}
}
