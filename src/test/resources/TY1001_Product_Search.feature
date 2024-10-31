Feature: Trendyol Product Search Test


  Background: Trendyol Sitesi Acilir
    Given Trendyol ana sayfasi acilir

  @ProductSearch
  Scenario: Ürün Arama Testi (Geçerli Ürün)
    And Urun arama combobox tiklanir, "urunAdi" yazilir
    And Urun arama butonuna tiklanir
    And Urun mevcut oldugu gorulur
    Then Sayfayi kapatir


