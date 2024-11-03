package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.Trendyol;
import utilities.ConfigReader;
import utilities.Driver;

public class TY_HomePage_Loading extends BaseSteps {

    Trendyol trendyol = new Trendyol();


    @And("Trendyol ana sayfasının yüklendiğini görür")
    public void trendyol_ana_sayfasının_yüklendiğini_görür() {
        checkElementDisplayed(trendyol.HomePageButton, "Trendyol ana sayfasi yüklenemedi");
    }


    @Then("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.quitDriver();
    }
}
