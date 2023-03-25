package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.RegisterPageElement_Sevgi;
import pages.RegisterPageElements;

public class TC_RF_021Steps {

    RegisterPageElements rp = new RegisterPageElements();
    RegisterPageElement_Sevgi rps= new RegisterPageElement_Sevgi();

    @Given("Fill out all the fields")
    public void fill_out_all_the_fields() {
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        rps.sendKeysMethod(rps.getRegisterFirstNameInput(),"Sam");
//   rps.sendKeysMethod(rps.getRegisterLastNameInput(),"Jhonny");
//   rps.sendKeysMethod(rps.getRegisterEmailInput(),"Sam123@com");
//   rps.sendKeysMethod(rps.getTelephoneBtn(),"1234566");
//   rps.sendKeysMethod(rps.getRegisterPasswordInput(),"123qwe");
//   rps.sendKeysMethod(rps.getRegisterPasswordConfirm(),"123qwe");
//

    }
    @When("Click on the Continue Button")
    public void click_on_the_continue_button() {

        rps.clickMethod(rps.getNewLetterBtn());
        //rp.clickMethod(rp.getRegisterCheckBox());

        rps.clickMethod(rps.getRegisterContinueButton());
    }
    @Then("user should be Warning Text")
    public void user_should_be_warning_text() {
        waitUntilVisible(rps.getWarningText());
    Assert.assertTrue(rps.getWarningText().isDisplayed());
    }

    private void waitUntilVisible(WebElement warningText) {
    }


    @Given("Fill out all the fields without click checkBox")
    public void fillOutAllTheFieldsWithoutClickCheckBox() {


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        rps.sendKeysMethod(rps.getRegisterFirstNameInput(),"Sam");
        rps.sendKeysMethod(rps.getRegisterLastNameInput(),"Jhonny");
        rps.sendKeysMethod(rps.getRegisterEmailInput(),"Sam123@gmail.com");
        rps.sendKeysMethod(rps.getTelephoneBtn(),"1234566");
        rps.sendKeysMethod(rps.getRegisterPasswordInput(),"123qwe");
        rps.sendKeysMethod(rps.getRegisterPasswordConfirm(),"123qwe");

    }
}
