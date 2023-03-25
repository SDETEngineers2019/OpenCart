package pages.Register;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.MyMethods;

public class SuccessfullRegisterElement extends MyMethods {

    public SuccessfullRegisterElement() {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@id='content']/h1")
    private WebElement successfullyLogin;

    public WebElement getSuccessfullyLogin() {
        return successfullyLogin;
    }
}
