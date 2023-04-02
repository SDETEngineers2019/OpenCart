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

    @FindBy(css = "#input-email")  // login page email input box
    private WebElement loginEmailInput;

    @FindBy (css = "#input-password")    //login page password input box
    private WebElement loginPasswordInput;
    @FindBy(xpath = "//input[@type='submit']")  // login page login button
    private WebElement loginButton;

    @FindBy(xpath = "(//div[@class='list-group']/a)[13]")  //Log out from right column
    private WebElement logOutButton;

    @FindBy(xpath = "//div[@id='content']/p[1]")
    private WebElement successfullyLoggedOutMessage; //When you successfully log out from right column, this message shows up.

    @FindBy(xpath = "//div[@class='pull-right']")   //When you log out from right column, this is that continue button that takes you to home page
    private WebElement logOutContinueButton;

    @FindBy(id = "logo")
    private WebElement homePage; // When you click continue logout,this home page will be shown.

    @FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[3]")  // My Account dropdown button on top of the page right side.
    private WebElement myAccountDropDownButton;

    @FindBy(xpath = "//*[text()='Logout']")  //Log out button from My Account dropdown on the top of the page.
    private WebElement logOutFromDropDown;

    @FindBy(xpath = "(//*[@class='breadcrumb']//li/a)[3]")  //When you log out from My Account dropdown, this Logout breadcrumb will appear.
    private WebElement logOutBreadCrumb;
    @FindBy(xpath = "//h1[text()='Account']") //When you logout from My Account dropdown ,this "Account" header will appear.
    private WebElement logOutPageHeader;

    @FindBy(xpath = "(//*[text()='Login'])[1]") // Login button from My Account dropdown from the top of the page.
    private WebElement loginFromDropDown;

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

