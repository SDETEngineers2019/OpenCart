package stepDefinitions.Register;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.Register.RegisterPageElements;

import java.util.List;

public class TC_RF_001 {
    RegisterPageElements rp = new RegisterPageElements();
    WebElement input;

    @Given("Enter Your Personal Details")
    public void enterYourPersonalDetails(DataTable elements) {
        List<String> elementList = elements.asList(String.class);
        for (String stringElement : elementList) {
            input = rp.createInputElementByCss(stringElement);
            if (stringElement.equalsIgnoreCase("telephone")) {
                rp.sendKeysMethod(input, rp.randomNumber());
            } else if (stringElement.equalsIgnoreCase("email")) {
                rp.sendKeysMethod(input, rp.randomText() + "@gmail.com");
            } else {
                rp.sendKeysMethod(input, rp.randomText());
            }
        }
    }

    @And("Enter Your Password")
    public void enterYourPassword(DataTable elements) {
        String psw = rp.randomText();
        List<String> elementList = elements.asList(String.class);
        for (String stringElement : elementList) {
            input = rp.createInputElementByCss(stringElement);
            rp.sendKeysMethod(input, psw);

        }
    }

    @And("Click on Privacy Policy checkbox")
    public void clickOnPrivacyPolicyCheckbox() {
        rp.clickMethod(rp.getRegisterCheckBox());
    }

    @When("Click Continue button")
    public void clickContinueButton() {
        rp.clickMethod(rp.getRegisterContinueButton());
    }

    @And("See success text on the URL")
    public void seeSuccessTextOnTheURL() {
        rp.verifyURL("success");
    }

    @And("Click on Continue button after creating successfully the account")
    public void clickOnContinueButtonAfterCreatingSuccessfullyTheAccount() {
        rp.clickMethod(rp.getSuccessCreatAccountContinueButton());
    }

    @Then("My Orders should be visible")
    public void myOrdersShouldBeVisible() {
    rp.verifyContainsText(rp.getMyOrderVisible(),"My Orders");
    }
}
