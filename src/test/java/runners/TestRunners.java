package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true,
        tags = "@HomePageLoading or @ProductSearch or @NegativeProductSearch or @ProductDetails or @ShoppingCartActions  or @PositiveLogin or @NegativeLogin"

)

public class TestRunners {

}


