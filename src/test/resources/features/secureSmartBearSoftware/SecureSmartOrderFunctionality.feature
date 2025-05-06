@regression

Feature: Testing Smart Order Functionality

  Background: Happy Path Order
    Given User successfully provide the username and password and click LoginButton
    Then User click Order Button

  Scenario Outline: Happy Path Order
    And User provides the '<Product>',<Quantity> for Product Information
    And User provides the '<CustomerName>','<Street>','<City>','<State>','<ZipCode>' for Address Information
    And User provides the '<cardType>','<cardNumber>','<expireDate>' for Payment Information
    Then User clicks process button and validates '<message>'
    And User clicks view all orders Link from MainPage
    And User validates all information '<CustomerName>','<Product>','<Quantity>','<date>','<Street>','<City>','<State>','<ZipCode>','<cardType>','<cardNumber>','<expireDate>'
    Examples:
      | Product     | Quantity | CustomerName | Street   | City | State | ZipCode | cardType         | cardNumber   | expireDate | message                                | date       |
      | MyMoney     | 4        | Zukhra       | Ocean St | NY   | NY    | 12379   | VISA             | 345345345345 | 06/27      | New order has been successfully added. | 02/27/2025 |
      | ScreenSaver | 4        | Rosa         | Blv St   | NY   | NY    | 12371   | American Express | 987654321237 | 06/27      | New order has been successfully added. | 02/27/2025 |
      | FamilyAlbum | 4        | Rimma        | PRQW St  | NY   | NY    | 69874   | MasterCard       | 741258963258 | 06/27      | New order has been successfully added. | 02/27/2025 |









#  Scenario: Product Information FamilyAlbum-MASTERCARD
#    Given User provides '<type>' and '<quantity>' information
#    Then User provides address information: '<name>', 'Ocean ave', '<state>', '<city>', '<zipCode>'
#    Then User provides payment information: card type MasterCard '<cartNumber>', '<exp>'
#    And User click Process button and validate the message 'New order has been successfully added.'
#    And User click viewOrderPage
#    Then User validate '<name>', '<quantity>', '02/25/2025', 'Ocean ave', 'NY', '<city>', '<zipCode>', '<cartNumber>', '<exp>'
#
#  Scenario: Product Information ScreenSaver-AMERICAN-EXPRESS
#    Given User provides '<type>' and '<quantity>' information
#    Then User provides address information: 'Zukhra', 'Ocean ave', '<state>', 'NY', '<zipCode>'
#    Then User provides payment information: card type American Express '<cartNumber>', '<exp>'
#    And User click Process button and validate the message 'New order has been successfully added.'
#    And User click viewOrderPage
#    Then User validate '<name>', '<quantity>', '02/25/2025', 'Ocean ave', '<state>', '<city>', '<zipCode>', '<cartNumber>', '<exp>'



 # gets the product information with product and quantity -->orderPage
#4- gets address information (all of them)-->orderPage
#5-gets card information-->orderPage
#6- validate message "New order has been successfully added."-->orderPage
#7-Go to the viewOrderPage and validate the information include date -->order page