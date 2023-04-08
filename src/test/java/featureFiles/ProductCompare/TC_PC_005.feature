Feature: Product Compare

  Background:
    Given Navigate to the web site

  Scenario: Validate adding the product for comparison from Grid View of Product Category or Sub Category page
    Given Click on Desktops and select Show All Desktops option
    When Click on Grid view
    And Click on Compare this Product option and validate Compare this Product is displayed
    And Validate success message displayed  Success: You have added Product Name to your product comparison!
    And Click on product comparison link from the success message
    Then Validate you are at the Product Comparison Page