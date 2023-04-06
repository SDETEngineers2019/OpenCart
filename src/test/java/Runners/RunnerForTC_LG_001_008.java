package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@LogoutOptionFromMyAccountDropdownMenu",
        features = {"src/test/java/featureFiles/Logout/TC_LG_001_008.feature"},
        glue = {"stepDefinitions/Logout", "stepDefinitions/Register"}
)
public class RunnerForTC_LG_001_008 extends AbstractTestNGCucumberTests {

}
