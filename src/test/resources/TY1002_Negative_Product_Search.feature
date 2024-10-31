Feature: Trendyol Negative Login Test

  Background: Trendyol Sitesi Acilir
    Given Trendyol ana sayfasi acilir
@NegativeProductSearch
  Scenario: Ürün Arama Testi (Geçersiz Ürün)
    And Urun arama combobox tiklanir, "failProduct" adı yazılır
    And Urun arama butonuna tiklanir
    And Urun bulunmadigi kontrol edilir
    Then Sayfayi kapatir


