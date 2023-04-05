package stepDefinitions.Search;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Search.SearchBoxPageElements;
import pages.WishList.WishListPageElements;

public class TC_SF_004 {

    SearchBoxPageElements sb = new SearchBoxPageElements();
    WishListPageElements wl = new WishListPageElements();

    @When("Enter any existing product name into search box")
    public void enterAnyExistingProductNameIntoSearchBox() {
        sb.getSearchBox().sendKeys("iMac");
    }

    @And("Click on search icon")
    public void clickOnSearchIcon() {
        sb.getSearchBoxButton().click();
    }

    @Then("Searched product is displayed")
    public void searchedProductIsDisplayed() {
        wl.isDisplayed(wl.getProduct());
    }
}
