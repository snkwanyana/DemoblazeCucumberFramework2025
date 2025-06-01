package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CartPage {

    public WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Cart')]")
    WebElement cartButton_xpath;
    @FindBy(xpath = "//a[contains(text(),'Delete')]")
    WebElement productPage_xpath;
    @FindBy(xpath = "//table/tbody/tr/td[2]")
    WebElement productTitle_xpath;

    @FindBy(xpath = "//button[contains(text(),'Place Order')]")
    WebElement placeOrderButton_xpath;

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickCartMenu() {
        cartButton_xpath.click();
    }

    public void verifyAddedLaptopIsDisplayed(String name){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(productPage_xpath));
        String productName = productTitle_xpath.getText();
        Assert.assertEquals(productName,name);
    }

    public void clickPlaceOerderButton(){
        placeOrderButton_xpath.click();
    }
}
