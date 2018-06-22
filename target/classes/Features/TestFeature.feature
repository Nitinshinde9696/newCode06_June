Feature: Test Cucumer program
Description: test the code
Scenario: Testing cucumber scenarios

Given Browser is open
When User navigate to Application
Then User Enter invalid userID and Password
Then User click on Login Button
But user unable to login
When User navigate to Application
Then User Enter userID and Password
Then User click on Login Button
And user Login successful
Then user navigate




