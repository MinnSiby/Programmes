
Feature: Para Bank login functionality

 

  Scenario Outline: check login credentials
    Given user is on login home page
    When user enters the un "<username>"
    And user enters the pw "<password>"
    And user cliks on login button
    Then Accounts overview page is displayed

    Examples: 
      | username  | password | 
      | john      | demo     | 
      | minnu     | supermin | 
      | Hai       | Hello12  |
