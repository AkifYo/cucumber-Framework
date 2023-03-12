Feature: US 18 Test Case 05
#(If it is an incomplete order) Verify that the Cancel Order button on
# the My Order page is visible and redirects to the Select cancel reason window.

Scenario Outline: US 18 Test Case 05
Given user goes to home page
And user clicks to the login button
And user  enters her "<email>" and "<password>"  and clicks sign in button
And user selects the DASHBOARD button
Then user clicks the my order button
And user clicks the order details button
Then user clicks the cancel order button and cancel screen appears
Examples:
| email | password |
|akyor06@hotmail.com|Ak233134.|