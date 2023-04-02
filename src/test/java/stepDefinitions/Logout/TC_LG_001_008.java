package stepDefinitions.Logout;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Logout.LogOutPageElements;

public class TC_LG_001_008 {
    LogOutPageElements lp = new LogOutPageElements();
    @When("Click on My Account Dropdown Menu")
    public void clickOnMyAccountDropdownMenu() {
        lp.clickMethod(lp.getMyAccountDropDownButton());
    }

    @And("Click on Logout Button")
    public void clickOnLogoutButton() {
        lp.clickMethod(lp.getLogOutFromDropDown());
    }

    @Then("User should be taken to Account Logout page")
    public void userShouldBeTakenToAccountLogoutPage() {
        lp.verifyContainsText(lp.getSuccessfullyLoggedOutMessage(), "logged off");
    }

    @And("User should see Login Option under My Account Dropdown Menu")
    public void userShouldSeeLoginOptionUnderMyAccountDropdownMenu() {
        lp.clickMethod(lp.getMyAccountDropDownButton());
        lp.isDisplayed(lp.getLoginFromDropDown());
    }

    @And("Click on Logout Continue Button")
    public void clickOnLogoutContinueButton() {
        lp.clickMethod(lp.getLogOutContinueButton());
    }

    @Then("User should be taken to Home page")
    public void userShouldBeTakenToHomePage() {
        lp.verifyURL("http://opencart.abstracta.us/index.php?route=common/home");
    }

    @And("Click on Login button under My Account Dropdown Menu")
    public void clickOnLoginButtonUnderMyAccountDropdownMenu() {
        lp.clickMethod(lp.getLoginFromDropDown());
    }

    @Then("User should be taken to Login Page")
    public void userShouldBeTakenToLoginPage() {
        lp.verifyURL("https://opencart.abstracta.us/index.php?route=account/login");
    }

}
