package com.practiceSelenium;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utilites.ReadExcelData;

public class TestRunner {
	public static void main(String[] args) throws InvalidFormatException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement userName =driver.findElement(By.id("email"));
		WebElement password =driver.findElement(By.id("pass"));
		
		String user = ReadExcelData.particularGetCellData(1, 0);
		String pass = ReadExcelData.particularGetCellData(1, 1);
			
		userName.sendKeys(user);
		password.sendKeys(pass);
		
	}

}
