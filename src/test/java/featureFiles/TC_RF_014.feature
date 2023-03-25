Feature: Register Functionality

#  QA: Berk G.
# Test Case ID: TC_RF_014
# Test Case:  Validate all the mandatory fields in the Register Account page are marked with red color * symbol

  Background:
    Given Navigate to the web site
    When Click on My Account button
    And Click on Register button
    Then User should go to Register Account page

    Scenario: Validate all mandatory fields in the Register Account page should start with red colored asterisk
      And All mandatory fields in the Register Account page should start with red colored asterisk
