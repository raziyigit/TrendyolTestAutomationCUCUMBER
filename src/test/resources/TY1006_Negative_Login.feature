Feature: Trendyol Negative Login Test

@NegativeLogin
Scenario Outline: Trendyol Negatif login islemleri
  Given "Url" sayfasi acilir
  And 3 saniye beklenir
  And Popup kapatilir
  And 3 saniye beklenir
  And Ana sayfada giris yap butonuna tiklanir
  And Mail adresi"<eposta>" yazilir
  And Sifre "<password>" yazilir
  And Login asamasinda cikan kategoriler pop-up kapat
  And Giris yap butonuna tiklanir
  Then Hata mesajı aldığı kontrol edilir "<errorMessage>"
  Then Sayfayi kapatir

  Examples:
    | eposta                      | password  | errorMessage                               |
    | selenium_test00@outlook.com | Aa123456. | E-posta adresiniz ve/veya şifreniz hatalı. |
