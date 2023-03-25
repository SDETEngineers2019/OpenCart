Feature: Register

  Background:
    Given Navigate to the web site
    When Click on My Account button
    And Click on Register button
    Then User should go to Register Account page

  @DontFillAnythingAndGetTheErrorMessages

  Scenario:
    When Click Continue button
    Then Error messages should be displayed