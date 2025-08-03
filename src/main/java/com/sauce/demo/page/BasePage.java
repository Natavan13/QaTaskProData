package com.sauce.demo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class  BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    protected void setDriver(WebDriver driver) {
        this.driver  = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    protected WebElement findElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void click(By locator) {
        findElement(locator).click();
    }

    protected void setText(By locator, String text) {
        findElement(locator).clear();
        findElement(locator).sendKeys(text);
    }

    protected String getText(By locator) {
        return findElement(locator).getText();
    }


}
