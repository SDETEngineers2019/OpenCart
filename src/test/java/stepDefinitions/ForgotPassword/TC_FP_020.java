package stepDefinitions.ForgotPassword;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.ForgotPassword.ForgotPasswordWebElements;

public class TC_FP_020 {
    ForgotPasswordWebElements fp = new ForgotPasswordWebElements();
    @Then("User should be navigated to 'Forgotten Password page")
    public void userShouldBeNavigatedToForgottenPasswordPage() {
        Assert.assertTrue(fp.getForgotPasswordEmailInput().isDisplayed());

    }
}
