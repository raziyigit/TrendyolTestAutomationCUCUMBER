# Trendyol Otomasyon Projesi                 ----Razi Mert YİĞİT©----

Bu proje, Trendyol web sitesi için Java, Selenium, Cucumber ve JUnit kullanılarak oluşturulmuş bir test otomasyon framework'üdür. Test kodlarının yeniden kullanılabilirliğini ve bakımını artırmak için Sayfa Nesne Modeli (POM) tasarım deseni uygulanmıştır.

## İçindekiler

1. [Proje Yapısı](#proje-yapısı)
2. [Kurulum ve Yapılandırma](#kurulum-ve-yapılandırma)
3. [Konfigürasyon](#konfigürasyon)
4. [Kullanım](#kullanım)
5. [Test Çalıştırma](#test-çalıştırma)
6. [Hata Yönetimi ve Kayıt](#hata-yönetimi-ve-kayıt)

## Gereksinimler:

- Selenium: 4.16.1
- Cucumber Java: 7.14.1
- Cucumber JUnit: 7.14.0
- Kod Stili: Proje, Java adlandırma kurallarını takip eder ve POM tasarım desenini uygular, bu sayede modüler ve yeniden kullanılabilir kod sağlanır.


## Proje Yapısı

Proje yapısının açıklaması:

- **`pom.xml`**: Proje bağımlılıklarını (Selenium, Cucumber, JUnit) ve Maven için yapılandırmaları yönetir.
- **`src/test/java`**:
  - **`stepdefinitions`**: Cucumber step definition’larını içerir; test adımlarının uygulandığı yer.
  - **`utilities`**: `Driver`, `ConfigReader` gibi konfigürasyon ve WebDriver yönetimini sağlayan yardımcı sınıfları içerir.
  - **`hooks`**: `Hooks` sınıfı, senaryolar için başlangıç ve bitiş işlemlerini yönetir; test başarısız olduğunda ekran görüntüsü alır.
  - **`pages`**: Trendyol sayfaları için Sayfa Nesne Modeli (POM) sınıflarını içerir.
- **`src/test/resources`**:
  - **`features`**: Test senaryolarının tanımlandığı Cucumber feature dosyalarını içerir.
  - **`configuration.properties`**: Tarayıcı türü, kullanıcı bilgileri gibi yapılandırma ayarlarını anahtar-değer çiftleri halinde yönetir.


## Kurulum ve Yapılandırma

1. **Projeyi Klonlayın**:
   ```bash
   git clone https://github.com/raziyigit/TrendyolTestAutomationCUCUMBER.git
Projeyi IntelliJ IDEA’da Açın: IntelliJ IDEA ve JDK 17 kurulu olduğundan emin olun.

Bağımlılıkları Kurun: pom.xml dosyasında belirtilen bağımlılıkları Maven otomatik olarak indirecektir:

- Tarayıcı etkileşimleri için Selenium WebDriver.
- BDD tarzı test için Cucumber.
- Test koşucusu framework olarak JUnit.
- Tarayıcı Sürücüsünü Ayarlayın:
- Uygun WebDriver’ın (Chrome, Firefox, Edge vb.) sistem PATH’inde olduğundan emin olun.
- Alternatif olarak, gerekli durumlarda configuration.properties dosyasına sürücü dosyalarının yollarını belirtebilirsiniz.


## Konfigürasyon
configuration.properties dosyası, proje için yapılandırılabilir parametreleri tutar:


## Kullanım
Yardımcı Sınıflar

ConfigReader: configuration.properties dosyasından yapılandırma değerlerini okur.

* Yöntem: getProperty(String key): Belirtilen anahtara göre bir yapılandırma değerini döndürür.
* Driver: WebDriver örneğini yönetir ve kapatma işlemlerini yapar.

* Yöntem: getDriver(): browser özelliğine göre WebDriver'ı başlatır.
* Yöntem: closeDriver(): Mevcut tarayıcı penceresini kapatır.
* Yöntem: quitDriver(): Tüm tarayıcı pencerelerini kapatır ve WebDriver oturumunu sonlandırır.
* Hooks: Senaryolar için öncesi ve sonrası işlemleri içerir.

* After: Test başarısız olduğunda ekran görüntüsü alır ve senaryo raporuna ekler.
BaseSteps: WebElement işlemleri (örneğin, clickElement, sendKeysToElement, checkElementDisplayed) için ortak eylemler içeren bir ana sınıf.

* Sayfa Nesne Modeli (POM)
Trendyol web sitesindeki her sayfa, pages paketinde karşılık gelen bir sınıfa sahiptir; bu sınıf sayfa üzerindeki WebElement'leri ve ilgili eylemleri içerir.


## Test Çalıştırma
**Maven ile Testleri Çalıştırma**
1. **Tüm testleri çalıştırmak için**:
   ```bash
   mvn test


2. **Belirli bir etiketle işaretlenmiş testleri çalıştırmak için**:
   ```bash
   mvn test -Dcucumber.options="--tags @etiket"


IntelliJ IDEA’dan Çalıştırma
Feature dosyasına veya Runner sınıfına sağ tıklayıp Run seçeneğini seçin.


Örnek Senaryo:
Feature Dosyası (src/test/java/resources/TY1010_Product_Collection_Actions.feature):


## Örnek Senaryo: Feature Dosyası (`src/test/java/resources/TY1010_Product_Collection_Actions.feature`)
```bash
**Feature**: Product Favorite Actions

**Background**: 
- Trendyol Sitesi Açılır 
- Trendyol login olunur

**Scenario**: Ürünleri favoriye ekleme ve silme testleri
- And 5 saniye beklenir
- And Ürün arama combobox’a tıklanır ve "urunAdi" yazılır
- And Ürün arama butonuna tıklanır
- And Aranan ilk ürün seçtirilir
- And Açılan sayfadaki pop-up kapatılır
- And Ürün favorilere eklenir
- And Favorilerim sayfası açılır
- And Bilgilendirme pop-up’ı kapatılır
- And Koleksiyonlarım butonuna tıklanır
- And Sayfa aşağıya kaydırılır
- And Koleksiyonun boş olduğu kontrol edilir
- And Yeni koleksiyon ekle butonuna tıklanır
- And Koleksiyon adı yazılır
- And Koleksiyon oluştur tıklanır
- And Ürün koleksiyona eklenir
- And Popup üzerinde koleksiyona ekle butonuna tıklanır
- And Koleksiyona git butonuna tıklanır
- And Koleksiyonda ürün olduğu kontrol edilir
- And Koleksiyondaki ürün favorilerden çıkarılır
- And Koleksiyonlarım sayfasına geri dönülür
- And Koleksiyon silinir
- And Koleksiyonun boş olduğu kontrol edilir
- And Trendyol ana sayfasına geri dönülür
- And Sayfayı kapatır
```


## Hata Yönetimi ve Kayıt
* **Ekran Görüntüleri:** Hooks sınıfı tarafından test başarısız olduğunda alınır.
* **Assert:** BaseSteps sınıfındaki her yöntem, durumları doğrulamak için assert kullanır. Hata ayıklamayı kolaylaştırmak amacıyla özel hata mesajları eklenmiştir.
* **Bekleme Süreleri:** WebDriver beklemeleri (implicit ve explicit) dinamik içeriği yönetmek ve NoSuchElementException hatasını önlemek için kullanılır.


## **Yazarlar**
**Razi Mert YİĞİT©**
