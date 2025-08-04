package com.sauce.demo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessPage extends BasePage {
    By success_header = By.className("complete-text");

    public SuccessPage(WebDriver driver) {
        super(driver);
    }

    public String getSuccessMessage() {
        return getText(success_header);
    }
}
