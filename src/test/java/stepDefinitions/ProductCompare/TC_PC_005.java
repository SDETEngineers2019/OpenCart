package stepDefinitions.ProductCompare;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.ProductCompare.ProductCompareWebElements;
import utilities.BaseDriver;

public class TC_PC_005 {
    ProductCompareWebElements elements = new ProductCompareWebElements();
    Actions actions = new Actions(BaseDriver.getDriver());
    @Given("Click on Desktops and select Show All Desktops option")
    public void clickOnDesktopsAndSelectShowAllDesktopsOption() {
        elements.scrollToElement(elements.getDesktopButton());
        Action hoverTheMouse = actions.moveToElement(elements.getDesktopButton()).build();
        hoverTheMouse.perform();
        elements.clickMethod(elements.getShowAllDesktop());
    }

    @Then("Validate you are at the Product Comparison Page")
    public void validateYouAreAtTheProductComparisonPage() {
        elements.verifyURL("compare");
    }

    @And("Validate success message displayed  Success: You have added Product Name to your product comparison!")
    public void validateSuccessMessageDisplayedSuccessYouHaveAddedProductNameToYourProductComparison() {
        elements.verifyContainsText(elements.getSuccessMessage(), "comparison");
    }

    @And("Click on Compare this Product option and validate Compare this Product is displayed")
    public void clickOnCompareThisProductOptionAndValidateCompareThisProductIsDisplayed() {
        elements.scrollToElement(elements.getCompareProductButton());
        Actions actions = new Actions(BaseDriver.getDriver());
        Action hoverTheMouse = actions.moveToElement(elements.getCompareProductButton()).build();
        hoverTheMouse.perform();
        elements.isDisplayed(elements.getCompareProductButton());
        elements.clickMethod(elements.getCompareProductButton());
    }
}
