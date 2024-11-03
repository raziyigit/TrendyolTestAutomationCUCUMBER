Feature: Trendyol Positive Login Test

  @PositiveLogin
  Scenario: Trendyol pozitif login islemleri
    Given "Url" sayfasi acilir
    And 3 saniye beklenir
    And Popup kapatilir
    And 3 saniye beklenir
    And Ana sayfada giris yap butonuna tiklanir
    And "mail" yazilir
    And "sifre" sifre yazilir
    And Bilgilendirme pop-up'i kapatilir
    And Giris yap butonuna tiklanir
    And Trendyol ana sayfasında giris yaptigi kontrol edilir
    Then Sayfayi kapatir