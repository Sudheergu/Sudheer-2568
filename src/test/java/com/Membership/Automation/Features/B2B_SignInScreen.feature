@B2B_SignInScreen
Feature: B2B-Login Screen
  Background:
    Given User is on B2B Sign in Screen

  @TC_01-@B2BSignInScreen
  Scenario Outline: Verify Sign In or log in at the B2B
    Then I Enter at the B2B <Email> and <Password>
    And I Click on Login button(Orange color)
    Then Navigate To Dashboard Screen
    Examples:
      |Email    |Password    |
      |B2b-Email|B2b-Password|