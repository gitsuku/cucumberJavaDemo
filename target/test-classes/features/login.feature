Feature: test login functionality
  Scenario: check login is success
    Given user is loginpage
    When user enter username and password
    And user clicks on login button
    Then user is navigated to homepage


