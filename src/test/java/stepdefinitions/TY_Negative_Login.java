package stepdefinitions;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.Trendyol;

public class TY_Negative_Login extends BaseSteps {

    Trendyol trendyol = new Trendyol();


    @And("Mail adresi{string} yazilir")
    public void mailAdresiYazilir(String eposta) {
        checkElementDisplayed(trendyol.EpostaTextBox, "Mail adresi text box mevcut degil");
        sendKeysToElement(trendyol.EpostaTextBox, eposta, "Mail yazma işlemi başarısız");
    }

    @And("Sifre {string} yazilir")
    public void sifreYazilir(String password) {
        checkElementDisplayed(trendyol.PasswordTextBox, "Sifre text box mevcut degil");
        sendKeysToElement(trendyol.PasswordTextBox, password, "Şifre yazma işlemi başarısız");

    }


    @Then("Hata mesajı aldığı kontrol edilir {string}")
    public void hataMesajıAldıgıKontrolEdilir(String errorMessage) {

        checkElementDisplayed(trendyol.ErrorMessageControl, "hata mesaji mevcut degil");
        String actualErrorMessage = trendyol.ErrorMessageControl.getText();
        Assert.isTrue(actualErrorMessage.equals(errorMessage), "Hata mesajı beklendiği gibi değil!");


    }

    @And("Login asamasinda cikan kategoriler pop-up kapat")
    public void loginAsamasindaCikanKategorilerPopUpKapat() {
        try {
            clickElement(trendyol.InformationPopUpClose, "tiklama basarisiz...");
        } catch (Exception e) {
            System.out.println("Popup kapatma sırasında hata oluştu: " + e.getMessage());
        }

    }
}
