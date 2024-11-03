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
    public WebElement PopUpAcceptButton;


    @FindBy(xpath = "//div[@class='account-nav-item user-login-container']")
    public WebElement HomePageLoginButton;

    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement EpostaTextBox;

    @FindBy(xpath = "//input[@id='login-password-input']")
    public WebElement PasswordTextBox;

    @FindBy(xpath = "//button[@class='q-primary q-fluid q-button-medium q-button submit']")
    public WebElement LoginButton;

    @FindBy(xpath = "//span[text()='E-posta adresiniz ve/veya şifreniz hatalı.']")
    public WebElement ErrorMessageControl;

    @FindBy(xpath = "//input[@data-testid='suggestion']")
    public WebElement SearchTextBox;

    @FindBy(xpath = "//i[@data-testid='search-icon']")
    public WebElement SearchButton;

    @FindBy(xpath = "//div[@class='no-rslt-text no-rslt-title']")
    public WebElement NegativeProductSearchResult;

    @FindBy(xpath = "//div[@class='dscrptn dscrptn-V2']")
    public WebElement IphoneSearchResult;

    @FindBy(xpath = "//div[@data-id='355707118']")
    public WebElement IphoneChoose;

    @FindBy(xpath = "//div[@class='srch-ttl-cntnr-wrppr']")
    public WebElement CurrentProduct;

    @FindBy(xpath = "//button[@class='onboarding-popover__default-renderer-primary-button']")
    public WebElement ProductPagePopUpButton;

    @FindBy(xpath = "//button[@class='add-to-basket']")
    public WebElement ProductPageAddBasketButton;

    @FindBy(xpath = "//div[@class='all-features']")
    public WebElement ProductPageProductFeatureButton;

    @FindBy(xpath = "//button[@class='navigate-all-reviews-btn']")
    public WebElement ProductPageCommentButton;

    @FindBy(xpath = "//span[@class='widget-row']")
    public WebElement ProductPageSellersButton;

    @FindBy(xpath = "//span[@class='add-to-collection-button-text']")
    public WebElement ProductPageAddCollectionButton;

    @FindBy(xpath = "//span[@class='total-review-count']")
    public WebElement ProductPageEvaluationIcon;

    @FindBy(xpath = "//a[@id='logo']")
    public WebElement HomePageButton;

    @FindBy(xpath = "//a[@class='link account-basket']")
    public WebElement MyBasketButton;

    @FindBy(xpath = "//*[contains(text(),'Anladım')]")
    public WebElement BasketPageUnderstandButton;

    @FindBy(xpath = "//*[contains(text(),'Sepetim (1 Ürün)')]")
    public WebElement BasketText;

    @FindBy(xpath ="//div[@class='pb-summary-approve'][1]")
    public WebElement BasketAcceptButton;

    @FindBy(xpath = "//div[@class='pb-merchant-details'][1]")
    public WebElement BasketPageSellerControl;

    @FindBy(xpath = "//div[@class='pb-merchant-group']")
    public WebElement ProductInBasketControl;

    @FindBy(xpath = "//i[@class='i-trash']")
    public WebElement DeleteProductInBasketButton;

    @FindBy(xpath = "//div[@class='pb-basket-item-removed-item-information-label single']")
    public WebElement RemoveProductInBasketControl;

    @FindBy(xpath = "(//*[text()=\"0 TL\"])[1]")
    public WebElement BasketAmountControl;

    @FindBy(xpath = "(//*[text()=\"Çıkış Yap\"])")
    public WebElement LogoutButton;

    @FindBy(xpath = "//span[@class='i-cancel']")
    public WebElement InformationPopUpClose;

    @FindBy(xpath = "//div[@class='selected-order']")
    public WebElement ProductSortingButton;

    @FindBy(xpath = "//*[text()=\"En düşük fiyat\"]")
    public WebElement ProductLowestPriceButton;

    @FindBy(xpath = "(//span[@class='search-dropdown-text'])[2]")
    public WebElement ProductLowestPriceButton2;

    @FindBy(xpath = "(//*[text()=\"Apple\"])[1]")
    public WebElement ProductBrandChooseCheckBox;

    @FindBy(xpath = "(//input[@class='fltr-srch-inpt'])[1]")
    public WebElement ProductCategorySearchTextBox;

    @FindBy(xpath ="//*[text()=\"Telefon Kılıfı\"]")
    public WebElement TelefonKilifiCheckBox;

    @FindBy(xpath = "//div[@class='favorite-button']")
    public WebElement AddFavoriteButton;

    @FindBy(xpath = "//div[@class='link']")
    public WebElement HomePageMyFavoritesButton;

    @FindBy(xpath = "//div[@class='ufvrt-btn-wrppr']")
    public WebElement RemoveFavoriteButton;

    @FindBy(xpath = "//div[@class='p-card-wrppr']")
    public WebElement MyFavoritesPageFavoriteProduct;

    @FindBy(xpath = "//p[@class='empty-favorites-header']")
    public WebElement FavoriteProductEmptyMessage;

    @FindBy(xpath = "//div[@class='button round-3 button-orange']")
    public WebElement StartShoppingButton;

    @FindBy(xpath = "//i[@class='i-collections-icon']")
    public WebElement MyCollectionButton;

    @FindBy(xpath = "//*[text()=\"Koleksiyonlarım (0)\"]")
    public WebElement Collection0Text;

    @FindBy(xpath = "//*[text()=\"Koleksiyonunuz Yok\"]")
    public WebElement Collection0Text2;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement AddNewCollectionButton;

    @FindBy(xpath = "//input[@name='collectionName']")
    public WebElement CollectionNameTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement CreateCollectionButton;

    @FindBy(xpath = "//div[@class='ty-display-flex ty-color-black ty-font-sm ty-flex-column ty-input-w']")
    public WebElement AddCollectionCheckBox;

    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement PopUpAddCollectionButton;

    @FindBy(xpath = "//div[@class='collection-navigation']")
    public WebElement GoToCollectionButton;

    @FindBy(xpath = "//div[@class='collection-update-modal-product']")
    public WebElement ChooseProductInCollectıonPopUp;

    @FindBy(xpath = "//*[text()=\"1 Ürün\"]")
    public WebElement CollectionHaveProductMessage;

    @FindBy(xpath = "//div[@class='image-overlay']")
    public WebElement ProductControlImage;

    @FindBy(xpath = "//div[@class='menu-button']")
    public WebElement CollectionProductInfo;

    @FindBy(xpath = "//i[@class='i-heart favored']")
    public WebElement RemoveProductInFavorite;

    @FindBy(xpath = "//i[@class='i-arrow-right reversed']")
    public WebElement BackCollectionButton;

    @FindBy(xpath = "//button[@class='ty-font-w-semi-bold ty-button ty-bordered ty-transition ty-input-medium ty-primary']")
    public WebElement DeleteCollectionPopUpAcceptButton;

}
