package tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"},
        glue = {"framework.steps"},
        features = {"src/test/resources/cucumbers"},
        tags = {"@checkEmailErrorMessage"}
)
class CucumberRunner {}
