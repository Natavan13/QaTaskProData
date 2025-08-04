package com.sauce.demo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    By checkout_btn = By.className("btn_action");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutInformationPage proceedToCheckout(){
        click(checkout_btn);
        return new CheckoutInformationPage(driver);
    }
}
