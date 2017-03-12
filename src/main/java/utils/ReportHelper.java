package utils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

class ReportHelper {
    private Scenario scenario;
    private static ReportHelper reportHelper;

    public ReportHelper() {
    }

    private ReportHelper(Scenario scenario) {
        this.scenario = scenario;
    }

    private static byte[] getScreenshot() {
        byte[] screenshot = null;
        try {
            screenshot = ((TakesScreenshot) SeleniumDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
        return screenshot;
    }

    @Before(order = 0)
    public void initReporter(Scenario scenario) {
        if (reportHelper == null)
            reportHelper = new ReportHelper(scenario);
    }

    @After(order = 99999)
    public void closeReporter() {
        if (reportHelper.scenario.isFailed()) {
            try {
                reportHelper.scenario.embed(getScreenshot(), "image/png");
            } catch (Exception e) {
                System.err.println();
            }
        }
        reportHelper = null;
    }
}
