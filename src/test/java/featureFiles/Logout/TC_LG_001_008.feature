Feature: Logout

  Scenario:
    Given Navigate to the web site
    When Click on My Account button
    And Click on Login button on home page
    And Enter email and password
    And Click on Login button
    Then User should be logged in