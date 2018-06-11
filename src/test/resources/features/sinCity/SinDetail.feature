Feature: Check detail of new sin
  As a sinner
  I want to check detail of my sin

  Background: I am on Sin City page
    Given I open Sin City page

  Scenario: Confess new valid Sin without tags
    And I confess a valid sin without tags
    When I open sin detail
    Then the information are correct