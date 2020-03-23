Feature: validation of automation practice page

  Background: 
    Given launch application
    And verify page title is "My Store"

  @test
  Scenario: 01_Order T-Shirt and Verify in Order History
    Given login to the application using valid "userName" and "password"
    And verify page title is "My account - My Store"
    When add tshirt to the cart
    Then complete the order process
    And verify in Order History

  @test
  Scenario Outline: 02_Update Personal Information Last Name in My Account
    Given login to the application using valid "userName" and "password"
    And verify page title is "My account - My Store"
    When navigate to my personal information page
    Then verify page title is "Identity - My Store"
    And update "<last name>" in the details section
    Then enter old "password"
    And Click on save button
    Then verify "<last name>" got update successfully

    Examples: 
      | last name |
      | testlastA |
