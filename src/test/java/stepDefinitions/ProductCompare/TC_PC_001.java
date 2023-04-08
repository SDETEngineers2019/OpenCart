package stepDefinitions.ProductCompare;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.ProductCompare.ProductCompareWebElements;
import pages.Search.SearchBoxPageElements;
import utilities.BaseDriver;

import javax.swing.*;

public class TC_PC_001 {


    ProductCompareWebElements pc=new ProductCompareWebElements();

    @Given("Enter any existing Product name into the Search text box field {string}")
    public void enterAnyExistingProductNameIntoTheSearchTextBoxField(String productName) {
        pc.sendKeysMethod(pc.getSearchBox(),productName);
        pc.clickMethod(pc.getSearchBoxButton());


    }

    @And("Click on the Product displayed in the Search results")
    public void clickOnTheProductDisplayedInTheSearchResults() {
        pc.clickMethod(pc.getImacProduct());

    }

    @And("Hover the mouse cursor on Compare this Product option from the displayed Product Display Page")
    public void hoverTheMouseCursorOnCompareThisProductOptionFromTheDisplayedProductDisplayPage() {
        Actions action=new Actions(BaseDriver.getDriver());
       Action mouseHover= action.moveToElement(pc.getCompareProductButton()).build();
       mouseHover.perform();

    }

    @And("Tool tip with the text Compare this Product should be displayed")
    public void toolTipWithTheTextCompareThisProductShouldBeDisplayed() {


    }


    @And("Success message with text {string} should be displayed")
    public void successMessageWithTextToYourProductComparisonShouldBeDisplayed(String successMessage) {
        pc.verifyContainsText(pc.getSuccessMessage(),successMessage);
    }

    @Then("Click on product comparison link from the displayed success message")
    public void clickOnProductComparisonLinkFromTheDisplayedSuccessMessage() {
        pc.clickMethod(pc.getc);
    }

    @Then("User should be taken to the Product Comparison page with the details of the Product that we have added for comparison.")
    public void userShouldBeTakenToTheProductComparisonPageWithTheDetailsOfTheProductThatWeHaveAddedForComparison() {
    }
}
