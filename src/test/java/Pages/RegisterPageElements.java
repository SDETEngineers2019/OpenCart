package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.MyMethods;

public class RegisterPageElements extends MyMethods {
    public RegisterPageElements() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = "(//a[text()='Register'])[1]")
    private WebElement registerButton;

    @FindBy(xpath = "//h1[text()='Account']")
    private WebElement registerAccountHeader;

    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement registerFirstNameInput;

    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement registerLastNameInput;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement registerEmailInput;
    @FindBy(xpath = "//input[@name='telephone']")
    private WebElement registerTelephoneInput;

    @FindBy(css = "input[name='password']")
    private WebElement registerPasswordInput;

    @FindBy(css = "input[name='confirm']")
    private WebElement registerPasswordConfirmInput;

    @FindBy(css = "input[value='0']") // clicks No option
    private WebElement newsLetterAndPrivacyRadioButton;

    @FindBy(xpath="//input[@type='checkbox']")
    private WebElement registerCheckBox;

    @FindBy(css = "input[value='Continue']")
    private WebElement registerContinueButton;

    public WebElement getMyAccountButton() {
        return myAccountButton;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getRegisterAccountHeader() {
        return registerAccountHeader;
    }

    public WebElement getRegisterFirstNameInput() {
        return registerFirstNameInput;
    }

    public WebElement getRegisterLastNameInput() {
        return registerLastNameInput;
    }

    public WebElement getRegisterEmailInput() {
        return registerEmailInput;
    }

    public WebElement getRegisterTelephoneInput() {
        return registerTelephoneInput;
    }

    public WebElement getRegisterPasswordInput() {
        return registerPasswordInput;
    }

    public WebElement getRegisterPasswordConfirmInput() {
        return registerPasswordConfirmInput;
    }

    public WebElement getNewsLetterAndPrivacyRadioButton() {
        return newsLetterAndPrivacyRadioButton;
    }

    public WebElement getRegisterCheckBox() {
        return registerCheckBox;
    }

    public WebElement getRegisterContinueButton() {
        return registerContinueButton;
    }
}
