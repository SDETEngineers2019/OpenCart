package stepDefinitions.Register;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Register.RegisterPageElements;
import utilities.BaseDriver;

import java.util.List;

public class TC_RF_004 {

    RegisterPageElements rp = new RegisterPageElements();
    @Then("Error messages should be displayed")
    public void errorMessagesShouldBeDisplayed() {
        List<WebElement> elements = BaseDriver.getDriver().findElements(By.className("text-danger"));
        for (WebElement element : elements){
            rp.isDisplayed(element);
        }
    }
}
