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








# Trendyol Automation Project                 ----Razi Mert YİĞİT©----

This project is a test automation framework created for the Trendyol website, using Java, Selenium, Cucumber, and JUnit. The Page Object Model (POM) design pattern is implemented to enhance code reusability and maintainability.

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
- And Wait for 5 seconds
- And Click on the product search combobox and enter "productName"
- And Click on the product search button
- And Select the first searched product
- And Close the pop-up on the opened page
- And Add the product to favorites
- And Open the Favorites page
- And Close the information pop-up
- And Click on the Collections button
- And Scroll down the page
- And Verify that the collection is empty
- And Click on the Add new collection button
- And Enter a collection name
- And Click Create Collection
- And Add the product to the collection
- And Click on the Add to collection button in the popup
- And Click on the Go to collection button
- And Verify that the collection contains the product
- And Remove the product from favorites in the collection
- And Go back to My Collections page
- And Delete the collection
- And Verify that the collection is empty
- And Return to the Trendyol homepage
- And Close the page

```


## Error Management and Logging
* **Screenshots:** Captured by the Hooks class when a test fails.
* **Assert:** Every method in the BaseSteps class uses assertions to verify conditions. Custom error messages are added to simplify debugging.
* **Wait Times:** WebDriver waits (implicit and explicit) are used to handle dynamic content and prevent NoSuchElementException errors.


## **Authors**
**Razi Mert YİĞİT©**





