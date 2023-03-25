Feature: Register Functionality

#  QA: Berk G.
# Test Case ID: TC_RF_015
# Test Case: Validate the details that are provided while Registering an Account are stored in the Database

  Background:
    Given Navigate to the web site
    When Click on My Account button
    And Click on Register button
    Then User should go to Register Account page

    Scenario: Validate the details that are provided while Registering an Account are stored in the Database
      When Fill out all the fields
      And Click on Continue button
      Then All the details should be successfully stored in the database