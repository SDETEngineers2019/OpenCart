Feature: Search

  Background:
    Given Navigate to the web site

  Scenario: TC_SF_013 Validate navigating to Product Compare Page from Search Results page
      When Enter any existing product name into search box
      And Click on search icon
      And Click on Product Compare link
      Then Validate you are at Product Compare Page