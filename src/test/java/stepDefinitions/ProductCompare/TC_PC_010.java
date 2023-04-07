package stepDefinitions.ProductCompare;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.ProductCompare.ProductCompareWebElements;
import utilities.BaseDriver;

public class TC_PC_010 {
    ProductCompareWebElements elements = new ProductCompareWebElements();
    @Given("Hover the mouse on Desktops")
    public void hoverTheMouseOnDesktops() {
        Actions actions = new Actions(BaseDriver.getDriver());
        Action hoverTheMouseOnDesktops = actions.moveToElement(elements.getDesktopButton()).build();
        hoverTheMouseOnDesktops.perform();
    }

    @When("Select Show All Desktops option")
    public void selectShowAllDesktopsOption() {
        elements.waitUntilVisible(elements.getShowAllDesktop());
        elements.getShowAllDesktop().click();
    }

    @And("Click on Product Compare link")
    public void clickOnProductCompareLink() {
        elements.getProductCompareZeroItem().click();
    }

    @Then("Verify the message")
    public void verifyTheMessage() {
        elements.verifyContainsText(elements.getShoppingCartEmptyMessage(), "You have not chosen any products to compare.");
    }
}
