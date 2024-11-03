package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.Trendyol;
import utilities.ConfigReader;

import java.util.NoSuchElementException;

public class TY_Product_Filter extends BaseSteps {

    Trendyol trendyol = new Trendyol();

    @And("Urun siralamasi tiklanir")
    public void urunSiralamasiTiklanir() {
        checkElementDisplayed(trendyol.ProductSortingButton, " Urunleri sirala butonu mevcut degil");
        clickElement(trendyol.ProductSortingButton, "tiklama basarisiz...");
    }

    @And("Siralama fiyat dusukten yuksege secilir")
    public void siralamaFiyatDusuktenYuksegeSecilir() {

        checkElementDisplayed(trendyol.ProductLowestPriceButton,"En dusuk fiyat butonu mevcut degil");
        clickElement(trendyol.ProductLowestPriceButton, "tiklama basarisiz...");

    }


    @And("Filtrelerden marka secilir")
    public void filtrelerdenMarkaSecilir() {
        checkElementDisplayed(trendyol.ProductBrandChooseCheckBox, "Urun marka sec check box mevcut degil");
        clickElement(trendyol.ProductBrandChooseCheckBox, "tiklama basarisiz...");
    }



    @And("Kategori ara textbox'a aranan ürün kategorisi {string} yazdirilir")
    public void kategoriAraTextboxAArananUrunKategorisiYazdirilir(String telefon) {
        String Kilif = ConfigReader.getProperty(telefon);
        sendKeysToElement(trendyol.ProductCategorySearchTextBox, Kilif,"Aranan urun kategorisi yazma basarisiz");
        clickElement(trendyol.TelefonKilifiCheckBox, "tiklama basarisiz...");
    }



}
