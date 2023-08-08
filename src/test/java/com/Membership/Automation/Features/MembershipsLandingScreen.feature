@MembershipsLandingScreen
  Feature: Memberships Landing Screen

    Background:
      Given User is on Membership tee time landing page
      Then User click on Course Policies Done button
      And I Click on Profile of Login button
      Then Navigate to Login to your Account screen is displayed

      @TC_01-MembershipsLandingScreen
      Scenario Outline: Verify the user is on Memberships Landing screen
      When I enter the <Email> and <Password>
      And I Click on Login button
      When User click on Course Policies Done button
      Then Navigate to Tee Time Screen is displayed
      Then I Click to Memberships button(blue color)
      Then Navigate to Membership Landing screen

        Examples:
          | Email      | Password      |
          | ValidEmail | ValidPassword |

    @TC_02-MembershipsLandingScreen
    Scenario Outline: Verify the user is Subscribe the Memberships screen
      When I enter the <Email> and <Password>
      And I Click on Login button
      When User click on Course Policies Done button
      Then Navigate to Tee Time Screen is displayed
      Then I Click to Memberships button(blue color)
      Then Navigate to Membership Landing screen
      Then Select the Memberships Plan Club
      Then I click on subscribe button(blue color)
      Then Navigate to checkout-Payment Methods Screen is displayed
      When User enters <FirstName>, <LastName>, <CardNumber>, <ExpirationDate>, <CVV> and <ZipCode>
      Then Click on Save Cards Button
      And User click on CheckBox of Save cards
      And Clicks on CheckBox of I acknowledge that I have read & agree to the Terms and Conditions.
      And Clicks on Continue button
      Then Navigate To Confirmation Screen is displayed

      Examples:
        | Email | Password| FirstName | LastName | CardNumber | ExpirationDate | CVV | ZipCode |
        |Email04 |Password04| FirstName | LastName | CardNumber | ExpirationDate | CVV | ZipCode |


