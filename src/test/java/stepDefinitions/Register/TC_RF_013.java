package stepDefinitions.Register;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.Register.RegisterPageElements;

public class TC_RF_013 {
    RegisterPageElements rp = new RegisterPageElements();
    @Given("All fields should be empty")
    public void allFieldsShouldBeEmpty() {
        rp.getRegisterFirstNameInput().clear();
        rp.getRegisterLastNameInput().clear();
        rp.getRegisterEmailInput().clear();
        rp.getRegisterPasswordInput().clear();

    }

    @Then("All placeholders should have the proper placeholders")
    public void allPlaceholdersShouldHaveTheProperPlaceholders() {

        String firstNameActualPlaceholder = rp.getRegisterFirstNameInput().getAttribute("placeholder");
        Assert.assertEquals("First Name", firstNameActualPlaceholder);

        String lastNameActualPlaceholder = rp.getRegisterLastNameInput().getAttribute("placeholder");
        Assert.assertEquals("Last Name", lastNameActualPlaceholder);

        String emailActualPlaceholder = rp.getRegisterEmailInput().getAttribute("placeholder");
        Assert.assertEquals("E-Mail", emailActualPlaceholder);

        String passwordActualPlaceholder = rp.getRegisterPasswordInput().getAttribute("placeholder");
        Assert.assertEquals("Password", passwordActualPlaceholder);


    }
}
