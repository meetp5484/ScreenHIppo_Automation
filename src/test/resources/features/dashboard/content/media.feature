Feature:User able to upload medai like image, video and files

  Background: User Log in
    Given User on login page
    When Enter valid email and password
    And Click submit button
    And User dashboard visible
    Then User redirect to media page

  Scenario:Check if user valid file upload
    Given User on media page
    When User click on upload button
    And Select file and upload file
    And User click to upload media
    Then User on media page


  Scenario:Check if user invalid file upload
    Given User on media page
    When User click on upload button
    And Select invalid file and upload file
    And User click on back button
    Then User on media page

  Scenario Outline: Check max cap on image and video upload with positive Test case
    Given User on media page
    When User click on upload button
    And Select "<file>" and upload file
    And User click to upload media
    Then User on media page
    Examples:
      | file                                                                                                             |
      | /image/image50_2mb.jpeg ,/image/image50_2mb.jpeg,/image/image_48mb.jpeg,/image/nature7.jpeg                      |
      | /image/nature1.jpeg,/image/nature2.jpeg,/image/nature3.jpeg,/image/nature4.jpeg,/image/nature5.jpeg              |
      | /video/yt173mb.mp4                                                                                               |
      | /video/yt173mb.mp4,/video/yt172video.mp4,/video/youtube video60.mp4,/video/sample-10s.mp4, /video/sample-30s.mp4 |
      | /image/image50_2mb.jpeg,/image/image50_2mb.jpeg, /video/yt173mb.mp4,/video/yt172video.mp4                        |


  Scenario Outline: Check max cap on image and video upload with negative Test case
    Given User on media page
    When User click on upload button
    And Select "<file>" and upload file
    And User show error msg
    And User click on back button
    Then User on media page
    Examples:
      | file                                                                                        |
      | /image/image54_3mb.jpeg,/image/image110mb.png,/image/image_61mb.jpg,/image/iamge53_2mb.jpeg |
      | /video/yt226mb.mp4                                                                          |
      | /video/yt226mb.mp4                                                                          |
      | /video/yt453mbVideo.mp4,/video/t257mb.mp4                                                   |
      | /image/image54_3mb.jpeg,/video/yt226mb.mp4, /video/yt453mbVideo.mp4                         |

  Scenario Outline: Check if user upload not accepted file
    Given User on media page
    When User click on upload button
    And Select "<file>" and upload file
    And User show file not accepted msg
    And User click on back button
    Then User on media page
    Examples:
      | file                                      |
      | /image/sample1.heic                       |
      | /video/file_example_MOV_480_700kB (1).mov |
      | /image/file_example_SVG_20kB.svg          |
      | /video/file_example_WMV_480_1_2MB.wmv     |
      | /video/file_example_AVI_480_750kB.avi     |
      | /temp.zip                                 |

