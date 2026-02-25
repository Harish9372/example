package com.genericUtilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listerner_Implementation implements ITestListener {

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		TakesScreenshot ts = (TakesScreenshot) BaseTest.sDriver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/DWS_" + Java_Utility.getCurrentTime() + ".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void ontestFailurenew(ITestResult result1) {
		
		ITestListener.super.onTestFailure(result1);
		
		
		
		
	}
	

	
	
	
	
	
}