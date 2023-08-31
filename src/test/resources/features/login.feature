Feature: Login
  As a Swag Labs user
  I want to log in to the website
  To check if my user exists

  Scenario: : enter the system correctly
    Given that Elvis is at the portal
    When he enters the credentials to enter
      | user                                                                    | password                                                                |
      | ##@externaldata@./src/test/resources/Data/DataLogin.xlsx@LoginCorrect@1 | ##@externaldata@./src/test/resources/Data/DataLogin.xlsx@LoginCorrect@2 |
    Then the user should see the message Products

  Scenario Outline: enter the system Incorrect
    Given that Elvis is at the portal
    When he enters the credentials to enter
      | user   | password   |
      | <user> | <password> |
    Then The user should see the following error <message>

    Examples: Data
      | user   | password      | message                             |
      |        | elvis         |   Epic sadface: Username is required|
      |elvis   |               |   Epic sadface: Password is required|
      |        |               |   Epic sadface: Username is required|

  Scenario Outline: Enter the system with a person who has restrictions
    Given that Elvis is at the portal
    When he enters the credentials to enter
      | user   | password   |
      | <user> | <password> |
    Then The user should see the following error <message>

    Examples: Data
      | user                   | password      | message                                            |
      | locked_out_user        | secret_sauce  | Epic sadface: Sorry, this user has been locked out.|
