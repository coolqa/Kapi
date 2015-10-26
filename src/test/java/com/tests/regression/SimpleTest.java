package com.tests.regression;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleTest {

    private Logger logger = LoggerFactory.getLogger(getClass());
    private WebDriver driver;

    @BeforeTest
    public void startUp() {
        driver = new FirefoxDriver();
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }
    @Test
    public void runSimpleTest() {
        driver.navigate().to("http://google.com");
        WebElement element = driver.findElement(By.xpath("//a[contains(.,' ')]"));
        String text = element.getText();
        String tagName = element.getTagName();
        String href = element.getAttribute("href");

        logger.info("text: {}", text);
        logger.info("tagName: {}", tagName);
        logger.info("href: {}", href);

        assertThat(text, containsString(" "));
        assertThat(tagName, containsString("a"));
        assertThat(href, containsString("http://google.com"));
    }
}
