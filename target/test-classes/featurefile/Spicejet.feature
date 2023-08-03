Feature: user validate the dropdown and search functionality of spicejet

  @SpicejetTest
  Scenario: Handle the dynamic Dropdown
    Given user handles the dynamic dropdown

    #Before executing before executing test Scenario:
  @SpicejetTest2
  Scenario: Validate the search functionality with specific keyword
    #BeforeStep execute before executing Given
  Given user navigates to home page and select city from source and  destination dropdown
    #Afterstep execute after Given Execute//BeforeStep execute before executing And
    And  user select the number of passengers and select the currency
     #Afterstep execute after And Execute//BeforeStep execute before executing And
    And user click on the radio button and checkbox
     #Afterstep execute after And Execute//BeforeStep execute before executing When
    When user clicks on search button
     #Afterstep execute after When Execute//BeforeStep execute before executing Then
    Then  user navigates to the booking page of the application
     #Afterstep execute after Then Execute//BeforeStep execute before executing And
    And click on nextday icon
     #Afterstep execute after And Execute

#Before executing after executing test Scenario:
