@MyProfileScreen
 Feature: My profile Screen

  Background:
    Given User is on Membership tee time landing page
    Then User click on Course Policies Done button
    And I Click on Profile of Login button
    Then Navigate to Login to your Account screen is displayed

  @TC_01-MyProfileScreen
  Scenario Outline:Verify the My Profile Screen
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    When I Click on Profile button icon
    Then I select My Profile
    Then My Profile Screen is displayed

    Examples:
      | Email      | Password      |
      | ValidEmail | ValidPassword |

  @TC_02-EditButton
  Scenario Outline:Verify the Edit button at My Profile Screen
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    When I Click on Profile button icon
    Then I select My Profile
    Then My Profile Screen is displayed
    Then I click on Edit button(Blue color)
    Then Edit My profile Screen is displayed

    Examples:
      | Email      | Password      |
      | ValidEmail | ValidPassword |

  @TC_03-EditDetails
  Scenario Outline:Verify the Edit the Details at My Profile Screen
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    When I Click on Profile button icon
    Then I select My Profile
    Then My Profile Screen is displayed
    Then I click on Edit button(Blue color)
    Then Edit My profile Screen is displayed
    Then Updating new details for <FirstName>,<LastName> and <ZipCode>
    Then I click on My Profile Save Changes Button(Blue color)

    Examples:
      | Email      | Password      |FirstName |LastName |ZipCode |
      | ValidEmail | ValidPassword |FirstName1|LastName1|ZipCode1|


  @TC_04-ChangesPassword-Update
  Scenario Outline: Verify the Changes Password(Update) At the My Profile screen
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    When I Click on Profile button icon
    Then I select My Profile
    Then My Profile Screen is displayed
    Then I click on Edit button(Blue color)
    Then Edit My profile Screen is displayed
    Then User enter <CurrentPassword>,<NewPassword> and <ConfirmPassword>
    Then I click on Password Save Changes button(Blue color)
    Then Edit My profile Screen is displayed

    Examples:
      | Email      | Password      |CurrentPassword  |NewPassword  |ConfirmPassword  |
      | ValidEmail | ValidPassword |CurrentPassword01|NewPassword01|ConfirmPassword01|

  @TC-05-CancelButton
  Scenario Outline: Verify the Cancel button At the My Profile screen
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    When I Click on Profile button icon
    Then I select My Profile
    Then My Profile Screen is displayed
    Then I click on Edit button(Blue color)
    Then Edit My profile Screen is displayed
    Then Click to cancel button of Password changes
    Then Edit My profile Screen is displayed

    Examples:
      | Email      | Password      |
      | ValidEmail | ValidPassword |

  @TC-06-EmptyFiledValidation
  Scenario Outline: Verify the Empty Filed Validation at Password changes field for the My Profile screen
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    When I Click on Profile button icon
    Then I select My Profile
    Then My Profile Screen is displayed
    Then I click on Edit button(Blue color)
    Then Edit My profile Screen is displayed
    Then User enter <CurrentPassword>,<NewPassword> and <ConfirmPassword>
    Then the Validation error Message should appear(captured) at the Passwords Changes Field
      #Then Click to cancel button of Password changes
      #Then Edit My profile Screen is displayed


    Examples:
      | Email      | Password      |CurrentPassword  |NewPassword  |ConfirmPassword  |
      | ValidEmail | ValidPassword |CurrentPassword02|NewPassword02|ConfirmPassword02|
