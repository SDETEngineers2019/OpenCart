package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.MyMethods;

public class ElementsForTC_RF_015 extends MyMethods {
    public ElementsForTC_RF_015() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='content']//p[1]")
    private WebElement congratulationsText;

    public WebElement getCongratulationsText() {
        return congratulationsText;
    }
}
