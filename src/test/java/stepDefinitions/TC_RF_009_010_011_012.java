package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPageElements;

public class TC_RF_009_010_011_012 {
    RegisterPageElements rp = new RegisterPageElements();
    @When("Enter existing First Name and Last Name")
    public void enterExistingFirstNameAndLastName() {
        rp.sendKeysMethod(rp.getRegisterFirstNameInput(), "Pavan");
        rp.sendKeysMethod(rp.getRegisterLastNameInput(), "B");
    }

    @When("Enter existing EMail")
    public void enterExistingEMail() {
        rp.sendKeysMethod(rp.getRegisterEmailInput(), "pavanoltraining@gmail.com");
    }

    @When("Enter existing Phone Number")
    public void enterExistingPhoneNumber() {
        rp.sendKeysMethod(rp.getRegisterTelephoneInput(), "814240XXXX");
    }

    @When("Enter existing Password and Confirm")
    public void enterExistingPasswordAndConfirm() {
        rp.sendKeysMethod(rp.getRegisterPasswordInput(), "12345");
        rp.sendKeysMethod(rp.getRegisterPasswordConfirmInput(), "12345");
    }

    @And("Click on Continue button")
    public void clickOnContinueButton() {
        rp.clickMethod(rp.getNewsLetterAndPrivacyRadioButton());
        rp.clickMethod(rp.getRegisterCheckBox());
        rp.clickMethod(rp.getRegisterContinueButton());
    }

//    @Then("Already registered error message should be displayed")
//    public void alreadyRegisteredErrorMessageShouldBeDisplayed() {
//    }
}
