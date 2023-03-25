Feature: Register

  Background:
    Given Navigate to the web site
    When Click on My Account button
    And Click on Register button
    Then User should go to Register Account page

    @ValidateRegisteringAnAccountByProvidingOnlyTheMandatoryFields

  Scenario:
    Given Enter Your Personal Details
      | firstname  |
      | lastname  |
      | email     |
      | telephone |
    And Enter Your Password
      | password |
      | confirm  |
    And Click on Privacy Policy checkbox
    When Click Continue button
    And See success text on the URL
    And Click on Continue button after creating successfully the account
    Then My Orders should be visible