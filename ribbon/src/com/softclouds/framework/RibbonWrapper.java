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
				
				/*File file =    new File("D:\\macu\\MACU_POC\\resources\\config\\test_execution\\Test.xlsx");
				FileInputStream f = new FileInputStream(file);
				XSSFWorkbook rwb=new XSSFWorkbook(f);
				
                Sheet sheet=rwb.getSheet("Sheet1");
                int nor=sheet.getPhysicalNumberOfRows();
                int noc=sheet.getRow(0).getLastCellNum();
                System.out.println("value = "+nor);
                SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
                Date dt=new Date();
                String dateandtime=sf.format(dt);
                Cell rcw=sheet.getRow(0).createCell(3);
                rcw.setCellValue(dateandtime);
                int cv=1;
                for(int r=1;r<nor;r++)
                {
                	 DataFormatter df=new DataFormatter();
                     String username=df.formatCellValue(sheet.getRow(r).getCell(cv));
                     enterText(byUserIDTextField, username);
                     cv++;
     				 String password=df.formatCellValue(sheet.getRow(r).getCell(cv));
     				 enterText(byPasswordTextField, password);
     				 //click(bySignInButton);
     				 cv++;
     			 	 Cell c=sheet.getRow(r).createCell(cv);
     				 c.setCellValue("Test Passed"+cv);
     				 cv--;
     				 cv--;
                }
               
				//Save and close excel file
				sheet.autoSizeColumn(nor); //auto fit on column size
				FileOutputStream fo=new FileOutputStream(file);
				rwb.write(fo); //save changes
				rwb.close();
				fo.close();
				f.close();*/
				
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
