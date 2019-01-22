Feature: User registration
  @registration
  Scenario: User should be able to register successfully
    Given User is on homepage and clicks on the register link
    When User fills out registration form and clicks register
    Then User should be registered successfully and be able to see successful message

    @emailfriend
    Scenario: Registered user should be able to send email with product successfully
      Given User has registered successfully
      When User clicks on the log in button and enters log in details
      And Selects product from homepage and clicks on email a friend option
      And User fills out email a friend page
      Then User should be able to send email to friend successfully

      @purchase
      Scenario: Registered user must be able to purchase a product successfully
        Given User is on homepage
        When User registers their details and clicks on the log in link
        And User enters login details and succesffuly logs in
        And selects product from homepage and adds product to cart
        And User clicks on the terms and service button and fills out checkout page
        Then User should be able to purchase product successfully and see order successful message



