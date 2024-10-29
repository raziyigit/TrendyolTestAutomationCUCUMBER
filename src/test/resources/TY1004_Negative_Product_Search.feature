Feature: TY.FAIL.PRODUCT.SEARCH

  Scenario: Ürün Arama Testi (Geçersiz Ürün)
    Given "Url" sayfasi acilir
    And 3 saniye beklenir
    And Popup kapatilir
    And 3 saniye beklenir
    And Urun arama combobox tiklanir, "failProduct" adı yazılır
    And Urun arama butonuna tiklanir
    And Urun bulunmadigi kontrol edilir


