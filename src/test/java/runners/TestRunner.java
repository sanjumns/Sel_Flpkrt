package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // Path to feature files
    glue = "stepDefinitions",                // Path to step definitions
    plugin = { "pretty", "html:target/cucumber-reports.html" }, // Report generation
    monochrome = true                        // Better console output
)
public class TestRunner {
}
