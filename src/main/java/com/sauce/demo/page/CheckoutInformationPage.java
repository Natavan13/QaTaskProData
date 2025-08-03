package com.sauce.demo.page;

import org.openqa.selenium.By;

public class CheckoutInformationPage extends BasePage {
    By first_name_field = By.id("first-name");
    By last_name_field = By.id("last-name");
    By postal_code_field = By.id("postal-code");
    By contninue_btn = By.className("btn_primary");
    By error_msg = By.cssSelector("checkout_info_wrapper h3");

    public FinishPage clickContinueBtn(){
        click(contninue_btn);
        return new FinishPage();
    }

    public void fillFirstName(String firstName){
        setText(first_name_field, firstName);
    }

    public void fillLastName(String lastName){
        setText(last_name_field, lastName);
    }

    public void fillPostalCode(String postalCode){
        setText(postal_code_field, postalCode);
    }

    public void getErrorMsg(){
        fillFirstName("ewfd");
        fillLastName("wfd");
        clickContinueBtn();
    }


}
