@MyMembershipsScreen
  Feature: My Memberships Screen

    Background:
      Given User is on Membership tee time landing page
      Then User click on Course Policies Done button
      And I Click on Profile of Login button
      Then Navigate to Login to your Account screen is displayed

    @TC_01-MyMembershipsScreen
    Scenario Outline: Verify the My Memberships Screen
      When I enter the <Email> and <Password>
      And I Click on Login button
      When User click on Course Policies Done button
      Then Navigate to Tee Time Screen is displayed
      When I Click on Profile button icon
      Then I select My Memberships
      Then My Memberships Screen is displayed


      Examples:
        | Email   | Password   |
        | Email05 | Password05 |

    @TC_02-MyMembershipsScreen
    Scenario Outline: Verify the My Memberships tab list of Memberships
      When I enter the <Email> and <Password>
      And I Click on Login button
      When User click on Course Policies Done button
      Then Navigate to Tee Time Screen is displayed
      When I Click on Profile button icon
      Then I select My Memberships
      Then My Memberships Screen is displayed
      Then by default My Memberships Tab Screen is displayed
      And verify the My Memberships list

      Examples:
        | Email   | Password   |
        | Email05 | Password05 |


    @TC_03-MyMembershipsScreen
    Scenario Outline: Verify the Receipts tab at My Memberships Screen
      When I enter the <Email> and <Password>
      And I Click on Login button
      When User click on Course Policies Done button
      Then Navigate to Tee Time Screen is displayed
      When I Click on Profile button icon
      Then I select My Memberships
      Then My Memberships Screen is displayed
      Then by default My Memberships Tab Screen is displayed
      And verify the My Memberships list
      Then I Click On Receipts Tab Screen is displayed
      And verify the Receipts of My Memberships list

      Examples:
        | Email   | Password   |
        | Email05 | Password05 |

    @TC_04-MyMembershipsScreen
    Scenario Outline: Verify the Memberships details Screen at the My Memberships Screen
      When I enter the <Email> and <Password>
      And I Click on Login button
      When User click on Course Policies Done button
      Then Navigate to Tee Time Screen is displayed
      When I Click on Profile button icon
      Then I select My Memberships
      Then My Memberships Screen is displayed
      Then by default My Memberships Tab Screen is displayed
      And verify the My Memberships list
      And I Click on anyone of Completed Memberships
      Then Navigate Memberships Details Screen is displayed
      Then I click Back to My Memberships button

      Examples:
        | Email   | Password   |
        | Email05 | Password05 |

    @TC_05-MyMembershipsScreen
    Scenario Outline: Verify the Memberships Details-terms and Conditions at My Memberships Screen
      When I enter the <Email> and <Password>
      And I Click on Login button
      When User click on Course Policies Done button
      Then Navigate to Tee Time Screen is displayed
      When I Click on Profile button icon
      Then I select My Memberships
      Then My Memberships Screen is displayed
      Then by default My Memberships Tab Screen is displayed
      And verify the My Memberships list
      And I Click on anyone of Completed Memberships
      Then Navigate Memberships Details Screen is displayed
      And I Click on Visit our terms and conditions
      Then Navigate to Terms and Conditions Screen is displayed
      Then I click Back to My Memberships button

      Examples:
        | Email   | Password   |
        | Email05 | Password05 |



