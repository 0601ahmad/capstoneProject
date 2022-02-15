@desktop
Feature: Desktops

  Background: 
    Given user is on Retail website
    When user click on Destops tab
    When user click on Show all Desktops

  Scenario: user verify all items are present in Destops tab
    Then user should see all items are present in Desktop page

  Scenario: user add HP LP 3065 from Desktops tab to the cart
    And user click ADD TO CART option on Hp LP3065 item
    And user select quantity one
    And user click add to Cart button
    Then User should see a message "Success: you have added HP LP 3065 to your Shopping cart!" and "screenOne"

  Scenario: user add Canon EOS 5D from Desktops tab to the cart
    And user click ADD TO CART option on Canon EOS 5D item
    And user select color from dropdown Red
    And user select quantity one
    And user click add to Cart button
    Then User should see a message along "Success: You have added Canon EOS 5D to your shopping cart!" and "screenTwo"

  Scenario: user add a review to Canon EOS 5D item in Desktops tab
    And user click on Canon EOS 5D item
    And user click on write a review link
    And user fill the review information with below information
      | name  | review                                            |
      | Ahmad | This camera is really good and I enjoy using it!! |
    And user select good for Rating
    And user click on Continue button
    Then User should see a message with "Thank you for your review. It has been submitted to the webmaster for approval." and "screenThree"
