Feature: Login functionality Feature

@execute
Scenario: User is trying to signin when Username and password is empty

Given user is on login page

When User does not enter username 
Then 'Enter Username' Message will display

When User does not enter password
Then 'Enter Password' Message will display

@execute
Scenario: User is trying to signin using Invalid Username and password

Given user is on login page
When User enter invalid username and password
Then 'Incorrect username or password.' Message will display

@execute
Scenario:  User is trying to signin using valid Username and password

Given user is on login page
When user enter valid username and password
Then target window will open.
