Feature: Product Favorite Actions

  Background: Trendyol Sitesi Acilir
    Given Trendyol login olunur
  @ProductCollectionActions
  Scenario: Ürünleri favoriye ekleme silme testleri
    And 5 saniye beklenir
    And Urun arama combobox tiklanir, "urunAdi" yazılır
    And Urun arama butonuna tiklanir
    And Aranan ilk ürün sectirilir
    And Acilan sayfadaki pop-up kapatilir
    And Urun favorilere eklenir
    And Favorilerim sayfasi acilir
    And Bilgilendirme pop-up'i kapatilir
    And Koleksiyonlarim butonuna tiklanir
    And Sayfa asagiya kaydirilir
    And Koleksiyonun bos oldugu kontrol edilir
    And Yeni koleksiyon ekle butonuna tiklanir
    And Koleksiyon adi "TrendyolTestKoleksiyon" yazilir
    And Koleksiyon olustur tiklanir
    And Urun koleksiyona eklenir
    And Popup uzerinde koleksiyona ekle butonuna tiklanir
    And Koleksiyona git butonuna tiklanir
    And Koleksiyonda urun oldugu kontrol edilir
    And Koleksiyondaki urun favorilerden cikarilir
    And Koleksiyonlarim sayfasina geri donulur
    And Sayfa asagiya kaydirilir
    And Koleksiyon silinir
    And Koleksiyonun bos oldugu kontrol edilir
    And Trendyol ana sayfasına geri dönülür
    And Hesabim butonunun uzerine gelinir
    And 3 saniye beklenir
    And Cikis yap butonuna tiklanir
    And Cikis yaptigi kontrol edilir
    And Sayfayi kapatir
