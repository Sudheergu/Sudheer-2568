@TC_01-EmailConfirmation
Feature:Gmail Login

      Scenario Outline: Verify the Above Same User Received the Email or Not?
            Given User is on Gmail Sign in Screen
            When I Enter at the Gmail <Email> field
            Then I Click on Email Next button
            Then I Enter the <Password>
            Then I Click on Password Next button
            And User Navigate to Inbox Gmail Screen is displayed

            Examples:
                  | Email | Password |
                  | Email |Password  |