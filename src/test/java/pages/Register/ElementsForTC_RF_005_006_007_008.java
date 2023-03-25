package pages.Register;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.MyMethods;

public class ElementsForTC_RF_005_006_007_008 extends MyMethods {

    public ElementsForTC_RF_005_006_007_008() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='form-group']/div/label[1]/input")
    private WebElement newsLetterYesRadioButton;

    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement accountSuccessPageContinueButton;

    @FindBy(xpath = "(//a[text()='Newsletter'])[1]")
    private WebElement newsletterButton;

    @FindBy(xpath = "//input[@checked='checked']")
    private WebElement yesRadioButton;

    @FindBy(xpath = "//a[text()='Login']")
    private WebElement loginButton;

    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement newCustomerContinueButton;

    @FindBy(xpath = "//*[@id='column-right']/div/a[2]")
    private WebElement rightColumnRegisterButton;

    @FindBy(xpath = "//div[text()='Password confirmation does not match password!']")
    private WebElement errorPasswordMessage;


    public WebElement getNewsLetterYesRadioButton() {
        return newsLetterYesRadioButton;
    }

    public WebElement getAccountSuccessPageContinueButton() {
        return accountSuccessPageContinueButton;
    }

    public WebElement getNewsletterButton() {
        return newsletterButton;
    }

    public WebElement getYesRadioButton() {
        return yesRadioButton;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getNewCustomerContinueButton() {
        return newCustomerContinueButton;
    }

    public WebElement getRightColumnRegisterButton() {
        return rightColumnRegisterButton;
    }

    public WebElement getErrorPasswordMessage() {
        return errorPasswordMessage;
    }
}
