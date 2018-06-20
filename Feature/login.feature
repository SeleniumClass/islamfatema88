Feature: Free GCR Shop login feature
Scenario: Free GCR Shop login feature

Given user is already on login page
And title of login page is GCR Shop
When user click on login button
And user enter "sarowerny@gmail.com" into username text fields on home screen
And user enter "student" into username password fields on home screen
And user click on sign in button
Then user is on home page