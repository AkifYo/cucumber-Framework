Feature: US 18 Test Case 01
  @now
  #When you click on the Order Details button from the product board on the My Order page,
  # it should be verified that the relevant order's detail page is accessed.
  Scenario Outline: : US 18 Test Case 01
    Given user goes to home page
    And user clicks to the login button
    And user  enters her "<email>" and "<password>"  and clicks sign in button
    And user selects the DASHBOARD button
    Then user clicks the my order button
    Examples:
      | email | password |
      |akyor06@hotmail.com|Ak233134.|