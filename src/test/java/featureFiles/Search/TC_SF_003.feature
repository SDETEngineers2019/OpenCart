Feature: Validate searching without providing any Product Name

  Background:
    Given Navigate to the web site

    Scenario:
      When Click on search icon
      Then There is no product that matches the search criteria should be displayed