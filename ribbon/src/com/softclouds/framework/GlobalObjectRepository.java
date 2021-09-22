package com.softclouds.framework;

import org.openqa.selenium.By;

//com.caf.Ribbon.framework - Contains the Base Framework around which the RibbonTesting project is build.
//Hierarchy of Classes in the com.caf.macu.framework is as follows(Class to the right inherits/extends the class to the left):
//GlobalVariable >> GlobalObjectRepository >> ReUsableMethods >> SeleniumWrapper >> LoudSightWrapper >> BaseClass

public class GlobalObjectRepository extends GlobalVariables {

//----------RIBBON-------------------	
	
//	Login Page
	public static By byUserIDTextFieldID       = By.id("username");
	public static By byPasswordTextFieldID     = By.id("password");
	public static By bySignInButtonID          = By.id("Login");
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
