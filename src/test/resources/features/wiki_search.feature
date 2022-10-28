Feature: Wikipedia Search Functionality and verifications


  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types Steve Jobs in the wiki search box
    And User clicks wiki search button
    Then User sees Steve Jobs is in the wiki title


  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title


   Scenario Outline: Wikipedia Search Functionality Title Verification with using DDT
     Given User is on Wikipedia home page
     When User types "Steve Jobs" in the wiki search box
     And User clicks wiki search button
     Then User sees "Steve Jobs" is in the wiki title

     Examples:

