Feature: GitHub Login functionality Feature

@execute
Scenario: User is trying to signin in GitHub using Invalid Username and password

Given user is on GitHub login page
When User enter invalid username and password
Then 'Incorrect username or password.' Message will display


Scenario:  User is trying to signin in GitHub using valid Username and password

Given user is on GitHub login page
When user enter valid username and password
Then user should successfully signin on his GitHub account
