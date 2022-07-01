package com.ribbon.cpq;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Attachment;

public class TestListener implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case failed " +result.getName());
	}
	
	@Attachment(value = "Page screenshot", type = "image/png")
	public byte[] saveScreenshotOnFailure(WebDriver driver) {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}
}
