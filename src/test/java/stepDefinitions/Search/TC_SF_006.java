package stepDefinitions.Search;

import io.cucumber.java.en.Then;
import pages.Search.SearchBoxPageElements;

public class TC_SF_006 {
    SearchBoxPageElements search = new SearchBoxPageElements();
    @Then("Search text box field and Search Criteria text box field is displayed")
    public void searchTextBoxFieldAndSearchCriteriaTextBoxFieldIsDisplayed() {
        search.isDisplayed(search.getSearchBox());
        search.isDisplayed(search.getSearchKeywordInput());
    }
}
