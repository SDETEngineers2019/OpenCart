Feature: Register Functionality

#  QA: Berk G.
# Test Case ID: TC_RF_016
# Test Case: Validate whether the Mandatory fields in the Register Account page are accepting only spaces

  Background:
    Given Navigate to the web site
    When Click on My Account button
    And Click on Register button
    Then User should go to Register Account page

    Scenario: Validate whether the Mandatory fields in the Register Account page are accepting only spaces
      When Enter spaces into mandatory fields
      And Click on Continue button
      Then Warning message should be displayed