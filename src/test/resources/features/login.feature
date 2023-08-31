Feature: Login
  As a Swag Labs user
  I want to log in to the website
  To check if my user exists

  Scenario Outline: enter the system correctly
    Given that Elvis is at the portal
    When he enters the credentials to enter
      | user   | password   |
      | <user> | <password> |
    Then the user should see the message <message>

    Examples: Data
      | user                                                                      | password                                                               | message |
      | ##@externaldata@./src/test/resources/Data/DataLogin.xlsx@LoginCorrect@1   | ##@externaldata@./src/test/resources/Data/DataLogin.xlsx@LoginCorrect@2| Products |

