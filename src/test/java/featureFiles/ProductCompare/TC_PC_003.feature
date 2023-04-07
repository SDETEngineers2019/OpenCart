Feature: Validate adding the product for comparison from Grid View of Search Results page

  Background:
    Given Navigate to the web site

  Scenario:
    Given Enter any existing product name into search box
    When Click on search icon
    And Click on Grid view
    And Click on Compare this Product option
    Then Click on product comparison link from the success message