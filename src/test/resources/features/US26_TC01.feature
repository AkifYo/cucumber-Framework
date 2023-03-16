Feature: US 26 Test Case 01

Background:
    Given user goes to home page
    When user sees the home page
    Then User sees the products

  Scenario: US 26 Test Case 01
#Verify that the site is accessible.
    Then User sees the products

  Scenario: US 26 Test Case 02
#It should be verified that the products on the site are displayed without registering on the site.
    Then User hover over the product

    Scenario: US 26 Test Case 03
      #Verify that the Add to Cart button appears when hovering over a product as a visitor.
  Then User hover over the product end she is able to add product to cart

  Scenario: US 26 Test Case 04
     #When clicking the Add to Cart button that appears when hovering over the product as a visitor,
      #it should be verified that the product has been added to the Cart page.
    Then User add to product to cart


  Scenario: US 26 Test Case 05
    #Verify that the View Cart button is visible in the Item added to your cart window and when clicked,
      # it redirects to the Cart page.
    Then User add to product to cart
    Then User can clicks the View Cart Button and navigate to the cart page

  Scenario: US 26 Test Case 06
    #Verify that the Proceed to Checkout button is visible on the Cart page.
    Then User add to product to cart
    Then User can clicks the View Cart Button and navigate to the cart page
    Then User can see the proceed To checkout button



  Scenario: US 26 Test Case 07
    #When the Proceed to Checkout button is clicked,
    # it should be verified that it redirects to the Checkout page.
    Then User add to product to cart
    Then User can clicks the View Cart Button and navigate to the cart page
    Then User clicks to the Proceed to checkout


  Scenario: US 26 Test Case 08
    #It should be verified
    # that it is mandatory to enter E-mail in the Contact Information field on the Checkout page.
    Then User add to product to cart
    Then User can clicks the View Cart Button and navigate to the cart page
    Then User clicks to the Proceed to checkout
    Then User have to enter her mail

  Scenario: US 26 Test Case 09
    #Verify that the Email me with news and offers Check Box is visible and selected.
    Then User add to product to cart
    Then User can clicks the View Cart Button and navigate to the cart page
    Then User clicks to the Proceed to checkout
    Then User have to enter her mail
    Then Users clicks the news and offers checkbox

  Scenario: US 26 Test Case 10
    #Verify that the Home delivery and Pickup Location radio buttons are visible
    # and selectable in the Shipping Address section.
    Then User add to product to cart
    Then User can clicks the View Cart Button and navigate to the cart page
    Then User clicks to the Proceed to checkout
    Then User have to enter her mail
    Then Users clicks the news and offers checkbox
    Then User clicks the Home delivery and Pickup Location

  Scenario: US 26 Test Case 11
 # In the Shipping Address section, it must be verified that the Name, Address, Phone, Country, State,
 # City Text Boxes must be filled in order for the address to be registered.
    Then User add to product to cart
    Then User can clicks the View Cart Button and navigate to the cart page
    Then User clicks to the Proceed to checkout
    Then User have to enter her mail
    Then Users clicks the news and offers checkbox
    Then User clicks the Home delivery and Pickup Location
    Then User fills in all shipping information


  Scenario: US 26 Test Case 12
    #Verify that the I agree with the terms and conditions Check Box is visible and selected.
    Then User add to product to cart
    Then User can clicks the View Cart Button and navigate to the cart page
    Then User clicks to the Proceed to checkout
    Then User have to enter her mail
    Then Users clicks the news and offers checkbox
    Then User clicks the Home delivery and Pickup Location
    Then User fills in all shipping information
    Then User clicks the terms and condition


  Scenario: US 26 Test Case 13
    #Verify that the Continue to Shipping button is visible on the checkout page.
    Then User add to product to cart
    Then User can clicks the View Cart Button and navigate to the cart page
    Then User clicks to the Proceed to checkout
    Then User sees the continue to shipping button


  Scenario: US 26 Test Case 14
    #After the requested information is entered in the relevant Text Boxes,
    #it should be verified that it redirects to the Shipping page when the Continue to Shipping button is clicked.
    Then User add to product to cart
    Then User can clicks the View Cart Button and navigate to the cart page
    Then User clicks to the Proceed to checkout
    Then User have to enter her mail
    Then Users clicks the news and offers checkbox
    Then User clicks the Home delivery and Pickup Location
    Then User fills in all shipping information
    Then User clicks the terms and condition
    Then User clicks the continue to shipping button


  Scenario: US 26 Test Case 15
    #Verify that the Continue to Payment button is visible on the Shipping page.
    Then User add to product to cart
    Then User can clicks the View Cart Button and navigate to the cart page
    Then User clicks to the Proceed to checkout
    Then User have to enter her mail
    Then User fills in all shipping information
    Then User clicks the continue to shipping button
    Then User sees the Continue to Payment


  Scenario: US 26 Test Case 16
#When one of the Shipping Methods is selected and the Continue to Payment button is clicked,
  # it should be verified that it redirects to the Payment page.
    Then User add to product to cart
    Then User can clicks the View Cart Button and navigate to the cart page
    Then User clicks to the Proceed to checkout
    Then User have to enter her mail
    Then User fills in all shipping information
    Then User clicks the continue to shipping button
    Then User clicks to the Continue to Payment button

  Scenario: US 26 Test Case 17
    #Verify that the Pay Now button is visible on the Payment page.
    Then User add to product to cart
    Then User can clicks the View Cart Button and navigate to the cart page
    Then User clicks to the Proceed to checkout
    Then User have to enter her mail
    Then User fills in all shipping information
    Then User clicks the continue to shipping button
    Then User clicks to the Continue to Payment button
    Then User sees the Pay Now button


  Scenario: US 26 Test Case 18
    #After selecting one of the payment methods and entering the required information,
    # it should be verified that it redirects to the Order Summary page when the Pay Now button is clicked.
    Then User add to product to cart
    Then User can clicks the View Cart Button and navigate to the cart page
    Then User clicks to the Proceed to checkout
    Then User have to enter her mail
    Then User fills in all shipping information
    Then User clicks the continue to shipping button
    Then User clicks to the Continue to Payment button
    Then User clicks to the Pay Now button
  @now
  Scenario: US 26 Test Case 19
    #Verify that the Continue Shopping button is visible on the Order Summary page.
    Then User add to product to cart
    Then User can clicks the View Cart Button and navigate to the cart page
    Then User clicks to the Proceed to checkout
    Then User have to enter her mail
    Then User fills in all shipping information
    Then User clicks the continue to shipping button
    Then User clicks to the Continue to Payment button
    Then User clicks to the Pay Now button
    Then User sees the Continue Shopping

  Scenario: US 26 Test Case 20
    Then User add to product to cart
    Then User can clicks the View Cart Button and navigate to the cart page
    Then User clicks to the Proceed to checkout
    Then User have to enter her mail
    Then User fills in all shipping information
    Then User clicks the continue to shipping button
    Then User clicks to the Continue to Payment button
    Then User clicks to the Pay Now button
    Then User clicks to the Continue Shopping