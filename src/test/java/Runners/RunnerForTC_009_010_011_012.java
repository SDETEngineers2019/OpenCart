package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//        tags = "";
        features = {"src/test/java/featureFiles/Register/TC_RF_009_010_011_012.feature"},
        glue = {"stepDefinitions"}
)
public class RunnerForTC_009_010_011_012 extends AbstractTestNGCucumberTests {

}
