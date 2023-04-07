package stepDefinitions.Search;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage.HomePageElements;
import pages.Search.SearchBoxPageElements;

public class TC_SF_017 {
    HomePageElements hp = new HomePageElements();
    SearchBoxPageElements sp = new SearchBoxPageElements();
    @When("Click on Site Map button")
    public void clickOnSiteMapButton() {
        hp.clickMethod(hp.getSiteMapLink());
    }

    @Then("User should go to the search page")
    public void userShouldGoToTheSearchPage() {
        Assert.assertTrue(sp.getSearchKeywordButton().isDisplayed());
    }
}
