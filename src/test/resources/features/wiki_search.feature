Feature: Wikipedia Search Functionality and verifications

  Background:
    Given User is on Wikipedia home page

  Scenario: Wikipedia Search Functionality Title Verification
    #Given User is on Wikipedia home page
    When User types Steve Jobs in the wiki search box
    And User clicks wiki search button
    Then User sees Steve Jobs is in the wiki title

@smoke
  Scenario: Wikipedia Search Functionality Title Verification
    #Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title

  Scenario Outline: Wikipedia Search Functionality Title Verification with using DDT
     #Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title

    Examples:
      | searchValue       | expectedTitle     |
      | Steve Jobs        | Steve Jobs        |
      | Bill Gates        | Bill Gates        |
      | Cristiano Ronaldo | Cristiano Ronaldo |
      | Elon Musk         | Elon Musk         |
      | Albert Einstein   | Albert Einstein   |
      | Chuck Norris      | Chuck Norris      |
      | Alisher Usmanov   | Alisher Usmanov   |


