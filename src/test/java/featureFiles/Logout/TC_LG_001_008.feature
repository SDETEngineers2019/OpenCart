Feature: Logout

  Background:
    Given Navigate to the web site
    When Click on My Account button
    And Click on Login button on home page
    And Enter email and password
    And Click on Login button
    Then User should be logged in

    @LogoutOptionFromMyAccountDropdownMenu
  Scenario: Logout option from 'My Account' dropdown menu
    When Click on My Account Dropdown Menu
    And Click on Logout Button
    Then User should be taken to Account Logout page
    And User should see Login Option under My Account Dropdown Menu
    And Click on Logout Continue Button
    Then User should be taken to Home page

    @LoginImmediatelyTest
  Scenario: Login immediately after logout
    When Click on My Account Dropdown Menu
    And Click on Logout Button
    Then User should be taken to Account Logout page
    And User should see Login Option under My Account Dropdown Menu
    And Click on Login button under My Account Dropdown Menu
    Then User should be taken to Login Page
    And Enter email and password
    And Click on Login button
    Then User should be logged in
