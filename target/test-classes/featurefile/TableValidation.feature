Feature: Table

  @TableHandlingTest
  Scenario: Handle the table
    Given user iterates the coloumn values


    @HyperLinkTest
    Scenario: HyperLink and Window Handling
      Given user search the product "iphone" and navigate to search result page and user sort by newest arrival
      And user clicks on selected iphone
      When user clicks on hyperLink
      Then user navigates to that page