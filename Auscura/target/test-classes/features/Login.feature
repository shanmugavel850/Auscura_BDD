Feature: Login into Application

Scenario: Login with Invalid credentials
Given Navigating to URL
When User enters Invalid Credentials and click login
Then Verify the notification for invalid credentials

Scenario: Login with Valid Username and Invalid password
Given Verify user in the given URL
When User enter valid username and invalid password
Then Verify the notication for invalid password

Scenario: Login with Invalid Username and Valid password
Given Veriy user in the given URL
When User enter Invalid username and valid password
Then Verify the notification for invalid username

Scenario: Login  with valid credentials
Given Verify the user in the given URL
When User enters valid login Credentials and click login
Then Verify that user is successfully logged in








