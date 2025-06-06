@login
Feature: Login

  @valid-login
  Scenario: Login with valid data
    Given user on the home page
    When user input "standard_user" as username
    And user input "secret_sauce" as password
    And user click login button
    Then user will redirect to home page

  @invalid-login
  Scenario Outline: Login with invalid credentials
    Given user on the home page
    When user input "<username>" as username
    And user input "<password>" as password
    And user click login button
    Then user will see error message "<expectedMessage>"

    Examples:
      | username        | password      | expectedMessage                                               |
      |                | secret_sauce  | Epic sadface: Username is required                            |
      | standard_user   |               | Epic sadface: Password is required                            |
      |                |               | Epic sadface: Username is required                            |

  @boundary-login
  Scenario Outline: Login with boundary value username and password
    Given user on the home page
    When user input "<username>" as username
    And user input "<password>" as password
    And user click login button
    Then user will see error message "Epic sadface: Username and password do not match any user in this service"

    Examples:
      | username                      | password       |
      | a                            | secret_sauce   |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaa | secret_sauce   |
      | standard_user                | a              |
      | standard_user                | aaaaaaaaaaaaaa |
