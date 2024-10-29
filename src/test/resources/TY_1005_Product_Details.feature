Feature: TY PRODUCT DETAILS

  Scenario: Ürün Detay Sayfası Testi
    Given "Url" sayfasi acilir
    And 3 saniye beklenir
    And Popup kapatilir
    And 3 saniye beklenir
    And Urun arama combobox tiklanir, "urunAdi" yazılır
    And Urun arama butonuna tiklanir
    And Urunun mevcut oldugu gorulur
    And Aranan ilk ürün sectirilir
    And Acilan sayfadaki pop-up kapatilir