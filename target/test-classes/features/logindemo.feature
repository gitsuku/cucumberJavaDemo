
Feature: test login function

  @tag1
  Scenario: check login is success
    Given browser is open
    And user is in login page
    When user enter credentials
    Then user navigate to home page
    
 