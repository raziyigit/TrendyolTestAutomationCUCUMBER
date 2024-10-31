package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.Trendyol;

public class TY_Product_Filter {
    Trendyol trendyol =new Trendyol();

    @And("Urun siralamasi tiklanir")
    public void urunSiralamasiTiklanir() {
        Assert.assertTrue("Buton mevcut degil",trendyol.ProductSortingButton.isDisplayed());
        trendyol.ProductSortingButton.click();
    }

    @And("Siralama fiyat dusukten yuksege secilir")
    public void siralamaFiyatDusuktenYuksegeSecilir() {

            if (trendyol.ProductLowestPriceButton.isDisplayed()) {
                trendyol.ProductLowestPriceButton.click();
            } else if (trendyol.ProductLowestPriceButton2.isDisplayed()) {
                trendyol.ProductLowestPriceButton2.click();
            }



    }


    @And("Filtrelerden marka secilir")
    public void filtrelerdenMarkaSecilir() {
        Assert.assertTrue("Buton mevcut degil",trendyol.ProductBrandChooseCheckBox.isDisplayed());
        trendyol.ProductBrandChooseCheckBox.click();
    }



    @And("Kategori ara textbox'a aranan ürün kategorisi yazdirilir")
    public void kategoriAraTextboxAArananUrunKategorisiYazdirilir() {
        trendyol.ProductCategorySearchTextBox.sendKeys("Telefon Kılıfı");
        trendyol.TelefonKilifiCheckBox.click();
    }


}
