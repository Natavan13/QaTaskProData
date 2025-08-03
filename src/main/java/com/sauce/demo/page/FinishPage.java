package com.sauce.demo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinishPage extends BasePage {
    By finish_btn = By.className(("btn_action");
    By cancel_btn = By.className("cart_cancel_link");

    public FinishPage clickFinishBtn() {
        click(finish_btn);
        return new FinishPage();
    }


}
