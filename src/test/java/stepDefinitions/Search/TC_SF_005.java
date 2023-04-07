package stepDefinitions.Search;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.bouncycastle.est.LimitedSource;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Search.SearchBoxPageElements;
import utilities.BaseDriver;

import java.util.List;

public class TC_SF_005 {

    SearchBoxPageElements search = new SearchBoxPageElements();

    @Given("Enter the search criteria in the Search text box field which can result in multiple products {string}")
    public void enterTheSearchCriteriaInTheSearchTextBoxFieldWhichCanResultInMutlipleProducts(String product) {
search.clickMethod(search.getSearchBoxButton());
        search.sendKeysMethod(search.getSearchKeywordInput(),product);

    }


    @And("Click on the search button")
    public void clickOnTheSearchButton() {
        search.clickMethod(search.getSearchKeywordButton());
    }

    @Then("Validate More than one products should be displayed in the search results page")
    public void validateMoreThanOneProductsShouldBeDisplayedInTheSearchResultsPage() {
        Assert.assertTrue(search.getListOfElementAfterSearch().size()>1);




        
    }



}
