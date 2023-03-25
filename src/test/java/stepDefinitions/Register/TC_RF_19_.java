package stepDefinitions.Register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Register.RegisterPageElements;
import pages.Register.SuccessfullRegisterElement;

public class TC_RF_19_ {

    RegisterPageElements elements=new RegisterPageElements();
    SuccessfullRegisterElement successfullRegisterElement=new SuccessfullRegisterElement();
    @And("Enter First Name and Last Name")
    public void enterFirstNameAndLastName() {
        elements.sendKeysMethod(elements.getRegisterFirstNameInput()," Melek ");
        elements.sendKeysMethod(elements.getRegisterLastNameInput()," BAYKALL ");
    }

    @And("Enter Email")
    public void enterEmail() {
        elements.sendKeysMethod(elements.getRegisterEmailInput()," mbaykall@gmail.com ");
    }

    @And("Enter Phone")
    public void enterPhone() {
        elements.sendKeysMethod(elements.getRegisterTelephoneInput(), " 6542581515 ");
    }

    @And("Enter Password and Confirm Password")
    public void enterPasswordAndConfirmPassword() {
        elements.sendKeysMethod(elements.getRegisterPasswordInput()," Melek123 ");
        elements.sendKeysMethod(elements.getRegisterPasswordConfirmInput()," Melek123 ");
    }

    @And("Click agreement button")
    public void clickAgreementButton() {
        elements.clickMethod(elements.getNewsLetterAndPrivacyRadioButton());
    }

    @Then("Successfully Registiration created")
    public void successfullyRegistirationCreated() {
       successfullRegisterElement.verifyContainsText(successfullRegisterElement.getSuccessfullyLogin(),"Account");
    }
}
