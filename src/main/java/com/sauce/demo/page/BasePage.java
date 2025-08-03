package com.sauce.demo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class  BasePage {

    public static WebDriver driver;

    public void setDriver(WebDriver driver) {
        BasePage.driver  = driver;
    }

    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public void click(By locator) {
        findElement(locator).click();
    }

    public void setText(By locator, String text) {
        findElement(locator).clear();
        findElement(locator).sendKeys(text);
    }


}
