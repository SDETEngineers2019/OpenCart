package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@TestLoginWithOldPassword",
        features = {"src/test/java/featureFiles/ForgotPassword/TC_FP_004.feature"},
        glue = {"stepDefinitions/ForgotPassword", "stepDefinitions/Register", "stepDefinitions/Logout"}
)
public class RunnerForTC_FP_004 extends AbstractTestNGCucumberTests {

}
