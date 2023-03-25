Feature: Register Functionality


    Background:
    Given Navigate to the web site
    When Click on My Account button
    And Click on Register button
    Then User should go to Register Account page


    Scenario:TC_RF_021
      Given Fill out all the fields without click checkBox
      When Click on the Continue Button
      Then user should be Warning Text

     Scenario: TC_RF_022
     Given Enter Password
     When Enter Password Confirm

    Scenario: TC_RF_023
    Given Click Login Page Link
    And Click Privacy Policy link
    When Click Right Column Options
    And  Menu Options
    And Click Header and Footer
    And Click Any Options

    Scenario: TC_RF_024
      Given Fill out all the fields without password confirm
      When Click on the Continue Button
      Then user should be Warning Text












