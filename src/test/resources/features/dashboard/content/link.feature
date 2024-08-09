Feature: User want add link and show in TV.

  Background: User Log in
    Given User on login page
    When Enter valid email and password
    And Click submit button
    And User dashboard visible
    Then User redirect to Link page


  Scenario: Search link by name
    Given User on link page
    When User click on sort and select By name
    Then verify sort by name

  Scenario Outline: Check with valid link to Add
    Given User on link page
    When Use click on add link
    And User enter valid "<link>".
    And User click on add link
    Then User on link page
    Examples:
      | link                       |
      | https://www.saucedemo.com/ |

  Scenario Outline: Check with invalid link to Add
    Given User on link page
    When Use click on add link
    And User enter valid "<link>".
    Then Show error msg.
    Examples:
      | link               |
      | AbcDEFGHDFJHGFHGFD |