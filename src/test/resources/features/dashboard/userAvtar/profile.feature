Feature:User profile

  Background: User Log in
    Given user on login page
    When Enter valid email and password
    And Click submit button
    Then User dashboard visible

