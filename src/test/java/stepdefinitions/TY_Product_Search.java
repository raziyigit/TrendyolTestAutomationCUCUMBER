package stepdefinitions;

import io.cucumber.java.en.And;
import pages.Trendyol;
import org.junit.Assert;
import utilities.ConfigReader;


public class TY_Product_Search {

    Trendyol trendyol = new Trendyol();

    @And("Urun arama combobox tiklanir, ürün adı yazılır")
    public void urunAramaComboboxTiklanirUrunAdıYazılır() {
        org.junit.Assert.assertTrue("Öğe görünür değil", trendyol.SearchTextBox.isDisplayed());
        trendyol.SearchTextBox.sendKeys("Iphone 14");
    }


    @And("Urun arama butonuna tiklanir")
    public void urunAramaButonunaTiklanir() {
        org.junit.Assert.assertTrue("Öğe görünür değil", trendyol.SearchButton.isDisplayed());
        trendyol.SearchButton.click();

    }


    @And("Urun arama combobox tiklanir, {string} adı yazılır")
    public void urunAramaComboboxTiklanirAdıYazılır(String fail) {
        String failProduct = ConfigReader.getProperty(fail);
        trendyol.SearchTextBox.sendKeys(failProduct);
    }

    @And("Urun bulunmadigi kontrol edilir")
    public void urunBulunmadigiKontrolEdilir() {
        Assert.assertTrue("Ürün bulunmadı mesajı görünmüyor!", trendyol.NegativeProductSearchResult.isDisplayed());
    }

    @And("Urun mevcut oldugu gorulur")
    public void urunMevcutOlduguGorulur() {
        Assert.assertTrue("Ürün bulundu mesajı görünmüyor!", trendyol.IphoneSearchResult.isDisplayed());
    }


    @And("Urun arama combobox tiklanir, {string} yazilir")
    public void urunAramaComboboxTiklanirYazilir(String key) {
        String urunAdi = ConfigReader.getProperty(key);
        trendyol.SearchTextBox.sendKeys(urunAdi);

    }



}
