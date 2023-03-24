package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.MyMethods;

import java.util.List;

public class ElementsForTC_RF_014 extends MyMethods {

    public ElementsForTC_RF_014() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@class='form-group required']")
    private List<WebElement> mandatoryFields;

    @FindBy(xpath = "//label[contains(text(),'First Name')]/preceding-sibling::span[@class='input-group-addon' and text()='*']")
    private WebElement firstNameText;

    @FindBy(xpath = "//fieldset[@id='account']//label[@for='input-lastname']")
    private WebElement lastNameText;

    @FindBy(xpath = "//fieldset[@id='account']//label[@for='input-email']")
    private WebElement emailText;

    @FindBy(xpath = "//fieldset[@id='account']//label[@for='input-telephone']")
    private WebElement telephoneText;

    @FindBy(xpath = "//div[@class='form-group required']//label[@for='input-password']")
    private WebElement passwordText;

    @FindBy(xpath = "//div[@class='form-group required']//label[@for='input-confirm']")
    private WebElement passwordConfirmText;

    public WebElement getFirstNameText() {
        return firstNameText;
    }

    public WebElement getLastNameText() {
        return lastNameText;
    }

    public WebElement getEmailText() {
        return emailText;
    }

    public WebElement getTelephoneText() {
        return telephoneText;
    }

    public WebElement getPasswordText() {
        return passwordText;
    }

    public WebElement getPasswordConfirmText() {
        return passwordConfirmText;
    }

    public List<WebElement> getMandatoryFields() {
        return mandatoryFields;
    }
}

