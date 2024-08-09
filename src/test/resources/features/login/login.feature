Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario Outline: User Enter Valid email and password with Verified
    Given User on login page
    When Enter "<email>" and "<password>"
    And Click submit button
    Then User dashboard visible
    Examples:
      | email                   | password  |
      | meet.patel@azilen.com   | patelmeet |
      | meetpatel@dede.infos.st | patelmeet |


  Scenario Outline: User Enter Valid email and password without Verified
    Given User on login page
    When Enter "<email>" and "<password>"
    And Click submit button
    Then The check your box page is visible
    Examples:
      | email                  | password  |
      | meet.patel@yopmail.com | patelmeet |

  Scenario Outline: User Enter Valid email and Invalid password with Verified
    Given User on login page
    When Enter "<email>" and "<password>"
    And Click submit button
    Then User not redirect to another page
    Examples:
      | email                 | password  |
      | meet.patel@azilen.com | meetpatel |

  Scenario Outline: User Enter Valid email and invalid password without verified
    Given User on login page
    When Enter "<email>" and "<password>"
    And Click submit button
    Then User not redirect to another page
    Examples:
      | email                  | password  |
      | meet.patel@yopmail.com | meetpatel |


  Scenario Outline: User Enter Invalid email and password with verified
    Given User on login page
    When Enter "<email>" and "<password>"
    And Click submit button
    Then User not redirect to another page
    Examples:
      | email         | password  |
      | meet.patel@ab | test@1234 |

  Scenario Outline: User Enter valid email and updated password with verified
    Given User on login page
    When Enter "<email>" and "<password>"
    And Click submit button
    Then User dashboard visible
    Examples:
      | email                    | password  |
      | updatedemail@yopmail.com | meetpatel |





