package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "./src/test/resources/Feature/QuickCreate.feature",  // Correct path to the features directory
    glue = "StepDefinition",  // Correct package name for step definitions
    plugin = {"json:result/cucumber-report.json","html:result/cucumber-reporthtml.html"}  // Correct format for the plugin
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
