package stepDefinitions.Search;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.Search.SearchBoxPageElements;

public class TC_SF_009 {
    SearchBoxPageElements search = new SearchBoxPageElements();

    @When("Enter any Product Name into the Search Criteria text box field  {string}")
    public void enterAnyProductNameIntoTheSearchCriteriaTextBoxField(String productName) {
        search.sendKeysMethod(search.getSearchKeywordInput(), productName);

    }

    @And("Select the correct category of the given Product Name into Category dropdown field")
    public void selectTheCorrectCategoryOfTheGivenProductNameIntoCategoryDropdownField() {
        Select select = new Select(search.getCategoriesDropDown());
        search.clickMethod(search.getCategoriesDropDown());
        select.selectByIndex(3);

    }

    @And("Click on Search button")
    public void clickOnSearchButton() {
        search.clickMethod(search.getSearchKeywordButton());
    }


    @And("Validate product should be successfully displayed in the search results.")
    public void validateProductShouldBeSuccessfullyDisplayedInTheSearchResults() {
        search.isDisplayed(search.getImacImage());

    }

    @And("Select a wrong category in the Category dropdown field")
    public void selectAWrongCategoryInTheCategoryDropdownField() {
        Select select = new Select(search.getCategoriesDropDown());
        search.clickMethod(search.getCategoriesDropDown());
        select.selectByIndex(2);
        search.clickMethod(search.getSearchKeywordButton());
       // search.verifyContainsStringText("Your shopping cart is empty!","There is no product that matches the search criteria");
    }
}
