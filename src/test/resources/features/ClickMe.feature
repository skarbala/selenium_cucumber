Feature: Click me baby
  As a user
  I want to click a button
  For no reason at all, only for study purpose

  Scenario: Click on button once
    Given I am on click me baby page
    When  I click 1 time on a button
    Then  description is klik

  Scenario: Click on button two times
    Given I am on click me baby page
    When  I click 2 times on a button
    Then  description is kliky

  Scenario: Click on button five times
    Given I am on click me baby page
    When  I click 5 times on a button
    Then  description is klikov

  Scenario: Click on button hundred times
    Given I am on click me baby page
    When  I click 50 times on a button
    Then  description is klikov