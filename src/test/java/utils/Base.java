package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.*;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    public final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.demoblaze.com/index.html");
    public HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    public ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
    public CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
    public PlaceOrderPage placeOrderPage = PageFactory.initElements(driver, PlaceOrderPage.class);




}
