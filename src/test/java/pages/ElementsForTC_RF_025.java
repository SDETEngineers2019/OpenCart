package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.MyMethods;

public class ElementsForTC_RF_025 extends MyMethods {
    public ElementsForTC_RF_025() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"account-register\"]/ul")
    private WebElement breadcrumb;

    @FindBy(xpath = "//a[text()=\"Your Store\"]")
    private WebElement pageHeading;

    public WebElement getBreadcrumb() {
        return breadcrumb;
    }

    public WebElement getPageHeading() {
        return pageHeading;
    }
}
