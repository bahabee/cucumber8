
#General description of the TestCase
Feature: Testing the Purchase Functionality
#Test case
  Background: Choosing departure and Destination part
   # Given User navigates to the 'https://www.blazedemo.com/'
    When  User chooses 'Boston' for departure
    And User chooses 'London' for destination and click Finding Flight Button

  Scenario: Validation Finding Flights Functionality
    Then  User validate header 'Flights from Boston to London:'

  Scenario: Validation Finding Flights Functionality
    And User click the Choose This Flight button
    Then User enter 'Zukhra Barlas' and '2018 Ocean ave', 'New York', 'NY' and '11237'
    Then User enter '123654789999' and 'Barlas Zukhra' name
    When User enter all information click checkBox and purchaseButton
    Then User validate last page header 'Thank you for your purchase today!'