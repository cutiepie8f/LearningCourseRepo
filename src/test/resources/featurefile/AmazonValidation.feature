Feature: user validates the amazon search functionality
  @RegressionTest @TCS006
  Scenario: Validate the search functionality with specific keywords
    Given user navigates to "https://www.amazon.in/"
    When user enters the "iphone" in search bar
    And user clicks on search icon
    Then user validates the search result

    @TCS004
    Scenario Outline: validate the sort by functionality
      Given user search the product "<Product Name>" and navigate to search result page
      When user sort by newest arrival
      Then validate whether the newest arrival is selected
      Examples:
        | Product Name |
        | iphone       |
        | Books        |
        | stationary   |

  @LoginTest
      Scenario: Login
        Given user navigates to signin page
        When user enters the username and password
        Then validate error message

  @StaticDropdown
      Scenario: Handle the static dropdown
        Given user selects the value from the static dropdown
        And user extract all the attributes list of static dropdown

  @MouseAction
      Scenario: Mouse action
        Given User handles the mouse action
        Then validate whether the user navigates to create List page
 @TCS007
      Scenario: Handle the dynamic selection of iphone
        Given user search the product "iphone" and navigate to search result page and user sort by newest arrival
        When user clicks on selected iphone
        Then user navigates to selected iphone page