package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.Trendyol;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

public class TY_Background_Steps {
    Trendyol trendyol =new Trendyol();

    @Given("Trendyol ana sayfasi acilir")
    public void trendyolAnaSayfasiAcilir() {
        Driver.getDriver().get("https://trendyol.com");

        try {
            trendyol.PopUpAcceptButton.click();
        } catch (Exception e) {
            System.out.println("Popup kapatma sırasında hata oluştu: " + e.getMessage());
        }




    }

    @Given("Trendyol login olunur")
    public void trendyolLoginOlunur() {
        Driver.getDriver().get("https://trendyol.com");

        try {
            trendyol.PopUpAcceptButton.click();
        } catch (Exception e) {
            System.out.println("Popup kapatma sırasında hata oluştu: " + e.getMessage());
        }


        trendyol.HomePageLoginButton.click();

        trendyol.EpostaTextBox.sendKeys("selenium_test00@outlook.com");

        trendyol.PasswordTextBox.sendKeys("Aa123456..");

        try {
            trendyol.NegativeLoginPagePopUpClose.click();
        } catch (Exception e) {
            System.out.println("Popup kapatma sırasında hata oluştu: " + e.getMessage());
        }


        trendyol.LoginButton.click();


    }
}
