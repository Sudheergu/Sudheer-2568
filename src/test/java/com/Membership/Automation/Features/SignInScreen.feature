@Regression @SignIn
Feature: SignIn page

  Background:
    Given User is on Membership tee time landing page
    Then User click on Course Policies Done button
    And I Click on Profile of Login button
    Then Navigate to Login to your Account screen is displayed

  @SmokeTest @TC_01-SignIn
  Scenario Outline: Verify Sign In or log in
    When I enter the <Email> and <Password>
    And I Click on Login button
    When User click on Course Policies Done button
    Then Navigate to Tee Time Screen is displayed
    Examples:
      | Email        | Password    |
      | EmailCorrect | PassCorrect |

  @SmokeTest @TC_02-EmailIncorrect
  Scenario Outline: Email invalid
    When I enter the <Email> and <Password>
    Then Verify the EmailInvalid validation message is displayed

    Examples:
      | Email          | Password     |
      | Emailincorrect | PassCorrect1 |

  @SmokeTest @TC_03-EmailandPasswordInvalid
  Scenario Outline: Email-andPasswordInvalid
    When I enter the <Email> and <password>
    And I Click on Login button
    Then Verify the EmailOrPasswordInvalid Validation message is displayed

    Examples:
      | Email        | password        |
      | EmailInvalid | PasswordInvalid |

  @SmokeTest @TC_04-EmailAndPasswordfieldbothareEmpty
  Scenario Outline: Tap On Log In button if email and Password is Empty
    When I enter the <Email> and <Password>
    Then I Click on label of Password Field
    Then Verify the Emailempty and Passwordempty validation message is displayed
    Then I Verify the login button is disable

    Examples:
      | Email       | Password       |
      | Empty-Email | Empty-Password |

  @SmokeTest @TC_05-VerifyForgotyourPassword?functionality
  Scenario Outline: Showing the functionality of Forgot your password? and also Back to SignInLink/Login Screen
    And I click Forgot your Password Link?
    Then Navigate to Forgot your password screen is displayed
    When I enter on email Field <existingEmail>
    And I click on Send link button
    And I click on Back to SignInLink button
    Then Navigate to Login to your Account screen is displayed
    #Then Verified forgot password email message is dispalyed in green color
    Examples:
      | existingEmail |
      | Emailcorrect1 |

  @SmokeTest @TC_06-VerifyForgotyourPassword?InvalidEmail
  Scenario Outline: Verify The Forgot your password Screen the InvalidEmail
    And I click Forgot your Password Link?
    Then Navigate to Forgot your password screen is displayed
    When I enter on email Field <existingEmail>
    Then click on label of Email Field
    Then Verify the InvalidEmail Validation message is displayed

    Examples:
      | existingEmail   |
      | Emailincorrect1 |

  @SmokeTest @TC_07-VerifyDidn'treceiveunlockinstructions?functionality
  Scenario Outline: Showing the functionality of Didnot receive unlock instructions? and also Back to SignInLink/Login Screen
    And I Click Didnot receive unlock instructions?
    Then Navigate to Resend Unlock Instructions screen is displayed
    When I enter on email Field <existingEmail>
    And I click on Send link button
    And I click on Back to SignInLink button
    Then Navigate to Login to your Account screen is displayed

    #	Then Password reset message will display
    Examples:
      | existingEmail |
      | Emailcorrect1 |

  @SmokeTest @TC_08-VerifyDidn'treceiveunlockinstructions?InvalidEmail
  Scenario Outline: Verify at Resend unlock instructions Screen the InvalidEmail
    And I Click Didnot receive unlock instructions?
    Then Navigate to Resend Unlock Instructions screen is displayed
    When I enter on email Field <existingEmail>
    Then click on label of Email Field
    Then Verify the InvalidEmail Validation message is displayed

    Examples:
      | existingEmail   |
      | Emailincorrect1 |


  @SmokeTest @TC_09-VerifySignupButtonintheloginScreen
  Scenario: Showing the Functionality of Donot have an account? Sign Up
    And I click on Donot have an account? Sign Up link button
    Then Navigate to Sign Up Screen is displayed
    And I click on Already have an account? Log in link button
    Then Navigate to Login to your Account screen is displayed