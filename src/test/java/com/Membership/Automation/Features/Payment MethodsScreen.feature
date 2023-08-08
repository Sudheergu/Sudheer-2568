@PaymentMethodsScreen
Feature: My Bookings Screen
  Background:
    Given User is on Membership tee time landing page
    Then User click on Course Policies Done button
    And I Click on Profile of Login button
    Then Navigate to Login to your Account screen is displayed

  @PaymentMethodsScreen
  Scenario Outline: Verify the Payment Methods Screen
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    When I Click on Profile button icon
    Then I Select Payment Methods
    Then Navigate to Payment Methods Screen is displayed

    Examples:
      | Email  | Password  |
      | Email1 | Password1 |

  @EnterNewCardDetailsAtPaymentMethods
  Scenario Outline: Verify to Enter New Card details at Payment Methods Screen
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    When I Click on Profile button icon
    Then I Select Payment Methods
    Then Navigate to Payment Methods Screen is displayed
    When User enters <FirstName>, <LastName>, <CardNumber>, <ExpirationDate>, <CVV> and <ZipCode>
    Then Click on Save Cards Button

    Examples:
      | Email | Password| FirstName | LastName | CardNumber | ExpirationDate | CVV | ZipCode |
      |Email1 |Password1| FirstName | LastName | CardNumber | ExpirationDate | CVV | ZipCode |

  @RemoveTheCardOfPaymentMethods
  Scenario Outline: Verify the Remove the Saved card details at Payment Methods screen
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    When I Click on Profile button icon
    Then I Select Payment Methods
    Then Navigate to Payment Methods Screen is displayed
    Then click to Remove button(Blue color)
    Then the again the Payment methods Screen is displayed

    Examples:
      | Email  | Password  |
      | Email1 | Password1 |


  #@EmptyFieldOfCardDetailsAtPaymentMethods
  Scenario Outline: Verify the Empty Filed Validation of card details at Payment Methods screen
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    When I Click on Profile button icon
    Then I Select Payment Methods
    Then Navigate to Payment Methods Screen is displayed
    When User enters <FirstName>, <LastName>, <CardNumber>, <ExpirationDate>, <CVV> and <ZipCode>
    Then Click on Save Cards Button
    Then the Validation error Message should appear(captured)
    Examples:
      | Email  | Password | FirstName   | LastName   | CardNumber   | ExpirationDate   | CVV   | ZipCode   |
      |Email01 |Password01| FirstName01 | LastName01 | CardNumber01 | ExpirationDate01 | CVV01 | ZipCode01 |

  #@EnterInvalidCardDetailsAtPaymentMethods
  Scenario Outline: Verify to Enter Invalid card details at Payment Methods screen
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    When I Click on Profile button icon
    Then I Select Payment Methods
    Then Navigate to Payment Methods Screen is displayed
    #When User enters invalid <FirstName>,<LastName>,<CardNumber>,<ExpirationDate>,<CVV> and <ZipCode>
    Then Click on Save Cards Button
    Then the Validation error Message should appear(captured)


    Examples:
      | Email  | Password | FirstName   | LastName   | CardNumber   | ExpirationDate   | CVV   | ZipCode   |
      |Email01 |Password01| FirstName01 | LastName01 | CardNumber01 | ExpirationDate01 | CVV01 | ZipCode01 |


