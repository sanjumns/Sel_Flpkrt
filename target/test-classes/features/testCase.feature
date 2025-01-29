Feature: Amazon Shopping Cart

  Scenario: Add item to cart
    Given I am on the Amazon homepage
    When I search for "laptop"
    And I add the first result to the cart
    Then the item should be added successfully
