package stepdefinitions;

import io.cucumber.java.en.And;
import pages.Trendyol;
import org.junit.Assert;

public class TY_Product_Search {

    Trendyol trendyol =new Trendyol();

    @And("Urun arama combobox tiklanir, ürün adı yazılır")
    public void urunAramaComboboxTiklanirUrunAdıYazılır() {
        org.junit.Assert.assertTrue("Öğe görünür değil",trendyol.SearchComboBox.isDisplayed());
        trendyol.SearchComboBox.sendKeys("Iphone 14");
        System.out.println("Ürün adı yazdırılıp tıklanıldı...");
    }


    @And("Urun arama butonuna tiklanir")
    public void urunAramaButonunaTiklanir() {
        org.junit.Assert.assertTrue("Öğe görünür değil",trendyol.SearchButton.isDisplayed());
        trendyol.SearchButton.click();
        System.out.println("Arama butonu tiklandi...");
    }




    @And("Urun arama combobox tiklanir, hatali ürün adı yazılır")
    public void urunAramaComboboxTiklanirHataliUrunAdıYazılır() {
        trendyol.SearchComboBox.sendKeys("asdfasdfasdfasdf");
        System.out.println("Hatali ürün adi yazdirildi...");
    }


    @And("Urun bulunmadigi kontrol edilir")
    public void urunBulunmadigiKontrolEdilir() {
        Assert.assertTrue("Ürün bulunmadı mesajı görünmüyor!", trendyol.HataliUrunAramaSonucu.isDisplayed());
        System.out.println("Ürün bulunmadığı kontrol edildi...");
    }

    @And("Urun mevcut oldugu gorulur")
    public void urunMevcutOlduguGorulur() {
        Assert.assertTrue("Ürün bulundu mesajı görünmüyor!", trendyol.IphoneAramaSonucu.isDisplayed());
        System.out.println("Urun mevcut olduğu goruldu...");
    }


}
