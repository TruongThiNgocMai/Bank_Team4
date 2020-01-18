Feature: Delete Customer

  Background:
    Given Open website https://www.way2automation.com/angularjs-protractor/banking/#/manager/list

  Scenario Outline: Delete Customer
    When I delete customer with <firstName> as <lastName> as <postCode>
    Then I verify delete customer successfully

    Examples:
      | firstName | lastName | postCode |
      | Harry     | Potter   | E725JB   |


