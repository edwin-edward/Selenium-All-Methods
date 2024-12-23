package org.webTableConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		List<WebElement> header = driver.findElements(By.xpath("//table[@id='countries']//tbody//tr[1]//td"));
		System.out.println("HEADERS : ");
		for(WebElement headers : header) {
			System.out.println(headers.getText());
		}
		
		System.out.println();
		
		System.out.println("COLUMN COUNT : "+header.size());
		
		System.out.println();
		
		WebElement particularData = driver.findElement(By.xpath("//table[@id='countries']//tbody//tr[66]//td[2]"));
		System.out.println("PARTICULAR DATA : "+particularData.getText());
		
		System.out.println();
		
		List<WebElement> allData = driver.findElements(By.xpath("//table[@id='countries']//tbody//tr//td"));
		System.out.println("ALL DATA : ");
		for(WebElement allDatas : allData) {
			System.out.println(allDatas.getText());
		}
		
		System.out.println();
		
		System.out.println("ENTIRE DATA COUNT : "+allData.size());
		
		System.out.println();
		
		List<WebElement> particularRow = driver.findElements(By.xpath("//table[@id='countries']//tbody//tr[100]//td"));
		System.out.println("PARTICULAR ROW DATA : ");
		for(WebElement particularRows : particularRow) {
			System.out.println(particularRows.getText());
		}
		
		System.out.println();
		List<WebElement> rowCount = driver.findElements(By.xpath("//table[@id='countries']//tbody//tr"));
		
		System.out.println("TOTAL ROW COUNT : "+rowCount.size());
		
		System.out.println();
		
		List<WebElement> particularColumn = driver.findElements(By.cssSelector("table#countries>tbody>tr>td:nth-child(4)"));
		System.out.println("PARTICULAR COLUMN :  ");
		for(WebElement particularColumns : particularColumn) {
			System.out.println(particularColumns.getText());
		}
		
		driver.close();
	}
}
