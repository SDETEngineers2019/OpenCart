package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.MyMethods;

public class ElementsForTC_RF_016 extends MyMethods {
    public ElementsForTC_RF_016() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"account\"]/div[2]/div/div")
    private WebElement firstNameWarningText;

    public WebElement getFirstNameWarningText() {
        return firstNameWarningText;
    }
}
