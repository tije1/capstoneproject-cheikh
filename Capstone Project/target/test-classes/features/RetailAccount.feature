Feature: Retail Account Page 
Background:
Given User is on retail website
When User click on Sign in option
And User enter email "abdou@gmail.co" and password "Tek@1234567890"
And User click on login button
Then User should be logged in into Account
When User click on Account option 


Scenario: Verify User can update Profile Information 
And User update Name "tij" and Phone "4444681264"
And User click on Update button 
Then User profile information should be updated 


Scenario: Verify User can Update password 
And User enter below information 
|previousPassword| newPassword|confirmPassword|
|Tek@123456789 |Tek@1234567890 |Tek@1234567890 |
 And User click on Change Password button 
Then A message should be displayed 'Password Updated Successfully'


Scenario: Verify User can add a payment method 
When User click on Account option 
And User click on Add a payment method link 
And User fill Debit or credit card information 
|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
|4785412365478963 | abdouu tije |4 |2026 |130 |
And User click on Add your card button 
Then Message should be displayed "Payment Method added sucessfully"


Scenario: Verify User can edit Debit or Credit card 
When User click on Account option 
And User click on card
And User click on Edit option of card section
And user edit information with below data 
|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
|2541789654721448 | cheikh ab |5 |2024 |321 |
And user click on Update Your Card button 
Then update message should be displayed 'Payment Method updated Successfully'

Scenario: Verify User can remove Debit or Credit card 
When User click on Account option 
And User click on card
And User click on remove option of card section
Then payment details should be removed


Scenario: Verify User can add an Address 
When User click on Account option 
And User click on Add address option 
And user fill new address form with below information 
|country|fullName|phoneNumber|streetAddress|apt |city | state |zipCode|
|United States | ch ab | 5723691785 | columbia st | 212 | arlington |Virginia| 22204 |
And User click on Add Your Address button 
Then after added the address a message should be displayed 'Address Added Successfully'

Scenario: Verify User can edit an Address added on account
When User click on Account option 
And User click on edit address option 
And user edit the address with below informations 
|country|fullName|phoneNumber|streetAddress|apt |city | state |zipCode|
|United States | abcde abcde | 7489654214 | 12 wilson rd | 512 | Arlington | Virginia | 22205 |
And User click update Your Address button 
Then a message with 'Address Updated Successfully' should be displayed

Scenario: Verify User can remove Address from Account 
When User click on Account option 
And User click on remove option of Address section
Then Address details should be removed
