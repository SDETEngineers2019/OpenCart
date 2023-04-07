package stepDefinitions.ForgotPassword;

import io.cucumber.java.en.And;
import pages.ForgotPassword.ForgotPasswordWebElements;

public class TC_FP_004 {
    ForgotPasswordWebElements fp = new ForgotPasswordWebElements();
    @And("Click on Continue button on Forgot Password Page")
    public void clickOnContinueButtonOnForgotPasswordPage() {
        fp.clickMethod(fp.getForgotPasswordContinueButton());
    }
}
