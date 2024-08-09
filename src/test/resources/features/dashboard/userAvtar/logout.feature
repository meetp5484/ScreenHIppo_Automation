Feature:User able to Logout

  Background: User Log in
    Given User on login page
    When Enter valid email and password
    And Click submit button
    Then User dashboard visible

  Scenario: If the user wants to log out of the website
    Given User dashboard visible
    When user click on user-avtar
    And user click logout option
    Then user on login page


