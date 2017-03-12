package actions

import cucumber.api.java.After
import utils.SeleniumDriver

class AfterActions {

    @After
    void tearDown() {
        SeleniumDriver.tearDown()
    }
}
