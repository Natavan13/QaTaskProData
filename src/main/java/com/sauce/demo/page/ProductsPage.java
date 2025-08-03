package com.sauce.demo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {
    List<WebElement> buttons = driver.findElements(By.cssSelector(".btn_primary.btn_inventory"));
    By cart_list_btn = By.id("shopping_cart_container");


    public void addCartNthProduct(int index){
        buttons.get(index).click();
    }

    public CartPage getCartPage(){
        click(cart_list_btn);
        return new CartPage();
    }

}
