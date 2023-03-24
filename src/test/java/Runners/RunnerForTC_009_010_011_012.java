package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/featureFiles/TC_RF_009_010_011_012.feature"},
        glue = {"stepDefinitions"}
)
public class RunnerForTC_009_010_011_012 extends AbstractTestNGCucumberTests {

}
