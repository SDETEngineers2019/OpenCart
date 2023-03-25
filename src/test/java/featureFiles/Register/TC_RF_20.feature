Feature: Register

  Background:
    Given Navigate to the web site
    When Click on My Account button
    And Click on Register button
    Then User should go to Register Account page

  Scenario: Check Privacy Policy Button is not selected By Default

    And Validate Privacy Policy Button Is Selected