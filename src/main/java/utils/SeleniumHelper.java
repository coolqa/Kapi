package utils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class SeleniumHelper {
    public static boolean isElementPresent(WebElement webElement) {
        boolean isPresent = webElement.isDisplayed();
        try {
            return isPresent;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
