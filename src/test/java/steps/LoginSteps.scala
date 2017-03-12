package steps

import cucumber.api.java.en.{And, Given, Then, When}
import pages.actions.LandingPageActions

class LoginSteps {

  private var pageActions: LandingPageActions = _

  pageActions = new LandingPageActions

  @Given("^I am on DuckDuckGo landing page$")
  @throws[Throwable]
  def I_am_on_login_page() {
    pageActions.openSearchProvider()
  }

  @And("^I enter Wikipedia$")
  @throws[Throwable]
  def I_type_some_text() {
    pageActions.typeSomeText()
  }

  @When("^I click the button and the search should happen$")
  @throws[Throwable]
  def I_click_the_search_button() {
    pageActions.clickSearchButton()
  }

  @Then("^I should be directed to the Search$")
  @throws[Throwable]
  def I_am_redirected_to_search() {
    pageActions.clickSearchButton()
  }
}
