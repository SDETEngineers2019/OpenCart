Feature: Register Functionality

#  QA: Berk G.
# Test Case ID: TC_RF_013
# Test Case:  Validate all the fields in the Register Account page have the proper placeholders

  Background:
    Given Navigate to the web site
    When Click on My Account button
    And Click on Register button
    Then User should go to Register Account page

    Scenario: Validate all the fields in the Register Account page have the proper placeholders
      Given All fields should be empty
      Then  All placeholders should have the proper placeholders


