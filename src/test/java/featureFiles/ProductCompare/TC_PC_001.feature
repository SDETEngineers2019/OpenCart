Feature: Product Compare

  Background:
    Given Navigate to the web site

  Scenario Outline: TC_PC_001 Validate adding the product for comparison from Product Display Page
    Given Enter any existing Product name into the Search text box field <productName>
    When Click on search icon
    And Click on the Product displayed in the Search results
    And Hover the mouse cursor on Compare this Product option from the displayed Product Display Page
    And Tool tip with the text Compare this Product should be displayed
    And Click on Compare this Product option
    And Success message with text <successMessage> should be displayed
    Then Click on product comparison link from the displayed success message
    Then User should be taken to the Product Comparison page with the details of the Product that we have added for comparison.
    Examples:
      | productName | successMessage                                                           |
      | "imac"      | "Success: You have added  Apple Cinema 30\" to your product comparison!" |
