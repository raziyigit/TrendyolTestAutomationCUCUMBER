Feature: Trendyol Product Details Test

  Background: Trendyol Sitesi Acilir
    Given Trendyol ana sayfasi acilir
  @ProductDetails
  Scenario: Ürün Detay Sayfası Testi
    And Urun arama combobox tiklanir, "urunAdi" yazılır
    And Urun arama butonuna tiklanir
    And Urunun mevcut oldugu gorulur
    And Aranan ilk ürün sectirilir
    And Acilan sayfadaki pop-up kapatilir
    And Urun sayfasi acildigi kontrol edilir
    And Trendyol ana sayfasına geri dönülür
    Then Sayfayi kapatir
