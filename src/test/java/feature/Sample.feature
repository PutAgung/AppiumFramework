@smoke
Feature: Sample Feature

  @positive
  Scenario Outline: Verify login with valid credentials
    Given the app is open
    When I enter username "<username>" and password "<password>"
    Then I should be logged in successfully

    Examples:
      | username | password  |
      | user1    | pass123   |
      | user2    | pass456   |
