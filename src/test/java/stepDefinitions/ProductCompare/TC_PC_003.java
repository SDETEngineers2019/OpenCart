package stepDefinitions.ProductCompare;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.ProductCompare.ProductCompareWebElements;
import utilities.BaseDriver;

public class TC_PC_003 {

    ProductCompareWebElements elements = new ProductCompareWebElements();
    @And("Click on Grid view")
    public void clickOnGridView() {
        elements.getGridButton().click();
    }

    @And("Click on Compare this Product option")
    public void clickOnCompareThisProductOption() {
        elements.scrollToElement(elements.getCompareProductButton());
        Actions actions = new Actions(BaseDriver.getDriver());
        Action hoverTheMouse = actions.moveToElement(elements.getCompareProductButton()).build();
        hoverTheMouse.perform();
        elements.clickMethod(elements.getCompareProductButton());
    }

    @Then("Click on product comparison link from the success message")
    public void clickOnProductComparisonLinkFromTheSuccessMessage() {
        elements.clickMethod(elements.getProductComparisonLink());
    }
}
