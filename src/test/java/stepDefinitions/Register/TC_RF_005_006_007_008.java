package stepDefinitions.Register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Register.ElementsForTC_RF_005_006_007_008;
import pages.Register.RegisterPageElements;

public class TC_RF_005_006_007_008 {

    RegisterPageElements rp = new RegisterPageElements();
    ElementsForTC_RF_005_006_007_008 elements = new ElementsForTC_RF_005_006_007_008();

    @When("Enter a new account details for FirstName and LastName")
    public void enterANewAccountDetailsForFirstNameAndLastName() {
        rp.sendKeysMethod(rp.getRegisterFirstNameInput(), "x1");
        rp.sendKeysMethod(rp.getRegisterLastNameInput(), "y1");
    }

    @And("Enter a new account details for Email and Telephone")
    public void enterANewAccountDetailsForEmailAndTelephone() {
        rp.sendKeysMethod(rp.getRegisterEmailInput(), "x1y13@gmail.com");
        rp.sendKeysMethod(rp.getRegisterTelephoneInput(), "1234567890");
    }

    @And("Enter a new account details for Password, PasswordConfirm and PrivacyPolicyFields")
    public void enterANewAccountDetailsForPasswordPasswordConfirmAndPrivacyPolicyFields() {
        rp.sendKeysMethod(rp.getRegisterPasswordInput(), "x1y1X1Y1");
        rp.sendKeysMethod(rp.getRegisterPasswordConfirmInput(), "x1y1X1Y1");
        rp.clickMethod(rp.getRegisterCheckBox());
    }

    @When("Click on Yes radio option for Newsletter")
    public void clickOnYesRadioOptionForNewsletter() {
        elements.clickMethod(elements.getNewsLetterYesRadioButton());
    }

    @And("Click on Continue Button")
    public void clickOnContinueButton() {
        rp.clickMethod(rp.getRegisterContinueButton());
    }

    @And("Click on Continue button that is displayed in the Account Success page")
    public void clickOnContinueButtonThatIsDisplayedInTheAccountSuccessPage() {
        elements.clickMethod(elements.getAccountSuccessPageContinueButton());
    }

    @And("Click on Subscribe-Unsubscribe to newsletter option")
    public void clickOnSubscribeUnsubscribeToNewsletterOption() {
        elements.clickMethod(elements.getNewsletterButton());
    }

    @Then("Yes option should be displayed as selected")
    public void yesOptionShouldBeDisplayedAsSelected() {
        elements.verifyIsSelected(elements.getYesRadioButton());
    }

    @When("Click on No radio option for Newsletter")
    public void clickOnNoRadioOptionForNewsletter() {
        rp.clickMethod(rp.getNewsLetterAndPrivacyRadioButton());
    }

    @Then("No option should be displayed as selected")
    public void noOptionShouldBeDisplayedAsSelected() {
        elements.verifyIsSelected(rp.getNewsLetterAndPrivacyRadioButton());
    }

    @And("Click on Login option")
    public void clickOnLoginOption() {
        elements.clickMethod(elements.getLoginButton());
    }

    @And("Click  on Continue button inside New Customer box")
    public void clickOnContinueButtonInsideNewCustomerBox() {
        elements.clickMethod(elements.getNewCustomerContinueButton());
    }

    @And("Click on Register option from the Right Column options")
    public void clickOnRegisterOptionFromTheRightColumnOptions() {
        elements.clickMethod(elements.getRightColumnRegisterButton());
    }

    @And("Click on checkbox for PrivacyPolicyFields")
    public void clickOnCheckboxForPrivacyPolicyFields() {
        rp.clickMethod(rp.getRegisterCheckBox());
    }

    @When("Enter any password into the Password field")
    public void enterAnyPasswordIntoThePasswordField() {
        rp.sendKeysMethod(rp.getRegisterPasswordInput(), "12345");
    }

    @And("Enter any different password into the Password Confirm field")
    public void enterAnyDifferentPasswordIntoThePasswordConfirmField() {
        rp.sendKeysMethod(rp.getRegisterPasswordConfirmInput(), "abcde");
    }

    @Then("Error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        elements.verifyContainsText(elements.getErrorPasswordMessage(), "does not match");
    }
}
