Feature: Test Login Functionality

  @smoke
  Scenario Outline: Check if the user can access the homepage using valid credentials
    Given user is on login page
    When user enters valid set of <username> and <password>
    And clicks on login button
    Then user is navigated on the homepage

    @valid
    Examples: 
      | username      | password                 |
      | standard_user | qcu24s4901FyWDTwXGr6XA== |

    @invalid
    Examples: 
      | username        | password                 |
      | locked_out_user | qcu24s4901FyWDTwXGr6XA== |
