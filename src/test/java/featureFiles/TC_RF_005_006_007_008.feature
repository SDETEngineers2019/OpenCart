Feature: Register

  Background: Go to Register Account Page
    Given Navigate to the web site
    When Click on My Account button
    And Click on Register button
    Then User should go to Register Account page

  Scenario: Validate Registering an Account when 'Yes' option is selected for Newsletter field
    When Enter a new account details for FirstName and LastName
    And Enter a new account details for Email and Telephone
    And Enter a new account details for Password, PasswordConfirm and PrivacyPolicyFields
    When Click on Yes radio option for Newsletter
    And Click on Continue Button
    And Click on Continue button that is displayed in the Account Success page
    And Click on Subscribe-Unsubscribe to newsletter option
    Then Yes option should be displayed as selected


  Scenario: Validate Registering an Account when 'No' option is selected for Newsletter field
    When Enter a new account details for FirstName and LastName
    And Enter a new account details for Email and Telephone
    And Enter a new account details for Password, PasswordConfirm and PrivacyPolicyFields
    When Click on No radio option for Newsletter
    And Click on Continue Button
    And Click on Continue button that is displayed in the Account Success page
    And Click on Subscribe-Unsubscribe to newsletter option
    Then No option should be displayed as selected

  Scenario: Validate different ways of navigating to 'Register Account' page
    When Click on My Account button
    And Click on Login option
    And Click  on Continue button inside New Customer box
    And Click on My Account button
    And Click on Login option
    And Click on Register option from the Right Column options
    Then User should go to Register Account page

  Scenario: Validate Registering an Account by entering different passwords into 'Password' and 'Password Confirm' fields
    When Enter a new account details for FirstName and LastName
    And Enter a new account details for Email and Telephone
    When Enter any password into the Password field
    And Enter any different password into the Password Confirm field
    And Click on Yes radio option for Newsletter
    And Click on checkbox for PrivacyPolicyFields
    And Click on Continue Button
    Then Error message should be displayed


