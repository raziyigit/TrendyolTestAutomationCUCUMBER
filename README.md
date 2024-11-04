**Turkish**
# Trendyol Otomasyon Projesi                 ----Razi Mert YİĞİT©----

Bu proje, Trendyol web sitesi için Java, Selenium, Cucumber ve JUnit kullanılarak oluşturulmuş bir test otomasyon framework'üdür. Test kodlarının yeniden kullanılabilirliğini ve bakımını artırmak için Sayfa Nesne Modeli (POM) tasarım deseni uygulanmıştır. 

## Önemli
* Projeyi çalıştırmadan önce configuration.properties içerisinde **"mail"** ve **"şifre"** değişkenlerini kendi hesabınıza uygun olarak doldurmanız gerekmektedir.

![image](https://github.com/user-attachments/assets/b02855ec-5561-49ce-b2d0-781417f75ce6)


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

- **src/test/resources/TY1006_Negative_Login.feature adımında Scenario Outline yapısı kullanılmıştır.Mail boş şifre dolu, mail dolu şifre boş , her ikisi de boş vb test caselerinin hepsi kullanılmıştır.**
- **Assert yapısı Element kontrol adımları haricinde de her bir xpath için proje içerisinde BaseSteps'te tanımlı olan methodlar ile kontrol ettirilmiştir.**

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
- And Koleksiyon adi "TrendyolTestKoleksiyon" yazilir
- And Koleksiyon oluştur tıklanır
- And Ürün koleksiyona eklenir
- And Popup üzerinde koleksiyona ekle butonuna tıklanır
- And Koleksiyona git butonuna tıklanır
- And Koleksiyonda ürün olduğu kontrol edilir
- And Koleksiyondaki ürün favorilerden çıkarılır
- And Koleksiyonlarım sayfasına geri dönülür
- And Sayfa asagiya kaydirilir
- And Koleksiyon silinir
- And Koleksiyonun boş olduğu kontrol edilir
- And Trendyol ana sayfasına geri dönülür
- And Hesabim butonunun uzerine gelinir
- And 3 saniye beklenir
- And Cikis yap butonuna tiklanir
- And Cikis yaptigi kontrol edilir
- And Sayfayı kapatır
```

![image](https://github.com/user-attachments/assets/b9f3d747-c580-4df4-90c5-8afe02765410)

![image](https://github.com/user-attachments/assets/510b3c5d-4e41-437d-8f8b-c6f52d7235cf)

![image](https://github.com/user-attachments/assets/0ec3d2fe-6f0c-401d-acca-e5c77cf0db2c)



## Hata Yönetimi ve Kayıt
* **Ekran Görüntüleri:** Hooks sınıfı tarafından test başarısız olduğunda alınır.
* **Assert:** BaseSteps sınıfındaki her yöntem, durumları doğrulamak için assert kullanır. Hata ayıklamayı kolaylaştırmak amacıyla özel hata mesajları eklenmiştir.
* **Bekleme Süreleri:** WebDriver beklemeleri (implicit ve explicit) dinamik içeriği yönetmek ve NoSuchElementException hatasını önlemek için kullanılır.


## **Yazarlar**
**Razi Mert YİĞİT©**








**English**
# Trendyol Automation Project                 ----Razi Mert YİĞİT©----

This project is a test automation framework created for the Trendyol website, using Java, Selenium, Cucumber, and JUnit. The Page Object Model (POM) design pattern is implemented to enhance code reusability and maintainability.

## Important
Before running the project, you need to fill in the **mail** and **password** variables in the configuration.properties file with values appropriate for your own account.

## Table of Contents

1. [Project Structure](#project-structure)
2. [Installation and Setup](#installation-and-setup)
3. [Configuration](#configuration)
4. [Usage](#usage)
5. [Running Tests](#running-tests)
6. [Error Management and Logging](#error-management-and-logging)

## Requirements:

- Selenium: 4.16.1
- Cucumber Java: 7.14.1
- Cucumber JUnit: 7.14.0
- Code Style: The project follows Java naming conventions and applies the POM design pattern, ensuring modular and reusable code.


## Project Structure

Description of the project structure:

- **`pom.xml`**: Manages project dependencies (Selenium, Cucumber, JUnit) and configurations for Maven.
- **`src/test/java`**:
  - **`stepdefinitions`**: Contains Cucumber step definitions where test steps are implemented.
  - **`utilities`**: Contains helper classes like `Driver`, `ConfigReader` for configuration and WebDriver management.
  - **`hooks`**: The `Hooks` class manages setup and teardown operations for scenarios; captures screenshots upon test failure.
  - **`pages`**: Contains Page Object Model (POM) classes for Trendyol pages.
- **`src/test/resources`**:
  - **`features`**: Contains Cucumber feature files defining test scenarios.
  - **`configuration.properties`**: Manages configuration settings such as browser type and user information in key-value pairs.
 
- **src/test/resources/TY1006_Negative_Login.feature adımında Scenario Outline yapısı kullanılmıştır.Mail boş şifre dolu, mail dolu şifre boş , her ikisi de boş vb test caselerinin hepsi kullanılmıştır.**
- **Scenario Outline structure was used in the src/test/resources/TY1006_Negative_Login.feature step. All test cases such as mail is empty, password is full, mail is full, password is empty, both are empty, etc. were used.**

## Installation and Setup

1. **Clone the Project:**:
   ```bash
   git clone https://github.com/raziyigit/TrendyolTestAutomationCUCUMBER.git
**Open the Project in IntelliJ IDEA:** Ensure IntelliJ IDEA and JDK 17 are installed.

**Install Dependencies:** Maven will automatically download the dependencies listed in pom.xml:

- Selenium WebDriver for browser interactions.
- Cucumber for BDD-style testing.
- JUnit as the test runner framework.
- Set up Browser Driver:
- Ensure the appropriate WebDriver (Chrome, Firefox, Edge, etc.) is in the system PATH.
- Alternatively, specify the paths to the driver files in the configuration.properties file if needed.


## Configuration
The configuration.properties file stores configurable parameters for the project.


## Usage
Helper Classes

ConfigReader: Reads configuration values from the configuration.properties file.

* Method: getProperty(String key): Returns a configuration value for the specified key.
* Driver: Manages the WebDriver instance and handles termination.

* Method: getDriver(): Initializes WebDriver based on the browser property.
* Method: closeDriver(): Closes the current browser window.
* Method: quitDriver(): Closes all browser windows and ends the WebDriver session.
* Hooks: Includes setup and teardown operations for scenarios.

* After: Captures a screenshot upon test failure and attaches it to the scenario report.
BaseSteps: A base class containing common actions for WebElement operations (e.g., clickElement, sendKeysToElement, checkElementDisplayed).

* Page Object Model (POM)
 Each page on the Trendyol website corresponds to a class in the pages package, which contains WebElements and related actions.


## Running Tests
**Running Tests with Maven**
1. **To run all tests**:
   ```bash
   mvn test


2. **To run tests tagged with a specific label:**:
   ```bash
   mvn test -Dcucumber.options="--tags @etiket"


Running from IntelliJ IDEA
Right-click on the feature file or the Runner class and select Run.


Sample Scenario:
Feature File (src/test/java/resources/TY1010_Product_Collection_Actions.feature):


## Sample Scenario: Feature File (src/test/java/resources/TY1010_Product_Collection_Actions.feature)
```bash
**Feature**: Product Favorite Actions

**Background**: 
- Open Trendyol website
- Log into Trendyol

**Scenario**: Testing adding and removing products from favorites
- And wait for 5 seconds
- And click on the product search combobox and type "productName"
- And click on the product search button
- And select the first searched product
- And close the pop-up on the opened page
- And add the product to favorites
- And open the Favorites page
- And close the notification pop-up
- And click on the My Collections button
- And scroll down the page
- And check if the collection is empty
- And click on the Add New Collection button
- And enter "TrendyolTestCollection" as the collection name
- And click on Create Collection
- And add the product to the collection
- And click on the Add to Collection button on the popup
- And click on the Go to Collection button
- And verify that the product is in the collection
- And remove the product from favorites within the collection
- And go back to the My Collections page
- And scroll down the page
- And delete the collection
- And verify that the collection is empty
- And return to the Trendyol homepage
- And hover over the My Account button
- And wait for 3 seconds
- And click on the Log Out button
- And verify that the user has logged out
- And close the page
```


## Error Management and Logging
* **Screenshots:** Captured by the Hooks class when a test fails.
* **Assert:** Every method in the BaseSteps class uses assertions to verify conditions. Custom error messages are added to simplify debugging.
* **Wait Times:** WebDriver waits (implicit and explicit) are used to handle dynamic content and prevent NoSuchElementException errors.


## **Authors**
**Razi Mert YİĞİT©**






