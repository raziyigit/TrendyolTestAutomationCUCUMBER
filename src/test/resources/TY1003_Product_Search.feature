Feature: TY.PRODUCT.SEARCH

  Scenario: Ürün Arama Testi (Geçerli Ürün)
    Given "Url" sayfasi acilir
    And 3 saniye beklenir
    And Popup kapatilir
    And 3 saniye beklenir
    And Urun arama combobox tiklanir, "urunAdi" yazilir
    And Urun arama butonuna tiklanir
    And Urun mevcut oldugu gorulur


