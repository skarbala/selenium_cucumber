Feature: Banana shop
  As a user I would like to get information about price of bananas

  Scenario: Check banana price
    Given I am on banana shop page
    And price for one banana is 1.5 €
    And I have chosen 1 banana
    Then values in table are following
      | total price          | 1.5  |
      | number of bananas    | 1    |
      | discount             | 0.00 |
      | price for one banana | 1.5  |