Feature: Add Customer

  Background:
    Given Open website http://www.way2automation.com/angularjs-protractor/banking/#/manager/addCust

  Scenario Outline: Add Customer sucessfully
    When I type first name as <firstname>, last name as <lastname>, post code as <postcode>
    And I click submit
    Then I verify that user is already add
    Then I verify that system is already added customer as <fullname> successfully

    Examples:
      | firstname | lastname | postcode | fullname   |
      | dieu      | quach    | 55000    | dieu quach |

  Scenario Outline: Add Customer unsucessfully
    When I type first name as <firstname>, last name as <lastname>, post code as <postcode>
    And I click submit
    Then I verify that system is already added customer as <fullname> unsuccessfully
    Examples:
      | firstname | lastname | postcode | fullname |
      | mai       | null     | 55000    | mai      |