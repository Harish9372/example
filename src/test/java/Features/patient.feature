Feature: patient history fetching

Scenario: patient history should be displayed

 Given user navigate to the application
 And user enter username and password
 When user click on patient history button
 Then patient history is displayed
 But patient history not displayed