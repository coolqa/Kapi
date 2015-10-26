package com.tests.util;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class BaseUtils {
	//Base imports for all tests.
	public WebDriver _driver;
	//Logging utility.
	public static final Logger 
		LOG = Logger.getLogger(BaseUtils.class);
}
