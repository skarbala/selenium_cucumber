Feature: Registration
  Scenario: Registration with invalid password
    Given I am on the registration page
    And I enter valid email
    And I enter name
    And I enter surname
    But I enter password '1234'
    And I check robot checkbox

    When I click on registration button

    Then the registration fails