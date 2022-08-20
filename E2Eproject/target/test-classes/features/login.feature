Feature: Login into Application

Scenario Outline: Positive test Validating login
Given Initialize the browser with chrome
And Navigate to "http://qaclickacademy.com" site
And Click on Login link in home page to land on Secure sign in page
When User enters <username> and <password> and logs in 
Then Verify that user is successfully logged in



Examples:
|username	                |password|
|jigyasabajaj93@gmail.com	|Khandwa450001|
|jigyasabajaj@gmail.com	    |Khandwa450002|

