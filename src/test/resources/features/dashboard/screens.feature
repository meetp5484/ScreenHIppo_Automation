Feature: pair a screen with tv

  Background: User Log in
    Given User on login page
    When Enter valid email and password
    And Click submit button
    Then User dashboard visible

  Scenario Outline: Pair a screen using valid pin code
    Given User dashboard visible
    When User click on pair screen button
    And Enter valid Pin Code "<pinCode>"
      #pending....................
    Then screen is connected
#      ...........................
    Examples:
      | pinCode |
      | 123456  |