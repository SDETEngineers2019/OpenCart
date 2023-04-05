package pages.Checkout;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.MyMethods;

public class CheckoutPageElements extends MyMethods {
    public CheckoutPageElements() {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Checkout']")
    private WebElement checkoutButton;

    @FindBy(css = "input[name='search']")
    private WebElement searchBox;

    @FindBy(css = "div.container div.row div.col-sm-5 div.input-group span.input-group-btn > button.btn.btn-default.btn-lg")
    private WebElement searchButtonIcon;

    @FindBy(xpath = "//span[text()=\"Add to Cart\"]")
    private WebElement addToCartButton;

    @FindBy(xpath = "//a[text()=\"shopping cart\"]")
    private WebElement shoppingCartDisplayedInSuccessMsg;

    @FindBy(xpath = "//a[text()=\"Checkout\"]")
    private WebElement checkoutButtonInTheShoppingCartPage;

    @FindBy(css = "button[data-loading-text='Loading...']")
    private WebElement CartButtonInBlackColor;

    @FindBy(xpath = "//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong")
    private WebElement checkoutOptionInDisplayedCartBlock;

    @FindBy(css = "input[value='Continue']")
    private  WebElement continueButton;

    @FindBy(css = "input[type='checkbox']")
    private WebElement checkboxTermsAndConditions;

    @FindBy(css = "input[value='Confirm Order']")
    private WebElement confirmOrderButton;

    @FindBy(css = "input[value='new']")
    private WebElement wantToUseNewAddressRadioOption;

    @FindBy(css = "input[name='firstname']")
    private WebElement firstNameMandatoryField;

    @FindBy(css = "input[name='lastname']")
    private WebElement lastNameMandatoryField;

    @FindBy(css = "input[name='address_1']")
    private WebElement address1MandatoryField;

    @FindBy(css = "input[name='city']")
    private WebElement cityMandatoryField;

    @FindBy(css = "select[name='country_id']")
    private WebElement countryMandatoryField;

    @FindBy(css = "input[name='zone_id']")
    private WebElement regionStateMandatoryField;

    @FindBy(xpath = "//div[@class='text-danger']")
    private WebElement warningMandatoryFirstNameFieldMessage; //First Name must be between 1 and 32 characters!

    @FindBy(xpath = "(//div[@class='text-danger'])[2]")
    private WebElement warningMandatoryLastNameFieldMessage; //First Name must be between 1 and 32 characters!

    @FindBy(xpath = "(//div[@class='text-danger'])[3]")
    private WebElement warningMandatoryAddressFieldMessage; //First Name must be between 1 and 32 characters!

    @FindBy(xpath = "(//div[@class='text-danger'])[4]")
    private WebElement warningMandatoryCityFieldMessage; //First Name must be between 1 and 32 characters!

    @FindBy(css = "textarea[name='comment']")
    private WebElement addCommentTextArea;

    @FindBy(css = "input[value='guest']")
    private WebElement guestCheckoutOption; //in the new customer section

    @FindBy(css = "input[value='register']")
    private WebElement registerAccountOption; //in the new customer section

    public WebElement getCheckoutButton() {
        return checkoutButton;
    }

    public WebElement getSearchBox() {
        return searchBox;
    }

    public WebElement getSearchButtonIcon() {
        return searchButtonIcon;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public WebElement getShoppingCartDisplayedInSuccessMsg() {
        return shoppingCartDisplayedInSuccessMsg;
    }

    public WebElement getCheckoutButtonInTheShoppingCartPage() {
        return checkoutButtonInTheShoppingCartPage;
    }

    public WebElement getCartButtonInBlackColor() {
        return CartButtonInBlackColor;
    }

    public WebElement getCheckoutOptionInDisplayedCartBlock() {
        return checkoutOptionInDisplayedCartBlock;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getCheckboxTermsAndConditions() {
        return checkboxTermsAndConditions;
    }

    public WebElement getConfirmOrderButton() {
        return confirmOrderButton;
    }

    public WebElement getWantToUseNewAddressRadioOption() {
        return wantToUseNewAddressRadioOption;
    }

    public WebElement getFirstNameMandatoryField() {
        return firstNameMandatoryField;
    }

    public WebElement getLastNameMandatoryField() {
        return lastNameMandatoryField;
    }

    public WebElement getAddress1MandatoryField() {
        return address1MandatoryField;
    }

    public WebElement getCityMandatoryField() {
        return cityMandatoryField;
    }

    public WebElement getCountryMandatoryField() {
        return countryMandatoryField;
    }

    public WebElement getRegionStateMandatoryField() {
        return regionStateMandatoryField;
    }

    public WebElement getWarningMandatoryFirstNameFieldMessage() {
        return warningMandatoryFirstNameFieldMessage;
    }

    public WebElement getWarningMandatoryLastNameFieldMessage() {
        return warningMandatoryLastNameFieldMessage;
    }

    public WebElement getWarningMandatoryAddressFieldMessage() {
        return warningMandatoryAddressFieldMessage;
    }

    public WebElement getWarningMandatoryCityFieldMessage() {
        return warningMandatoryCityFieldMessage;
    }

    public WebElement getAddCommentTextArea() {
        return addCommentTextArea;
    }

    public WebElement getGuestCheckoutOption() {
        return guestCheckoutOption;
    }

    public WebElement getRegisterAccountOption() {
        return registerAccountOption;
    }
}
