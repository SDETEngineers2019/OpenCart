package stepDefinitions.Register;

import io.cucumber.java.en.Then;
import pages.Register.ElementsForTC_RF_025;

public class TC_RF_025 {
    @Then("The Breadcrumb, Page Heading, Page URL, Page Title of Register Account Page should be displayed")
    public void theBreadcrumbPageHeadingPageURLPageTitleOfRegisterAccountPageShouldBeDisplayed() {
        ElementsForTC_RF_025 element = new ElementsForTC_RF_025();
            element.isDisplayed(element.getBreadcrumb());
            element.isDisplayed(element.getPageHeading());
            element.verifyURL("register");
            element.verifyTitle("Register Account");
    }
}
