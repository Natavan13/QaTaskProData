package com.sauce.demo.page;

import org.openqa.selenium.By;

public class CheckoutInformationPage extends BasePage {
    By first_name_field = By.id("first-name");
    By last_name_field = By.id("last-name");
    By postal_code_field = By.id("postal-code");
    By contninue_btn = By.className("btn_primary");

    public FinishPage clickContinueBtn(){
        click(contninue_btn);
        return new FinishPage();
    }


}
