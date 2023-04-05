Feature: Validate Breadcrumb of the 'Forgotten Password' page

  Background:
    Given Navigate to the web site
    When Click on My Account button
    And Click on Login button on home page

  Scenario:
    When Click on Forgotten Password link from login page
    Then Forgotten Password should be displayed on Breadcrumb