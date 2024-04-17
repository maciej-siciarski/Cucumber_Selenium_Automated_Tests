Feature: Login

  Scenario Outline: Positive Login Scenario
    Given I go to login page
    When I click sign in button
    And I type email "maciejsiciarski@gmail.com"
    And password "testertester1"
    And I use sign in button
    Then I am logged in
    Then I click addresses button
    And I click create new address button
    And I fill alias "<alias>" bracket
    And I fill address "<address>" bracket
    And I fill city "<city>" bracket
    And I fill postal code "<postal>" bracket
    And I fill country "<country>" bracket
    And I fill  phone "<phone>" bracket
    Then I click save button
    Then I verify address details
    Examples:
      | alias        | address    | city    | postal | country        | phone       |
      | MaciejObrona | Obrona 1 | EgzaminKońcowy | 32-050 | United Kingdom | 123-456-789 |





