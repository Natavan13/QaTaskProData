package tests.endToEndTests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EndToEndTests extends BaseTests {
    @Test
    public void completeOrderFlow() throws InterruptedException {

        productsPage = loginpage.loginIntoApplication("standard_user", "secret_sauce");

        productsPage.addCartNthProduct(0); // Add first product
        productsPage.addCartNthProduct(1); // Add second product

        cartPage = productsPage.getCartPage();

        checkoutInformationPage = cartPage.proceedToCheckout();

        finishPage = checkoutInformationPage.fillCheckoutInformation("Natavan", "Pashayeva", "AZ1001");

        successPage = finishPage.finishOrder();

        String successMessage = successPage.getSuccessMessage();
        Assert.assertEquals(successMessage, "Your order has been dispatched, and will arrive just as fast as the pony can get there!");

        System.out.println("Test Passed: Order flow completed successfully.");
    }
}
