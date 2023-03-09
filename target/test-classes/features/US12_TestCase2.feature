Feature: US 12 Test Case 2
  #After the Name, E-mail, Messages and customer/Installation sections Text Boxes in the Get in Touch section
  # are filled in accordance with the criteria, when the Send Message button is clicked,
  # it should be verified that the email is sent successfully.

  Scenario: US 12 Test Case 2
    Given user goes to home page
    And user clicks on the contact button
    And user enters name, mail and his message box
    Then user sees that the message was sent successfully