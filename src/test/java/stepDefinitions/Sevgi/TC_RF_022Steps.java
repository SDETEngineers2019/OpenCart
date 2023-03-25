package stepDefinitions.Sevgi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.RegisterPageElement_Sevgi;
import pages.RegisterPageElements;

public class TC_RF_022Steps {
    RegisterPageElements rp = new RegisterPageElements();
    RegisterPageElement_Sevgi rps= new RegisterPageElement_Sevgi();


    @Given("Enter Password")
    public void enter_password() {
        rps.sendKeysMethod(rps.getRegisterPasswordInput(),"Sam123");

    }
    @When("Enter Password Confirm")
    public void enter_password_confirm() {
       rps.sendKeysMethod(rps.getRegisterPasswordConfirm(),"Sam123");
    }

    @Then("user should see Warning Text")
    public void userShouldSeeWarningText() {
        Assert.assertTrue(rps.getWarningText2().isDisplayed());
    }

}
