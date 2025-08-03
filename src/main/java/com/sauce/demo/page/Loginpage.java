package com.sauce.demo.page;

import org.openqa.selenium.By;

public class Loginpage  extends BasePage{
    private By user_name = By.id("user-name");
    private By password = By.id("password");
    private By login_button = By.id("login-button");
    private By err_message = By.cssSelector(".login-box h3");

    public void setUserNameField(String userName) {
        setText(this.user_name, userName);
    }

    public void setPasswordField(String password) {
        setText(this.password, password);
    }

    public ProductsPage clickLoginButton() {
        click(this.login_button);
        return new ProductsPage();
    }

    public ProductsPage loginIntoApplication(String username, String password){
        setUserNameField(username);
        setPasswordField(password);
        return clickLoginButton();
    }
    public String getErrorMessage(){
        return getText(err_message);
    }
}
