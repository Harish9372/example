Feature:  demo flight ticket  booking

Scenario Outline:  flight details should displayed

Given user should navigate to the application
And user should cancel the popup
And user should enter the destination from "<CITY1>" to "<CITY2>"
And user should enter the "<DEPARTURE>"
And user should enter the "<TRAVELLERS>" and "<CLASS>"
When user click on the search flight button
Then flight details page displayed

Examples: 

|     CITY1     |     CITY2     |     DEPARTURE     |     TRAVELLERS     |     CLASS     |

|   HYDERABAD   |   CHENNAI     |     25

