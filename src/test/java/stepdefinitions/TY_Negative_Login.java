package stepdefinitions;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Trendyol;

public class TY_Negative_Login {

    Trendyol trendyol =new Trendyol();


    @And("Mail adresi{string} yazilir")
    public void mailAdresiYazilir(String eposta) {
        org.junit.Assert.assertTrue("Öğe görünür değil",trendyol.EpostaTextBox.isDisplayed());
        trendyol.EpostaTextBox.sendKeys(eposta);
    }

    @And("Sifre {string} yazilir")
    public void sifreYazilir(String password) {
        org.junit.Assert.assertTrue("Öğe görünür değil",trendyol.PasswordTextBox.isDisplayed());
        trendyol.PasswordTextBox.sendKeys(password);

    }


    @Then("Hata mesajı aldığı kontrol edilir {string}")
    public void hataMesajıAldıgıKontrolEdilir(String errorMessage) {

            Assert.isTrue(trendyol.ErrorMessageControl.isDisplayed(), "Hata mesajı görüntülendi!");
            String actualErrorMessage = trendyol.ErrorMessageControl.getText();
            Assert.isTrue(actualErrorMessage.equals(errorMessage), "Hata mesajı beklendiği gibi değil!");
            System.out.println("Fail Login Test başarılı: Beklenen hata mesajı alındı.");

    }

    @And("Login asamasinda cikan kategoriler pop-up kapat")
    public void loginAsamasindaCikanKategorilerPopUpKapat() {
        try {
            trendyol.NegativeLoginPagePopUpClose.click();
        } catch (Exception e) {
            System.out.println("Popup kapatma sırasında hata oluştu: " + e.getMessage());
        }

    }
}
