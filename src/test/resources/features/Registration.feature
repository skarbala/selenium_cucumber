Feature: Registration

  Scenario: Registration with invalid password
    Given I am on the registration page
    And I enter email dionyz@gmail.mn
    And I enter name dionyz
    And I enter surname trnka

    When I enter and repeat invalid password
    And I check robot checkbox
    And I click on registration button

    Then the registration fails