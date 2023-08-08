@RateTypeScreen
Feature: Rate Type Screen

  Background:
    Given User is on Membership tee time landing page
    Then User click on Course Policies Done button
    And I Click on Profile of Login button
    Then Navigate to Login to your Account screen is displayed

  @TC_01-RateTypeScreen
  Scenario Outline: Verify the Rate type Screen
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    Then User Select Course
    When User Select Date
    #And User Select Players
    #And User Select Holes
    And clicks on Search button icon
    When user scrolls down to desired tee time
    And Select anyone of the Tee time tile
    Then Navigate to Rate type Screen is displayed
    When user scrolls down to desired rate type
    And Select anyone of the Rate Type tile
    Then Navigate to checkout-Payment Methods Screen is displayed

    Examples:
      | Email | Password |
      | Email2| Password2|

  @TC_02-RateTypeScreen
  Scenario Outline:Verify the Anonymous User At the Rate Type Screen then
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
    When user scrolls down to desired rate type
    And Select anyone of the Rate Type tile
    Then Navigate to Login to your Account screen is displayed
    When I enter the <Email> and <Password>
    And I Click on Login button
    Then Navigate to checkout-Payment Methods Screen is displayed

    Examples:
      | Email | Password |
      | Email2| Password2|

