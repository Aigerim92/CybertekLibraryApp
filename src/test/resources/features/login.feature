
Feature: As a User should be able to Login

  Scenario: Login
    Given navigate to URL
    When user enters emailLogin
    And user enters password
    And sign in
    Then user should see the "Library" page
    Then user click on "Books" tab
    And user should popup of "+Add Books"
