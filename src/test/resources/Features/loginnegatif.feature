Feature: feature to test login functionality

	#  Scenario: Check login in successfull with valid credentials 
	#Given browser is open
	#When user is on login page 
	#When user enters username and password
	#And clicks on login button
	#Then user is navigated to the home page

  Scenario Outline: Check login in failed with failed credentials
	Given browser is open negative
	When user is on login page negative
	When negative user enters <invalid_username> and <invalid_password>
	Then clicks on login button negative
	Then user sees an error message negative

	Examples:
	  | invalid_username 	| invalid_password |
	  | standard_user 	| secret23  	|
	  | problem_user23	| secret_sauce	|
