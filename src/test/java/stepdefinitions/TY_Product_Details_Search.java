package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.Trendyol;
import utilities.ConfigReader;

import static utilities.Driver.driver;

public class TY_Product_Details_Search {


    Trendyol trendyol2 =new Trendyol();


    @And("Aranan ilk ürün sectirilir")
    public void arananIlkUrunSectirilir() {
        Assert.assertTrue("Urun mevcut degil", trendyol2.IphoneChoose.isDisplayed());
        trendyol2.IphoneChoose.click();
    }

    @And("Urun arama combobox tiklanir, {string} yazılır")
    public void urunAramaComboboxTiklanirYazılır(String urun) {
        String urunAdi  = ConfigReader.getProperty(urun);
        trendyol2.SearchTextBox.sendKeys(urunAdi);
    }

    @And("Urunun mevcut oldugu gorulur")
    public void urununMevcutOlduguGorulur() {
        Assert.assertTrue("Urun mevcut degil", trendyol2.CurrentProduct.isDisplayed());
    }

    @And("Acilan sayfadaki pop-up kapatilir")
    public void acilanSayfadakiPopUpKapatilir() {

        String winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        try {
            trendyol2.ProductPagePopUpButton.click();
        } catch (Exception e) {
            System.out.println("Popup kapatma sırasında hata oluştu: " + e.getMessage());
        }

     }


    @And("Urun sayfasi acildigi kontrol edilir")
    public void urunSayfasiAcildigiKontrolEdilir() {
        Assert.assertTrue("Urun mevcut degil",trendyol2.ProductPageAddBasketButton.isDisplayed());
        Assert.assertTrue("Urun mevcut degil",trendyol2.ProductPageProductFeatureButton.isDisplayed());
        Assert.assertTrue("Urun mevcut degil",trendyol2.ProductPageCommentButton.isDisplayed());
        Assert.assertTrue("Urun mevcut degil",trendyol2.ProductPageSellersButton.isDisplayed());
        Assert.assertTrue("Urun mevcut degil",trendyol2.ProductPageAddCollectionButton.isDisplayed());
        Assert.assertTrue("Urun mevcut degil",trendyol2.ProductPageEvaluationIcon.isDisplayed());
    }

    @And("Trendyol ana sayfasına geri dönülür")
    public void trendyolAnaSayfasınaGeriDonulur() {
        Assert.assertTrue("Ikon mevcut degil",trendyol2.HomePageButton.isDisplayed());
        trendyol2.HomePageButton.click();
    }



}
