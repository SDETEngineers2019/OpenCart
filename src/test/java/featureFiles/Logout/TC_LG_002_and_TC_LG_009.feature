Feature:Logout

  Background:
    Given Navigate to the web site
    When Click on My Account button
    And Click on Login option
    And Enter existing EMail "pavanoltraining@gmail.com" and password "12345"
    Then Click on Login

  Scenario:  Validate Logging out by selecting Logout option from 'Right Column' options

    And Click on Logout option from the Right Column
    And Click on Continue button for logout
    Then Validate you are at the home page

Scenario: Validate Account Logout page
  And Click on My Account button
  And Click Logout from My Account Dropdown
  Then Check the Page Heading, Page Title, Page URL and Breadcrumb of the displayed Account Logout page

