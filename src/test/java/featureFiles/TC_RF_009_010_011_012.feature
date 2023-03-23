Feature: Register

  Background:
    Given Navigate to the web site
    When Click on My Account button
    And Click on Register button
    Then User should go to Register Account page

  Scenario:
    When Enter existing First Name and Last Name
    When Enter existing EMail
    When Enter existing Phone Number
    When Enter existing Password and Confirm
    And Click on Continue button
#    Then Already registered error message should be displayed

