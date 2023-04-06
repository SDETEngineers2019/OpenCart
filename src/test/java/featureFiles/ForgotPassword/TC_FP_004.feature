Feature: Register

  Background:
    Given Navigate to the web site
    When Click on My Account button
    And Click on Login button on home page

  @TestLoginWithOldPassword
  Scenario: Logging with old password when resetting is initiated but not completed
    Given Click on Forgotten Password link from login page
    Given Enter existing EMail as "muratyilmaz@mail.com"
    And Click on Continue button on Forgot Password Page
    And Enter existing EMail "muratyilmaz@mail.com" and password "332211qq"
    And Click on Login
    Then User should be logged in

  @TestForgotPasswordInvalidEMail
  Scenario Outline: Invalid Email
    When Enter invalid EMail as "<InvalidEMail>"
    And Click on Continue button
    Then Invalid EMail as "<InvalidEMail>" error message should be displayed
    Examples:
      | InvalidEMail   |
      | pavanol        |
      | pavanol@       |
      | pavanol@gmail. |
      | pavanol@gmail  |


