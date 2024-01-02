Feature: Calculator Operations
  As a user
  I want to perform basic calculations
  So that I can quickly get the results

  Scenario: Add two numbers
    Given the calculator is turned on
    When I add 5 and 7
    Then the result should be 12

  Scenario: Subtract two numbers
    Given the calculator is turned on
    When I subtract 8 from 15
    Then the result should be 7

  Scenario: Multiply two numbers
    Given the calculator is turned on
    When I multiply 4 by 6
    Then the result should be 24

  Scenario: Divide two numbers
    Given the calculator is turned on
    When I divide 10 by 2
    Then the result should be 5
