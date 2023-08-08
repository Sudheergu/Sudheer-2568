@Regression
Feature: Tee Time Screen

  Background:
    Given User is on Membership tee time landing page
    Then User click on Course Policies Done button
    And I Click on Profile of Login button
    Then Navigate to Login to your Account screen is displayed

  @TC_01-TeeTimeScreen
  Scenario Outline: Verify the Tee time Screen
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    Then User Select Course
    #When User Select Date
    #And User Select Players
    And User Select Holes
    And clicks on Search button icon
    When user scrolls down to desired tee time
    And Select anyone of the Tee time tile
    Then Navigate to Rate type Screen is displayed

    Examples:
      | Email | Password |
      | Email1| Password1|

    @TC_02-TeeTimeScreen
    Scenario:Verify The Tee with Anonymous User
      Given User is on Membership tee time landing page
      Then User click on Course Policies Done button
      Then Navigate to Tee Time Screen is displayed
      Then User Select Course
      #When User Select Date
      #And User Select Players
      And User Select Holes
      And clicks on Search button icon
      When user scrolls down to desired tee time
      And Select anyone of the Tee time tile
      Then Navigate to Rate type Screen is displayed

