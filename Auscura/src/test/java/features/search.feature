Feature: search functionality

Scenario: Verify search feature is available
Given User successfully logged in
When User click community hospital and search button
Then Verify user redirect into the search page

Scenario: Verify user is able to search
Given Verify user in the search page
When User selects the Location Department From To and click search
Then verify proposed searching data should be displayed

Scenario: Verify that user is able to search with age filter
Given Verify the user in the search page
When User Selects the Location, Department, From, To, age filter and click search
Then Verify Proposed age group data should be displayed

Scenario: Verify that user is able to search with gender filter
Given Check the user in the search page
When User Selects the Location, Department, From, To, gender filter and click search
Then Verify Proposed gender data should be displayed