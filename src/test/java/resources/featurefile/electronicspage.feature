Feature: Electronics Page Test

  Scenario: Verify user should navigate to cell phone page
    Given I am on homepage
    When I hover mouse on Electronics and Cell Phone and click
    Then I am on cell phone page

  @test2
  Scenario: Verify that the product added successfully and place order successfully
    Given I am on homepage
    When I hover mouse on Electronics and Cell Phone and click
    And I am on cell phone page
    And I click on list view tab
    And I click on product Nokia Lumia link
    And I am on "Nokia Lumia 1020" product page
    And I verify the price is "$349.00"
    And I changed quantity to "2"
    And I click on add to cart button
    And I verified the message "The product has been added to your shopping cart" on top green bar
    And I close the green bar by clicking on the cross button
    And I hover mouse on Shopping cart and click on GO TO CART
    And I am on shopping cart page
    And I verified the quantity is "2"
    And I verifeid the Total is "$698.00"
    And I click on check box I agree with the terms of service
    And I click on checkout
    And I verified text "Welcome, Please Sign In!"
    And I click on Register button
    And I am on Register page
    And I select gender Male
    And I enter First Name "Naresh"
    And I enter Last Name "Kanodia"
    And I select Date of Birth "19"
    And I select Birth month "December"
    And I select Birth year "1950"
    And I enter email
    And I enter Password "abc123"
    And I confirm Password "abc123"
    And I click on register button on register page
    And I Registered Successfully and verified
    And I click on continue tab
    And I verify the text Shopping cart
    And I click on checkbox I agree with the terms of service
    And I Click on CHECKOUT
    And I Fill the Mandatory fields
#    And I enter first name on check out "Naresh"
#    And I enter last name "Kanodia"
    And I select billing country "United Kingdom"
#    And I enter email "NareshKanodia@gmail.com"
    And I enter city "London"
    And I enter address "19 Grant road"
    And I enter postal code "NW9 0EX"
    And I enter phone number "01234567890"
    And I click on Continue after phone
    And I click on Radio Button “2nd Day Air ($0.00)”
    And I click on Continue after shipping
    And I select Radio Button “Credit Card”
    And I select “Visa” From Select credit card dropdown
    And I enter card holder name "Naresh Kanodia"
    And I enter credit card number "4024007105297690"
    And I enter month of expiry "10"
    And I enter year of expiry "2023"
    And I enter card code "728"
    And I click on payment continue button
    And I am verifying payment method and is credit card
    And I am verifying shipping method and is 2nd day air
    And I am verifying final total "$698.00"
    And I am pressing confirm save button
    And I am verifying message "Thank you"
    And I verify the order is successfull
    And I press continue button at the end
    And I am on welcome page again
    And I press log out link
    Then I verified URL





