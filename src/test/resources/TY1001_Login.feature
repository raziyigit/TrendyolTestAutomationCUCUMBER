Feature:TY_LOGIN

  @login
  Scenario: Trendyol Login islemleri
    Given "Url" sayfasi acilir
    And 3 saniye beklenir
    And Popup kapatilir
    And 3 saniye beklenir
    And Ana sayfada giris yap butonuna tiklanir
    And Mail adresi yazilir
    And Sifre yazilir
    And Giris yap butonuna tiklanir