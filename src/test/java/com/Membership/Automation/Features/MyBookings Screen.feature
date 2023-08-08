@BookingsScreen
Feature: My Bookings Screen
  Background:
    Given User is on Membership tee time landing page
    Then User click on Course Policies Done button
    And I Click on Profile of Login button
    Then Navigate to Login to your Account screen is displayed

   @TC_01-BookingsScreen
  Scenario Outline: Verify the Bookings screen
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    When I Click on Profile button icon
    Then I select Bookings
    Then My Bookings Screen is displayed

    Examples:
      | Email      | Password      |
      | ValidEmail | ValidPassword |

  @TC_02-UpcomingBookingsScreen
  Scenario Outline: Verify the Upcoming Bookings Screen
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    When I Click on Profile button icon
    Then I select Bookings
    Then My Bookings Screen is displayed
    Then by default Upcoming Tab Screen is displayed
    And verify the Upcoming Bookings list

    Examples:
      | Email      | Password      |
      | ValidEmail | ValidPassword |

  @TC_03-PastBookingsScreen
  Scenario Outline: Verify the Past Bookings Screen
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    When I Click on Profile button icon
    Then I select Bookings
    Then My Bookings Screen is displayed
    Then by default Upcoming Tab Screen is displayed
    Then I Click On Past Tab Screen is displayed
    And verify the Past Bookings list

    Examples:
      | Email      | Password      |
      | ValidEmail | ValidPassword |

  @TC_04-CompletedBookingsScreen
  Scenario Outline:  Verify the Completed Bookings
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    When I Click on Profile button icon
    Then I select Bookings
    Then My Bookings Screen is displayed
    Then by default Upcoming Tab Screen is displayed
    And verify the Upcoming Bookings list
    And I Click on anyone of Completed bookings
    Then Navigate Booking Details Screen is displayed
    Then I click Back to My Bookings button

    Examples:
      | Email      | Password      |
      | ValidEmail | ValidPassword |

  @TC_05-CancelBookingButton
  Scenario Outline: Verify the Cancel Booking Button in Upcoming Booking Screen
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    When I Click on Profile button icon
    Then I select Bookings
    Then My Bookings Screen is displayed
    Then by default Upcoming Tab Screen is displayed
    And verify the Upcoming Bookings list
    And I Click on anyone of Completed bookings
    Then Navigate Booking Details Screen is displayed
    Then I click on Cancel Booking Button(blue color)

    Examples:
      | Email      | Password      |
      | ValidEmail | ValidPassword |

  @TC_06-Pop-CrossButton
  Scenario Outline: Verify the Pop a Cross (X) Button for Cancel Bookings
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    When I Click on Profile button icon
    Then I select Bookings
    Then My Bookings Screen is displayed
    Then by default Upcoming Tab Screen is displayed
    And verify the Upcoming Bookings list
    And I Click on anyone of Completed bookings
    Then Navigate Booking Details Screen is displayed
    Then I click on Cancel Booking Button(blue color)
    Then Pop Appears Are you sure you want to cancel this booking?
    And I Click on Cross(X) button
    Then Navigate Booking Details Screen is displayed

    Examples:
      | Email      | Password      |
      | ValidEmail | ValidPassword |

  @TC_07-Pop-Yes-Button
  Scenario Outline: Verify the Pop a Yes Button for Cancel Bookings
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    When I Click on Profile button icon
    Then I select Bookings
    Then My Bookings Screen is displayed
    Then by default Upcoming Tab Screen is displayed
    And verify the Upcoming Bookings list
    And I Click on anyone of Completed bookings
    Then Navigate Booking Details Screen is displayed
    Then I click on Cancel Booking Button(blue color)
    Then Pop Appears Are you sure you want to cancel this booking? with Yes and No button
    And I Click on Yes Button
    Then Navigate to Cancel Booking Screen is displayed

    Examples:
      | Email      | Password      |
      | ValidEmail | ValidPassword |

   @TC_08-Pop-No-Button
  Scenario Outline: Verify the Pop a No Button for Cancel Bookings
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    When I Click on Profile button icon
    Then I select Bookings
    Then My Bookings Screen is displayed
    Then by default Upcoming Tab Screen is displayed
    And verify the Upcoming Bookings list
    And I Click on anyone of Completed bookings
     Then Navigate Booking Details Screen is displayed
    Then I click on Cancel Booking Button(blue color)
    Then Pop Appears Are you sure you want to cancel this booking? with Yes and No button
    And I Click on No Button
     Then Navigate Booking Details Screen is displayed

    Examples:
      | Email      | Password      |
      | ValidEmail | ValidPassword |

  @TC_09-PastBookingsScreen
  Scenario Outline: Verify the Past Bookings Screen of Cancel booking
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    When I Click on Profile button icon
    Then I select Bookings
    Then My Bookings Screen is displayed
    Then by default Upcoming Tab Screen is displayed
    Then I Click On Past Tab Screen is displayed
    And verify the Past Bookings list
    Then I Click on anyone Courses of Cancel Booking
    Then Navigate to Cancel Booking Screen is displayed
    Then I click Back to My Bookings button

    Examples:
      | Email      | Password      |
      | ValidEmail | ValidPassword |

  ##@TC_10-CompleteUpcomingToPastScreenCancelBookingsFlow
  Scenario Outline: Verify the Complete Upcoming To Past Screen Tee Time Cancel Bookings Flow
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    When I Click on Profile button icon
    Then I select Bookings
    Then My Bookings Screen is displayed
    Then by default Upcoming Tab Screen is displayed
    And verify the Upcoming Bookings list
    And I Click on anyone of Completed bookings
    Then Navigate Booking Details Screen is displayed
    Then I click on Cancel Booking Button(blue color)
    Then Pop Appears Are you sure you want to cancel this booking? with Yes and No button
    And I Click on Yes Button
    Then Navigate to Cancel Booking Screen is displayed
    Then I click Back to My Bookings button
    Then I Click On Past Tab Screen is displayed
    And verify the Past Bookings list
    Then I Click on anyone Courses of Cancel Booking
    Then Navigate to Cancel Booking Screen is displayed
    Then I click Back to My Bookings button

    Examples:
      | Email      | Password      |
      | ValidEmail | ValidPassword |