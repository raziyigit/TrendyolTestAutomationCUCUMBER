package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.Trendyol;
import utilities.ConfigReader;

import static utilities.Driver.driver;

public class TY_Product_Collection_Actions extends BaseSteps {

    Trendyol trendyol = new Trendyol();


    @And("Koleksiyonlarim butonuna tiklanir")
    public void koleksiyonlarimButonunaTiklanir() {
        checkElementDisplayed(trendyol.MyCollectionButton, "Koleksiyonlarim butonu mevcut degil");
        clickElement(trendyol.MyCollectionButton, "tiklama basarisiz...");
    }


    @And("Koleksiyonun bos oldugu kontrol edilir")
    public void koleksiyonunBosOlduguKontrolEdilir() {
        checkElementDisplayed(trendyol.Collection0Text, "Koleksiyon 0 mesajı mevcut degil");
        checkElementDisplayed(trendyol.Collection0Text2, "Koleksiyon 0 mesajı mevcut degil");
    }


    @And("Yeni koleksiyon ekle butonuna tiklanir")
    public void yeniKoleksiyonEkleButonunaTiklanir() {
        checkElementDisplayed(trendyol.AddNewCollectionButton, "Yeni koleksiyon ekle butonu mevcut degil");
        clickElement(trendyol.AddNewCollectionButton, "tiklama basarisiz...");
    }



    @And("Koleksiyon adi {string} yazilir")
    public void koleksiyonAdiYazilir(String koleksiyon) {
        checkElementDisplayed(trendyol.CollectionNameTextBox, "Koleksiyon adi text box mevcut degil");
        String TrendyolTestKoleksiyon  = ConfigReader.getProperty(koleksiyon);
        sendKeysToElement(trendyol.CollectionNameTextBox, TrendyolTestKoleksiyon,"Koleksiyon adi yazma basarisiz");
    }


    @And("Koleksiyon olustur tiklanir")
    public void koleksiyonOlusturTiklanir() {
        checkElementDisplayed(trendyol.CreateCollectionButton, "Koleksiyon olustur butonu mevcut degil");
        clickElement(trendyol.CreateCollectionButton, "tiklama basarisiz...");
    }

    @And("Sayfa asagiya kaydirilir")
    public void sayfaAsagiyaKaydirilir() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
    }

    @And("Urun koleksiyona eklenir")
    public void urunKoleksiyonaEklenir() {
        checkElementDisplayed(trendyol.AddCollectionCheckBox, "Koleksiyona ekleme checkbox mevcut degil");
        clickElement(trendyol.AddNewCollectionButton, "tiklama basarisiz...");
    }

    @And("Popup uzerinde koleksiyona ekle butonuna tiklanir")
    public void popupUzerindeKoleksiyonaEkleButonunaTiklanir() {
        checkElementDisplayed(trendyol.PopUpAddCollectionButton, "Koleksiyona ekle butonu mevcut degil");
        clickElement(trendyol.ChooseProductInCollectıonPopUp,"Tiklama islemi basarisiz");
        clickElement(trendyol.PopUpAddCollectionButton, "tiklama basarisiz...");
    }

    @And("Koleksiyona git butonuna tiklanir")
    public void koleksiyonaGitButonunaTiklanir() {
        checkElementDisplayed(trendyol.GoToCollectionButton, "Koleksiyona git butonu mevcut degil");
        clickElement(trendyol.GoToCollectionButton, "tiklama basarisiz...");
    }

    @And("Koleksiyonda urun oldugu kontrol edilir")
    public void koleksiyondaUrunOlduguKontrolEdilir() {
        checkElementDisplayed(trendyol.CollectionHaveProductMessage, "Koleksiyon da urun var mesaji mevcut degil");
        checkElementDisplayed(trendyol.ProductControlImage, "Urun kontrol resimi mevcut degil");
    }


    @And("Koleksiyonlarim sayfasina geri donulur")
    public void koleksiyonlarimSayfasinaGeriDonulur() {
        checkElementDisplayed(trendyol.BackCollectionButton, "Koleksiyonlarima don butonu mevcut degil");
        clickElement(trendyol.BackCollectionButton, "tiklama basarisiz...");
    }

    @And("Koleksiyondaki urun favorilerden cikarilir")
    public void koleksiyondakiUrunFavorilerdenCikarilir() {
        clickElement(trendyol.CollectionProductInfo, "tiklama basarisiz...");
        clickElement(trendyol.RemoveProductInFavorite, "tiklama basarisiz...");
    }

    @And("Koleksiyon silinir")
    public void koleksiyonSilinir() {
        clickElement(trendyol.CollectionProductInfo, "tiklama basarisiz...");
        clickElement(trendyol.DeleteProductInBasketButton, "tiklama basarisiz...");
        clickElement(trendyol.DeleteCollectionPopUpAcceptButton, "tiklama basarisiz...");
    }


}
