package stepDefinitions.Register;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Register.ElementsForTC_RF_015;
import pages.Register.RegisterPageElements;

public class TC_RF_015 {

    RegisterPageElements rp = new RegisterPageElements();
    ElementsForTC_RF_015 elementsForTCRf015 = new ElementsForTC_RF_015();

    @When("Fill out all the fields")
    public void fillOutAllTheFields() {
        rp.sendKeysMethod(rp.getRegisterFirstNameInput(), "Test1254143263425");
        rp.sendKeysMethod(rp.getRegisterLastNameInput(), "Test3251x");
        rp.sendKeysMethod(rp.getRegisterPasswordInput(), "Test123");
        rp.sendKeysMethod(rp.getRegisterEmailInput(), "Test@test123.com");
        rp.sendKeysMethod(rp.getRegisterTelephoneInput(), "4567891254");
        rp.sendKeysMethod(rp.getRegisterPasswordInput(), "Test123");
        rp.sendKeysMethod(rp.getRegisterPasswordConfirmInput(), "Test123");

    }

    @Then("All the details should be successfully stored in the database")
    public void allTheDetailsShouldBeSuccessfullyStoredInTheDatabase() {
        Assert.assertTrue(elementsForTCRf015.getCongratulationsText().getText().contains("Congratulations!"));
    }
}
