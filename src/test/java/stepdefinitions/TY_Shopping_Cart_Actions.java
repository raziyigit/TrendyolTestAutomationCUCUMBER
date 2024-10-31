package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.Trendyol;

public class TY_Shopping_Cart_Actions {
    Trendyol trendyol =new Trendyol();


    @And("Sepete ekle butonu tiklanir")
    public void sepeteEkleButonuTiklanir() {
        trendyol.ProductPageAddBasketButton.click();
    }

    @And("Sepetim butonuna tiklanir, sepete gidilir")
    public void sepetimButonunaTiklanirSepeteGidilir() {
        trendyol.MyBasketButton.click();
    }

    @And("Ekranda çikan anladım pop-up kapatilir")
    public void ekrandaCikanAnladımPopUpKapatilir() {
        trendyol.BasketPageUnderstandButton.click();
    }


    @And("Sepetim sayfasinda oldugu kontrol edilir")
    public void sepetimSayfasindaOlduguKontrolEdilir() {
        Assert.assertTrue("Text mevcut degil",trendyol.BasketText.isDisplayed());
        Assert.assertTrue("Button mevcut degil",trendyol.BasketAcceptButton.isDisplayed());
    }

    @And("Urunun sepete eklendigi kontrol edilir")
    public void urununSepeteEklendigiKontrolEdilir() {
        Assert.assertTrue("Button mevcut degil",trendyol.BasketPageSellerControl.isDisplayed());
        Assert.assertTrue("Urun  mevcut degil",trendyol.ProductInBasketControl.isDisplayed());
        Assert.assertTrue("Button  mevcut degil",trendyol.DeleteProductInBasketButton.isDisplayed());
    }

    @And("Urun sepetten kaldirilir")
    public void urunSepettenKaldirilir() {
        trendyol.DeleteProductInBasketButton.click();
    }

    @And("Sepette urun olmadigi kontrol edilir")
    public void sepetteUrunOlmadigiKontrolEdilir() {
        Assert.assertTrue("Sepette urun mevcut",trendyol.RemoveProductInBasketControl.isDisplayed());
        Assert.assertTrue("Sepette urun mevcut",trendyol.BasketAmountControl.isDisplayed());
    }



}
