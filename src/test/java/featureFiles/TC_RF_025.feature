Feature: Register

  Background:
    Given Navigate to the web site
    When Click on My Account button
    And Click on Register button
    Then User should go to Register Account page

  Scenario:
    Then The Breadcrumb, Page Heading, Page URL, Page Title of Register Account Page should be displayed

