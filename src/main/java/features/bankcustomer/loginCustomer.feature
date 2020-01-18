

Feature: Customer Login

  Scenario Outline: Customer Login Successfully
    Given Open website http://www.way2automation.com/angularjs-protractor/banking/#/customer
    When I select username as <username>
    When I click login button
    Then I verify that user as <usernameSelected> login successfully

    Examples:
      | username     | usernameSelected |
      | Harry Potter | Harry Potter     |