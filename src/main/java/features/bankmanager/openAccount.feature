Feature: Open Account

  Background:
    Given Open website http://www.way2automation.com/angularjs-protractor/banking/#/manager/openAccount

  Scenario Outline:  Open Account sucessfully
    When I choose account as <fullname> and currency as <currency>
    And I click open account
    Then I verify that user is already open
    Examples:
      | fullname     | currency |
      | Harry Potter | Pound    |