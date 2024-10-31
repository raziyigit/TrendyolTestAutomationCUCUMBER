package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.Trendyol;
import utilities.ConfigReader;
import utilities.Driver;

public class TY_HomePage_Loading {

    Trendyol trendyol = new Trendyol();

    @And("Trendyol ana sayfasının yüklendiğini görür")
    public void trendyol_ana_sayfasının_yüklendiğini_görür() {
        Assert.assertTrue("Trendyol ana sayfa logosu görünmüyor", trendyol.logo.isDisplayed());
    }


    @Then("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.quitDriver();
    }
}
