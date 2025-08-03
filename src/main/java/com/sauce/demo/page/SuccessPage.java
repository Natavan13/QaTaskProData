package com.sauce.demo.page;

import org.openqa.selenium.By;

public class SuccessPage extends BasePage {
    By success_header = By.className("complete-text");

    public String getSuccessMessage() {
        return getText(success_header);
    }
}
