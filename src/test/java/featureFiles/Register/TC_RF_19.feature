Feature: Register

  Background:
    Given Navigate to the web site
    When Click on My Account button
    And Click on Register button
    Then User should go to Register Account page

  Scenario: Enter New Account Details
    #Validate whether the leading and trailing spaces entered into the Register Account fields are trimmed
    And Enter First Name and Last Name
    And Enter Email
    And Enter Phone
    And Enter Password and Confirm Password
    And Click agreement button
    Then Click on Continue button

  Scenario:
      #Validate whether the Password fields in the Register Account page are following Password Complexity Standards

