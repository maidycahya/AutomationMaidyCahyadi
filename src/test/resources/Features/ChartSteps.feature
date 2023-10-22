Feature: Login and Cart Functionality

	#  Scenario: Check login in successfully with valid credentials
	#Given browser is open
	#When user is on login page 
	#When user enters username and password
	#And clicks on login button
	#Then user is navigated to the home page

  Scenario Outline: Check login in successfully with valid credentials
	Given browser is open chart
	When user is on login page chart
	When chart user enters <step_username> and <step_password>
	Then clicks on login button chart
    And add to cart sauce labs backpack
    And shopping cart container
    Then user is navigated to the chart information

	Examples:
	  | step_username 		| step_password |
	  | standard_user 	| secret_sauce	|



