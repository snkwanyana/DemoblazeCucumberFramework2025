package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.function.Function;

import java.time.Duration;

public class LaptopsPages {

    public WebDriver driver;


    public LaptopsPages(WebDriver driver){
        this.driver = driver;
    }

    public void selectLaptopOfYourChoice(String laptopName) throws InterruptedException {

        int attempts = 0;
        while (attempts < 6) {
            try {
                Thread.sleep(2000);
                WebElement element = driver.findElement(By.xpath("//a[contains(text(),'"+laptopName+"')]"));
                element.click();
                break;
            } catch (StaleElementReferenceException e) {
                attempts++;
            }
        }
    }
}
