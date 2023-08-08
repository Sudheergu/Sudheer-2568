@SignUp
Feature: SignUp page

  Background:
    Given User is on Membership tee time landing page
    Then User click on Course Policies Done button
    And I Click on Profile of SignUp button
    Then Navigate to SignUp Screen is displayed

  @TC_01-SignUp
  Scenario Outline: Verify Sign Up
    When I Enter details of fields like <Email>,<FirstName>,<LastName>,<Password>,<ConfirmPassword> and <ZipCode>
    #When User click on Course Policies Done button
    Then Captured the Captcha then Enter the Captcha in the field
    And I Click on Sign Up button(Blue color)
    Then Navigate to Tee Time Screen is displayed

    Examples:
      | Email   |FirstName   |LastName   |Password   |ConfirmPassword   |Country   |ZipCode   |
      | Email01S|FirstName01S|LastName01S|Password01S|ConfirmPassword01S|Country01S|ZipCode01S|



  #@TC_01-SignUp
  Scenario Outline: Verify Sign Up with Address and Phone number
    When I Enter details of fields like <Email>,<FirstName>,<LastName>,<Password>,<ConfirmPassword> and <ZipCode>
    #When User click on Course Policies Done button
    Then Captured the Captcha then Enter the Captcha in the field
    And I Click on Sign Up button(Blue color)
    Then Navigate to Tee Time Screen is displayed

    Examples:
      | Email   |FirstName   |LastName   |Password   |ConfirmPassword   |Country   |ZipCode   |
      | Email01S|FirstName01S|LastName01S|Password01S|ConfirmPassword01S|Country01S|ZipCode01S|