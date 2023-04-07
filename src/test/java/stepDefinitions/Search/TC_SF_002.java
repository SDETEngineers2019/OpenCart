package stepDefinitions.Search;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Search.SearchBoxPageElements;

public class TC_SF_002 {
    SearchBoxPageElements sf=new SearchBoxPageElements();
    @Given("Enter non existing product name into the Search text box field {string}")
    public void enterNonExistingProductNameIntoTheSearchTextBoxField(String productName) {
        sf.sendKeysMethod(sf.getSearchBox(),productName);
    }

    @And("Click on the button having search icon")
    public void clickOnTheButtonHavingSearchIcon() {
        sf.clickMethod(sf.getSearchBoxButton());
    }

    @Then("{string} should be displayed in the Search Results page")
    public void shouldBeDisplayedInTheSearchResultsPage(String message) {
      sf.verifyContainsStringText("Your shopping cart is empty!",message);



    }
    }
