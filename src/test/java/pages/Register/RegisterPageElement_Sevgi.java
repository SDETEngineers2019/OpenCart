package pages.Register;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.MyMethods;

import java.util.List;

public class RegisterPageElement_Sevgi extends MyMethods {
    public RegisterPageElement_Sevgi() {
        PageFactory.initElements(BaseDriver.getDriver(), this);

    }
    @FindBy(xpath = "//input[@id='input-firstname']")
    private WebElement registerFirstNameInput;

    @FindBy(xpath = "//input[@id='input-lastname']")
    private WebElement registerLastNameInput;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement registerEmailInput;

    @FindBy(xpath = "//input[@id='input-telephone']")
    private WebElement telephoneBtn;
    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement registerPasswordInput;
    @FindBy(xpath = "//input[@id='input-confirm']")
    private WebElement registerPasswordConfirm;

    @FindBy(xpath = "(//label[@class='radio-inline'])[2]")
    private WebElement newLetterBtn;

    @FindBy(xpath="//input[@type='checkbox']")
    private WebElement registerCheckBox;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement registerContinueButton;

    @FindBy(xpath = "//div[text()=' Warning: You must agree to the Privacy Policy!']")
    private WebElement warningText;

    @FindBy(xpath = "//div[text()=' Warning: You must agree to the Privacy Policy!']")
    private WebElement warningText2;

    @FindBy(linkText = "login page")
    private WebElement linkTextBtn;

    @FindBy(xpath ="//div[@class='list-group']/a")
    private List<WebElement> rightColumnBtn;

    @FindBy(xpath = "//ul[@class='dropdown-menu']/li")
    private List<WebElement> menuOption1;

    @FindBy(xpath = "//div[@class='row']")
    private List<WebElement> headerBtn;

    @FindBy(xpath = "//div[@class='container']")
    private List<WebElement> footerBtn;

    @FindBy(xpath = "//ul[@class='list-inline']/li")
    private List<WebElement> topListBtn;






    public WebElement getRegisterFirstNameInput() {
        return registerFirstNameInput;
    }

    public WebElement getRegisterLastNameInput() {
        return registerLastNameInput;
    }

    public WebElement getRegisterEmailInput() {
        return registerEmailInput;
    }

    public WebElement getTelephoneBtn() {
        return telephoneBtn;
    }

    public WebElement getRegisterPasswordInput() {
        return registerPasswordInput;
    }

    public WebElement getRegisterPasswordConfirm() {
        return registerPasswordConfirm;
    }

    public WebElement getNewLetterBtn() {
        return newLetterBtn;
    }

    public WebElement getRegisterCheckBox() {
        return registerCheckBox;
    }

    public WebElement getRegisterContinueButton() {
        return registerContinueButton;
    }

    public WebElement getWarningText() {
        return warningText;
    }

    public WebElement getWarningText2() {
        return warningText2;
    }



    public List<WebElement> getHeaderBtn() {
        return headerBtn;
    }

    public List<WebElement> getFooterBtn() {
        return footerBtn;
    }

    public List<WebElement> getTopListBtn() {
        return topListBtn;
    }

    public WebElement getLinkTextBtn() {
        return linkTextBtn;
    }

    public List<WebElement> getRightColumnBtn() {
        return rightColumnBtn;
    }

    public List<WebElement> getMenuOption1() {
        return menuOption1;
    }
}
