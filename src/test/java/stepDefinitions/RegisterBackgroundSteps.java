package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPageElements;
import utilities.BaseDriver;

public class RegisterBackgroundSteps {

    RegisterPageElements rp = new RegisterPageElements();
    @Given("Navigate to the web site")
    public void navigateToTheWebSite() {
        BaseDriver.getDriver().get("https://demo.opencart.com");
    }

    @When("Click on My Account button")
    public void clickOnMyAccountButton() {
        rp.clickMethod(rp.getMyAccountButton());
    }

    @And("Click on Register button")
    public void clickOnRegisterButton() {
        rp.clickMethod(rp.getRegisterButton());
    }

    @Then("User should go to Register Account page")
    public void userShouldGoToRegisterAccountPage() {
        rp.verifyContainsText(rp.getRegisterAccountHeader(), "Register Account");
    }
}
