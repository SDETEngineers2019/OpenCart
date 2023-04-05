package stepDefinitions.ForgotPassword;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForgotPassword.ForgotPasswordWebElements;

public class TC_FP_021 {

    ForgotPasswordWebElements elements = new ForgotPasswordWebElements();
    @When("Click on Forgotten Password link from login page")
    public void clickOnForgottenPasswordLinkFromLoginPage() {
        elements.getForgottenPasswordUnderPasswordInput().click();
    }

    @Then("Forgotten Password should be displayed on Breadcrumb")
    public void forgottenPasswordShouldBeDisplayedOnBreadcrumb() {
        elements.isDisplayed(elements.getForgottenPasswordUnderPasswordInput());
    }
}
