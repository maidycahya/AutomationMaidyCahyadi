Feature: Login and Cart Functionality

	#  Scenario: Check login in successfully with valid credentials
	#Given browser is open
	#When user is on login page 
	#When user enters username and password
	#And clicks on login button
	#Then user is navigated to the home page

  Scenario Outline: Check Logout in successfully
	Given browser is open logout
	When user is on login page logout
	When logout user enters <logout_username> and <logout_password>
	Then clicks on login button logout
    And add to cart sauce labs backpack logout
    And shopping cart container logout
	And clicks on hamburger menu logout
	And click on menu logout logout
    Then user is navigated to dashboard login


	Examples:
	  | logout_username 		| logout_password |
	  | standard_user 	| secret_sauce	|



