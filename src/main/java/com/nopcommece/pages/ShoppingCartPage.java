package com.nopcommece.pages;

import com.nopcommece.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.Random;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());


    @FindBy(xpath = "//a[@href='/computers']")
    WebElement clickComputer;

    @FindBy(xpath = "//a[@title='Show products in category Desktops']")
    WebElement clickDesktop;
    @FindBy(id = "products-orderby")
    WebElement sort;

    @FindBy(xpath = "(//button[contains(text(),'to cart')])[1]")
    WebElement clickCart;
    //By actualVerifyText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    @FindBy(name = "product_attribute_1")
    WebElement selctComputer;


    public void clickOnComputerAndDesktop() {
        clickOnElement(clickComputer);
        clickOnElement(clickDesktop);
    }

    public void sortComputerDesktopsToAtoZ(String value) {
        selectByValueFromDropDown(sort, value);
    }

    public void clickOnShoppingCart() throws InterruptedException {
        Thread.sleep(5000);
        clickOnElement(clickCart);
    }


    public void selectPentiumComputer(String name) {
        selectByVisibleTextFromDropDown(selctComputer, name);
    }

    public void selectByDropDown(String message, By by, String name) {
        selectByVisibleTextFromDropDown(by, name);
    }


    public String exptectedTextMessage(String expected) {
        System.out.println("Expected Text or Message is : " + expected);
        return expected;
    }

    public String actualTextToVerify(By by) {
        String actual = driver.findElement(by).getText();
        System.out.println("Actual Text or Message is : " + actual);
        return actual;
    }
    public void selectRadioButton(String message, By by) {
        clickOnElement(by);
    }

    public void selectCheckBox(String message, By by) {
        clickOnElement(by);
    }

    public void selectPressButton(String message, By by) {
        clickOnElement(by);
    }

    public void mouseHoveronShoppingCartAndClickOnGoToCart() {
        mouseHoverToElement(By.xpath("//span[contains(text(),'Shopping cart')]"));
        WebElement goToCart = driver.findElement(By.xpath("//button[contains(text(),'Go to cart')]"));
        goToCart.click();
    }

    public void changeTheQuantityTo2AndClickOnUpdateShoppingCart() {
        clearContent(By.xpath("//input[@class='qty-input']"));
        sendTextToElement(By.xpath("//input[@class='qty-input']"), "2");
        clickOnElement(By.id("updatecart"));
    }

    public void fillingMandatoryFields(String message, String sendText, By by) {
        sendTextToElement(by, sendText);
    }

    public void randomEmailGeneratorAndSendText(By by, String firstName, String lastName) {
        Random randomGenerator = new Random();
        int emailNum = randomGenerator.nextInt(9999);
        String email = firstName + "." + lastName + emailNum + "@email.com";
        sendTextToElement(by, email);
    }
}

