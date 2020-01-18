Feature: Search Customer

  Background:
    Given Open website http://www.way2automation.com/angularjs-protractor/banking/#/manager/list

  Scenario Outline: Search Customer successfully
    When I type some text <keyword> into the search box
    Then I verify the search results <keyword>

    Examples:
      | keyword |
      | Ha      |