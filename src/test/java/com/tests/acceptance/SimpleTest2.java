package com.tests.acceptance;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.page.objects.SimpleTest2PageObjects;
import com.tests.util.*;

public class SimpleTest2 extends BaseUtils {
    Properties Loginproperties = new Properties();
    InputStream inputLogin = null;
    
    @BeforeTest
    public void startUp() {
    	_driver = new FirefoxDriver();
    }
    @Test
    public void wikipediaCheck() throws IOException {
    	//PageFactory test definitions
      	SimpleTest2PageObjects st2po = PageFactory.initElements(_driver, SimpleTest2PageObjects.class);
    	propertiesLogin();
    	_driver.navigate().to(Loginproperties.getProperty("ddg"));
        checkHeader();
        st2po.clickSearchField();
        st2po.clickSearchFieldSendKeys.sendKeys(Loginproperties.getProperty("search"));
        st2po.clickSearchFieldButton();
        st2po.clickWikipediaResultLink();
    		WebElement browsertitle = _driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[4]/form/label"));
    			String text = browsertitle.getText();
    			String tagName = browsertitle.getTagName();
    			LOG.info(text);
    			LOG.info(tagName);
        st2po.clickFinalLink();
        assertThat(text, containsString("Find Wikipedia in a language:"));
		assertThat(tagName, containsString("label"));
    }
    @AfterTest
    public void tearDown() {
    	_driver.close();
    }
    public void checkHeader() {
		String Text = _driver.getTitle();
		Assert.assertEquals(Text, "DuckDuckGo");
	}
    public void propertiesLogin() throws IOException {
    	inputLogin = new FileInputStream("./src/main/resources/testdata_login.properties");
    	Loginproperties.load(inputLogin);
    }
}