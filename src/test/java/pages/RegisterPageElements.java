package pages;

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

    @FindBy(xpath = "//h1[text()='Register Account']")
    private WebElement registerAccountHeader;

    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement registerFirstNameInput;

    @FindBy(xpath = "//input[@name='lastname']]")
    private WebElement registerLastNameInput;

    @FindBy(xpath = "//input[@name='email']]")
    private WebElement registerEmailInput;

    @FindBy(css = "#input-password")
    private WebElement registerPasswordInput;

    @FindBy(xpath="//input[@type='checkbox']")
    private WebElement registerCheckBox;

    @FindBy(xpath = "//button[text()='Continue']")
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

    public WebElement getRegisterPasswordInput() {
        return registerPasswordInput;
    }

    public WebElement getRegisterCheckBox() {
        return registerCheckBox;
    }

    public WebElement getRegisterContinueButton() {
        return registerContinueButton;
    }
}
