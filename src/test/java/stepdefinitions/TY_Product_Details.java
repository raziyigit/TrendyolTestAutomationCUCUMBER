package stepdefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import pages.Trendyol;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.time.Instant;

public class TY_Product_Details {
    WebDriver driver;

    Trendyol trendyol =new Trendyol();


    @And("Aranan ilk ürün sectirilir")
    public void arananIlkUrunSectirilir() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement iphone14Element = wait.until(ExpectedConditions.elementToBeClickable(trendyol.IphoneSecme));
        iphone14Element.click();
    }
}
