package pages.MyAccount;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.MyMethods;

public class myAccountPageElements extends MyMethods {

    public myAccountPageElements() {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='my account']")
    private WebElement myAccountLinkInSuccessMessage;
    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccountButton;
    @FindBy(xpath = "//a[text()='Login']")
    private WebElement loginButton;
    @FindBy(id = "input-email")
    private WebElement emailInputForLogin;
    @FindBy(id = "input-password")
    private WebElement passwordInputForLogin;
    @FindBy(css = "input[type='submit']")
    private WebElement loginButtonForEntry;
    @FindBy(xpath = "(//a[text()='My Account'])[1]")
    private WebElement myAccountInDropdownMenu;
    @FindBy(xpath = "(//a[text()='Order History'])[3]")
    private WebElement orderHistoryButton;
    @FindBy(xpath = "//a[text()='Site Map']")
    private WebElement siteMapButtonOnFooter;
    @FindBy(xpath = "(//a[text()='My Account'])[2]")
    private WebElement myAccountInSiteMap;
    @FindBy(xpath = "//a[text()='Account']")
    private WebElement accountLinkInBreadcrumb;
    @FindBy(xpath = "//div[@id='content']/h2[1]")
    private WebElement myAccountHeaderInAccountPage;

    public WebElement getMyAccountLinkInSuccessMessage() {
        return myAccountLinkInSuccessMessage;
    }

    public WebElement getMyAccountButton() {
        return myAccountButton;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getEmailInputForLogin() {
        return emailInputForLogin;
    }

    public WebElement getPasswordInputForLogin() {
        return passwordInputForLogin;
    }

    public WebElement getLoginButtonForEntry() {
        return loginButtonForEntry;
    }

    public WebElement getMyAccountInDropdownMenu() {
        return myAccountInDropdownMenu;
    }

    public WebElement getOrderHistoryButton() {
        return orderHistoryButton;
    }

    public WebElement getSiteMapButtonOnFooter() {
        return siteMapButtonOnFooter;
    }

    public WebElement getMyAccountInSiteMap() {
        return myAccountInSiteMap;
    }

    public WebElement getAccountLinkInBreadcrumb() {
        return accountLinkInBreadcrumb;
    }

    public WebElement getMyAccountHeaderInAccountPage() {
        return myAccountHeaderInAccountPage;
    }
}
