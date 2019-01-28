Feature: Netflix

Scenario: Sign into Netflix
	Given the user is on the "Sign In" page
	When she enters "testa6215@gmail.com" 
	And she enters "Pass1234"
	And she clicks on the sign in button
	Then she will land on the "home page"