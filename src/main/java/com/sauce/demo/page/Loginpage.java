package com.sauce.demo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage  extends BasePage{
    private By user_name = By.id("user-name");
    private By password = By.id("password");
    private By login_button = By.id("login-button");
    private By err_message = By.cssSelector(".login-box h3");

    public Loginpage(WebDriver driver) {
        super(driver);
    }

    public void setUserNameField(String userName) {
        setText(this.user_name, userName);
    }

    public void setPasswordField(String password) {
        setText(this.password, password);
    }

    public void clickLoginButton() {
        click(this.login_button);}

    public ProductsPage loginIntoApplication(String username, String password){
        setUserNameField(username);
        setPasswordField(password);
        click(this.login_button);
        return new ProductsPage(driver);

    }
    public String getErrorMessage(){
        return getText(err_message);
    }
}
