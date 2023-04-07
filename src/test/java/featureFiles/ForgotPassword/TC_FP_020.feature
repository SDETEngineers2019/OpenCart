Feature: Validate navigating to 'Forgotten Password' page from 'Right Column' options

  Background:
    Given Navigate to the web site
    When Click on My Account button
    And Click on Login button on home page

    Scenario:
      When Click on Forgotten Password link from login page
      Then User should be navigated to 'Forgotten Password page
