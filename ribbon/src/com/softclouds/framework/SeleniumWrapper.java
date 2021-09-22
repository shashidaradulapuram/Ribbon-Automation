package com.softclouds.framework;

import java.io.File;
import java.util.HashMap;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

///com.ribbon.framework - Contains the Base Framework around which the RibbonTesting project is build.
//Hierarchy of Classes in the com.ribbon.framework is as follows(Class to the right inherits/extends the class to the left):
//GlobalVariable >> GlobalObjectRepository >> ReUsableMethods >> SeleniumWrapper >> LoudSightWrapper >> BaseClass

// This class contains all the UI related actions performed using selenium
// wrapped in a custom method.
public class SeleniumWrapper extends ReUsableMethods {


	public static String captureScreen() throws Exception {
		TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		String dest ="user.dir"+".png";
		File target = new File(dest);
		FileUtils.copyFile(src, target);
		return dest;
	}
	public static void click(By by) throws Exception {
		hardWait(5);
		//Wait(5);
		click(getWebElement(by));
	}

	public static void click(String locator) throws Exception {
		click(getWebElement(locator));
		
	}

	//This method Clicks on the WebElement
	public static void click(WebElement webElement) throws Exception {
		try {
			waitTillVisible(webElement).click();
			log.info("Clicking on :{}", webElement );
		} catch(ElementClickInterceptedException elementClickInterceptedException) {
			int attempts = 0;
			while(attempts < WEBDRIVER_WAIT_TIME) {
				try {
					hardWait(5);
					wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
				}catch(ElementClickInterceptedException e) {
				}
				attempts++;
			}
			log.debug("Handled ElementClickInterceptedException and Clicked on :{}" , webElement);
		} catch(StaleElementReferenceException staleElementException) {
			int attempts = 0;
			while(attempts < WEBDRIVER_WAIT_TIME) {
				try {
					hardWait(5);
					wait.until(ExpectedConditions.visibilityOf(webElement)).click();
					hardWait(6);
				}catch(ElementClickInterceptedException e) {
				}
				attempts++;
			}
			log.debug("Handled the StaleElementException and Clicked on :{}" , webElement);
		} catch(WebDriverException e) {
			int attempts = 0;
			while(attempts < WEBDRIVER_WAIT_TIME) {
				try {
					hardWait(5);
					wait.until(ExpectedConditions.visibilityOf(webElement)).click();
					hardWait(6);
				}catch(WebDriverException e1) {
				}
				attempts++;
			}
			log.debug("Handled the WebDriverException and Clicked on :{}" , webElement);
		} catch (Exception e) {
			log.error(e);
			throw e;
		}
	}


	public static void closeAllBrowser() {
		driver.quit();
		log.info("Closing all Browsers");
	}
	
	public static void closeCurrentBrowser() {
		driver.close();
		log.info("Closing the current Browser");
	}

	public static void enterText(By by ,String text) throws Exception {
		hardWait(6);
		enterText(getWebElement(by), text);
	}		
	public static void enterText(String locator,String text) throws Exception {
		enterText(getWebElement(locator), text);
	}

	public static void enterText(WebElement webElement, String text) throws Exception {
		try {
			waitTillVisible(webElement).clear();
			webElement.sendKeys(text);
			log.info("Entering Text :{} in WebElement :{}", text, webElement);
		} catch (StaleElementReferenceException staleElementException) {
			hardWait(6);
			wait.until(ExpectedConditions.visibilityOf(webElement)).sendKeys(text);
			log.info("Handled StaleElement Exception, Entering Text :{} in WebElement :{}", text, webElement);
		} catch (Exception e) {
			log.error(e);
			throw e;
		}
	}
	

	public static void compare(WebElement webElement ,WebElement webElement2) throws Exception {
		hardWait(6);
		compare(getWebElement(webElement2), getWebElement(webElement2));
	}		
	public static void compare(String locator,String locator1) throws Exception {
		compare(getWebElement(locator1), getWebElement(locator1));
	}

	public static void compare(WebElement webElement, String text) throws Exception {
		try {
			waitTillVisible(webElement).clear();
			webElement.sendKeys(text);
			log.info("Compare Text :{} in WebElement :{}", text, webElement);
		} catch (StaleElementReferenceException staleElementException) {
			hardWait(6);
			wait.until(ExpectedConditions.visibilityOf(webElement)).sendKeys(text);
			log.info("Handled StaleElement Exception, Entering Text :{} in WebElement :{}", text, webElement);
		} catch (Exception e) {
			log.error(e);
			throw e;
		}
	}

	//This method is used to enter the url in the browser
	public static void enterURL(String url) {
		try {
			driver.navigate().to(url);
			log.info("Entering url :{}" , url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//This method is used to fetch the default Chrome profile
	public static ChromeOptions getChromeBrowserProfile() {
		ChromeOptions chromeOptions = new ChromeOptions();
		
		HashMap<String, Object> prefs=new HashMap<>();
		prefs.put("plugins.always_open_pdf_externally", true);
		//prefs.put("download.default_directory", "E:\\Selenium\\Workspace\\Ribbon\\Workspace\\ribbon\\resources\\PDF_Downloads");
		chromeOptions.addArguments("chrome.switches", "--disable-extensions");
		chromeOptions.addArguments("--start-maximized");
		chromeOptions.addArguments("--disable-save-password");
		chromeOptions.setExperimentalOption("prefs", prefs);		
		chromeOptions.addArguments("disable-infobars");
		chromeOptions.addArguments("--disable-notifications");
		chromeOptions.addArguments("disable-popup-blocking");
		//chromeOptions.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		return chromeOptions;
	}

	public static ChromeOptions getChromeBrowserProfile(String profilePath) {
		ChromeOptions chromeOptions = new ChromeOptions();
		// chromeProfile.addArguments("chrome.switches","--disable-extensions");
		chromeOptions.addArguments("user-data-dir=" + profilePath);
		chromeOptions.addArguments("--start-maximized");
		chromeOptions.addArguments("disable-infobars");
		chromeOptions.addArguments("--disable-save-password");
		chromeOptions.addArguments("disable-popup-blocking");
		return chromeOptions;
	}
 
	//This method is used to get the current browser URL
	public static String getCurrentURL() {
			log.info("Getting Current WebPage URL :{}" , driver.getCurrentUrl());
			return driver.getCurrentUrl();
	}

	//This method is used to fetch the User Firefox profile
	public static FirefoxProfile getFirefoxBrowserProfile(String firefoxProfilePath) {
		FirefoxProfile firefoxProfile = new FirefoxProfile(new File(firefoxProfilePath));
		return firefoxProfile;
	}

	public static By getByLocator(String locator) throws Exception {

		//Splitting locator to extract the Locator_type and Locator_Value 
		String locatorType  = locator.split(":",2)[0]; //Example: locator = id:ABC, then locatorType = id
		String locatorValue = locator.split(":",2)[1]; //Example: locator = id:ABC, then locatorValue = ABC
		
		By by;

		locatorType = locatorType.toLowerCase();
		switch (locatorType) {
		case "id":
			by = By.id(locatorValue);
			break;

		case "name":
			by = By.name(locatorValue);
			break;

		case "classname":
			by = By.className(locatorValue);
			break;

		case "tagname":
			by = By.tagName(locatorValue);
			break;

		case "linktext":
			by = By.linkText(locatorValue);
			break;

		case "partiallinktext":
			by = By.partialLinkText(locatorValue);
			break;

		case "cssselector":
			by = By.cssSelector(locatorValue);
			break;

		case "xpath":
			by = By.xpath(locatorValue);
			break;

		default:
			by = null;
			log.error("Unknown Locator type: {} " , locatorType);
		}
		return by;
	}



	public static String getPageTitle() {
		return driver.getTitle();
	}
	public static String getTextOfWebelement(By by) throws Exception {
		return getTextOfWebelement(getWebElement(by));
	}
	public static String getTextOfWebelement(String locator) throws Exception {
		return getTextOfWebelement(getWebElement(locator));
	}
	public static String getTextOfWebelement(WebElement webElement) throws Exception {
		try {
			return webElement.getText();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static String getValueFromPropertiesFile(Properties propertiesFile, String Key) {
		return propertiesFile.getProperty(Key);
	}
	
	public static int toInt(String s) {
	    return Integer.parseInt(s);
	}
	 
	public static Integer toInteger(String s) {
	    return Integer.valueOf(s);
	}

	public static WebElement getWebElement(By locator) throws Exception {
		WebElement webElement;
		try {
			webElement = driver.findElement(locator);
		} catch (StaleElementReferenceException e) {
			hardWait(5);
			webElement = driver.findElement(locator);
			System.err.println("stale element handled");
		}
		
		return getWebElement(webElement);
	}
	
		
	public static WebElement getWebElement(String locator) throws Exception {
			return getWebElement(getByLocator(locator));
	}
	
	public static WebElement getWebElement(WebElement webElement) throws Exception {
		try {
			wait.until(ExpectedConditions.visibilityOf(webElement));
			return wait.until(ExpectedConditions.elementToBeClickable(webElement));
		} catch (StaleElementReferenceException e) {
			hardWait(6);
			System.err.println("stale element handled");
			return wait.until(ExpectedConditions.elementToBeClickable(webElement));
			
		} catch (Exception e) {
			log.error(e);
			throw e;
		}
	}


	
	
	public static void hardWait(int seconds) {
		try {
			Thread.sleep(1000*seconds);
		} catch (InterruptedException e) {
			log.error(e);
		}
	}

	

	/*public static void hardWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}*/
		
	public static void highlightWebElement(By by) throws InterruptedException {
		try {
			highlightWebElement(getWebElement(by));
		} catch (Exception e) {
			log.error(e);
		}
	}

	public static void highlightWebElement(String locator) throws InterruptedException {
		try {
			highlightWebElement(getWebElement(locator));
		} catch (Exception e) {
			log.error(e);
		}
	}

	public static void highlightWebElement(WebElement element) throws InterruptedException {
		for (int i = 0; i < 6; i++) {
			jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"color: orange; border: 3px solid orange;");
			Thread.sleep(125);
			jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"color: pink; border: 4px solid pink;");
			Thread.sleep(125);
			jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,"color: yellow; border: 4px solid yellow;");
			Thread.sleep(125);
			jse.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
		}
	}



	
	
	public static void moveToThenClick(By by) throws Exception {
		try {
			moveToThenClick(getWebElement(by));
		} catch (Exception e) {
			log.error(e);
			throw e;
		}
	}

	public static void moveToThenClick(String locator) throws Exception {
		try {
			moveToThenClick(getWebElement(locator));
		} catch (Exception e) {
			log.error(e);
			throw e;
		}
	}

	public static void moveToThenClick(WebElement webElement) throws Exception {
		try {
			actions.moveToElement(webElement).perform();
			webElement.click();
		} catch (Exception e) {
			log.error(e);
			throw e;
		}
	}

	public static void openBrowser() throws Exception {
		openBrowser(BROWSER);
	}
	
	public static void openBrowser(Browsers browserName) throws Exception {
		openBrowser(browserName.toString());
	}
	
	private static void openBrowser(String browserName) throws Exception {
		try {
			browserName = browserName.toLowerCase();
			switch (browserName) {

			case "chrome": {
				System.setProperty("webdriver.chrome.driver", WEBDRIVER_EXECUTABLES_PATH +"chromedriver.exe");
			    driver = new ChromeDriver(getChromeBrowserProfile());
				log.info("Opening {} browser.", browserName);
			    break;
			}
				
			case "firefox": {
				System.setProperty("webdriver.gecko.driver", WEBDRIVER_EXECUTABLES_PATH +"geckodriver.exe");
				System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
				driver = new FirefoxDriver();
				log.info("Opening {} browser.", browserName);
				break; 
			}
			
			
			default:
				log.error("Pass a proper name for the Browser i.e. Chrome, firefox, IE");
				System.exit(0);
			}
			actions	= new Actions(driver); //Initialisied Actions
			jse 	= (JavascriptExecutor) driver;//Initialisied JavaScriptExecutor 
			wait 	= new WebDriverWait(driver, WEBDRIVER_WAIT_TIME);
		} catch (Exception e) {
			log.error(e);
			throw e;
		}
	}
	public static void scrollToWebElement(By by) throws Exception {
		try {
			scrollToWebElement(getWebElement(by));
		} catch (Exception e) {
			log.error(e);
			throw e;
		}
	}

	public static void scrollToWebElement(String locator) throws Exception {
		try {
			scrollToWebElement(getWebElement(locator));
		} catch (Exception e) {
			log.error(e);
			throw e;
		}
	}

	public static void scrollToWebElement(WebElement we) {
		try {
			jse.executeScript("arguments[0].scrollIntoView();", we);
		} catch (Exception e) {
			log.error(e);
		}
	}


	public static WebElement waitTillClickable(By by) throws Exception {
		return waitTillClickable(getWebElement(by));
	}

	public static WebElement waitTillClickable(By by, int waitTime) throws Exception {
		return waitTillClickable(getWebElement(by) , waitTime );
	}

	public static WebElement waitTillClickable(String locator) throws Exception {
		return waitTillClickable(getWebElement(locator));
	}

	public static WebElement waitTillClickable(String locator, int waitTime) throws Exception {
		return waitTillClickable(getWebElement(locator) , waitTime );
	}
	
	public static WebElement waitTillClickable(WebElement webElement) throws Exception {
		try {
			return wait.until(ExpectedConditions.elementToBeClickable(webElement));
		} catch (NoSuchElementException e) {
			log.error(e);
			throw e;
		}
	}
	
	public static WebElement waitTillClickable(WebElement webElement , int waitTime) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver, waitTime);
			return wait.until(ExpectedConditions.elementToBeClickable(webElement));
		} catch (NoSuchElementException e) {
			log.error(e);
			throw e;
		}
	}

	
	public static Boolean waitTillInvisibility(By by) throws Exception {
		return waitTillInvisibility(getWebElement(by));
	}
	
	public static Boolean waitTillInvisibility(By by , int waitTime) throws Exception {
		return waitTillInvisibility(getWebElement(by) , waitTime);
	}
	
	public static Boolean waitTillInvisibility(String locator) throws Exception {
		return waitTillInvisibility(getWebElement(locator));
	}
	
	public static Boolean waitTillInvisibility(String locator , int waitTime) throws Exception {
		return waitTillInvisibility(getWebElement(locator));
	}
	
	public static Boolean waitTillInvisibility(WebElement webElement) throws Exception {
		try {
			return wait.until(ExpectedConditions.invisibilityOf(webElement));
		} catch (Exception e) {
			log.error(e);
			throw e;
		}
	}
	
	public static Boolean waitTillInvisibility(WebElement webElement , int waitTime) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver, waitTime);
			return wait.until(ExpectedConditions.invisibilityOf(webElement));
		} catch (Exception e) {
			log.error(e);
			throw e;
		}
	}
	
	public static WebElement waitTillPresent(By by) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, WEBDRIVER_WAIT_TIME);
			return wait.until(ExpectedConditions.presenceOfElementLocated(by));
		} catch (NoSuchElementException e) {
			log.error(e);
			throw e;
		}
	}
	
	public static WebElement waitTillPresent(By by , int waitTime) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, waitTime);
			return wait.until(ExpectedConditions.presenceOfElementLocated(by));
		} catch (NoSuchElementException e) {
			log.error(e);
			throw e;
		}
	}
	
	public static WebElement waitTillPresent(String locator) throws Exception {
		return waitTillPresent(getByLocator(locator));
	}
	
	public static WebElement waitTillPresent(String locator, int waitTime) throws Exception {
		return waitTillPresent(getByLocator(locator) , waitTime);
	}
	
	public static boolean waitTillTextIsPresentInWebElement(By by , String text) throws Exception {
		return waitTillTextIsPresentInWebElement(getWebElement(by), text);
	}
	
	public static boolean waitTillTextIsPresentInWebElement(By by , String text , int waitTime) throws Exception {
		return waitTillTextIsPresentInWebElement(getWebElement(by), text , waitTime);
	}
	
	public static boolean waitTillTextIsPresentInWebElement(String locator , String text) throws Exception {
		return waitTillTextIsPresentInWebElement(getWebElement(locator), text);
	}
	
	public static boolean waitTillTextIsPresentInWebElement(String locator , String text , int waitTime) throws Exception {
		return waitTillTextIsPresentInWebElement(getWebElement(locator), text, waitTime);
	}
	
	public static boolean waitTillTextIsPresentInWebElement(WebElement webElement , String text) {
		try {
			return wait.until(ExpectedConditions.textToBePresentInElement(webElement, text));
		} catch (Exception e) {
			log.error(e);
			throw e;
		}
	}
	
	public static boolean waitTillTextIsPresentInWebElement(WebElement webElement , String text , int waitTime) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver, waitTime);
			return wait.until(ExpectedConditions.textToBePresentInElement(webElement, text));
		} catch (Exception e) {
			log.error(e);
			throw e;
		}
	}
	
	public static WebElement waitTillVisible(By by) throws Exception {
		return waitTillVisible(getWebElement(by));
	}
	
	public static WebElement waitTillVisible(By by, int waitTime) throws Exception {
		return waitTillVisible(getWebElement(by), waitTime);
	}

	public static WebElement waitTillVisible(String locator) throws Exception {
		return waitTillVisible(getWebElement(locator));
	}

	public static WebElement waitTillVisible(String locator , int waitTime) throws Exception {
		return waitTillVisible(getWebElement(locator), waitTime);
	}
	
	public static WebElement waitTillVisible(WebElement webElement) throws Exception {
		try {
			return wait.until(ExpectedConditions.visibilityOf(webElement));
		} catch (Exception e) {
			log.error(e);
			throw e;
		}
	}
	
	public static WebElement waitTillVisible(WebElement webElement, int waitTime) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver, waitTime);
			return wait.until(ExpectedConditions.visibilityOf(webElement));
		} catch (Exception e) {
			log.error(e);
			throw e;
		}
	}
	
	public static void waitTillVisibleEnabledClickable(WebElement webElement) throws Exception {
		try {
			waitTillVisible(webElement);
			} catch (Exception e) {
			log.error(e);
			throw e;
		}
	 }
	
	public static void waitTillVisibleEnabledClickable(String locator) throws Exception {
			waitTillVisibleEnabledClickable(getWebElement(locator));
	}
	
	public static Boolean waitTillWebELementAttributeContains(By by, String attributeName,String attributeValue) {
		return wait.until(ExpectedConditions.attributeContains(by, attributeName, attributeValue));
	}
	
	public static boolean waitTillWebPageTitleContains(String webPageTitle) throws Exception {
		try {
			return wait.until(ExpectedConditions.titleContains(webPageTitle));
		} catch (Exception e) {
			log.error(e);
			throw e;
		}
	}
	
}