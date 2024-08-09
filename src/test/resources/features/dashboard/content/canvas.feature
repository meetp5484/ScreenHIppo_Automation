Feature: user Playlist
  users can create multiple playlists, add content to them, set content to display on the screen, and publish the playlists.

  Background: User Log in
    Given User on login page
    When Enter valid email and password
    And Click submit button
    And User dashboard visible
    Then User redirect to canvas page

  Scenario:Check Alignment work properly in "Add to Text"
    Given User on canvas page
    When Click on create canvas
    And Click on Screen in Canvas page
    And Click on add to text button
    And Click on Align to Left in align
    And Click on Align to Top in align
    And Click on Center Horizontally in align
    And Click on Align to Right in align
    And Click on Center Vertically in align
    And Click on Align to Bottom in align
    And Click on Center Horizontally in align
    And Click on Align to Left in align
    And Click on Center Vertically in align
    And Click on Align to Top in align
    And Click on Save and exit button
    Then User on canvas page

#    .............
#    image panding
#  ..............
  Scenario:Check Alignment work properly in "Circle"
    Given User on canvas page
    When Click on create canvas
    And Click on Screen in Canvas page
    And Click on circle button
    And Click on Align to Left in align
    And Click on Align to Top in align
    And Click on Center Horizontally in align
    And Click on Align to Right in align
    And Click on Center Vertically in align
    And Click on Align to Bottom in align
    And Click on Center Horizontally in align
    And Click on Align to Left in align
    And Click on Center Vertically in align
    And Click on Align to Top in align
    And Click on Save and exit button
    Then User on canvas page


  Scenario:Check Alignment work properly in "Rectangle"
    Given User on canvas page
    When Click on create canvas
    And Click on Screen in Canvas page
    And Click on rectangle button
    And Click on Align to Left in align
    And Click on Align to Top in align
    And Click on Center Horizontally in align
    And Click on Align to Right in align
    And Click on Center Vertically in align
    And Click on Align to Bottom in align
    And Click on Center Horizontally in align
    And Click on Align to Left in align
    And Click on Center Vertically in align
    And Click on Align to Top in align
    And Click on Save and exit button
    Then User on canvas page


  Scenario:Check Alignment work properly in "Square"
    Given User on canvas page
    When Click on create canvas
    And Click on Screen in Canvas page
    And Click on square button
    And Click on Align to Left in align
    And Click on Align to Top in align
    And Click on Center Horizontally in align
    And Click on Align to Right in align
    And Click on Center Vertically in align
    And Click on Align to Bottom in align
    And Click on Center Horizontally in align
    And Click on Align to Left in align
    And Click on Center Vertically in align
    And Click on Align to Top in align
    And Click on Save and exit button
    Then User on canvas page

  Scenario:Check Alignment work properly in "Triangle"
    Given User on canvas page
    When Click on create canvas
    And Click on Screen in Canvas page
    And Click on triangle button
    And Click on Align to Left in align
    And Click on Align to Top in align
    And Click on Center Horizontally in align
    And Click on Align to Right in align
    And Click on Center Vertically in align
    And Click on Align to Bottom in align
    And Click on Center Horizontally in align
    And Click on Align to Left in align
    And Click on Center Vertically in align
    And Click on Align to Top in align
    And Click on Save and exit button
    Then User on canvas page

  Scenario:Check Alignment work properly in "Pentagon"
    Given User on canvas page
    When Click on create canvas
    And Click on Screen in Canvas page
    And Click on pentagon button
    And Click on Align to Left in align
    And Click on Align to Top in align
    And Click on Center Horizontally in align
    And Click on Align to Right in align
    And Click on Center Vertically in align
    And Click on Align to Bottom in align
    And Click on Center Horizontally in align
    And Click on Align to Left in align
    And Click on Center Vertically in align
    And Click on Align to Top in align
    And Click on Save and exit button
    Then User on canvas page

  Scenario:Check Alignment work properly in "Line"
    Given User on canvas page
    When Click on create canvas
    And Click on Screen in Canvas page
    And Click on line button
    And Click on Align to Left in align
    And Click on Align to Top in align
    And Click on Center Horizontally in align
    And Click on Align to Right in align
    And Click on Center Vertically in align
    And Click on Align to Bottom in align
    And Click on Center Horizontally in align
    And Click on Align to Left in align
    And Click on Center Vertically in align
    And Click on Align to Top in align
    And Click on Save and exit button
    Then User on canvas page

  Scenario: Verify the sorting by name
    Given User on canvas page
    When User click on sort and select By name
    Then User visible canvas by name

  Scenario: Check, add text, and navigate back without saving. Confirm with 'Yes' for the template.
    Given User on canvas page
    When Create blank template with name
    And Click on save button
    And Click on add to text button
    And Click on navigate back
    And Select Option with yes
    Then User on canvas page


  Scenario: Check, add text, and navigate back without saving. Confirm with 'No' for the template.
    Given User on canvas page
    When Create blank template with name
    And Click on save button
    And Click on add to text button
    And Click on navigate back
    And Select Option with no
    Then User on created canvas page

  Scenario: Check, add text, and navigate back without saving. Confirm with 'Yes' for the Canvas.
    Given User on canvas page
    When Click on create canvas
    And Click on Screen in Canvas page
    And Click on save button in canvas
    And Click on add to text button
    And Click on navigate back
    And Select Option with yes
    Then User on created canvas page

  Scenario: Check, add text, and navigate back without saving. Confirm with 'No' for the Canvas.
    Given User on canvas page
    When Click on create canvas
    And Click on Screen in Canvas page
    And Click on save button in canvas
    And Click on add to text button
    And Click on navigate back
    And Select Option with no
    Then User on created canvas page

