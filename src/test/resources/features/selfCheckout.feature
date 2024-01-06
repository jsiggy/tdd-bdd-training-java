Feature: Customers self checkout
  Allow a customer to use a self service checkout register to purchase their goods by scanning items and paying for them

  Scenario: Customer can add a product to be purchased
    Given the product catalog includes a lightbulb with barcode 12455 and price $2.75
    When a product with barcode 12455 is scanned
    Then the current product price should be $2.75