package com.tests.acceptance;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.tests.util.*;
public class SimpleTest extends BaseUtils {
    private WebDriver driver;

    @BeforeTest
    public void startUp() {
        driver = new FirefoxDriver();
    }
    @Test
    public void runSimpleTest() {
        driver.navigate().to("https://duckduckgo.com/");
        WebElement element = driver.findElement(By.xpath("//a[contains(.,'Learn')]"));
        String text = element.getText();
        String tagName = element.getTagName();
        String href = element.getAttribute("href");
        	LOG.info(text);
        	LOG.info(tagName);
        	LOG.info(href);
        assertThat(text, containsString("Learn More"));
        assertThat(tagName, containsString("a"));
        assertThat(href, containsString("https://duckduckgo.com/"));
    }
    @AfterTest
    public void tearDown() {
        driver.close();
    }
}