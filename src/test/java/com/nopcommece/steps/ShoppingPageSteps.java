package com.nopcommece.steps;

import com.nopcommece.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ShoppingPageSteps {

    @And("^I click on Add To Cart$")
    public void iClickOnAddToCart() throws InterruptedException {
        new ShoppingCartPage().clickOnShoppingCart();
    }

    @And("^I Verify the Text Build your own computer$")
    public void iVerifyTheTextBuildYourOwnComputer() {
        String expMessage = "Build your own computer";
        String actMessage = new ShoppingCartPage().actualTextToVerify(By.xpath("//h1[contains(text(),'Build your own computer')]"));
        Assert.assertEquals("Not on Build your own page", expMessage,
                actMessage);

    }

    @And("^I Select (\\d+)\\.(\\d+) GHz Intel Pentium Dual-Core E(\\d+) using Select$")
    public void iSelectGHzIntelPentiumDualCoreEUsingSelect() throws InterruptedException {
        Thread.sleep(10000);
        new ShoppingCartPage().selectByDropDown("Selecting 2.2 GHz Intel Pentium Dual-Core E2200",
                By.name("product_attribute_1"), "2.2 GHz Intel Pentium Dual-Core E2200");
    }

    @And("^I Select (\\d+)GB \\[\\+\\$(\\d+)\\.(\\d+)\\] using Select class\\.$")
    public void iSelectGB$UsingSelectClass() {
        new ShoppingCartPage().selectByDropDown("Selecting 8GB [+$60.00] ", By.name("product_attribute_2"), "8GB [+$60.00]");
    }

    @And("^I Select HDD radio (\\d+) GB \\[\\+\\$(\\d+)\\.(\\d+)\\]$")
    public void iSelectHDDRadioGB$() {
        new ShoppingCartPage().selectRadioButton("Selecting 400 GB [+$100.00]", By.id("product_attribute_3_7"));
    }

    @And("^I Select OS radio Vista Premium \\[\\+\\$(\\d+)\\.(\\d+)\\]$")
    public void iSelectOSRadioVistaPremium$() {
        new ShoppingCartPage().selectRadioButton("Selecting Vista Premium [+$60.00]", By.id("product_attribute_4_9"));
    }

    @And("^I check Check Two Check boxes Microsoft Office \\[\\+\\$(\\d+)\\.(\\d+)\\] and Total Commander\\[\\+\\$(\\d+)\\.(\\d+)\\]$")
    public void iCheckCheckTwoCheckBoxesMicrosoftOffice$AndTotalCommander$() {
        new ShoppingCartPage().selectCheckBox("Selecting Microsoft Office [+$50.00]\" and \"Total Commander [+$5.00]", By.id("product_attribute_5_12"));

    }

    @And("^I Verify the price \\$(\\d+),(\\d+)\\.(\\d+)$")
    public void iVerifyThePrice$() {
        String expMessage = "$1,475.00";
        Assert.assertEquals("Price Not Matching", expMessage, new ShoppingCartPage().actualTextToVerify(By.xpath("//span[@id='price-value-1']")));
    }

    @And("^I Click on ADD TO CARD Button$")
    public void iClickOnADDTOCARDButton() {
        new ShoppingCartPage().selectPressButton("ADD TO CARD", By.xpath("//button[@id='add-to-cart-button-1']"));
    }

    @And("^I verify Verify the Message The product has been added to your shopping cart on Topgreen Bar$")
    public void iVerifyVerifyTheMessageTheProductHasBeenAddedToYourShoppingCartOnTopgreenBar() {
        String expMessage = "The product has been added to your shopping cart";
        Assert.assertEquals("Product not added to Shopping Cart", expMessage, new ShoppingCartPage().actualTextToVerify(By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]")));

    }

    @And("^I MouseHover on Shopping cart and Click on GO TO CART button\\.$")
    public void iMouseHoverOnShoppingCartAndClickOnGOTOCARTButton() {
        new ShoppingCartPage().selectPressButton("Clicking Cross button and closing bar", By.xpath("//span[@class='close']"));
        new ShoppingCartPage().mouseHoveronShoppingCartAndClickOnGoToCart();
    }

    @And("^I Verify the message Shopping cart$")
    public void iVerifyTheMessageShoppingCart() {
        String expMessage = "Shopping cart";
        Assert.assertEquals("Not on Shopping Cart", expMessage, new ShoppingCartPage().actualTextToVerify(By.xpath("//h1[contains(text(),'Shopping cart')]")));
    }

    @And("^I Change the Qty to (\\d+) and Click on Update shopping cart$")
    public void iChangeTheQtyToAndClickOnUpdateShoppingCart(int arg0) {
        new ShoppingCartPage().changeTheQuantityTo2AndClickOnUpdateShoppingCart();
    }

    @And("^I Verify the Total\\$(\\d+),(\\d+)\\.(\\d+)$")
    public void iVerifyTheTotal$() {
        String expMessage = "$2,950.00";
        Assert.assertEquals("Total is incorrect", expMessage, new ShoppingCartPage().actualTextToVerify(By.xpath("(//strong[text()='$2,950.00'])[2]")));
    }

    @And("^I click on checkbox I agree with the terms of service$")
    public void iClickOnCheckboxIAgreeWithTheTermsOfService() {
        new ShoppingCartPage().selectCheckBox("click on checkbox I agree with the terms of service", By.id("termsofservice"));
    }

    @And("^I Click on CHECKOUT$")
    public void iClickOnCHECKOUT() {
        new ShoppingCartPage().selectPressButton("Pressing checkout Button", By.id("checkout"));
    }

    @And("^I Verify the Text Welcome, Please Sign In!$")
    public void iVerifyTheTextWelcomePleaseSignIn() {
        String expMessage = "Welcome, Please Sign In!";
        Assert.assertEquals("Not Signed in", expMessage, new ShoppingCartPage().actualTextToVerify(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")));

    }

    @And("^I (\\d+)Click on CHECKOUT AS GUEST Tab$")
    public void iClickOnCHECKOUTASGUESTTab(int arg0) {
        new ShoppingCartPage().selectPressButton("Click on “CHECKOUT AS GUEST”Tab", By.xpath("//button[contains(text(),'Checkout as Guest')]"));
    }
    // ***************************************************************************
    @And("^I Fill the all mandatory field$")
    public void iFillTheAllMandatoryField() {
        new ShoppingCartPage().fillingMandatoryFields("Entering Fist Name", "Prime", By.id("BillingNewAddress_FirstName"));
        new ShoppingCartPage().fillingMandatoryFields("Entering Last Name", "Testing", By.id("BillingNewAddress_LastName"));
        new ShoppingCartPage().randomEmailGeneratorAndSendText(By.id("BillingNewAddress_Email"), "Prime", "Testing");
        new ShoppingCartPage().selectByDropDown("Selecting Country", By.id("BillingNewAddress_CountryId"), "India");
        new ShoppingCartPage().fillingMandatoryFields("Entering city", "Ahmedabad", By.id("BillingNewAddress_City"));
        new ShoppingCartPage().fillingMandatoryFields("Entering Address1", "999 Raghunath Ni Pol", By.id("BillingNewAddress_Address1"));
        new ShoppingCartPage().fillingMandatoryFields("Entering Zip Code", "380011", By.id("BillingNewAddress_ZipPostalCode"));
        new ShoppingCartPage().fillingMandatoryFields("Entering Phone number", "9989711425", By.id("BillingNewAddress_PhoneNumber"));


    }

    @And("^I Click on CONTINUE$")
    public void iClickOnCONTINUE() {

        new ShoppingCartPage().selectPressButton("Click on Continue", By.name("save"));

    }

    @And("^I Click on Radio Button Next Day Air\\(\\$(\\d+)\\.(\\d+)\\)$")
    public void iClickOnRadioButtonNextDayAir$() {

        new ShoppingCartPage().selectRadioButton("Click on Radio Button Next Day Air($0.00)", By.id("shippingoption_1"));
        new ShoppingCartPage().selectPressButton("clicking CONTINUE", By.xpath("//button[@onclick='ShippingMethod.save()']"));

    }


    @And("^I select Radio Button Credit Card$")
    public void iSelectRadioButtonCreditCard() {
        new ShoppingCartPage().selectRadioButton("Select Radio Button Credit Card", By.id("paymentmethod_1"));
        new ShoppingCartPage().selectPressButton("clicking CONTINUE", By.xpath("//button[@onclick='PaymentMethod.save()']"));


    }

    @And("^I Select Master card From Select credit card dropdown$")
    public void iSelectMasterCardFromSelectCreditCardDropdown() {

        new ShoppingCartPage().selectByDropDown("Select Master card From Select credit card dropdown", By.id("CreditCardType"), "Master card");
    }

    @And("^I Fill all the details$")
    public void iFillAllTheDetails() {

        new ShoppingCartPage().fillingMandatoryFields("Fill the name", "Prime Testing", By.id("CardholderName"));
        new ShoppingCartPage().fillingMandatoryFields("Entering Credit Card number", "5357793919621142", By.id("CardNumber"));
        new ShoppingCartPage().selectByDropDown("Selecting Expiry Date", By.id("ExpireMonth"), "10");
        new ShoppingCartPage().selectByDropDown("Selecting Expiry Month", By.id("ExpireYear"), "2025");
        new ShoppingCartPage().fillingMandatoryFields("Entering Credit Card Code", "283", By.id("CardCode"));


    }

    @And("^I click Click on CONTINUE$")
    public void iClickClickOnCONTINUE() {
        new ShoppingCartPage().selectPressButton("Click Continue Button", By.id("payment-info-buttons-container"));

    }

    @And("^I Verify Payment Method is Credit Card$")
    public void iVerifyPaymentMethodIsCreditCard() {

        new ShoppingCartPage().assertAssert("Verify Payment Method is Credit Card","Credit Card",
                new ShoppingCartPage().actualTextToVerify(By.xpath("//span[contains(text(), 'Credit Card')]")));
    }

    @And("^I Verify Shipping Method is Next Day Air$")
    public void iVerifyShippingMethodIsNextDayAir() {

        new ShoppingCartPage().assertAssert("Verify “Shipping Method” is Next Day Air",
                "Next Day Air", new ShoppingCartPage().actualTextToVerify(By.xpath("//span[contains(text(), 'Next Day Air')]")));
    }

    @And("^I Verify Total is \\$(\\d+),(\\d+)\\.(\\d+)$")
    public void iVerifyTotalIs$() {
        new ShoppingCartPage().assertAssert("Verify Total is $2,950.00", "$2,950.00",
                new ShoppingCartPage().actualTextToVerify(By.xpath("(//strong[text()='$2,950.00'])[2]")));

    }

    @And("^I Click on CONFIRM$")
    public void iClickOnCONFIRM() {
        new ShoppingCartPage().selectPressButton("Click on CONFIRM", By.xpath("//button[@onclick='ConfirmOrder.save()']"));
    }

    @And("^I Verify the Text Thank You$")
    public void iVerifyTheTextThankYou() {
        new ShoppingCartPage().assertAssert("Verify the Text Thank You", "Thank you",
                new ShoppingCartPage().actualTextToVerify(By.xpath("//h1[text()='Thank you']")));
    }

    @And("^I Verify the message Your order has been successfully processed!$")
    public void iVerifyTheMessageYourOrderHasBeenSuccessfullyProcessed() {
        new ShoppingCartPage().assertAssert("Verify the message Your order has been successfully processed!",
                "Your order has been successfully processed!",
                new ShoppingCartPage().actualTextToVerify(By.xpath("//strong[contains(text(), 'fully processed!')]")));
    }

    @And("^I Verify the text Welcome to our store$")
    public void iVerifyTheTextWelcomeToOurStore() {

        new ShoppingCartPage().selectPressButton("Click on CONTINUE", By.xpath("//button[@onclick='setLocation(\"/\")']"));
    }

    @Then("^I verifyProductAddedToShoppingCartSuccessFully$")
    public void iVerifyProductAddedToShoppingCartSuccessFully() {
        new ShoppingCartPage().assertAssert("Verify the text Welcome to our store",
                "Welcome to our store",
                new ShoppingCartPage().actualTextToVerify(By.xpath("//h2[text()='Welcome to our store']")));
    }


}
