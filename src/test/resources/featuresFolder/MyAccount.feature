
@MyAccount
Feature: My Account

  Background: 
    Given User is on Retail website
    And User click  on MyAccount
    When User click on Login
    And User enter username 'taha1@gmail.com' and password 'TahaOne'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on ‘Register for an Affiliate Account’ link
    And User fill affiliate form with below information
      | company  | website          | taxID | payeeName |
      | HealthAT | www.healthat.com | 12345 | Asra      |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

  
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on ‘Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName   | abaNumber | swiftCode | accountName | accountNumber |
      | wellsfargo |    567890 |   1234567 | Asra        |      12345678 |
    And User click on Continue button
    Then User should see a success message
@accountpageone
  Scenario: Edit your account Information
    When User click on ‘Edit your account information’ link
    And User modify below information
      | firstname | lastName | email          | telephone  |
      | taha2      | Ghafoori | taha2@gmail.com | 9162226541 |
    And User click on Continue button
    Then User should see a message ‘Success: Your account has been successfully updated.’
