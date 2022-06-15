Feature: To verify DigiBoxx login page
@DigiBoxxLogin
Scenario: Check login is sucessfull
Given I go to DigiBoxx webpage
When I enter Digispace
Then I enter email
And I enter password
Then I click on login
Then Home Page is displayed