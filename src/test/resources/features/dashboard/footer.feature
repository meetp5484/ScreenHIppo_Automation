Feature: Show the contect us, privacy policy and terms and conditions

  Background: User Log in
    Given User on login page
    When Enter valid email and password
    And Click submit button
    Then User dashboard visible

  Scenario: Check the power by screen hippo visible or not.
    Given User dashboard visible
    Then power by screen hippo visible at bottom

  Scenario: Check contact us link work properly.
    Given User dashboard visible
    When User click on contact us
    Then User on contact us page


  Scenario: Check privacy policy  link work properly.
    Given User dashboard visible
    When User click on privacy policy
    Then User on privacy policy page

  Scenario: Check terms and conditions link work properly.
    Given User dashboard visible
    When User click on terms and conditions
    Then User on terms and conditions page
