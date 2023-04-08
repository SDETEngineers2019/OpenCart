Feature: Search

  Background:
    Given Navigate to the web site

  Scenario: TC_SF_006 Validate all the fields in the Search functionality and Search page have placeholders
    When Click on the button having search icon
    Then Search text box field and Search Criteria text box field is displayed

