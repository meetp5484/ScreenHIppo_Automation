Feature: user Playlist
  users can create multiple playlists, add content to them, set content to display on the screen, and publish the playlists.

  Background: User Log in
    Given User on login page
    When Enter valid email and password
    And Click submit button
    Then User dashboard visible

  Scenario: Create user with name and thumbnail
    Given User redirect to playlist page
    When User click on Create Playlist
    And User enter name, select thumbnail and click on Create
    Then Check if the playlist has been created

  Scenario Outline: Search Playlist By name
    Given User redirect to playlist page
    When Search playlist By "<name>"
    Then Searched playlist visible
    Examples:
      | name             |
      | New Playlist (2) |
    #if name is change so in playlist path also need to change






