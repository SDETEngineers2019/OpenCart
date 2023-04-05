Feature: Validate searching for a product after login to the Application

  Background:
    Given Navigate to the web site
    When Click on My Account button
    And Click on Login button on home page
    And Enter email and password
    And Click on Login button

  Scenario:
    When Enter any existing product name into search box
    And Click on search icon
    Then Searched product is displayed