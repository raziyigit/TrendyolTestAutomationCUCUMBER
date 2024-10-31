Feature: Trendyol Home Page Loading Test

  @HomePageLoading
  Scenario: Trendyol ana sayfasının başarıyla yüklenmesi
    Given "Url" sayfasi acilir
    And Popup kapatilir
    And Trendyol ana sayfasının yüklendiğini görür
    Then Sayfayi kapatir
