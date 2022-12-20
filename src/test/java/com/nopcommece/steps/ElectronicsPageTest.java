package com.nopcommece.steps;

import com.nopcommece.pages.ElectronicsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ElectronicsPageTest {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I hover mouse on Electronics and Cell Phone and click$")
    public void iHoverMouseOnElectronicsAndCellPhoneAndClick() {
        new ElectronicsPage().clickOnElectronicsMenuAndCellPhone();
    }

    @Then("^I am on cell phone page$")
    public void iAmOnCellPhonePage() throws InterruptedException {
        String expectedText = "Cell phones";
        Assert.assertEquals("User is not on cell phone page", expectedText, new ElectronicsPage().getCellPhoneText());
    }


    @And("^I click on list view tab$")
    public void iClickOnListViewTab() {
        new ElectronicsPage().clickOnListTab();
    }


    @And("^I click on product Nokia Lumia link$")
    public void iClickOnProductNokiaLumiaLink() throws InterruptedException {
        new ElectronicsPage().clickOnNokiaLumia1020();

    }

    @And("^I am on \"([^\"]*)\" product page$")
    public void iAmOnProductPage(String text) {
        Assert.assertEquals("User has not selected right product", text, new ElectronicsPage().getNokiaLumiaText());

    }

    @And("^I verify the price is \"([^\"]*)\"$")
    public void iVerifyThePriceIs(String price) {
        Assert.assertEquals("User has not selected right product", price, new ElectronicsPage().getPriceForNokiaLumia());
    }


    @And("^I changed quantity to \"([^\"]*)\"$")
    public void iChangedQuantityTo(String qty) {
        new ElectronicsPage().updateQuantityTo2();

    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new ElectronicsPage().setAddToCart();
    }

    @And("^I verified the message \"([^\"]*)\" on top green bar$")
    public void iVerifiedTheMessageOnTopGreenBar(String message) {
        Assert.assertEquals("Quantity not added to cart", message, new ElectronicsPage().getAddedToCartMessage());

    }

    @And("^I close the green bar by clicking on the cross button$")
    public void iCloseTheGreenBarByClickingOnTheCrossButton() {
        new ElectronicsPage().closePopUpMessage();
    }

    @And("^I hover mouse on Shopping cart and click on GO TO CART$")
    public void iHoverMouseOnShoppingCartAndClickOnGOTOCART() {
        new ElectronicsPage().clickOnGoToCart();
    }

    @And("^I am on shopping cart page$")
    public void iAmOnShoppingCartPage() {
        String expText = "Shopping cart";
        Assert.assertEquals("User is not on shopping cart", expText, new ElectronicsPage().shoppingCartMessage());
    }

    @And("^I verified the quantity is \"([^\"]*)\"$")
    public void iVerifiedTheQuantityIs(String qty) {
        Assert.assertEquals("Quantity is not as expected", qty, new ElectronicsPage().updateQuantityMessage());
    }

    @And("^I verifeid the Total is \"([^\"]*)\"$")
    public void iVerifeidTheTotalIs(String total) {
        Assert.assertEquals("Total is not correct", total, new ElectronicsPage().verifyTotal());

    }

    @And("^I click on check box I agree with the terms of service$")
    public void iClickOnCheckBoxIAgreeWithTheTermsOfService() {
        new ElectronicsPage().clickOnCheckBox();
    }

    @And("^I click on checkout$")
    public void iClickOnCheckout() {
        new ElectronicsPage().setClickOnCheckoutBox();
    }

    @And("^I verified text \"([^\"]*)\"$")
    public void iVerifiedText(String text) {
        Assert.assertEquals("User is not on checkout page", text, new ElectronicsPage().verifyWelcomeText());
    }

    @And("^I click on Register button$")
    public void iClickOnRegisterButton() {
        new ElectronicsPage().clickOnCheckBox();
    }

    @And("^I am on Register page$")
    public void iAmOnRegisterPage() {
        String expText = "Register";
        Assert.assertEquals("User is not on register page", expText, new ElectronicsPage().verifyRegisterText());
    }

    @And("^I select gender Male$")
    public void iSelectGenderMale() {
        new ElectronicsPage().selectRadioButton("selecting male", By.xpath("//label[@for='gender-male']"));
    }

    @And("^I enter First Name \"([^\"]*)\"$")
    public void iEnterFirstName(String name) {
        new ElectronicsPage().fillingMandatoryFields("Sending name", name, By.id("FirstName"));
    }

    @And("^I enter Last Name \"([^\"]*)\"$")
    public void iEnterLastName(String surname) {
        new ElectronicsPage().fillingMandatoryFields("Sending surname", surname, By.id("LastName"));

    }

    @And("^I select Date of Birth \"([^\"]*)\"$")
    public void iSelectDateOfBirth(String day) {
        new ElectronicsPage().selectByDropDown("Selecting Birth Date", By.name("DateOfBirthDay"), day);
    }

    @And("^I select Birth month \"([^\"]*)\"$")
    public void iSelectBirthMonth(String month) {
        new ElectronicsPage().selectByDropDown("Selecting Birth Month", By.name("DateOfBirthMonth"), month);
    }

    @And("^I select Birth year \"([^\"]*)\"$")
    public void iSelectBirthYear(String year) {
        new ElectronicsPage().selectByDropDown("Selecting Birth Year", By.name("DateOfBirthYear"), year);
    }

    @And("^I enter email$")
    public void iEnterEmail() {
        new ElectronicsPage().randomEmailGeneratorAndSendText(By.id("Email"), "naresh", "kanodia");
    }

    @And("^I enter Password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new ElectronicsPage().passAndConfirmPass(By.id("Password"), password);

    }

    @And("^I confirm Password \"([^\"]*)\"$")
    public void iConfirmPassword(String confirmPass) {
        new ElectronicsPage().passAndConfirmPass(By.id("ConfirmPassword"), confirmPass);

    }

    @And("^I click on register button on register page$")
    public void iClickOnRegisterButtonOnRegisterPage() {
        new ElectronicsPage().selectPressButton("pressing register button", By.id("register-button"));
    }

    @And("^I Registered Successfully and verified$")
    public void iRegisteredSuccessfullyAndVerified() {
        String expText = "Your registration completed";
        new ElectronicsPage().assertAssert("Registration unsucessful", expText,
                new ElectronicsPage().actualTextToVerify(By.xpath("//div[@class='result' and text()='Your registration completed']")));
    }

    @And("^I click on continue tab$")
    public void iClickOnContinueTab() {
        new ElectronicsPage().selectPressButton("Click on CONTINUE tab", By.xpath("//a[contains(@class, 'continue-button')]"));
    }

    @And("^I verify the text Shopping cart$")
    public void iVerifyTheTextShoppingCart() {
        String expText = "Shopping cart";
        new ElectronicsPage().assertAssert("Verify the text Shopping card", expText,
                new ElectronicsPage().actualTextToVerify(By.xpath("//h1[text()='Shopping cart']")));
    }

    @And("^I click on checkbox I agree with the terms of service$")
    public void iClickOnCheckboxIAgreeWithTheTermsOfService() {
        new ElectronicsPage().selectCheckBox("click on checkbox I agree with the terms of service", By.id("termsofservice"));
    }

    @And("^I Click on CHECKOUT$")
    public void iClickOnCHECKOUT() {
        new ElectronicsPage().selectPressButton("Click on CHECKOUT", By.id("checkout"));
    }

    @And("^I Fill the Mandatory fields$")
    public void iFillTheMandatoryFields() {

    }

    @And("^I select billing country \"([^\"]*)\"$")
    public void iSelectBillingCountry(String billCountry) {
        new ElectronicsPage().selectByDropDown("Selecting Country", By.id("BillingNewAddress_CountryId"), billCountry);
    }

    @And("^I enter city \"([^\"]*)\"$")
    public void iEnterCity(String billCity) {
        new ElectronicsPage().fillingMandatoryFields("Entering city", billCity, By.id("BillingNewAddress_City"));
    }

    @And("^I enter address \"([^\"]*)\"$")
    public void iEnterAddress(String add1) {
        new ElectronicsPage().fillingMandatoryFields("Entering Address1", add1, By.id("BillingNewAddress_Address1"));
    }

    @And("^I enter postal code \"([^\"]*)\"$")
    public void iEnterPostalCode(String zip) {
        new ElectronicsPage().fillingMandatoryFields("Entering Zip Code", zip, By.id("BillingNewAddress_ZipPostalCode"));
    }

    @And("^I enter phone number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String phone) {
        new ElectronicsPage().fillingMandatoryFields("Entering Phone number", phone, By.id("BillingNewAddress_PhoneNumber"));
    }

    @And("^I click on Continue after phone$")
    public void iClickOnContinueAfterPhone() {

        new ElectronicsPage().selectPressButton("Click on CONTINUE", By.name("save"));
    }

    @And("^I click on Radio Button “(\\d+)nd Day Air \\(\\$(\\d+)\\.(\\d+)\\)”$")
    public void iClickOnRadioButtonNdDayAir$() {
        new ElectronicsPage().selectRadioButton("Click on Radio Button 2nd Day Air ($0.00)", By.id("shippingoption_2"));
    }

    @And("^I click on Continue after shipping$")
    public void iClickOnContinueAfterShipping() {
        new ElectronicsPage().selectPressButton("Click on CONTINUE", By.xpath("//button[@onclick='ShippingMethod.save()']"));
    }

    @And("^I select Radio Button “Credit Card”$")
    public void iSelectRadioButtonCreditCard() {
        new ElectronicsPage().selectRadioButton("Select Radio Button Credit Card", By.id("paymentmethod_1"));
    }



}
