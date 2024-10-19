package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.Trendyol;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

public class TY_Login {

    Trendyol trendyol =new Trendyol();

    @Given("{string} sayfasi acilir")
    public void sayfasiAcilir(String Url) {
        System.out.println("Url sayfası açılıyor...");
        Driver.getDriver().get(ConfigReader.getProperty("trendyolUrl"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.trendyol.com/");
    }


    @And("{int} saniye beklenir")
    public void saniyeBeklenir(int arg0) throws InterruptedException {
        Thread.sleep(arg0*1000);
    }

    @And("Popup kapatilir")
    public void popupKapatilir() {
        System.out.println("Popup kapatılıyor...");
        try {
            trendyol.PopUpKabulEtButton.click();
            System.out.println("Popup başarıyla kapatıldı.");
        } catch (Exception e) {
            System.out.println("Popup kapatma sırasında hata oluştu: " + e.getMessage());
        }
    }

    @And("Ana sayfada giris yap butonuna tiklanir")
    public void anaSayfadaGirisYapButonunaTiklanir() {
        System.out.println("Giriş yap butonuna tıklanıyor...");
        Actions actions = new Actions(driver);
        Assert.assertTrue("Öğe görünür değil",trendyol.AnaSayfaGirisYapButton.isDisplayed());
        actions.moveToElement(trendyol.AnaSayfaGirisYapButton)
                .pause(500)
                .perform();

        trendyol.AnaSayfaGirisYapButton.click();
    }

    @And("Mail adresi yazilir")
    public void mailAdresiYazilir() {
        System.out.println("Mail adresi yazılıyor...");
        Assert.assertTrue("Öğe görünür değil",trendyol.EpostaTextBox.isDisplayed());
        trendyol.EpostaTextBox.sendKeys("selenium_test00@outlook.com");

    }

    @And("Sifre yazilir")
    public void sifreYazilir() {
        System.out.println("Şifre yazılıyor...");
        Assert.assertTrue("Öğe görünür değil",trendyol.SifreTextBox.isDisplayed());
        trendyol.SifreTextBox.sendKeys("Aa123456..");

    }

    @And("Giris yap butonuna tiklanir")
    public void girisYapButonunaTiklanir() {
        System.out.println("Giriş yap butonuna tıklanıyor...");
        Assert.assertTrue("Öğe görünür değil",trendyol.GirisYapButton.isDisplayed());
        trendyol.GirisYapButton.click();

    }



}
