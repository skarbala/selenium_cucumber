Feature: Optimus Prime
  As the Optimus
  I want to tell you if the number is prime or not

  Scenario Outline: Check the number <number>
    Given I am on the Optimus prime page
    When  I enter number <number>
    And I ask Optimus if it is prime
    Then Optimus says that the number is <expectedResult>

    Examples:
      | number | expectedResult |
      | 1      | prime          |
      | 5      | prime          |
      | 6      | not prime      |
      | 47     | prime          |
      | 100    | not prime      |