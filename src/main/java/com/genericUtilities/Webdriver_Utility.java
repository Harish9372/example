package com.genericUtilities;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.internal.invokers.AbstractParallelWorker.Arguments;

public class Webdriver_Utility {

	public static void takeScreenshot(WebDriver driver) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./TestNG ScreenShot/" + Java_Utility.getCurrentTime() + ".png");
		FileHandler.copy(source, destination);
         
	}

	public static void takeScreenshot(WebElement element) throws IOException {

		File source = element.getScreenshotAs(OutputType.FILE);
		File destination = new File("./TestNG ScreenShot/" + Java_Utility.getCurrentTime() + ".png");
		FileHandler.copy(source, destination);

	}

	public static void selectDropdownOptionByText(WebElement element, String visibletext) {

		Select s1 = new Select(element);
		s1.selectByVisibleText(visibletext);
	}

	public static void selectDropdownOptionByValue(WebElement element, String value) {

		Select s1 = new Select(element);
		s1.selectByValue(value);
	}

	public static void selectDropdownOptionByindex(WebElement element, int index) {

		Select s1 = new Select(element);
		s1.selectByIndex(index);
	}

	public static void autoSuggestionhandling(List<WebElement> elements, String suggestion) {
		for (WebElement element : elements) {

			if (element.getText().equals(suggestion)) {
				element.click();
				break;
			}

		}

	}

	public static void switchTowindowByTitle(WebDriver driver, String title) {

		String parentwindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		allWindowHandles.remove(parentwindowHandle);
		for (String windowHandle : allWindowHandles) {

			driver.switchTo().window(windowHandle);
			if (driver.getTitle().equals(title)) {
				break;
			} else {
				driver.close();
			}
		}

	}

	public static void switchTowindowByUrl(WebDriver driver, String url) {

		String parentwindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		allWindowHandles.remove(parentwindowHandle);
		for (String windowHandle : allWindowHandles) {

			driver.switchTo().window(windowHandle);
			if (driver.getCurrentUrl().equals(url)) {
				break;
			} else {
				driver.close();
			}
		}
	}

	public static void scrollToElement(WebDriver driver, WebElement element, boolean position) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(" + position + ")", element);
	}

	public static void sendData(WebDriver driver, WebElement element, String data) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=" + data + "'", element);
	}

	public static void clickElement(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

}
