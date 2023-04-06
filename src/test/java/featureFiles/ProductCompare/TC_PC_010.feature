Feature: Validate 'Product Compare' page when no products are added for comparison

  Background:
    Given Navigate to the web site

  Scenario:
    Given Hover the mouse on Desktops
    When Select Show All Desktops option
    And Click on Product Compare link
    Then Verify the message