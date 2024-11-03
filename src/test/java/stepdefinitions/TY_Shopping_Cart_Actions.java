package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.Trendyol;

public class TY_Shopping_Cart_Actions extends BaseSteps {

    Trendyol trendyol = new Trendyol();


    @And("Sepete ekle butonu tiklanir")
    public void sepeteEkleButonuTiklanir() {
        clickElement(trendyol.ProductPageAddBasketButton, "tiklama basarisiz...");
    }

    @And("Sepetim butonuna tiklanir, sepete gidilir")
    public void sepetimButonunaTiklanirSepeteGidilir() {
        clickElement(trendyol.MyBasketButton, "tiklama basarisiz...");
    }

    @And("Ekranda çikan anladım pop-up kapatilir")
    public void ekrandaCikanAnladımPopUpKapatilir() {
        clickElement(trendyol.BasketPageUnderstandButton, "tiklama basarisiz...");
    }


    @And("Sepetim sayfasinda oldugu kontrol edilir")
    public void sepetimSayfasindaOlduguKontrolEdilir() {
        checkElementDisplayed(trendyol.BasketText, "Text mevcut degil");
        checkElementDisplayed(trendyol.BasketAcceptButton, "Sepeti onayla butonu mevcut degil");
    }

    @And("Urunun sepete eklendigi kontrol edilir")
    public void urununSepeteEklendigiKontrolEdilir() {
        checkElementDisplayed(trendyol.BasketPageSellerControl, "Satici mevcut degil");
        checkElementDisplayed(trendyol.ProductInBasketControl, "Sepette urun mevcut degil");
        checkElementDisplayed(trendyol.DeleteProductInBasketButton, "Sepetten urun sil butonu mevcut degil");
    }

    @And("Urun sepetten kaldirilir")
    public void urunSepettenKaldirilir() {
        clickElement(trendyol.DeleteProductInBasketButton, "tiklama basarisiz...");
    }

    @And("Sepette urun olmadigi kontrol edilir")
    public void sepetteUrunOlmadigiKontrolEdilir() {
        checkElementDisplayed(trendyol.RemoveProductInBasketControl, "Sepette kaldirilmis urun mevcut degil");
        checkElementDisplayed(trendyol.BasketAmountControl, "Sepet tutari ogesi mevcut degil");
    }


}
