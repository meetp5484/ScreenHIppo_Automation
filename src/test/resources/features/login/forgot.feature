Feature: Update password using emailId

  Background: User is on Login page
    Given User redirect to Forgot page

  Scenario Outline: User change password using valid email id
    Given User is on forgot page
    When User enter valid "<Email>"
    And Click Forgot Button
    Then The check your box page is visible
    Examples:
      | Email                 |
      | meet.patel@azilen.com |

  Scenario Outline: User change password using invalid email id
    Given User is on forgot page
    When User enter valid "<Email>"
    And Click Forgot Button
    And Show invalid email error message
    Then User not redirect from forgot page
    Examples:
      | Email                |
      | abc@awregt@gamil.com |


  Scenario Outline: User change password using null email id
    Given User is on forgot page
    When User enter valid "<Email>"
    And Click Forgot Button
    And Show null error message
    Then User not redirect from forgot page
    Examples:
      | Email |
      |       |
