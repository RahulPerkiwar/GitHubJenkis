Feature: Login Page Automation of Saucedemo Application
Scenario: Check login is successfully with valid creds
Given User is on login page
When User enters the valid "<username>" and "<password>"
And Click on login button
Then User navigate to home page
And Close the browser

Examples:
| username | password |
#| standrad_user | secret_sauce |
#| locked_out_user | secret_sauce |
| problem_user | secret_sauce |
#| performance_glitch_user | secret_sauce |
