package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Trendyol;

import java.time.Duration;
import java.util.NoSuchElementException;

import static utilities.Driver.driver;

public class TY_Product_Favorite_Actions extends BaseSteps {

    Trendyol trendyol = new Trendyol();

    @And("Urun favorilere eklenir")
    public void urunFavorilereEklenir() {
        checkElementDisplayed(trendyol.AddFavoriteButton, "Favorilerime ekle butonu mevcut degil");
        clickElement(trendyol.AddFavoriteButton, "tiklama basarisiz...");
    }

    @And("Favorilerim sayfasi acilir")
    public void favorilerimSayfasiAcilir() {
        checkElementDisplayed(trendyol.HomePageMyFavoritesButton, "Favorilerim butonu mevcut degil");
        clickElement(trendyol.HomePageMyFavoritesButton, "tiklama basarisiz...");
    }


    @And("Favorilerime eklendigi kontrol edilir")
    public void favorilerimeEklendigiKontrolEdilir() {
        checkElementDisplayed(trendyol.MyFavoritesPageFavoriteProduct, "Favorileri urun mevcut degil");
        checkElementDisplayed(trendyol.RemoveFavoriteButton, "Favorilerimden kaldir butonu mevcut degil");
    }

    @And("Favorilerimden urun cikarilir")
    public void favorilerimdenUrunCikarilir() {
        clickElement(trendyol.RemoveFavoriteButton, "tiklama basarisiz...");
    }

    @And("Urunun favorilerden cikarildigi, favori listesinin bos oldugu kontrol edilir")
    public void urununFavorilerdenCikarildigiFavoriListesininBosOlduguKontrolEdilir() {
        checkElementDisplayed(trendyol.FavoriteProductEmptyMessage, "Boş ürün mesaji mevcut degil");
        checkElementDisplayed(trendyol.StartShoppingButton, "Alisverise basla butonu mevcut degil");
    }

    @And("Bilgilendirme pop-up'i kapatilir")
    public void bilgilendirmePopUpIKapatilir() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            if (wait.until(ExpectedConditions.visibilityOf(trendyol.InformationPopUpClose)).isDisplayed()) {
                clickElement(trendyol.InformationPopUpClose, "tiklama basarisiz...");
            }
        } catch (TimeoutException e) {

        }
    }
}
