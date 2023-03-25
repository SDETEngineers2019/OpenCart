package stepDefinitions.Register;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Register.ElementsForTC_RF_016;
import pages.Register.RegisterPageElements;

public class TC_TF_016 {

    RegisterPageElements rp = new RegisterPageElements();
    ElementsForTC_RF_016 elementsForTCRf016 = new ElementsForTC_RF_016();
    @When("Enter spaces into mandatory fields")
    public void enterSpacesIntoMandatoryFields() {
        rp.sendKeysMethod(rp.getRegisterFirstNameInput(), " ");
        rp.sendKeysMethod(rp.getRegisterLastNameInput(), " ");
        rp.sendKeysMethod(rp.getRegisterEmailInput(), " ");
        rp.sendKeysMethod(rp.getRegisterTelephoneInput(), " ");
        rp.sendKeysMethod(rp.getRegisterPasswordInput(), " ");
        rp.sendKeysMethod(rp.getRegisterPasswordConfirmInput(), " ");
    }

    @Then("Warning message should be displayed")
    public void warningMessageShouldBeDisplayed() {
        elementsForTCRf016.waitUntilVisible(elementsForTCRf016.getFirstNameWarningText());
        Assert.assertTrue(elementsForTCRf016.getFirstNameWarningText().isDisplayed());
    }
}
