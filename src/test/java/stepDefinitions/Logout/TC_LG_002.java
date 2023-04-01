package stepDefinitions.Logout;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Logout.LogOutPageElements;

public class TC_LG_002 {

    LogOutPageElements logOutPageElements=new LogOutPageElements();


    @And("Enter existing EMail {string} and password {string}")
    public void enterExistingEMailAndPassword(String existingEmail, String password) {
        logOutPageElements.sendKeysMethod(logOutPageElements.getLoginEmailInput(), existingEmail);
        logOutPageElements.sendKeysMethod(logOutPageElements.getLoginPasswordInput(), password);

    }



    @Then("Click on Login")
    public void clickOnLogin() {
        logOutPageElements.clickMethod(logOutPageElements.getLoginButton());
    }

    @And("Click on Logout option from the Right Column")
    public void clickOnLogoutOptionFromTheRightColumn() {
        logOutPageElements.waitUntilClickable(logOutPageElements.getLogOutButton());
        logOutPageElements.clickMethod(logOutPageElements.getLogOutButton());
    }

    @And("Click on Continue button for logout")
    public void clickOnContinueButtonForLogout() {
        logOutPageElements.waitUntilClickable(logOutPageElements.getLogOutContinueButton());
        logOutPageElements.clickMethod(logOutPageElements.getLogOutContinueButton());

    }



    @Then("Validate you are at the home page")
    public void validateYouAreAtTheHomePage() {
        logOutPageElements.isDisplayed(logOutPageElements.getHomePage());
    }



}
