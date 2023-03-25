package stepDefinitions.Register;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.Register.RegisterPageElement_Sevgi;
import pages.Register.RegisterPageElements;
import utilities.BaseDriver;

import java.util.ArrayList;
import java.util.List;

public class TC_RF_023Steps {
    RegisterPageElements rp = new RegisterPageElements();
    RegisterPageElement_Sevgi rps= new RegisterPageElement_Sevgi();


    @Given("Click Login Page Link")
    public void click_login_page_link() {
        rps.clickMethod(rps.getLinkTextBtn());
        Assert.assertTrue(BaseDriver.getDriver().getCurrentUrl().contains("login"));
        BaseDriver.getDriver().navigate().back();


    }
    @Given("Click Privacy Policy link")
    public void click_privacy_policy_link() {
      rps.clickMethod(rps.getRegisterCheckBox());


    }
    @When("Click Right Column Options")
    public void click_right_column_options() {
        rps.scrollToElement(rp.getMyAccountButton());

        for (int i = 0; i < rps.getRightColumnBtn().size(); i++) {
            rps.getRightColumnBtn().get(i).click();
        }

    }

    @When("Menu Options")
    public void menu_options() {
        for (WebElement element: rps.getMenuOption1()) {
            rps.clickMethod(element);
            BaseDriver.getDriver().navigate().back();
        }

    }
    @When("Click Any Options")
    public void click_any_options() {
        for (int i=0; i<=5; i++){
            rps.clickMethod((WebElement) rps.getTopListBtn());
            BaseDriver.getDriver().navigate().back();

        }
        return;
    }


    @And("Click Header and Footer")
    public void clickHeaderAndFooter() {
        for (int i=0; i<=4; i++){
            rps.clickMethod((WebElement) rps.getFooterBtn());
            BaseDriver.getDriver().navigate().back();

            rps.clickMethod((WebElement) rps.getHeaderBtn());
            BaseDriver.getDriver().navigate().back();

        }
            return;
    }

}
