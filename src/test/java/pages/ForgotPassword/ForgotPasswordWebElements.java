package pages.ForgotPassword;

import org.apache.commons.compress.archivers.zip.X000A_NTFS;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class ForgotPasswordWebElements extends BaseDriver {

    public ForgotPasswordWebElements() {
        PageFactory.initElements(BaseDriver.getDriver(), this);

    }

    @FindBy(css = "#input-email")
    private WebElement forgotPasswordEmailInput;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement forgotPasswordContinueButton;
    @FindBy(className = "alert alert-success alert-dismissible")
    private WebElement confirmationLinkHasBeenSentMessage;
    @FindBy(xpath = "(//a[text()='Forgotten Password'])[1]")
    private WebElement forgottenPasswordUnderPasswordInput;
    @FindBy(xpath = "(//a[text()='Forgotten Password'])[2]")
    private WebElement forgottenPasswordRightColumn;


    public WebElement getForgotPasswordEmailInput() {
        return forgotPasswordEmailInput;
    }

    public WebElement getForgotPasswordContinueButton() {
        return forgotPasswordContinueButton;
    }

    public WebElement getConfirmationLinkHasBeenSentMessage() {
        return confirmationLinkHasBeenSentMessage;
    }

    public WebElement getForgottenPasswordUnderPasswordInput() {
        return forgottenPasswordUnderPasswordInput;
    }

    public WebElement getForgottenPasswordRightColumn() {
        return forgottenPasswordRightColumn;
    }
}
