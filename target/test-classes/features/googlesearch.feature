Feature: feature to test google
  Scenario: validate google search
    Given browser is open
    And user is on google search box
    When user enter a text
    And hits enter
    Then user should get results
   

