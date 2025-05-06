
Feature: Testing Login Functionality

  Scenario: Testing happy Path Login (correct Username + correct Password)
    When  User provide user name 'guest1@microworks.com' and password 'Guest1!'
    And User click rememberButton and signInButton
    Then User validate title 'ORDER DETAILS - Weborder'

    Scenario Outline: Testing negative Login testing

    When User provide user name '<username>' and password '<password>'
    And  User click rememberButton and signInButton
    Then  User validate error message '<message>'

      Examples:
        | username              | password | message        |
        | guest1@microworks.com | Guest1!! | Sign in Failed |
        | guest1@microworks.co  | Guest1!  | Sign in Failed |
        |                       |          | Sign in Failed |


#  Scenario: Testing negative Login testing (Wrong username + Correct Password)
#    When  User provide user name 'guest1@microworks.co' and password 'Guest1!'
#    And User click rememberButton and signInButton
#    Then  User validate error message 'Sign in Failed'
#
#  Scenario: Testing navigate Login testing (Both box are empty)
#    When User provide user name '' and password ''
#    And User click rememberButton and signInButton
#    Then User validate error message 'Sign in Failed'





#  Scenario Outline: Verify that a user can successfully add an income using EMT
#    Given User successfully provide the username 'beeez@gmail.com' and password '987654' and click LoginButton
#
#    Given the user navigates to the Reports section, then to the Transactions page, and clicks the Add Income button.
#    Then the user enters '29/09/08', uploads the file, and then enters the 'Atlantis'.
#    And the user creates a New Category, adds a 'Phone' and 'MoonBay', and selects the created 'Phone'.
#    Then the user selects a 'Electronic money transfer'.
#    Then the user creates a Payment Invoice, enters the 'FRU', '333.33', and 'MoonBay', then selects the created 'FRU'.
#    Then the user enters the amount '653.89' and successfully adds the income.
