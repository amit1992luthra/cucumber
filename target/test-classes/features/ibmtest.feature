Feature: Title of your feature
  I want to use this template for my feature file

  Background: Login steps
    Given user is on login page
    When user enter valid login id and password
    Then User navigates to the home page

  Scenario: Verify the fields in My Profile
    Given User is on Home page
    When User clicks on my profile link
    And click on save button
    Then changes are saved

  Scenario: Verify the validation messages in my profile page
    Given User is on Home page
    When User clicks on my profile link
    And user enter invalid input in the fields
    Then validation messages appeared

  Scenario Outline: Verify the email field in my profile page
    Given User is on Home page
    When User clicks on my profile link
    And user enter invalid input "<Email>" and Phone number "<phonenumber>"in the fields
    Then validation messages appeared

    Examples: 
      | Email     | phonenumber |
      | a@a       |      123654 |
      | kjfhjkhfs |       32362 |
      | xyz@zbc.c |         251 |

