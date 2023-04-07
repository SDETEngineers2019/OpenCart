package stepDefinitions.ForgotPassword;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ForgotPassword.ForgotPasswordWebElements;
import utilities.BaseDriver;

public class TC_FP_005_TC_FP_015_and_TC_FP_019 {

    ForgotPasswordWebElements fp = new ForgotPasswordWebElements();


    @And("Click on Forgot Password link from login page")
    public void clickOnForgotPasswordLinkFromLoginPage() {
        fp.clickMethod(fp.getForgottenPasswordRightColumn());
    }

    @And("Enter an email {string} address for which the Account does not exist in the application")
    public void enterAnEmailAddressForWhichTheAccountDoesNotExistInTheApplication(String email) {

        fp.sendKeysMethod(fp.getForgotPasswordEmailInput(), email);
        fp.clickMethod(fp.getForgotPasswordContinueButton());
    }

    @Then("Success message {string} should be displayed in green color")
    public void successMessageShouldBeDisplayedInGreenColor(String message) {
        fp.verifyContainsText(fp.getConfirmationLinkHasBeenSentMessage(), message);
    }


    @Then("Validate the message")
    public void validateTheMessage() {
        fp.verifyContainsText(fp.getWarningMessage(), "Warning: The E-Mail Address was not found in our records, please try again!");
    }

    @And("Click on Back button")
    public void clickOnBackButton() {
        BaseDriver.getDriver().navigate().back();

    }

    @Then("Validate you are at the login page")
    public void validateYouAreAtTheLoginPage() {
        fp.verifyURL("https://opencart.abstracta.us/index.php?route=account/login");

    }

    @Then("Field level warning message with text {string} should be displayed for E-Mail Address field")
    public void fieldLevelWarningMessageWithTextShouldBeDisplayedForEMailAddressField(String message) {
        fp.verifyContainsText(fp.getWarningMessage(),message);
    }

    @And("Click on Continue button from forgot password field")
    public void clickOnContinueButtonFromForgotPasswordField() {
        fp.clickMethod(fp.getForgotPasswordContinueButton());
    }
}
