package com.softclouds.framework;

import java.io.File;

import org.aspectj.util.FileUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;


public class RibbonWrapper extends SeleniumWrapper{
	
	public static void signIntoRibbon() throws Exception{
		signIntoRibbon(baseUrl);
	}
	
   	public static void signIntoRibbon(String baseurl) throws Exception {
		try {
				enterURL(baseurl);				
				enterText(byUserIDTextFieldID, byusername);
				enterText(byPasswordTextFieldID, bypassword);
				click(bySignInButtonID);
				
			} catch (Exception e) {
				
				File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    	Reporter.log("MACU Signin process un-successfull - Screenshot");
		    	FileUtil.copyFile(screenShot, new File("D:\\macu\\MACU_POC\\resources\\reportng\\scr1.png"));
		    	Reporter.log("<a href="+"D:\\macu\\MACU_POC\\resources\\reportng\\scr1.png"+">screenshot</a>");
		    	log.error("Error in the signin process");
		    	e.printStackTrace();
				throw e;
				
			}
	}
   
}
