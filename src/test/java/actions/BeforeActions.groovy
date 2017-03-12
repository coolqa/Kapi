package actions

import cucumber.api.java.Before
import utils.SeleniumDriver

class BeforeActions {

    @Before
    void setUp() {
        SeleniumDriver.setUpDriver()
    }
}
