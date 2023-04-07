Feature: Forgot Password

  Background:
    Given Navigate to the web site
    When Click on My Account Dropdown Menu
    And Click on Login option

  Scenario Outline:TC_FP_005 Validate resetting the password for a non-registered account

    And Click on Forgot Password link from login page
    And Enter an email <email> address for which the Account does not exist in the application
    And Click on Continue button
    Then Success message <message> should be displayed in green color
    Then Validate the message
    Examples:
      | email           | message                                                               |
      | "non@gmail.com" | "An email with a confirmation link has been sent your email address." |

  Scenario: TC_FP_015 Validate resetting the Password without providing the registered email address
    Given Click on Forgot Password link from login page
    And Click on Continue button from forgot password field
    Then Field level warning message with text "E-Mail must be between 4 and 20 characters!" should be displayed for E-Mail Address field

  Scenario:TC_FP_019_Validate Back button on the 'Forgotten Password' page
    Given Click on Forgot Password link from login page
    And Click on Back button
    Then Validate you are at the login page