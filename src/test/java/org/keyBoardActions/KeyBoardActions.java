package org.keyBoardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException,AWTException{
		System.setProperty("webdriver.chrome.driver",".\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/key_presses?");
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_0);
		r.keyRelease(KeyEvent.VK_0);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_1);
		r.keyRelease(KeyEvent.VK_1);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_2);
		r.keyRelease(KeyEvent.VK_2);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_3);
		r.keyRelease(KeyEvent.VK_3);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_4);
		r.keyRelease(KeyEvent.VK_4);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_5);
		r.keyRelease(KeyEvent.VK_5);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_6);
		r.keyRelease(KeyEvent.VK_6);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_7);
		r.keyRelease(KeyEvent.VK_7);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_8);
		r.keyRelease(KeyEvent.VK_8);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_9);
		r.keyRelease(KeyEvent.VK_9);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_B);
		r.keyRelease(KeyEvent.VK_B);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_D);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_F);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_G);
		r.keyRelease(KeyEvent.VK_G);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_H);
		r.keyRelease(KeyEvent.VK_H);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_J);
		r.keyRelease(KeyEvent.VK_J);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_K);
		r.keyRelease(KeyEvent.VK_K);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_EXCLAMATION_MARK);
		r.keyRelease(KeyEvent.VK_EXCLAMATION_MARK);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_AT);
		r.keyRelease(KeyEvent.VK_AT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_CIRCUMFLEX);
		r.keyRelease(KeyEvent.VK_CIRCUMFLEX);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_NUMBER_SIGN);
		r.keyRelease(KeyEvent.VK_NUMBER_SIGN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOLLAR);
		r.keyRelease(KeyEvent.VK_DOLLAR);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.close();
	}
}
