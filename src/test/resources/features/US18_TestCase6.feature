Feature: US 18 Test Case 06
#In the window that opens, it should be confirmed that the entered order is canceled
# when a selection is made from the Reason dropbox and the send button is clicked.

Scenario Outline: US 18 Test Case 06
Given user goes to home page
And user clicks to the login button
And user  enters her "<email>" and "<password>"  and clicks sign in button
And user selects the DASHBOARD button
Then user clicks the my order button
Then user selects a reason from the list
And sends it with clicking the send button
Examples:
| email | password |
|akyor06@hotmail.com|Ak233134.|