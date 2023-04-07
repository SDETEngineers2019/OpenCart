Feature: Validate navigating to Search page from the Site Map page

  Background:
    Given Navigate to the web site

    Scenario:
      When Click on Site Map button
      Then User should go to the search page
