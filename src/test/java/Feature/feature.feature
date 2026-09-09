Feature: User should verify the Flexcommerce shopping

  Background:
    Given User should launch the App

  @product
  Scenario: User verify the Shopping
    When User click View All products
    And User click the Hp Pavillion 15 laptop silver
    And User should see the image Hp laptop  visible
    And User check the brand is visible HP
    And User should see the title is visible Hp Pavillion 15 laptop silver
    And User check the product ratings ⭐⭐
    And User should see the Amount inclusive of all taxes is visible
    And User should see and click the Exchange available button is visible
    And User should see the click the Wishlist button
    And User should click the product to Add to Cart
    And User should click the Card button
    And User should click the Home Page

  @Amount
  Scenario: Verify the Two product
    When User should click the Galaxy S26 product1
    And User should Addcard product1
    And User should see the product1 price
    And User should click the Hp Pavillon Laptop product2
    And User should Addcard product2
    And User should see the product2 price
    And User should see the Total product price
    Then User should click the Home Page
    Then User should see the Sort By options
    And User select the sort option "Price: Low to High"

  @Sort
  Scenario Outline: User sorts products by different options
    When User click View All products
    And User click the Sort button
    And User select the sort option "<option>"
    Then User should see the Sort By options

    Examples:
      | option             |
      | Relevance          |
      | Price: Low to High |
      | Price: High to Low |
      | Rating             |
      | Newest             |
      | Discount           |

  @Filters
  Scenario: User applies rating and brand filters
    Given User should launch the App
    When User click View All products
    And User click the Filters button
    Then User should see the Filters screen
    And User select rating "4" and above
    And User select the brand "Apple"
    And User click Apply Filters

  @500Filters
  Scenario: User applies Under ₹500 quick filter
    Given User should launch the App
    And User click View All products
    When User click the ₹500 Under500

  @500-1000Filters
  Scenario: User applies ₹500-₹1000 quick filter
    Given User should launch the App
    And User click View All products
    When User click the ₹500-₹1000 Above500

  @Search
  Scenario: User searches for a product
    And User click View All products
    When User click the Search icon
    And User search for "Galaxy"
    Then User should see search results

  @Grid
  Scenario: User switches to grid view
    Given User should launch the App
    And User click View All products
    When User click the Grid icon
    Then User should see products in grid view

  # Negative Scenario
  @SearchNegative
  Scenario: User searches for a product invalid
    And User click View All products
    When User click the Search icon
    And User search for invalid  "@fdgfd$586@$"
    Then User should see search results No product

  @productCountNegative
  Scenario: User  add product to card  only once
    When User click View All products
    And User click the Hp Pavillion 15 laptop silver
    And User should see the image Hp laptop  visible
    And User check the brand is visible HP
    And User should see the title is visible Hp Pavillion 15 laptop silver
    And User check the product ratings ⭐⭐
    And User should see the Amount inclusive of all taxes is visible
    And User should see and click the Exchange available button is visible
    And User should see the click the Wishlist button
    And User should click the product to Add to Cart
    And User should click the Card button
    Then The card item count should not exceed 1

  @NavigateBack
  Scenario: User navigate back to home after add card and card is not cleared
    When User click View All products
    And User click the Hp Pavillion 15 laptop silver
    And User should see the image Hp laptop  visible
    And User check the brand is visible HP
    And User should see the title is visible Hp Pavillion 15 laptop silver
    And User check the product ratings ⭐⭐
    And User should see the Amount inclusive of all taxes is visible
    And User should see and click the Exchange available button is visible
    And User should see the click the Wishlist button
    And User should click the product to Add to Cart
    And User should click the Card button
    Then User should see the card is not cleared

  @PriceNegative
  Scenario: User verify the price doesn't not change after adding
    When User click View All products
    And User click the Hp Pavillion 15 laptop silver
    And User should see the image Hp laptop  visible
    And User check the brand is visible HP
    And User should see the title is visible Hp Pavillion 15 laptop silver
    And User check the product ratings ⭐⭐
    And User should see the Amount inclusive of all taxes is visible
    And User should see and click the Exchange available button is visible
    And User should see the click the Wishlist button
    And User should click the product to Add to Cart
    Then The displayed price should remain unchanged

  @GridNegative
  Scenario: User switches to grid view when product list is empty
    Given User should launch the App
    When User click View All products
    And User click the Grid icon
    And User should see products in grid view
    And User click the Search icon
    And User search for invalid  "@fdgfd$586@$"
    Then Grid icon should be disabled or "No product" found message

  @filtersNegative
  Scenario: User opens filters screen but applies no filter section
    Given User should launch the App
    When User click View All products
    And User click the Filters button
    Then User should see the Filters screen
    And User click Apply Filters
    Then Prouduct list should remain unchanged

  @productcountNegative
  Scenario: Cart count resets correctly after app restart
    When User click View All products
    And User click the Hp Pavillion 15 laptop silver
    And User should see the image Hp laptop  visible
    And User check the brand is visible HP
    And User should see the title is visible Hp Pavillion 15 laptop silver
    And User check the product ratings ⭐⭐
    And User should see the Amount inclusive of all taxes is visible
    And User should see and click the Exchange available button is visible
    And User should see the click the Wishlist button
    And User should click the product to Add to Cart
    And User close and reopens the App
    And The cart item count should remain 0
