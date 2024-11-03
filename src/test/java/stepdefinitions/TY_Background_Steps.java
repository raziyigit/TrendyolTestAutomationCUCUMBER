package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.Trendyol;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

public class TY_Background_Steps extends BaseSteps {

    Trendyol trendyol = new Trendyol();

    @Given("Trendyol ana sayfasi acilir")
    public void trendyolAnaSayfasiAcilir() {
        Driver.getDriver().get("https://trendyol.com");

        try {
            clickElement(trendyol.PopUpAcceptButton, "tiklama basarisiz...");
        } catch (Exception e) {
            System.out.println("Popup kapatma sırasında hata oluştu: " + e.getMessage());
        }


    }

    @Given("Trendyol login olunur")
    public void trendyolLoginOlunur() {
        Driver.getDriver().get("https://trendyol.com");

        try {
            clickElement(trendyol.PopUpAcceptButton, "tiklama basarisiz...");
        } catch (Exception e) {
            System.out.println("Popup kapatma sırasında hata oluştu: " + e.getMessage());
        }


        clickElement(trendyol.HomePageLoginButton, "tiklama basarisiz...");

        sendKeysToElement(trendyol.EpostaTextBox, "selenium_test00@outlook.com", "Mail yazma işlemi başarısız");

        sendKeysToElement(trendyol.PasswordTextBox, "Aa123456..", "Şifre yazma işlemi başarısız");

        try {
            clickElement(trendyol.InformationPopUpClose, "tiklama basarisiz...");
        } catch (Exception e) {
            System.out.println("Popup kapatma sırasında hata oluştu: " + e.getMessage());
        }


        clickElement(trendyol.LoginButton, "tiklama basarisiz...");


    }
}
