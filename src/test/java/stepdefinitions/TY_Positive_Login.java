package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Trendyol;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

public class TY_Positive_Login extends BaseSteps {

    Trendyol trendyol = new Trendyol();


    @Given("{string} sayfasi acilir")
    public void sayfasiAcilir(String Url) {
        Driver.getDriver().get(ConfigReader.getProperty("trendyolUrl"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.trendyol.com/");
    }


    @And("{int} saniye beklenir")
    public void saniyeBeklenir(int arg0) throws InterruptedException {
        Thread.sleep(arg0 * 1000);
    }

    @And("Popup kapatilir")
    public void popupKapatilir() {
        try {
            clickElement(trendyol.PopUpAcceptButton, "tiklama basarisiz...");
        } catch (Exception e) {
            System.out.println("Popup kapatma sırasında hata oluştu: " + e.getMessage());
        }
    }

    @And("Ana sayfada giris yap butonuna tiklanir")
    public void anaSayfadaGirisYapButonunaTiklanir() {
        Actions actions = new Actions(driver);
        checkElementDisplayed(trendyol.HomePageLoginButton, "Ana sayfa giris yap butonu mevcut degil");
        actions.moveToElement(trendyol.HomePageLoginButton)
                .pause(500)
                .perform();

        clickElement(trendyol.HomePageLoginButton, "tiklama basarisiz...");
    }

    @And("Mail adresi yazilir")
    public void mailAdresiYazilir() {
        checkElementDisplayed(trendyol.EpostaTextBox, "Eposta text box mevcut degil");
        sendKeysToElement(trendyol.EpostaTextBox, "selenium_test00@outlook.com", "Mail yazma işlemi başarısız");
    }

    @And("Sifre yazilir")
    public void sifreYazilir() {
        checkElementDisplayed(trendyol.PasswordTextBox, "Sifre text box mevcut degil");
        sendKeysToElement(trendyol.PasswordTextBox, "Aa123456..", "Şifre yazma işlemi başarısız");

    }

    @And("Giris yap butonuna tiklanir")
    public void girisYapButonunaTiklanir() {
        checkElementDisplayed(trendyol.LoginButton, " Giris yap butonu mevcut degil");
        clickElement(trendyol.LoginButton, "tiklama basarisiz...");
    }


    @And("Trendyol ana sayfasında giris yaptigi kontrol edilir")
    public void trendyolAnaSayfasındaGirisYaptigiKontrolEdilir() {
        checkElementDisplayed(trendyol.HomePageLoginButton, "Giris yapilamadi");

    }

    @And("{string} yazilir")
    public void yazilir(String deger) {
        String mail = ConfigReader.getProperty(deger);
        sendKeysToElement(trendyol.EpostaTextBox, mail, "Mail yazma işlemi başarısız");
    }


    @And("{string} sifre yazilir")
    public void sifreYazilir(String deger2) {
        String sifre = ConfigReader.getProperty(deger2);
        sendKeysToElement(trendyol.PasswordTextBox, sifre, "Şifre yazma işlemi başarısız");
    }
}
