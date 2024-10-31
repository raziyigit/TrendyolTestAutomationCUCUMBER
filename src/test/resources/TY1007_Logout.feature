Feature: Trendyol Logout

  Background: Trendyol Login
    Given Trendyol login olunur
  Scenario: Trendyol cikis yapma islemleri
    And Trendyol ana sayfasında giris yaptigi kontrol edilir
    And Hesabim butonunun uzerine gelinir
    And 3 saniye beklenir
    And Cikis yap butonuna tiklanir
    And Cikis yaptigi kontrol edilir
    Then Sayfayi kapatir


