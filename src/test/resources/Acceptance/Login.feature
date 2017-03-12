@acceptance_tests
Feature: Search for Wikipedia in DuckDuckGo

  To Search for something online
  Users needs to enter a parameter and click the button

  Scenario: Successfully search for Wikipedia
    Given I am on DuckDuckGo landing page
    And   I enter Wikipedia
    When  I click the button and the search should happen
    Then  I should be directed to the Search