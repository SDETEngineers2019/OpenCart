package stepDefinitions.Search;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.Search.SearchBoxPageElements;

public class TC_SF_003 {
    SearchBoxPageElements sp = new SearchBoxPageElements();

    @Then("There is no product that matches the search criteria should be displayed")
    public void thereIsNoProductThatMatchesTheSearchCriteriaShouldBeDisplayed() {
        Assert.assertTrue(sp.getYourShoppingCartIsEmptyMessage().isDisplayed());
    }

}
