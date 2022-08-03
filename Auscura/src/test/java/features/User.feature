Feature: Create a New User

Scenario: User is able to navigate a Users List Page
Given User is successfully logged in 
When User click User and Click list in the user 
Then User's List Page should be displayed

 Scenario: User is able to create a new User
 Given Verify that user in the User's List Page
 When User click Create User and enter valid data and click Save
 Then Verify that newly created user in the UsersList
 
 Scenario: User is not able to use a already existing username
 Given Verify that user in the Create new user page
 When User enter existing user details and click save
 Then Username already exist validation message should gets displayed
 
 Scenario: User can't create a new user without filling mandatory fields
 Given Verify that user in the Create a NewUser page
 When  User click save
 Then Validation messages of the mandatory fields should gets displayed 