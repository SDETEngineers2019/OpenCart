Feature: Register

  Background:
    Given Navigate to the web site
    When Click on My Account button
    And Click on Register button
    Then User should go to Register Account page

  @TestExistingAccount
  Scenario: Existing Account Details
    When Enter existing First Name as "Pavan" and Last Name as "B"
    When Enter existing EMail as "pavanoltraining@gmail.com"
    When Enter existing Phone Number as "814240XXXX"
    When Enter existing Password as "12345" and Confirm as "12345"
    And Click on Continue button
    Then Already registered error message should be displayed

  @TestInvalidEMail
  Scenario Outline: Invalid Email
    When Enter existing First Name as "Jack" and Last Name as "Sparrow"
    When Enter invalid EMail as "<InvalidEMail>"
    When Enter existing Phone Number as "814240XXXX"
    When Enter existing Password as "12345" and Confirm as "12345"
    And Click on Continue button
    Then Invalid EMail as "<InvalidEMail>" error message should be displayed
    Examples:
      | InvalidEMail   |
      | pavanol        |
      | pavanol@       |
      | pavanol@gmail. |
      | pavanol@gmail  |
