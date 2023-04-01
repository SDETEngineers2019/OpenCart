package stepDefinitions.Logout;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Logout.LogOutPageElements;

public class TC_LG_009 {
    LogOutPageElements logOutPage = new LogOutPageElements();

    @And("Click Logout from My Account Dropdown")
    public void clickLogoutFromMyAccountDropdown() {

        logOutPage.clickMethod(logOutPage.getLogOutFromDropDown());


    }

    @Then("Check the Page Heading, Page Title, Page URL and Breadcrumb of the displayed Account Logout page")
    public void checkThePageHeadingPageTitlePageURLAndBreadcrumbOfTheDisplayedAccountLogoutPage() {
        logOutPage.verifyURL("https://opencart.abstracta.us/index.php?route=account/logout");
        logOutPage.isDisplayed(logOutPage.getLogOutBreadCrumb());
        logOutPage.isDisplayed(logOutPage.getLogOutPageHeader());
        logOutPage.verifyTitle("Account Logout");

    }

}
