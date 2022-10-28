Feature: User should be able to login with valid credentials

  @webtableApp
  Scenario: Login scenario with 1 param
    Given user is on the login page of web table app
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks to login button
    Then user should see url contains orders



