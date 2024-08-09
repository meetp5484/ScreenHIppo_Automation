Feature: Create user
  create user with valid details

  Background:User is on Login page
    Given User redirect to Signup page

  Scenario Outline:Create user with special symbol add in name, organization and email
    Given User is on SignUp Page
    When Enter "<Name>", "<Organization>" and Email with Special symbol
    And Enter Phone No. with only digit
    And Enter "<Password>" with min character
    And Click Sign up button
    Then User not redirect from signupPage
    Examples:
      | Name       | Organization | Password   |
      | @Patelmeet | @azilen      | patelmeetm |


  Scenario Outline: Create a user with all fields containing 30 characters
    Given User is on SignUp Page
    When Enter "<Name>", "<Organization>" and Email with Thirty characters
    And Enter Phone No. with only digit
    And Enter "<Password>" with containing Seventy characters
    And Click Sign up button
    Then The check your box page is visible
    Examples:
      | Name                           | Organization                   | Password                       |
      | Patelmeet Patelmeet Patelmeetm | Patelmeet Patelmeet Patelmeetm | Patelmeet Patelmeet Patelmeetm |

  Scenario Outline: Create a user with 31 and more characters
    Given User is on SignUp Page
    When Enter "<Name>", "<Organization>" and Email with Thirty and more characters
    And Enter Phone No. with only digit
    And Enter "<Passsword>" with containing Thirty or more chracters
    And Click Sign up button
    Then User not redirect from signupPage
    Examples:
      | Name                            | Organization                    | Passsword                       |
      | PatelmeetMPatelmeetmPatelmeetmP | PatelmeetMPatelmeetmPatelmeetmP | PatelmeetMPatelmeetmPatelmeetmP |

  Scenario Outline: Create a user with 30 or less characters
    Given User is on SignUp Page
    When Enter "<Name>", "<Organization>" and Email with Thirty or less characters
    And Enter Phone No. with only digit
    And Enter "<Passsword>" with containing Thirty or more chracters
    And Click Sign up button
    Then The check your box page is visible
    Examples:
      | Name                          | Organization                  | Passsword                     |
      | PatelmeetMPatelmeetmPatelmeet | PatelmeetMPatelmeetmPatelmeet | PatelmeetMPatelmeetmPatelmeet |


  Scenario Outline: Create a user with null
    Given User is on SignUp Page
    When Enter "<Name>", "<Organization>" and Email with null
    And Enter "<PhoneNo>" with null
    And Enter "<Passsword>" with containing null
    And Click Sign up button
    Then User not redirect from signupPage
    Examples:
      | Name | PhoneNo | Organization | Passsword |
      |      |         |              |           |
