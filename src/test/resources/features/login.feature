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
      | user                   | password      | message |
      | standard_user          | secret_sauce  | Ofertas |
      |locked_out_user         | secret_sauce  | Ofertas |
      | problem_user           | secret_sauce  | Ofertas |
      | performance_glitch_user| secret_sauce  | Ofertas |

