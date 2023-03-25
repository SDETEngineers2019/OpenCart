package stepDefinitions.Register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.Register.ElementsForTC_009_010_011_012;
import pages.Register.RegisterPageElements;
import org.testng.Assert;

import java.awt.*;

public class TC_RF_009_010_011_012 {
    RegisterPageElements rp = new RegisterPageElements();
    ElementsForTC_009_010_011_012 eft = new ElementsForTC_009_010_011_012();

    @When("Enter existing First Name as {string} and Last Name as {string}")
    public void enterExistingFirstNameAndLastName(String firstName, String lastName) {
        rp.sendKeysMethod(rp.getRegisterFirstNameInput(), firstName);
        rp.sendKeysMethod(rp.getRegisterLastNameInput(), lastName);
    }

    @When("Enter existing EMail as {string}")
    public void enterExistingEMail(String existingEMail) {
        rp.sendKeysMethod(rp.getRegisterEmailInput(), existingEMail);
    }

    @When("Enter existing Phone Number as {string}")
    public void enterExistingPhoneNumber(String phoneNumber) {
        rp.sendKeysMethod(rp.getRegisterTelephoneInput(), phoneNumber);
    }

    @When("Enter existing Password as {string} and Confirm as {string}")
    public void enterExistingPasswordAndConfirm(String password, String confirmPassword) {
        rp.sendKeysMethod(rp.getRegisterPasswordInput(), password);
        rp.sendKeysMethod(rp.getRegisterPasswordConfirmInput(), confirmPassword);
    }

    @And("Click on Continue button")
    public void clickOnContinueButton() {
        rp.clickMethod(rp.getNewsLetterAndPrivacyRadioButton());
        rp.clickMethod(rp.getRegisterCheckBox());
        rp.clickMethod(rp.getRegisterContinueButton());
    }

    @Then("Already registered error message should be displayed")
    public void alreadyRegisteredErrorMessageShouldBeDisplayed() {
        rp.verifyContainsText(eft.getWarningMessageForExistingEmail(), "Warning: E-Mail Address is already registered!");
    }

    @When("Enter invalid EMail as {string}")
    public void enterInvalidEMailAs(String eMail) {
        rp.sendKeysMethod(rp.getRegisterEmailInput(), eMail);
    }

    @Then("Invalid EMail as {string} error message should be displayed")
    public void invalidEMailAsErrorMessageShouldBeDisplayed(String eMail) {
        if (!(eMail.contains("@"))) {
            String msg = rp.getRegisterEmailInput().getAttribute(("validationMessage"));
            rp.verifyContainsStringText(msg, "Please include an '@' in the email address. '" + eMail + "' is missing an '@'.");
        } else if (eMail.contains("@") && eMail.charAt(eMail.length() - 1) == '@') {
            String msg = rp.getRegisterEmailInput().getAttribute(("validationMessage"));
            rp.verifyContainsStringText(msg, "Please enter a part following '@'. '" + eMail + "' is incomplete.");
        } else if (eMail.contains("@") && eMail.charAt(eMail.length() - 1) == '.') {
            String msg = rp.getRegisterEmailInput().getAttribute(("validationMessage"));
            String secondPartOfEMail = eMail.split("@")[1];
            rp.verifyContainsStringText(msg, "'.' is used at a wrong position in '" + secondPartOfEMail + "'.");
        }
        else {
            rp.verifyContainsText(eft.getWarningMessageForInvalidEmail(), "E-Mail Address does not appear to be valid!");
        }
    }

    @Then("Invalid Phone Number error message should be displayed")
    public void invalidPhoneNumberErrorMessageShouldBeDisplayed() {
        Assert.fail();
        Assert.assertEquals(null, "Invalid phone number");
    }

    @When("Fill in the registration form")
    public void fillInTheRegistrationForm() throws AWTException {

        rp.sendKeysMethod(rp.getRegisterFirstNameInput(), "Pavan" +
                Keys.TAB + "B" +
                Keys.TAB + "pavanoltraining@gmail.com" +
                Keys.TAB + "814240XXXX" +
                Keys.TAB + "12345" +
                Keys.TAB + "12345");
    }
}
