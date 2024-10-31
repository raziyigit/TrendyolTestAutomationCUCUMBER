package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Trendyol;

import java.time.Duration;

import static utilities.Driver.driver;

public class TY_Logout {
    Trendyol trendyol = new Trendyol();

    @And("Cikis yap butonuna tiklanir")
    public void cikisYapButonunaTiklanir() {



        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(trendyol.HomePageLoginButton));


        Actions actions = new Actions(driver);
        Assert.assertTrue("Öğe görünür değil", trendyol.HomePageLoginButton.isDisplayed());
        actions.moveToElement(trendyol.HomePageLoginButton)
                .pause(500)
                .perform();

        trendyol.LogoutButton.click();

    }

    @And("Pop-up cikarsa kapatilir")
    public void popUpCikarsaKapatilir() {
        try {
            trendyol.LoginPagePopUpClose.click();
        } catch (Exception e) {
            System.out.println("Popup kapatma sırasında hata oluştu: " + e.getMessage());
        }

    }

    @And("Hesabim butonunun uzerine gelinir")
    public void hesabimButonununUzerineGelinir() {

        Actions actions = new Actions(driver);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(trendyol.HomePageLoginButton));


        actions.moveToElement(trendyol.HomePageLoginButton).perform();

    }

    @And("Cikis yaptigi kontrol edilir")
    public void cikisYaptigiKontrolEdilir() {

        Assert.assertTrue("Cikis yapilamadi",trendyol.HomePageLoginButton.isDisplayed());

    }
}
