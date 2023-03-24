Feature: Sign In Feature
Background:
Given User is on retail website
When User click on Sign in option
And User enter email "abdou@gmail.co" and password "Tek@1234567890"
And User click on login button
Then User should be logged in into Account

@smoe2
Scenario: Verify user can sign in into Retail Application
When User click on Sign in option
And User enter email "abdou@gmail.co" and password "Tek@12345678"
And User click on login button
Then User should be logged in into Account




@smoe1
Scenario: Verify user can create an account into Retail Website
And User click on Create New Account button
And User fill the signUp information with below data
| name | email | password | confirmPassword |
| panthers | tijoooo@tekschool.us | Tek@12345 | Tek@12345 |
And User click on SignUp button
Then User should be logged into account page