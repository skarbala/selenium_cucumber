@banana
Feature: Banana shop
  As a user I would like to get information about price of bananas

  @smoke
  Scenario: Check banana price
    Given I am on banana shop page
    And price for one banana is 1.5 €
    And I have chosen 1 banana
    Then values in table are following
      | total_price          | 1.5  |
      | number_of_bananas    | 1    |
      | discount             | 0.00 |
      | price_for_one_banana | 1.5  |