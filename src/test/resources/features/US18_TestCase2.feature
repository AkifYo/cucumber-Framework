Feature: US 18 Test Case 02
#On the Order Details page, it should be verified that
# the Order ID, Status, Order date, Order Amount, Package, Price, Shipping Info, Billing Info, Payment Info information is displayed.
Scenario Outline: US 18 Test Case 02
Given user goes to home page
And user clicks to the login button
And user  enters her "<email>" and "<password>"  and clicks sign in button
And user selects the DASHBOARD button
Then user clicks the my order button
And user clicks the order details button
Then user can see he Order ID, Status, Order date, Order Amount, Package, Price, Shipping Info, Billing Info, Payment Info
Examples:
| email | password |
|akyor06@hotmail.com|Ak233134.|