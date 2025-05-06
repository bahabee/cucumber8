

#NOTE:3 Scenarios
#Task:1-MyMoney-Visa  2-FamilyAlbum-MASTERCARD 3-ScreenSaver-AMERICAN-EXPRESS
#1-login successfully with Tester(username) and password(test) LoginPage
#2-Click Order Button -->mainPage
#3- gets the product information with product and quantity -->orderPage
#4- gets address information (all of them)-->orderPage
#5-gets card information-->orderPage
#6- validate message "New order has been successfully added."-->orderPage
#7-Go to the viewOrderPage and validate the information include date -->order page

  Feature: Testing Secure Smart Bear SoftwareOrder Functionality

    Scenario: Happy Path Secure Smart Bear SoftwareOrder
      Given User successfully provide the username 'Tester' and password 'test' and click LoginButton

