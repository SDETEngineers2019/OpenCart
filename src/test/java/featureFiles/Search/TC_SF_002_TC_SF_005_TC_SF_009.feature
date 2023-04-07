Feature: Search Functionality

  Background:
   Given Navigate to the web site

  Scenario Outline: TC_SF_002 Validate searching with a non existing Product Name
    Given Enter non existing product name into the Search text box field <productName>
    And Click on the button having search icon
    Then <message> should be displayed in the Search Results page
    Examples:
      | productName | message                                                |
      | "Fitbit"    | "There is no product that matches the search criteria" |


  Scenario Outline: TC_SF_005 Validate searching by providing a search criteria which results in multiple products
    Given Enter the search criteria in the Search text box field which can result in multiple products "<product>"
    And Click on the search button
    Then Validate More than one products should be displayed in the search results page
    Examples:
      | product |
      | mac     |


  Scenario Outline: TC_SF_009 Validate Search by selecting the category of product
    Given Click on the button having search icon
    When Enter any Product Name into the Search Criteria text box field  <productName>
    And Select the correct category of the given Product Name into Category dropdown field
    And Click on Search button
    And Validate product should be successfully displayed in the search results.
    And Select a wrong category in the Category dropdown field
    And Click on Search button
    Then <message> should be displayed in the Search Results page
    Examples:
      | productName | message                                                |
      | "imac"      | "There is no product that matches the search criteria" |