package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.MyMethods;

public class ElementsForTC_009_010_011_012 extends MyMethods {

    public ElementsForTC_009_010_011_012() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private WebElement warningMessageForExistingEmail;

    @FindBy(xpath = "//div[@class='text-danger']")
    private WebElement warningMessageForInvalidEmail;

    public WebElement getWarningMessageForExistingEmail() {
        return warningMessageForExistingEmail;
    }

    public WebElement getWarningMessageForInvalidEmail() {
        return warningMessageForInvalidEmail;
    }

}
