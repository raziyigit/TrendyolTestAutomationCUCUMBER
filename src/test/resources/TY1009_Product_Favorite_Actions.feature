Feature: Product Favorite Actions

  Background: Trendyol Sitesi Acilir
    Given Trendyol login olunur
  @ProductFavoriteActions
  Scenario: Ürünleri favoriye ekleme silme testleri
    And 5 saniye beklenir
    And Urun arama combobox tiklanir, "urunAdi" yazılır
    And Urun arama butonuna tiklanir
    And Aranan ilk ürün sectirilir
    And Acilan sayfadaki pop-up kapatilir
    And Urun favorilere eklenir
    And Favorilerim sayfasi acilir
    And 3 saniye beklenir
    And Bilgilendirme pop-up'i kapatilir
    And Favorilerime eklendigi kontrol edilir
    And 3 saniye beklenir
    And Favorilerimden urun cikarilir
    And Urunun favorilerden cikarildigi, favori listesinin bos oldugu kontrol edilir
    And 3 saniye beklenir
    And Sayfayi kapatir
