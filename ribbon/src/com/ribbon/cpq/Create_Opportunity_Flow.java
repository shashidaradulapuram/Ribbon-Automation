package com.ribbon.cpq;

import java.io.File;
import java.util.List;
import java.util.Set;
import org.aspectj.util.FileUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Create_Opportunity_Flow extends Ribbon_Management {
	@BeforeClass
	public void testSignIn() throws Exception 
	   {
		try {
		     	openBrowser();
		    	signIntoRibbon();			
		    } catch (Exception e) 
		    {
			log.error("Login/SignIn un-successful");
			e.printStackTrace();
			throw e;
		    }
	   }
	@Test (priority = 1, description = "Navigate from Salesforce to CPQ")
	public void testAddSite() throws Exception {
		try {
			try {
					hardWait(20);
					click(bylightningprofile);					
					hardWait(5);
					click(bySwitchtoclassic);
					hardWait(5);
				}  
			      catch(Exception e) 
			     {
			    	  e.printStackTrace();
			     }
			        hardWait(2);
			        click(byOpportunity);
			        hardWait(5);
					click(bySelectOpportunity);
					hardWait(5);
					click(byClickOracleQuotes);			
					//click(byClickNewOracleQuote);
					click(byClickGoToList);
					click(byClickOracleQuoteName);			
					click(byClickEditButton);
					hardWait(10);
					String current = System.getProperty("user.dir");
			        System.out.println("Current working directory in Java : " + current);
					Screen s=new Screen();
		            s.click("E:\\Git Repository\\Ribbon\\Ribbon-Automation\\ribbon\\resources\\Popup_Images\\Redirect.png");		          
		            s.click("E:\\Git Repository\\Ribbon\\Ribbon-Automation\\ribbon\\resources\\Popup_Images\\Allow.png");
		            s.click("E:\\Git Repository\\Ribbon\\Ribbon-Automation\\ribbon\\resources\\Popup_Images\\Done.png");
		            driver.navigate().refresh();
		            hardWait(25);            
		            enterText(byClearQuoteName,byEnterQuoteName); 
		            hardWait(2);
		            click(byQuoteSaveButton);
		            hardWait(2);
			     
			     
	    	} catch (Exception e) {
				File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    	Reporter.log("Salesforce login or Add Site unsuccessful - Screenshot");
		    	FileUtil.copyFile(screenShot, new File("E:\\Selenium\\Workspace\\Ribbon\\Workspace\\ribbon\\resources\\reportng\\scr1.png"));
		    	Reporter.log("<a href="+"E:\\Selenium\\Workspace\\Ribbon\\Workspace\\ribbon\\resources\\reportng\\scr1.png"+">screenshot</a>");
		    	log.error("Salesforce login and navigate to CPQ unsuccessful");
		    	e.printStackTrace();
				throw e;
		    }
	    }
            
         
	@Test (priority = 2, description = "Add EdgeMarc Model")
	public void testAddEdgeMarc() throws Exception {
		try { 
			click(byAddSiteButton);
            hardWait(15);
            enterText(byClearSiteName,byEnterSiteNameEM);
            hardWait(5);
            click(byTopConfigGroup);            
            click(bySelectEMTopConfigGroup);            
            click(byAddConfigurationButton);
            hardWait(5);
            
            try {
            click(byTargetApplication);            
            click(bySelectTargetApplication);
            hardWait(2);
            }
            catch(Exception e) {            
            click(bySystemConfiguration);
            hardWait(20);
            }
            click(byEdgeMarcCheckbox);
            hardWait(5);
            //click(byLocationEM);            
            //click(bySelectLocationEM);            
            click(byEdgeMarcProductLine);            
            click(bySelectEdgeMarcProductLine);            
            click(byEdgeMarcQuote);            
            click(bySelectEdgeMarcQuote);  
            hardWait(2);
            enterText(byClearSystemsRequire,byEnterSystemsRequire);
            hardWait(2);
            click(byEdgeMarcConfigSupport);            
            click(bySelectEdgeMarcConfigSupport);            
            click(bySDWANPerpetualLicense);           
            click(bySelectSDWANPerpetualLicense);            
            click(byYearsOfSupport);            
            click(bySelectYearsOfSupport);           
            click(byImplementationServices);           
            click(bySelectImplementationServices);            
            click(byImplementationType);           
            click(bySelectImplementationType);            
            hardWait(2);
            WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Partners & Distributors')]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            hardWait(6);
            click(bySIPurvivability);            
            click(bySelectSIPurvivability);            
            click(byAddAdditionalCallCounts);            
            click(bySelectAddAdditionalCallCounts);           
            click(bySecondPRIPort);            
            click(bySelectSecondPRIPort);              
            //click(byExpandMaintenance);
            click(byMaintenanceProvider);            
            click(bySelectMaintenanceProvider);   
            click(byConfigUpdateButton);
            hardWait(10);
            /////////////////////////////////////////////////////    SCROLL DOWN TO BOTTOM OF PAGE     //////////////////////////////////////////////////////////
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
            hardWait(5);
            /////////////////////////////////////////////////////    SCROLL TO TOP OF PAGE     //////////////////////////////////////////////////////////////////
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
            hardWait(6);            
            click(byAddToQuoteButton);
            hardWait(12);     
            click(byQuoteSaveButton);
            hardWait(15);
			
		} catch (Exception e) {
			File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	Reporter.log("Add EdgeMarc Model unsuccessful - Screenshot");
	    	FileUtil.copyFile(screenShot, new File("E:\\Selenium\\Workspace\\Ribbon\\Workspace\\ribbon\\resources\\reportng\\scr2.png"));
	    	Reporter.log("<a href="+"E:\\Selenium\\Workspace\\Ribbon\\Workspace\\ribbon\\resources\\reportng\\scr2.png"+">screenshot</a>");
	    	log.error("Add EdgeMarc Model unsuccessful");
	    	e.printStackTrace();
			throw e;
		}
	}
	
	@Test (priority = 3, description = "Add GVPP Model")
	public void testAddGVPP() throws Exception {
		try {
			click(byAddSiteButton);
            hardWait(15);
            enterText(byClearSiteName,byEnterSiteNameGVPP);
            hardWait(5);
            click(byTopConfigGroup);
            click(bySelectGVPPTopConfigGroup); 
            click(byAddConfigurationButton);
            hardWait(5);
            click(bySystemConfiguration);
            hardWait(20);
            click(byLocationGVPP);
            click(bySelectLocationGVPP);
            
			//////////////////////////////////////////////////////EDP Toggle Button  /////////////////////////////////////////////////////////////////////////////
			List<WebElement> switchElement = driver.findElements(By.xpath("//div[@class='oj-switch-track']"));            
			if (switchElement.size() != 0) {
			switchElement.get(0).findElement(By.xpath("//oj-switch[@id='endpointDeviceProvisioning']//div[@aria-checked='false']")).click();
			System.out.println("Switch is OFF and changed to ON");
			} else {
			System.out.println("Switch  is already ON");
			}
            
            click(byPPSWR);
            click(bySelectPPSWR);
            click(byPPDM);
            click(bySelectPPDM);
            click(byMARMSPT);
            click(bySelectMARMSPT);
            click(byHDDQuantity);
            click(bySelectHDDQuantity);
            click(byPSResiliencyOptions);
            click(bySelectPSResiliencyOptions);
            click(byEDPResiliencyOptions);
            click(bySelectEDPResiliencyOptions);
            enterText(byClearEDPNodes,byEnterEDPNodes);
            hardWait(2);           
            
            /////////////////////////////////////////////////////    GVPP-PS/C3C RTUs?   //////////////////////////////////////////////////////////////////////////////
            List<WebElement> switchElement1 = driver.findElements(By.xpath("//div[@class='oj-switch-track']"));            
            if (switchElement1.size() != 0) {
                switchElement1.get(0).findElement(By.xpath("//oj-switch[@id='doesThisServiceProviderHaveExistingGVPPPSC3CRTUs']//div[@aria-checked='false']")).click();
                System.out.println("Switch is OFF and changed to ON");
            } else {
                System.out.println("Switch is already ON");
            }
            hardWait(5);
            WebElement portalServer = driver.findElement(By.xpath("//label[@id='isThisConfigurationCohabitatingWithAnExistingNSP-label|label']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", portalServer);
            hardWait(6);
            
            enterText(byClearBasicLines,byEnterBasicLines);
            hardWait(3);
            enterText(byClearSIPLines,byEnterSIPLines);
            hardWait(3);
            enterText(byClearSIPEDPDevices,byEnterSIPEDPDevices);
            hardWait(3);
            enterText(byClearEUPLogins,byEnterEUPLogins);
            hardWait(3);
            click(bySMBPortalLogins);
            click(bySelectSMBPortalLogins);
            click(bySPResellerPortalLogins);
            click(bySelectSPResellerPortalLogins);
            
            enterText(byClearNewBasicLines,byEnterNewBasicLines);
            hardWait(3);
            enterText(byClearNewSIPLines,byEnterNewSIPLines);
            hardWait(3);
            enterText(byClearNewSIPEDPDevices,byEnterNewSIPEDPDevices);
            hardWait(3);
            enterText(byClearNewEUPLogins,byEnterNewEUPLogins);
            hardWait(3);
            click(byNewSMBPortalLogins);
            click(bySelectNewSMBPortalLogins);
            click(byNewSPResellerPortalLogins);
            click(bySelectNewSPResellerPortalLogins);
            
            enterText(byClearCIMVoiceMail,byEnterCIMVoiceMail);
            hardWait(3);
            
            WebElement portalLanguages = driver.findElement(By.xpath("//label[@id='sMBPortalLogins_existingPortal-label|label']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", portalLanguages);
            hardWait(6);
            
            click(byPortalLanguagescheckkbox);
            enterText(byClearCustomNEWASCII,byEnterCustomNewASCII);
            hardWait(3);
            enterText(byClearCustomNEWDBCS,byEnterCustomNewDBCS);
            hardWait(3);
            click(byConfigUpdateButton);
            hardWait(10);
			/////////////////////////////////////////////////////    SCROLL DOWN TO BOTTOM OF PAGE     //////////////////////////////////////////////////////////
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
			hardWait(5);
			/////////////////////////////////////////////////////    SCROLL TO TOP OF PAGE     //////////////////////////////////////////////////////////////////
			((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
			hardWait(5);			
            
            try 
            {
            	hardWait(5);
            	click(byConfigSaveButton);                      
            }
            catch (Exception e)
            {
            	click(byAddToQuoteButton);            		
            }             
            hardWait(15); 
            click(byQuoteSaveButton);
            hardWait(15);
		  }
		
		catch(Exception e) {
			File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	Reporter.log("Add GVPP Model unsuccessful - Screenshot");
	    	FileUtil.copyFile(screenShot, new File("E:\\Selenium\\Workspace\\Ribbon\\Workspace\\ribbon\\resources\\reportng\\scr3.png"));
	    	Reporter.log("<a href="+"E:\\Selenium\\Workspace\\Ribbon\\Workspace\\ribbon\\resources\\reportng\\scr3.png"+">screenshot</a>");
	    	log.error("Add GVPP Model unsuccessful");
	    	e.printStackTrace();
			throw e;
		}
	}	
	
	@Test (priority = 4, description = "Add From Catalog")
	public void testAddFromCatalog() throws Exception {
		try {
			highlightWebElement(byAddFromCatalogButton);
            hardWait(3);
            click(byAddFromCatalogButton);
            hardWait(15);
            click(byCatalogName);
            click(bySelectCatalogName);
            try {
            click(byTargetApplication);
            click(bySelectTargetApplication);
            } catch(Exception e) {
             System.out.println("Already Target Application visible and is read only");
            }
            click(byExpandMaintenance);
            click(byMaintenanceProvider);
            click(bySelectMaintenanceProvider);
            click(byCatalogType);
            click(bySelectCatalogType);
            click(bySytsemConfigurationHardwareRBP);
            hardWait(3);
            click(bySearchButton);
            hardWait(6);
            
            click(byClickPartQtyGTP);
            enterText(byClearPartQtyGTP,byEnterPartQtyGTP);
            hardWait(5);
            
            Actions acttwo = new Actions(driver);
            //Double click on element
            WebElement bs = driver.findElement(By.xpath("//div[contains(@class,'cpq-table-body-row')]//span[@title='CELL-SFWBS']//following::div[2]/span")); 
            acttwo.doubleClick(bs).perform();            
            enterText(byClearPartQtyBS,byEnterPartQtyBS);
            hardWait(5);
            
            Actions actthree = new Actions(driver);
            //Double click on element
            WebElement lab= driver.findElement(By.xpath("//div[contains(@class,'cpq-table-body-row')]//span[@title='CELL-SFWLAB']//following::div[2]/span")); 
            actthree.doubleClick(lab).perform();            
            enterText(byClearPartQtyLAB,byEnterPartQtyLAB);
            hardWait(5);               
            
            click(byAddPartsButton);  
            hardWait(5);
            click(byConfigUpdateButton);
            hardWait(10);
            
			/////////////////////////////////////////////////////    SCROLL DOWN TO BOTTOM OF PAGE     //////////////////////////////////////////////////////////
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
			hardWait(5);
			/////////////////////////////////////////////////////    SCROLL TO TOP OF PAGE     //////////////////////////////////////////////////////////////////
			((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
			hardWait(5);  
			
			click(bySytsemConfigurationRBP);
			hardWait(5);
			click(byAddIcon);
			click(byClickCatalogTypeTwo);
			click(bySelectCatalogTypeTwo);			
			hardWait(5);
			click(bySytsemConfigurationSoftwareRBP);
			hardWait(15);
			click(bySearchButton);
            hardWait(6);
            
            click(byClickPartQtyGTPFWGEO);
            enterText(byClearPartQtyGTPFWGEO,byEnterPartQtyGTPFWGEO);
            hardWait(5);
                        
            Actions actfour = new Actions(driver);
            //Double click on element
            WebElement mult = driver.findElement(By.xpath("//div[contains(@class,'cpq-table-body-row')]//span[@title='CELL-SFWMULT']//following::div[2]/span")); 
            actfour.doubleClick(mult).perform();            
            enterText(byClearPartQtyMULT,byEnterPartQtySFWMULT);
            hardWait(5);
            
            Actions actfive = new Actions(driver);
            //Double click on element
            WebElement ana= driver.findElement(By.xpath("//div[contains(@class,'cpq-table-body-row')]//span[@title='CELL-SMSANA']//following::div[2]/span")); 
            actfive.doubleClick(ana).perform();            
            enterText(byClearPartQtyANA,byEnterPartQtySMSANA);
            hardWait(6);	
            
			/////////////////////////////////////////////////////    SCROLL DOWN TO BOTTOM OF PAGE     //////////////////////////////////////////////////////////
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
			hardWait(5);
			
			click(byAddPartsButton);  
            hardWait(5);
            
			/////////////////////////////////////////////////////    SCROLL DOWN TO BOTTOM OF PAGE     //////////////////////////////////////////////////////////
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
			hardWait(5);

            click(byConfigUpdateButton);
            hardWait(15);			
            
            try 
            {
            	click(byConfigSaveButton);                        
            }
            catch (Exception e)
            {
            	click(byAddToQuoteButton);            		
            }          
            
            hardWait(15);
            click(byQuoteSaveButton);
            hardWait(15);
		  }
		
		catch(Exception e) {
			File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	Reporter.log("Reconfigure Model unsuccessful - Screenshot");
	    	FileUtil.copyFile(screenShot, new File("E:\\Selenium\\Workspace\\Ribbon\\Workspace\\ribbon\\resources\\reportng\\scr4.png"));
	    	Reporter.log("<a href="+"E:\\Selenium\\Workspace\\Ribbon\\Workspace\\ribbon\\resources\\reportng\\scr4.png"+">screenshot</a>");
	    	log.error("Reconfigure Model unsuccessful");
	    	e.printStackTrace();
			throw e;
		}
	}	
	
	
	@Test (priority = 5, description = "Reconfigure Model")
	public void testReconfigureModel() throws Exception {
		try {
			hardWait(5);
            WebElement scrolltoCurrency = driver.findElement(By.xpath("//label[@id='currency_t-label-ro|label']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrolltoCurrency);
            hardWait(6);
			
			highlightWebElement(byHighlightModelName);
            hardWait(3);
            click(bySelectModelName);
            hardWait(3);
            click(byReconfigureModel);
            hardWait(20);  
            click(byLocationGVPP);
            click(byChangeLocationGVPP);
            click(byMARMSPT);
            click(byChangeMARMSPT);
            click(byHDDQuantity);
            click(byChangeHDDQuantity);
            click(byConfigUpdateButton);
            hardWait(10);
            click(byConfigSaveButton);
            hardWait(15);
            click(byQuoteSaveButton);
            hardWait(15);
		  }
		
		catch(Exception e) {
			File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	Reporter.log("Reconfigure Model unsuccessful - Screenshot");
	    	FileUtil.copyFile(screenShot, new File("E:\\Selenium\\Workspace\\Ribbon\\Workspace\\ribbon\\resources\\reportng\\scr5.png"));
	    	Reporter.log("<a href="+"E:\\Selenium\\Workspace\\Ribbon\\Workspace\\ribbon\\resources\\reportng\\scr5.png"+">screenshot</a>");
	    	log.error("Reconfigure Model unsuccessful");
	    	e.printStackTrace();
			throw e;
		}
	}	
	
	@Test (priority = 6, description = "Discounting")
	public void testDiscounting() throws Exception {
		try {
			highlightWebElement(byQuoteDiscountingButton);
            hardWait(3);
            click(byQuoteDiscountingButton);
            hardWait(3);
            enterText(byAddlProductDiscount,byEnterAddlProductDiscount);
            hardWait(3);
            enterText(byAddlMaintenanceDiscount,byEnterAddlMaintenanceDiscount);
            hardWait(3);
            enterText(byAddlServicesDiscount,byEnterAddlServicesDiscount);
            hardWait(3);
            enterText(byOneTimeDiscount,byEnterOneTimeDiscount);
            hardWait(3);
            //click(byQuoteCalculateDiscountButton);
            //hardWait(3);
            click(byQuoteSaveButton);
            hardWait(15);
		  }
		
		catch(Exception e) {
			File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	Reporter.log("Discounting unsuccessful - Screenshot");
	    	FileUtil.copyFile(screenShot, new File("E:\\Selenium\\Workspace\\Ribbon\\Workspace\\ribbon\\resources\\reportng\\scr6.png"));
	    	Reporter.log("<a href="+"E:\\Selenium\\Workspace\\Ribbon\\Workspace\\ribbon\\resources\\reportng\\scr6.png"+">screenshot</a>");
	    	log.error("Discounting unsuccessful");
	    	e.printStackTrace();
			throw e;
		}
	}	
		@Test (priority = 7, description = "Generate Quote Documents")
		public void testQuoteDocumentGeneration() throws Exception {
			try {
				highlightWebElement(byQuoteProposalsButton);
				hardWait(4);
				click(byQuoteProposalsButton);		            
	            click(byQuoteProposalType);	            
	            click(bySelectQuoteProposalType);	                
	            click(byQuoteFileType);	            
	            click(bySelectPDFFileType);	                
	            
	            String parentHandle=driver.getWindowHandle();
	            System.out.println("Parent Window - "+parentHandle);
	            click(byGenerateProposalPDFButton);
	            hardWait(5);
	            Set<String> pdfwindowhandle=driver.getWindowHandles();
	            for (String pdfhandle:pdfwindowhandle) {
	            	System.out.println(pdfhandle);
	            	if(!pdfhandle.equals(parentHandle)) {
	            		driver.switchTo().window(pdfhandle);	            		
	            		hardWait(5);
	            		driver.close();
	            		hardWait(3);
	            	}
	            }
	            driver.switchTo().window(parentHandle);
	            hardWait(2);
	            
	           /* 
	            click(byQuoteFileType);	            
	            click(bySelectExcelFileType);
	            
	            String parentWindow=driver.getWindowHandle();
	            System.out.println("Parent Window - "+parentWindow);
	            click(byGenerateProposalExcelButton);
	            hardWait(5);
	            Set<String> excelwindowhandle=driver.getWindowHandles();
	            for (String excelhandle:excelwindowhandle) {
	            	System.out.println(excelhandle);
	            	if(!excelhandle.equals(parentWindow)) {
	                driver.switchTo().window(excelhandle);
	                hardWait(5);
            		driver.close();
            		hardWait(3);
	            	}
	            }
	            driver.switchTo().window(parentWindow);
	            hardWait(2);*/
	            click(byQuoteSaveButton);
	            hardWait(15);
				click(byQuoteOpportunityButton);
				hardWait(15);
			  }
			
			catch(Exception e) {
				File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    	Reporter.log("Quote Documents Generation unsuccessful - Screenshot");
		    	FileUtil.copyFile(screenShot, new File("E:\\Selenium\\Workspace\\Ribbon\\Workspace\\ribbon\\resources\\reportng\\scr7.png"));
		    	Reporter.log("<a href="+"E:\\Selenium\\Workspace\\Ribbon\\Workspace\\ribbon\\resources\\reportng\\scr7.png"+">screenshot</a>");
		    	log.error("Quote Documents Generation unsuccessful");
		    	e.printStackTrace();
				throw e;
			}
	} 
	
		@Test (priority = 8, description = "Start Sync & Stop Sync in SFDC")
		public void testStartandStopSync() throws Exception {
			try {
				hardWait(2);
				click(byClickOracleQuotes);							
				click(byClickOracleQuoteName);	
				highlightWebElement(byClickStartSyncButton);
				hardWait(3);
				click(byClickStartSyncButton);
				hardWait(12);	 
				
				// Switching to Alert        
		        Alert alert = driver.switchTo().alert();		
		        		
		        // Capturing alert message.    
		        String actualMessage= driver.switchTo().alert().getText();		
		        		
		        // Displaying alert message		
		        System.out.println("Start Sync Status: " +actualMessage);	
		        hardWait(4);
		        		
		        // Accepting alert		
		        alert.accept();	
		        
		        String expectedMessage= "Quote Sync in progress , please wait to complete the Sync process.";
		        
		        Assert.assertEquals(actualMessage, expectedMessage);
		        
		        Alert syncCompleted = driver.switchTo().alert();
		        String syncStatus= driver.switchTo().alert().getText();	
		        System.out.println("Start Sync Status: "+syncStatus);
		        hardWait(4);
		        syncCompleted.accept();
		        
			  }
			
			catch(Exception e) {
				File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    	Reporter.log("Start Sync & Stop Sync in SFDC unsuccessful - Screenshot");
		    	FileUtil.copyFile(screenShot, new File("E:\\Selenium\\Workspace\\Ribbon\\Workspace\\ribbon\\resources\\reportng\\scr8.png"));
		    	Reporter.log("<a href="+"E:\\Selenium\\Workspace\\Ribbon\\Workspace\\ribbon\\resources\\reportng\\scr8.png"+">screenshot</a>");
		    	log.error("Start Sync & Stop Sync in SFDC - unsuccessful");
		    	e.printStackTrace();
				throw e;
			}
	}
	
	@AfterClass
	public void testSignout() throws Exception {
		try {
			click(byClickOnProfile);
			hardWait(3);
			click(byClickLogout);			
			hardWait(4);
			closeCurrentBrowser();			
			} catch (Exception e) {
			log.error("Logout/SignOut un-successful");
			e.printStackTrace();
			throw e;
		}
	}
}
