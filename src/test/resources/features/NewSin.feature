Feature: Confess new sin
  As a sinner
  I want to confess a sin
  So that I	have a clear conscience

  Background: I am on Sin City page
    Given I open Sin City page

  Scenario: Confess new valid Sin without tags
    And I enter sin title pocuvam one direction and sin author brano
    And I enter sin message
    When I confess my sin
    Then my sin appears in the list of all sins

  Scenario: Confess new valid Sin without tags
    And I enter sin title
    And I enter sin message
    When I confess my sin
    Then my sin appears in the list of all sins

  Scenario: Confess new valid Sin with tags
    And I enter sin title
    And I enter sin author
    And I enter sin message
    And I select following sins
      | murder | robbery | car accident |

#    When I confess my sin
#    Then my sin appears in the list of all sins
