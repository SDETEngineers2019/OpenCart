package stepDefinitions.Logout;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Logout.LogOutPageElements;
import pages.Register.RegisterPageElements;
import utilities.BaseDriver;

public class LogoutBackgroundSteps {

    LogOutPageElements lp = new LogOutPageElements();
    @Given("Navigate to the web site")
    public void navigateToTheWebSite() {
        BaseDriver.getDriver().get("http://opencart.abstracta.us/index.php?route=common/home");
    }

    @When("Click on My Account button")
    public void clickOnMyAccountButton() {
        lp.clickMethod(lp.getMyAccountButton());
    }

    @And("Click on Login button on home page")
    public void clickOnLoginButtonOnHomePage() {
        lp.clickMethod(lp.getLoginButtonOnHomePage());
        lp.verifyURL("https://opencart.abstracta.us/index.php?route=account/login");
    }

    @And("Enter email and password")
    public void enterEmailAndPassword() {
        lp.sendKeysMethod(lp.getLoginEmailInput(), "pavanoltraining@gmail.com");
        lp.sendKeysMethod(lp.getLoginPasswordInput(), "12345");
    }

    @And("Click on Login button")
    public void clickOnLoginButton() {
        lp.clickMethod(lp.getLoginButton());
    }

    @Then("User should be logged in")
    public void userShouldBeLoggedIn() {
        lp.verifyURL("https://opencart.abstracta.us/index.php?route=account/account");
    }

}
