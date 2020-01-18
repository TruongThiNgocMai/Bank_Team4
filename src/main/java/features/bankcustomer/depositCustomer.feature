Feature: Customer Deposit

  Background:
    Given Open website http://www.way2automation.com/angularjs-protractor/banking/#/customer
    When I login successfully with username as Harry Potter

Scenario Outline: Customer Deposit unSuccessfully
   When I click deposit tab
    And I type the deposit as <deposit>
  And I click deposit submit button
   Then I verify amount input of Deposit
    Then I navigate to Transaction Tab
   Then I verify that customer deposit unsuccessfully as <deposit>

   Examples:
      | deposit |
     |         |

  Scenario Outline: Customer Deposit Successfully when the input valid
    When I click deposit tab
    And I type the deposit as <deposit>
    And I click deposit submit button
    Then I verify amount input of Deposit
    Then I navigate to Transaction Tab
    Then I verify that customer deposit successfully as <deposit>

    Examples:
      | deposit |
      | 2000    |
      | 1000    |
