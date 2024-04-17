Feature: Task2

  Scenario Outline: Positive Buyout Scenario
    Given I go to login page
    When I click sign in button
    And I type email "maciejsiciarski@gmail.com"
    And password "testertester1"
    And I use sign in button
    Then I am logged in
    When I return to home-page
    Then I chose hummingbird printed sweatshirt
    And I choose M size
    And I choose quantity "<quantity>"
    When I click add to cart button
    Then I proceed to checkout
    When I confirm the address
    And I click continue button
    And I select pick up in-store option
    And I select pay by check option
    And I agree to terms of service
    Then I place an order
    And I screenshot the order
    And I confirm the order
    Examples:
      | quantity |
      | 5        |
