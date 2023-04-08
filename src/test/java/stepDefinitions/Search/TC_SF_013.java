package stepDefinitions.Search;

import io.cucumber.java.en.Then;
import pages.Search.SearchBoxPageElements;

public class TC_SF_013 {
    SearchBoxPageElements search = new SearchBoxPageElements();
    @Then("Validate you are at Product Compare Page")
    public void validateYouAreAtProductComparePage() {
        search.verifyURL("compare");
    }
}
