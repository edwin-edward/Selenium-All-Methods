package org.webTableConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		List<WebElement> header = driver.findElements(By.xpath("//table[starts-with(@class,'tsc_table_s13')]//thead//tr//th"));
		System.out.println("HEADERS : ");
		for(WebElement headers : header) {
			System.out.println(headers.getText());
		}
		
		System.out.println();
		
		System.out.println("COLUMN COUNT : "+header.size());
		
		System.out.println();
		
		WebElement particularData = driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tbody//tr//td//span[text()='China']"));
		System.out.println("PARTICULAR DATA : "+particularData.getText());
		
		System.out.println();
		
		List<WebElement> allData = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tbody//tr//td"));
		System.out.println("ALL DATA : ");
		for(WebElement allDatas : allData) {
			System.out.println(allDatas.getText());
		}
		
		System.out.println();
		
		System.out.println("ENTIRE DATA COUNT : "+allData.size());
		
		System.out.println();
		
		List<WebElement> particularRow = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tbody//tr[2]"));
		System.out.println("PARTICULAR ROW DATA : ");
		for(WebElement particularRows : particularRow) {
			System.out.println(particularRows.getText());
		}
		
		System.out.println();
		
		List<WebElement> entireRow = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tbody//tr"));
		System.out.println("TOTAL ROW DATA : ");
		for(WebElement entireRows : entireRow) {
			System.out.println(entireRows.getText());
		}
		
		System.out.println();
		
		System.out.println("TOTAL ROW COUNT : "+entireRow.size());
		
		System.out.println();
		
		List<WebElement> particularColumn = driver.findElements(By.cssSelector("table.tsc_table_s13>tbody>tr>td:nth-child(2)"));
		System.out.println("PARTICULAR COLUMN :  ");
		for(WebElement particularColumns : particularColumn) {
			System.out.println(particularColumns.getText());
		}
		
		driver.close();
	}
}
