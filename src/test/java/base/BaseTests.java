package base;

import com.sauce.demo.page.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTests {
    protected WebDriver driver;
    protected BasePage basePage;
    protected Loginpage loginpage;
    protected ProductsPage productsPage;
    protected CartPage cartPage;
    protected CheckoutInformationPage checkoutInformationPage;
    protected FinishPage finishPage;
    protected SuccessPage successPage;
    private String url = "https://www.saucedemo.com/v1/";

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        loginpage = new Loginpage(driver);
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
        checkoutInformationPage = new CheckoutInformationPage(driver);
        finishPage = new FinishPage(driver);
    }

    @AfterClass
    public void tearDown(){
        // driver.quit();
    }
}
