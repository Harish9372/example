Feature: feature to test login functionality

Scenario Outline: login should be successfull

Given user navigate to the application
And user click on login button 
And user click on cancel popup
And user enter the destination from "<CITY1>" to "<CITY2>"
When user click on search flights
Then flights status will be displayed

Examples:

|CITY1|CITY2|
|Hyderabad|Chennai|

