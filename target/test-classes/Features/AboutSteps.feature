Feature: feature to test login functionality

	#  Scenario: Check login in successfull with valid credentials 
	#Given browser is open
	#When user is on login page 
	#When user enters username and password
	#And clicks on login button
	#Then user is navigated to the home page

  Scenario Outline: Check about information
	Given browser is open product
	When user is on login page product
	When product user enters <product_username> and <product_password>
	And clicks on login button product
	And clicks on hamburger menu
	And click menu about
    Then user is navigated to the about information

	Examples:
	  | product_username 	| product_password |
	  | standard_user 	| secret_sauce 	|

