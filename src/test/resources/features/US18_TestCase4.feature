Feature: US 18 Test Case 02
  @now
Scenario Outline: US 18 Test Case 02
Given user goes to home page
And user clicks to the login button
And user  enters her "<email>" and "<password>"  and clicks sign in button
And user selects the DASHBOARD button
Then user clicks the my order button
And user clicks the order details button
Then user can see what he meaning of Pending, Processing, Shipped, Recieved, Delivered stages related to the relevant order process
Examples:
| email | password |
|akyor06@hotmail.com|Ak233134.|