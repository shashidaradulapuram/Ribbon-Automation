package com.softclouds.framework;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.google.common.io.Files;

//com.caf.MACU.framework - Contains the Base Framework around which the MACUTesting project is build.
//Hierarchy of Classes in the com.caf.macu.framework is as follows(Class to the right inherits/extends the class to the left):
//GlobalVariable >> GlobalObjectRepository >> ReUsableMethods >> SeleniumWrapper >> LoudSightWrapper >> BaseClass

public class GlobalVariables {

	public final static Logger log = initLogger();
	
	public static Actions               actions; 
	public static Alert                 alert;
	public static By                    by; 
	//public static Wait                  implicit;
	public static String 			    currUserDirectory = System.getProperty("user.dir");
	public static WebDriver             driver;
	public static JavascriptExecutor    jse;
	public static SoftAssert 		    softAssert = new SoftAssert();
	public static WebDriverWait         wait; 
	public static WebElement            webElement;
	
	
	public final static String LOG4J2_CONFIG_FILE_PATH 	       = "./resources/config/logger/log4j2.xml";
	public final static String WEBDRIVER_EXECUTABLES_PATH 	   = "./resources/drivers/";
	
	public final static String BROWSER 					= YamlWrapper.getBrowserName();
	
	public final static Integer WEBDRIVER_WAIT_TIME 	= YamlWrapper.getWebDriverWaitTime();


	//Storing the WebTable in HashMap
	public static HashMap<Integer, HashMap <Integer, String>>     webTableData    = new HashMap<Integer, HashMap <Integer, String>>();
	public static HashMap<Integer, HashMap <Integer, WebElement>> webTableElement = new HashMap<Integer, HashMap <Integer, WebElement>>();
    
	
	//URL's 
	public static String baseUrl 	= YamlWrapper.getBaseUrl();
	public static String base_Url 	= YamlWrapper.geturl_BUI();
	
	
	//Login Credentials
	public static String byusername     				= YamlWrapper.getUsername();
	public static String bypassword     				= YamlWrapper.getPassword();
	public static String byEnterQuoteName    			= YamlWrapper.getEnterQuoteName();
	public static String byEnterSiteNameEM    			= YamlWrapper.getEnterSiteNameEM();
	public static String byEnterSiteNameGVPP    		= YamlWrapper.getEnterSiteNameGVPP();
	public static String byEnterEDPNodes         		= YamlWrapper.getEnterEDPNodes();
	
	public static String byEnterBasicLines         		= YamlWrapper.getEnterBasicLines();
	
	public static String byEnterSystemsRequire     		= YamlWrapper.getEnterSystemsRequire();
	public static String byEnterSIPLines         		= YamlWrapper.getEnterSIPLines();
	public static String byEnterSIPEDPDevices   		= YamlWrapper.getEnterSIPEDPDevices();
	public static String byEnterEUPLogins       		= YamlWrapper.getEnterEUPLogins();
	
	public static String byEnterNewBasicLines         	= YamlWrapper.getEnterNewBasicLines();
	public static String byEnterNewSIPLines         	= YamlWrapper.getEnterNewSIPLines();
	public static String byEnterNewSIPEDPDevices   		= YamlWrapper.getEnterNewSIPEDPDevices();
	public static String byEnterNewEUPLogins       		= YamlWrapper.getEnterNewEUPLogins();
	
	public static String byEnterCIMVoiceMail       		= YamlWrapper.getEnterCIMVoiceMail();
	public static String byEnterCustomNewASCII   		= YamlWrapper.getEnterCustomNewASCII();
	public static String byEnterCustomNewDBCS     		= YamlWrapper.getEnterCustomNewDBCS();
	
	public static String byEnterAddlProductDiscount 	= YamlWrapper.getEnterAddlProductDiscount();
	public static String byEnterAddlMaintenanceDiscount	= YamlWrapper.getEnterAddlMaintenanceDiscount();
	public static String byEnterAddlServicesDiscount 	= YamlWrapper.getEnterAddlServicesDiscount();
	public static String byEnterOneTimeDiscount     	= YamlWrapper.getEnterOneTimeDiscount();
	public static String byEnterOneTimeDiscountAmount  	= YamlWrapper.getEnterOneTimeDiscountAmount();
	
	public static String byEnterPartQtyGTP            	= YamlWrapper.getEnterPartQtyGTP();
	public static String byEnterPartQtyBS            	= YamlWrapper.getEnterPartQtyBS();
	public static String byEnterPartQtyLAB            	= YamlWrapper.getEnterPartQtyLAB();
	
	public static String byEnterPartQtyGTPFWGEO        	= YamlWrapper.getEnterPartQtyGTPFWGEO();
	public static String byEnterPartQtySFWMULT        	= YamlWrapper.getEnterPartQtySFWMULT();
	public static String byEnterPartQtySMSANA        	= YamlWrapper.getEnterPartQtySMSANA();
	
	public static String bysearchusername 				= YamlWrapper.getsearchusername();
	public static String bygetsearchemailid  			= YamlWrapper.getsearchemailid();
	public static String bygetsearchkeyword_search  	= YamlWrapper.getsearchkeyword_search();
	public static String bygettitle  					= YamlWrapper.gettitle();
	public static String bygetkeywords  				= YamlWrapper.getkeywords();
	public static String bygetcontentinfo  				= YamlWrapper.getcontentinfo();
	public static String bygetcontent  					= YamlWrapper.getcontent();
	public static String bygetBasicInfo  				= YamlWrapper.getBasicInfo();
	public static String bygetBasicContactInfo  		= YamlWrapper.getBasicContactInfo();
	public static String bygetSteps  					= YamlWrapper.getSteps();
	public static String bygetStepsContactInfo  		= YamlWrapper.getStepsContactInfo();
	public static String bygetForms_Resources  			= YamlWrapper.getForms_Resources();
	public static String bygetForms_Resources_Content  	= YamlWrapper.getForms_Resources_Content();
	public static String bygetSalesConnections  		= YamlWrapper.getSalesConnections();
	public static String bygetSalesConnectionsContent  	= YamlWrapper.getSalesConnectionsContent();
	public static String bygetId  						= YamlWrapper.getId();
	public static String bygetLink  					= YamlWrapper.getLink();
	public static String bygetAnswerType  				= YamlWrapper.getAnswerType();
	public static String bygetStartTime  				= YamlWrapper.getStartTime();
	public static String bygetRemoveTime  				= YamlWrapper.getRemoveTime();
	public static String bygetReviewTime  				= YamlWrapper.getReviewTime();
	public static String bygetEditkeywords  			= YamlWrapper.getEditkeywords();
	public static String bygetEditReason  				= YamlWrapper.getEditReason();
	public static String bygetAnswerId  				= YamlWrapper.getAnswerId();
	public static String bygetReplayForFeedBack  		= YamlWrapper.getReplayForFeedBack();
	public static String bygetusername_BUI  			= YamlWrapper.getusername_BUI();
	public static String bygetpassword_BUI  			= YamlWrapper.getpassword_BUI();
	public static String bygetRequest_Change  			= YamlWrapper.getRequest_Change();
	public static String bygetThumbsUp_Down  			= YamlWrapper.getThumbsUp_Down();
	public static String bygetlogin_id  				= YamlWrapper.getlogin_id();
	
	
	
	public static Logger initLogger() {
		System.setProperty("log4j.configurationFile",LOG4J2_CONFIG_FILE_PATH);
		return LogManager.getLogger(GlobalVariables.class.getName());
	}
	
	public static void renameAndMovePreviousTestNGReport() {
		try {
			String timeStamp     = new SimpleDateFormat("HH-mm a - dd MMM YYYY").format(new Date());
			File sourceFile 	 = new File("./test-output/emailable-report.html");
			File destinationFile = new File("./resources/reports/" + timeStamp + "_emailable-report.html" );
			Files.copy(sourceFile , destinationFile );
			
		} catch (IOException e) {
			log.error(e);
		}
	}
	
}