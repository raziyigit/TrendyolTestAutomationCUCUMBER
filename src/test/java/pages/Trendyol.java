package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Trendyol {


    public Trendyol(){
        PageFactory.initElements(Driver.getDriver(),this);}

    //XPATH

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement PopUpKabulEtButton;


    @FindBy(xpath = "//div[@class='link account-user']")
    public WebElement AnaSayfaGirisYapButton;


    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement EpostaTextBox;

    @FindBy(xpath = "//input[@id='login-password-input']")
    public WebElement SifreTextBox;

    @FindBy(xpath = "//button[@class='q-primary q-fluid q-button-medium q-button submit']")
    public WebElement GirisYapButton;

    @FindBy(xpath = "//span[text()='E-posta adresiniz ve/veya şifreniz hatalı.']")
    public WebElement HataMesajiKontrol;

    @FindBy(xpath = "//input[@data-testid='suggestion']")
    public WebElement SearchTextBox;

    @FindBy(xpath = "//i[@data-testid='search-icon']")
    public WebElement SearchButton;


    @FindBy(xpath = "//div[@class='no-rslt-text no-rslt-title']")
    public WebElement HataliUrunAramaSonucu;

    @FindBy(xpath = "//a[@id='logo']")
    public WebElement logo;

    @FindBy(xpath = "//div[@class='p-card-wrppr with-campaign-view'][1]")
    public WebElement IphoneAramaSonucu;


    @FindBy(xpath = "//div[@class='p-card-wrppr with-campaign-view'][1]")
    public WebElement IphoneSecme;

    @FindBy(xpath = "//div[@class='account-nav-item user-login-container']")
    public WebElement LoginKontrol;

    @FindBy(xpath = "//div[@class='srch-ttl-cntnr-wrppr']")
    public WebElement MevcutUrun;

    @FindBy(xpath = "//button[@class='onboarding-popover__default-renderer-primary-button']")
    public WebElement UrunSayfasiPopUpButton;

    @FindBy(xpath = "//span[@class='i-cancel']")
    public WebElement NegativeLoginPagePopUpKapat;


}
