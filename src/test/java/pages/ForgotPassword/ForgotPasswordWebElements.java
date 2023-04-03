package pages.ForgotPassword;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.MyMethods;



public class ForgotPasswordWebElements extends MyMethods {

    public ForgotPasswordWebElements (){
      PageFactory.initElements(BaseDriver.getDriver(),this);

    }

    @FindBy(css = "#input-email")
    private WebElement forgotPasswordEmailInput; //When you click on forgotten password button,this e-mail input shows up.
    @FindBy(xpath = "//input[@type='submit']") //When you enter you e-mail to inbox,then continue button
    private WebElement forgotPasswordContinueButton;
    @FindBy(css= ".alert.alert-success.alert-dismissible") //When you enter valid e-mail address this message will show up.
    private WebElement confirmationLinkHasBeenSentMessage;

    @FindBy(xpath = "(//a[text()='Forgotten Password'])[1]") //under the password input on login page
    private WebElement forgottenPasswordUnderPasswordInput;

   @FindBy(xpath = "(//a[text()='Forgotten Password'])[2]") //Right side of the page
    private WebElement forgottenPasswordRightColumn;
   @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")//When you enter invalid email to forgotten password reset input,this message will show up
   private WebElement warningMessage;


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

    public WebElement getWarningMessage() {
        return warningMessage;

    }
}