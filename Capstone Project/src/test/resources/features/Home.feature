Feature: Home Feature





Scenario: Verify user can add item to cart with selected quantity
Given User is on retail website
When User click on Sign in option
And User enter email 'ahmed@gmail.com' and password 'Tek@1234567890'
And User click on login button
And User should be logged in into Account
And User change category to 'Smart Home'
And User search for an item 'kasa outdoor smart plug'
And User click on Search icon
And User click on item 
And User then select quantity '2'
And User then click add to Cart button
Then The cart icon quantity should change to 2

Scenario: Verify User can place an order without Shipping address and payment Method on file
Given User is on retail website
When User click on Sign in option
And User enter email 'cheik@tekschool.us' and password 'Tek@1234567890'
And User click on login button
And User should be logged in into Account
And User change the category to 'Electronics'
And User search for the item 'Apex Legends' 
And User click on Search icon
And User click on item Apax
And User select the quantity 4
And User then click add to Cart button
Then The quantity should change to 5
And User click on Cart option 
And User click on Proceed to Checkout button
And User click on Place Your Order Button
Then User should remain on the Checkout page


Scenario: Verify Shop by Department sidebar
Given User is on retail website
When User click on Sign in option
And User enter email 'mohamed@yahoo.fr' and password 'Tek@1234567890'
And User click on login button
And User should be logged in into Account 
When User click on All section
Then below options are present in Shop by Department sidebar
|Electronics|Computers|Smart Home|Sports|Automative|
Scenario Outline: Verify department sidebar options
    When User click on All section
    And User on <department>
    Then below options are present in department
      | <optionOne> | <optionTwo> |
    Examples: 
      | department    | optionOne                      | optionTwo                |
      | 'Electronics' | TV & Video                     | Video Games              |
      | 'Computers'   | Accessories                    | Networking               |
      | 'Smart Home'  | Smart Home Lightning           | Plugs and Outlets        |
      | 'Sports'      | Athletic Clothing              | Exercise & Fitness       |
      | 'Automative'  | Automative Parts & Accessories | MotorCycle & Powersports |





Scenario: Verify User can place an order with Shipping address and payment Method on file
Given User is on retail website
When User click on Sign in option
And User enter email 'abou@gmail.com' and password 'Tek@1234567890'
And User click on login button
And User should be logged in into Account
And User change the category to 'Electronics'
And User search for the item 'Apex Legends' 
And User click on Search icon
And User click on item Apax
And User select the quantity 4
And User then click add to Cart button
Then The quantity should change to 5
And User click on Cart option
And User click on Proceed to Checkout button
And User click Add a new address link for shipping address
And User fill new address form with below information
|country|fullName|phoneNumber|streetAddress|apt |city | state |zipCode|
|United States | cheikh ab | 5723691785 | columbia  | 212 | arlington |Virginia| 22204 |
And User click Add Your Address button 
And User click Add a credit card or Debit Card for Payment method
And User fill card information
|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
|4985412365478964 | abdouu tijo |4 |2027 |130 |
And User click on: Add your card button
And User click on Place Your Order
Then a message should be displayed 'Order Placed Successfully'

