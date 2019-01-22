Feature: Non registered user
Background: User is on homepage
  @nonregistered
  Scenario: Unregistered user should not be able to send email
    Given User is on homepage and has not registered details
    When User selects product from homepage and clicks on email friend option
    And Fills out email friend details
    Then User should not be able to send email to friend successfully

    @termsconditions
    Scenario: User must accept terms and conditions in order to checkout
      Given User is on homepage
      When User selects product and adds product to cart
      And User clicks on the shopping cart link
      When User clicks on terms and service and checkout link
      Then User will be able to proceed with checkout and see welcome message

      @addtocart
      Scenario: User should be able to see 4 add to cart buttons with the homepage products
        Given User is on homepage
        When User inspects the add to cart links that are with the four products
        Then User should be able to see four add to cart buttons

