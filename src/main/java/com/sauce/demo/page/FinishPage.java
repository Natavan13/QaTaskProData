package com.sauce.demo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinishPage extends BasePage {
    By finish_btn = By.cssSelector(".btn_action.cart_button");
    By cancel_btn = By.className("cart_cancel_link");

    public FinishPage(WebDriver driver) {
        super(driver);
    }

    public SuccessPage finishOrder() {
        WebElement finishButton = findElement(finish_btn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", finishButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", finishButton);
        return new SuccessPage(driver);
    }


}
