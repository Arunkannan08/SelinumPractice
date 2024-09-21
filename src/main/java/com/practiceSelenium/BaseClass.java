package com.practiceSelenium;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public abstract class BaseClass {
	public static WebDriver driver;
	static String getTitle;
	static WebElement element;
	public static ExtentReports extentReports;
	public static File file; 

	// 1. Launch Browser
	public static WebDriver browserLaunch(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else {
				System.out.println("Enter the Valid browser name to launch the browser");
			}
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	// 2. Get Url
	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 3. Get Title
	public static void getTitle() {
		try {
			String getTitle = driver.getTitle();
			System.out.println("The Title of the Window is : " + getTitle);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 4. Current Url
	public static void getCurrentUrl(WebDriver driver) {
		try {
			String currentUrl = driver.getCurrentUrl();
			System.out.println("Current Url : " + currentUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 5. Navigate To
	public static void navigateTo(WebDriver driver, String navigateUrl) {
		try {
			driver.navigate().to(navigateUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 6. Other Navigate Methods
	public static void navigateMethods(WebDriver driver, String navigateMethodName) {
		try {
			if (navigateMethodName.equalsIgnoreCase("forward")) {
				driver.navigate().forward();
			} else if (navigateMethodName.equalsIgnoreCase("back")) {
				driver.navigate().back();
			} else if (navigateMethodName.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 7. Clear
	public static void clearText(WebDriver driver, WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 8. input & Send Keys
	public static void getinput(WebDriver driver, WebElement element, String input) {
		try {
			element.sendKeys(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 9. Click
	public static void click(WebDriver driver, WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 10. To check the visibility of element
	public static void elementPresent(WebDriver driver, WebElement element, String visiblity) {
		boolean elementIs=false;
		try {
			if (visiblity.equalsIgnoreCase("isEnabled")) {
				elementIs = element.isEnabled();
			} else if (visiblity.equalsIgnoreCase("isDisplayed")) {
				elementIs = element.isDisplayed();
			} else if (visiblity.equalsIgnoreCase("isSelected")) {
				elementIs = element.isSelected();
			} else {
				System.out.println("Enter proper visiblity type");
			}
			System.out.println("Element is present : "+elementIs);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 11. GetText
	public static void getText(WebDriver driver, WebElement element) {
		try {
			String text = element.getText();
			System.out.println("Text Extracted From Web Page : " + text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 12. Take Screen Shot
	public static void takeScreenShot(WebDriver driver, String fileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Arunkumar\\Eclipse_Learning\\practiceSelenium\\ScreenShot\\" + fileName + ".png");
		FileHandler.copy(src, des);
	}

	// 13. closeWindow
	public static void closeWindow(WebDriver driver, String close) {
		if (close.equalsIgnoreCase("Close")) {
			driver.close();
		} else if (close.equalsIgnoreCase("quit")) {
			driver.quit();
		}
		System.out.println("Window Closed");
	}

	// 14. WaitTime
	public static void waitTime(WebDriver driver, int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	// 15. JaVa Script
	public static void javaScript(WebDriver driver, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(value);
	}
	
	public static void extentReportStart(String location)
	{
		extentReports = new ExtentReports();
		file = new File(location);
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extentReports.attachReporter(sparkReporter);
		extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));
	}
	
	public static void extentReportTearDown(String location) throws IOException
	{
		extentReports.flush();
		file = new File(location);
		Desktop.getDesktop().browse((file).toURI());
	}
	
	public String takeScreenShot1()throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		String timestamp = new SimpleDateFormat("yyyMMdd_HHmmss").format(new java.util.Date());
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("ScreenShot\\.png"+"_" + timestamp + ".png");
		FileHandler.copy(src, des);
		return des.getAbsolutePath();
		
	}
}
