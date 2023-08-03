Feature: As a user validates the login functionality of salesforce application

  #Background:
   # When user enter the username "Learnmore" and password "123"
  @TCS001 @RegressionTest @TCS009 @Salesforce
  Scenario: Error message validation in login page
    Given user navigates to salesforce "https://login.salesforce.com/"
    When user enter the username "Learnmore" and password "123"
    And user clicks on login button
    Then user validates the error message


  @TCS002 @RegressionTest @TCS001 @Salesforce
  Scenario Outline: login validation
      Given user navigates to "https://login.salesforce.com/"
      When user enter the username "<UserName>" and password "<Password>"
      And user clicks on login button
      Then user navigates to the home page of the application
    Examples:
      | UserName | Password |
      | Jaya     | 123      |
      | Hello    | happy    |