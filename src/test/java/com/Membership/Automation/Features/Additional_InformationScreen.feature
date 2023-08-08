@AdditionalInformationScreen
Feature: My AdditionalInformation Screen
  Background:
    Given User is on Membership tee time landing page
    Then User click on Course Policies Done button
    And I Click on Profile of Login button
    Then Navigate to Login to your Account screen is displayed

  @TC_01-AdditionalInformationScreen
  Scenario Outline: Verify the Additional Information Screen
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    When I Click on Profile button icon
    Then I Select Additional Information
    Then Navigate to Additional Information Screen is displayed

    Examples:
      | Email  | Password  |
      | Email1 | Password1 |

  @TC_02-SelectCourseOfForeUpDetails
  Scenario Outline: Verify the Select Course to View Additional Information option and the view Button is Clickable then navigate to ForeUpSoftware.com of user Details Screen
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    When I Click on Profile button icon
    Then I Select Additional Information
    Then Navigate to Additional Information Screen is displayed
    Then Select Course to View Additional Information option
    Then Click to view button(Blue color)
    Then Navigate to select course of ForeUpSoftware.com for the user details

    Examples:
      | Email  | Password  |
      | Email1 | Password1 |