Feature: Trendyol Product Filter

  Background: Trendyol Sitesi Acilir
    Given Trendyol ana sayfasi acilir
  @ProductFilter
  Scenario: Trendyol ürün filtreleme testleri
    And Urun arama combobox tiklanir, "urunAdi" yazılır
    And Urun arama butonuna tiklanir
    And Urun siralamasi tiklanir
    And Siralama fiyat dusukten yuksege secilir
    And Filtrelerden marka secilir
    And Kategori ara textbox'a aranan ürün kategorisi "Kilif" yazdirilir
    And 5 saniye beklenir
    And Sayfayi kapatir


