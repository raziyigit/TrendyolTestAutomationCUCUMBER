package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.Driver.driver;

public class BaseSteps {


    protected void checkElementDisplayed(WebElement element, String errorMessage) {
        Assert.assertTrue(errorMessage, element.isDisplayed());
    }

    protected void clickElement(WebElement element, String errorMessage) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(element));
            element.click();
        } catch (Exception e) {
            Assert.fail(errorMessage + " - Tıklama işlemi başarısız: " + e.getMessage());
        }
    }

    protected void sendKeysToElement(WebElement element, String text, String errorMessage) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(element));
            element.sendKeys(text);
        } catch (Exception e) {
            Assert.fail(errorMessage + " - Metin gönderme işlemi başarısız: " + e.getMessage());
        }
    }
}
