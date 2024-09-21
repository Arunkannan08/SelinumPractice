package com.practiceSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAttachFileFromWindows {
	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.filemail.com/share/upload-file");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//*[text()='Add Files']"));
		element.click();

		Robot r = new Robot();
		r.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\QQA0155\\Pictures\\Screenshots\\Selenium\\TESTNG\\TESTNGPOM2.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
		
	}

