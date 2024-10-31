Feature: Trendyol Shopping Cart Actions

  Background: Trendyol Sitesi Acilir
    Given Trendyol ana sayfasi acilir
    @ShoppingCartActions
  Scenario: Sepet islemleri
    And Urun arama combobox tiklanir, "urunAdi" yazılır
    And Urun arama butonuna tiklanir
    And Aranan ilk ürün sectirilir
    And Acilan sayfadaki pop-up kapatilir
    And Sepete ekle butonu tiklanir
    And Sepetim butonuna tiklanir, sepete gidilir
    And Ekranda çikan anladım pop-up kapatilir
    And Sepetim sayfasinda oldugu kontrol edilir
    And Urunun sepete eklendigi kontrol edilir
    And Urun sepetten kaldirilir
    And Sepette urun olmadigi kontrol edilir
    And Trendyol ana sayfasına geri dönülür
    Then Sayfayi kapatir

