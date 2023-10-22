Feature: feature to test login functionality

	#  Scenario: Check login in successfully with valid credentials
	#Given browser is open
	#When user is on login page 
	#When user enters username and password
	#And clicks on login button
	#Then user is navigated to the home page

  Scenario Outline: Check login in successfully with valid credentials
	Given browser is open
	When user is on login page
	When user enters <username> and <password>
	Then clicks on login button
	Then user is navigated to the home page

	Examples:
	  | username 		| password 		|
	  | standard_user 	| secret_sauce	|
	  | problem_user 	| secret_sauce	|
