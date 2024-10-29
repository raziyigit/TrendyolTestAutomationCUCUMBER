package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import pages.Trendyol;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;

import java.time.Duration;
import java.time.Instant;

public class TY_Product_Details {
    WebDriver driver;

    Trendyol trendyol =new Trendyol();


    @And("Aranan ilk ürün sectirilir")
    public void arananIlkUrunSectirilir() {
        Assert.assertTrue("Urun mevcut degil", trendyol.IphoneSecme.isDisplayed());
        trendyol.IphoneSecme.click();
    }

    @And("Urun arama combobox tiklanir, {string} yazılır")
    public void urunAramaComboboxTiklanirYazılır(String urun) {
        String urunAdi  = ConfigReader.getProperty(urun);
        trendyol.SearchTextBox.sendKeys(urunAdi);
    }

    @And("Urunun mevcut oldugu gorulur")
    public void urununMevcutOlduguGorulur() {
        Assert.assertTrue("Urun mevcut degil", trendyol.MevcutUrun.isDisplayed());
    }

    @And("Acilan sayfadaki pop-up kapatilir")
    public void acilanSayfadakiPopUpKapatilir() {
       try {
           trendyol.UrunSayfasiPopUpButton.click();
       }catch (Exception e) {
           System.out.println("Popup kapatma sırasında hata oluştu: " + e.getMessage());
       }
    }

}
