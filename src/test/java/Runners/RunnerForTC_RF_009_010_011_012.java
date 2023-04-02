package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@TestExistingAccount",
        features = {"src/test/java/featureFiles/Register/TC_RF_009_010_011_012.feature"},
        glue = {"stepDefinitions/Register"}
)
public class RunnerForTC_RF_009_010_011_012 extends AbstractTestNGCucumberTests {

}
