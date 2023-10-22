Feature: Login and Cart Functionality

	#  Scenario: Check login in successfully with valid credentials
	#Given browser is open
	#When user is on login page 
	#When user enters username and password
	#And clicks on login button
	#Then user is navigated to the home page

  Scenario Outline: Check login in successfully with valid credentials
	Given browser is open checkout1
	When user is on login page checkout1
	When checkout1 user enters <step_username> and <step_password>
	Then clicks on login button checkout1
    And add to cart sauce labs backpack checkout1
    And shopping cart container checkout1
    Then user is navigated to the chart information checkout1
    And user proceeds to checkout checkout1
    When user input information <first_name> and <last_name> and <portal_code>
	And user click on continue
	And user click on finish
	Then user checkout in successfully





	Examples:
	  | step_username 		| step_password | first_name 	| last_name | portal_code |
	  | standard_user 	    | secret_sauce	|   maidy	    | cahyadi	| 11540       |


