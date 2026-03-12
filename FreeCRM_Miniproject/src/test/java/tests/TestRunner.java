package tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/FreeCRM.feature",
        glue = {"stepdefinitions"},
        monochrome = true,
        dryRun = false,
        plugin = {"pretty", "html:Testreports/hrmsLogin-reports.html"})

public class TestRunner {

}
