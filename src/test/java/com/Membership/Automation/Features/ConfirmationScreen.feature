@ConfirmationScreen
Feature: Checkout-Payment Methods Screen

  Background:
    Given User is on Membership tee time landing page
    Then User click on Course Policies Done button
    And I Click on Profile of Login button
    Then Navigate to Login to your Account screen is displayed

  @TC_01-ConfirmationScreen
  Scenario Outline: Verify the Confirmation Screen
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
    When User enters <FirstName>, <LastName>, <CardNumber>, <ExpirationDate>, <CVV> and <ZipCode>
    Then Click on Save Cards Button
    And User click on CheckBox of Save cards
    And Clicks on CheckBox of I acknowledge that I have read & agree to the Terms and Conditions.
    And Clicks on Book Now button
    Then Navigate To Confirmation Screen is displayed
    Then Check the Tee time Confirmation Number
    Then Click on Home Back Button

    Examples:
      | Email | Password| FirstName | LastName | CardNumber | ExpirationDate | CVV | ZipCode |
      |Email3 |Password3| FirstName | LastName | CardNumber | ExpirationDate | CVV | ZipCode |