package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.Trendyol;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

public class TY_Positive_Login {

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
            trendyol.PopUpAcceptButton.click();
        } catch (Exception e) {
            System.out.println("Popup kapatma sırasında hata oluştu: " + e.getMessage());
        }
    }

    @And("Ana sayfada giris yap butonuna tiklanir")
    public void anaSayfadaGirisYapButonunaTiklanir() {
        Actions actions = new Actions(driver);
        Assert.assertTrue("Öğe görünür değil", trendyol.HomePageLoginButton.isDisplayed());
        actions.moveToElement(trendyol.HomePageLoginButton)
                .pause(500)
                .perform();

        trendyol.HomePageLoginButton.click();
    }

    @And("Mail adresi yazilir")
    public void mailAdresiYazilir() {
        Assert.assertTrue("Öğe görünür değil", trendyol.EpostaTextBox.isDisplayed());
        trendyol.EpostaTextBox.sendKeys("selenium_test00@outlook.com");
    }

    @And("Sifre yazilir")
    public void sifreYazilir() {
        Assert.assertTrue("Öğe görünür değil", trendyol.PasswordTextBox.isDisplayed());
        trendyol.PasswordTextBox.sendKeys("Aa123456..");
        
    }

    @And("Giris yap butonuna tiklanir")
    public void girisYapButonunaTiklanir() {
        Assert.assertTrue("Öğe görünür değil", trendyol.LoginButton.isDisplayed());
        trendyol.LoginButton.click();
    }


    @And("Trendyol ana sayfasında giris yaptigi kontrol edilir")
    public void trendyolAnaSayfasındaGirisYaptigiKontrolEdilir() {
        Assert.assertTrue("Öğe görünür değil", trendyol.LoginControl.isDisplayed());
    }

    @And("{string} yazilir")
    public void yazilir(String deger ) {
        String mail = ConfigReader.getProperty(deger);
        trendyol.EpostaTextBox.sendKeys(mail);
    }


    @And("{string} sifre yazilir")
    public void sifreYazilir(String deger2) {
        String sifre = ConfigReader.getProperty(deger2);
        trendyol.PasswordTextBox.sendKeys(sifre);
    }
}
