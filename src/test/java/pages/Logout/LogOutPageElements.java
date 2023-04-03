package pages.Logout;

import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.MyMethods;

public class LogOutPageElements extends MyMethods {

    public LogOutPageElements() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = "//a[text()='Login']")
    private WebElement loginButtonOnHomePage;

    @FindBy(css = "#input-email")
    private WebElement loginEmailInput;

    @FindBy (css = "#input-password")
    private WebElement loginPasswordInput;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "(//div[@class='list-group']/a)[13]")
    private WebElement logOutButton;

    @FindBy(xpath = "//div[@id='content']/p[1]")
    private WebElement successfullyLoggedOutMessage;

    @FindBy(xpath = "//div[@class='pull-right']")
    private WebElement logOutContinueButton;

    @FindBy(id = "logo")
    private WebElement homePage;

    @FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[3]")
    private WebElement myAccountDropDownButton;

    @FindBy(xpath = "//*[text()='Logout']")
    private WebElement logOutFromDropDown;

    @FindBy(xpath = "(//*[@class='breadcrumb']//li/a)[3]")
    private WebElement logOutBreadCrumb;
    @FindBy(xpath = "//h1[text()='Account']")
    private WebElement logOutPageHeader;

    @FindBy(xpath = "(//*[text()='Login'])[1]")
    private WebElement loginFromDropDown;

    public WebElement getMyAccountButton() {
        return myAccountButton;

    }

    public WebElement getLoginButtonOnHomePage() {
        return loginButtonOnHomePage;

    }

    public WebElement getLogOutButton() {
        return logOutButton;
    }

    public WebElement getSuccessfullyLoggedOutMessage() {
        return successfullyLoggedOutMessage;
    }

    public WebElement getLogOutContinueButton() {
        return logOutContinueButton;
    }

    public WebElement getHomePage() {
        return homePage;
    }

    public WebElement getMyAccountDropDownButton() {
        return myAccountDropDownButton;
    }

    public WebElement getLogOutFromDropDown() {
        return logOutFromDropDown;
    }

    public WebElement getLogOutBreadCrumb() {
        return logOutBreadCrumb;
    }

    public WebElement getLogOutPageHeader() {
        return logOutPageHeader;
    }

    public WebElement getLoginFromDropDown() {
        return loginFromDropDown;
    }

    public WebElement getLoginEmailInput() {
        return loginEmailInput;
    }

    public WebElement getLoginPasswordInput() {
        return loginPasswordInput;
    }

    public WebElement getLoginButton() {
        return loginButton;

    }
}