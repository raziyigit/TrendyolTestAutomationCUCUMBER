package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber-smoke.json",
                "junit:target/xml-report/cucumber-smoke.xml"},
        monochrome = true,
        tags = "@ProductFilter"
)

public class TY1008_TestRunner {
}


