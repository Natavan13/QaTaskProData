package com.sauce.demo.page;

import org.openqa.selenium.By;

public class CartPage extends BasePage {
    By checkout_btn = By.className("btn_action");

    public FinishPage clickCheckoutBtn(){
        click(checkout_btn);
        return new FinishPage();
    }
}
