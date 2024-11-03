package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.Trendyol;
import utilities.ConfigReader;

import static utilities.Driver.driver;

public class TY_Product_Details_Search extends BaseSteps {


    Trendyol trendyol2 = new Trendyol();


    @And("Aranan ilk ürün sectirilir")
    public void arananIlkUrunSectirilir() {
        checkElementDisplayed(trendyol2.IphoneChoose, "Urun mevcut degil");
        clickElement(trendyol2.IphoneChoose, "tiklama basarisiz...");
    }

    @And("Urun arama combobox tiklanir, {string} yazılır")
    public void urunAramaComboboxTiklanirYazılır(String urun) {
        String urunAdi = ConfigReader.getProperty(urun);
        sendKeysToElement(trendyol2.SearchTextBox, urunAdi, "Şifre yazma işlemi başarısız");
    }

    @And("Urunun mevcut oldugu gorulur")
    public void urununMevcutOlduguGorulur() {
        checkElementDisplayed(trendyol2.CurrentProduct, "Urun mevcut degil");
    }

    @And("Acilan sayfadaki pop-up kapatilir")
    public void acilanSayfadakiPopUpKapatilir() {

        String winHandleBefore = driver.getWindowHandle();

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        try {
            clickElement(trendyol2.ProductPagePopUpButton, "tiklama basarisiz...");
        } catch (Exception e) {
            System.out.println("Popup kapatma sırasında hata oluştu: " + e.getMessage());
        }

    }


    @And("Urun sayfasi acildigi kontrol edilir")
    public void urunSayfasiAcildigiKontrolEdilir() {
        checkElementDisplayed(trendyol2.ProductPageAddBasketButton, "Sepete ekle butonu mevcut degil");
        checkElementDisplayed(trendyol2.ProductPageProductFeatureButton, "Urun ozellik butonu mevcut degil");
        checkElementDisplayed(trendyol2.ProductPageCommentButton, "Urun yorum butonu mevcut degil");
        checkElementDisplayed(trendyol2.ProductPageSellersButton, "Urun satici butonu mevcut degil");
        checkElementDisplayed(trendyol2.ProductPageAddCollectionButton, "Koleksiyona ekle butonu mevcut degil");
        checkElementDisplayed(trendyol2.ProductPageEvaluationIcon, " Degerlendirme butonu mevcut degil");

    }

    @And("Trendyol ana sayfasına geri dönülür")
    public void trendyolAnaSayfasınaGeriDonulur() {
        checkElementDisplayed(trendyol2.HomePageButton, "buton mevcut degil");
        clickElement(trendyol2.HomePageButton, "tiklama basarisiz...");
    }


}
