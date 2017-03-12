package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.objects.LandingPageObjects;
import utils.SeleniumDriver;
import utils.SeleniumHelper;

public class LandingPageActions {
    private LandingPageObjects lp_objects;

    public LandingPageActions() {
        lp_objects = new LandingPageObjects();
        PageFactory.initElements(SeleniumDriver.getDriver(), lp_objects);
    }

    public void openSearchProvider() {
        SeleniumDriver.openPage("https://duckduckgo.com");
    }

    public void typeSomeText() {
        lp_objects.textBox.click();
        lp_objects.textBox.sendKeys("Wikipedia");
    }

    public boolean clickSearchButton() {
        return SeleniumHelper.isElementPresent(lp_objects.searchButton);
    }
}
