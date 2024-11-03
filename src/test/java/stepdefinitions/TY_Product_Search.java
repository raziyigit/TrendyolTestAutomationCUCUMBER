package stepdefinitions;

import io.cucumber.java.en.And;
import pages.Trendyol;
import org.junit.Assert;
import utilities.ConfigReader;


public class TY_Product_Search extends BaseSteps {

    Trendyol trendyol = new Trendyol();

    @And("Urun arama combobox tiklanir, ürün adı yazılır")
    public void urunAramaComboboxTiklanirUrunAdıYazılır() {
        checkElementDisplayed(trendyol.SearchTextBox, "Urun arama text box mevcut degil");
        sendKeysToElement(trendyol.SearchTextBox, "Iphone 14", "Urun adi yazma işlemi başarısız");
    }


    @And("Urun arama butonuna tiklanir")
    public void urunAramaButonunaTiklanir() {
        checkElementDisplayed(trendyol.SearchButton, "Urun arama butonu mevcut degil");
        clickElement(trendyol.SearchButton, "tiklama basarisiz...");

    }


    @And("Urun arama combobox tiklanir, {string} adı yazılır")
    public void urunAramaComboboxTiklanirAdıYazılır(String fail) {
        String failProduct = ConfigReader.getProperty(fail);
        sendKeysToElement(trendyol.SearchTextBox, failProduct, "Hatali urun adi yazma işlemi başarısız");
    }

    @And("Urun bulunmadigi kontrol edilir")
    public void urunBulunmadigiKontrolEdilir() {
        checkElementDisplayed(trendyol.NegativeProductSearchResult, "Urun bulunamadi mesaji mevcut degil");
    }

    @And("Urun mevcut oldugu gorulur")
    public void urunMevcutOlduguGorulur() {
        checkElementDisplayed(trendyol.IphoneSearchResult, "Urun bulundu mesaji mevcut degil");
    }


    @And("Urun arama combobox tiklanir, {string} yazilir")
    public void urunAramaComboboxTiklanirYazilir(String key) {
        String urunAdi = ConfigReader.getProperty(key);
        sendKeysToElement(trendyol.SearchTextBox, urunAdi, "Urun adi yazma işlemi başarısız");
    }


}
