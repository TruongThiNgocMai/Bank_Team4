
Feature: Customer Withdrawl

  Background:
    Given Open website http://www.way2automation.com/angularjs-protractor/banking/#/customer
    When I login successfully with username as Harry Potter
    When I verify user input Deposit successful with 2000

  Scenario Outline: Customer withdrawl Successfully
    When I open withdrawl tab
    When I type withdrawl as <withdrawl>
    And  I click withdrawl submit button
    Then I verify amount input of Withdrawl successfully
    Then I click Transaction to navigate to Transaction Tab
    Then I verify that customer input withdrawl successfully as <withdrawl>

    Examples:
      | withdrawl |
      | 1000     |

      Scenario Outline: Customer withdrawl Successfully
          When I open withdrawl tab
          When I type withdrawl as <withdrawl>
          And  I click withdrawl submit button
          Then I verify amount input of Withdrawl unsuccessfully
          Then I click Transaction to navigate to Transaction Tab

          Examples:
            | withdrawl |
            | 5000     |


