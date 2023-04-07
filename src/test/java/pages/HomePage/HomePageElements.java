package pages.HomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.MyMethods;

public class HomePageElements extends MyMethods {

    public HomePageElements() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }


    /*** Elements here. Let's not mix getters and elements.**/

    @FindBy(css = "input[name='search']")
    private WebElement searchBox;

    @FindBy(css = "div.container div.row div.col-sm-5 div.input-group span.input-group-btn > button.btn.btn-default.btn-lg")
    private WebElement searchButton;

    @FindBy(css = "div[id='cart']")
    private WebElement cartButton;

    @FindBy(xpath = "//span[text()='Checkout']")
    private WebElement checkoutButton;

    @FindBy(xpath = "//span[text()='Shopping Cart']")
    private WebElement shoppingCartButton;

    @FindBy(xpath = "//span[text()='Wish List (0)']")
    private WebElement wishListButton;

    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = "//a[@href='http://opencart.abstracta.us:80/index.php?route=information/information&amp;information_id=4']")
    private WebElement aboutUsLink;

    @FindBy(xpath = "//a[@href='http://opencart.abstracta.us:80/index.php?route=information/information&amp;information_id=6']")
    private WebElement deliveryInfoLink;

    @FindBy(xpath = "//a[@href='http://opencart.abstracta.us:80/index.php?route=information/information&amp;information_id=3']")
    private WebElement privacyPolicyLink;

    @FindBy(xpath = "//a[@href='http://opencart.abstracta.us:80/index.php?route=information/information&amp;information_id=5']")
    private WebElement termsAndConditionsLink;

    @FindBy(xpath = "//a[@href='http://opencart.abstracta.us:80/index.php?route=information/contact']")
    private WebElement contactUsLink;

    @FindBy(xpath = "//a[@href='https://opencart.abstracta.us:443/index.php?route=account/return/add']")
    private WebElement returnsLink;

    @FindBy(xpath = "//a[@href='http://opencart.abstracta.us:80/index.php?route=information/sitemap']")
    private WebElement siteMapLink;

    @FindBy(xpath = "//a[@href='http://opencart.abstracta.us:80/index.php?route=product/manufacturer']")
    private WebElement brandsLink;

    @FindBy(xpath = "//a[@href='https://opencart.abstracta.us:443/index.php?route=account/voucher']")
    private WebElement giftCertificatesLink;

    @FindBy(xpath = "//a[@href='https://opencart.abstracta.us:443/index.php?route=affiliate/login']")
    private WebElement affiliateLink;

    @FindBy(xpath = "//a[@href='http://opencart.abstracta.us:80/index.php?route=product/special']")
    private WebElement specialsLink;

    @FindBy(xpath = "//a[@href='https://opencart.abstracta.us:443/index.php?route=account/account']")
    private WebElement myAccountLink;

    @FindBy(xpath = "//a[@href='https://opencart.abstracta.us:443/index.php?route=account/order']")
    private WebElement orderHistoryLink;

    @FindBy(xpath = "//a[@href='https://opencart.abstracta.us:443/index.php?route=account/wishlist']")
    private WebElement wishlistLink;

    @FindBy(xpath = "//a[@href='https://opencart.abstracta.us:443/index.php?route=account/newsletter']")
    private WebElement newsletterLink;

    @FindBy(xpath = "//span[text()='Currency']")
    private WebElement currencyLabel;


    /** Getters here**/

    public WebElement getSearchBox() {
        return searchBox;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getCartButton() {
        return cartButton;
    }

    public WebElement getCheckoutButton() {
        return checkoutButton;
    }

    public WebElement getShoppingCartButton() {
        return shoppingCartButton;
    }

    public WebElement getWishListButton() {
        return wishListButton;
    }

    public WebElement getMyAccountButton() {
        return myAccountButton;
    }

    public WebElement getAboutUsLink() {
        return aboutUsLink;
    }

    public WebElement getDeliveryInfoLink() {
        return deliveryInfoLink;
    }

    public WebElement getPrivacyPolicyLink() {
        return privacyPolicyLink;
    }

    public WebElement getTermsAndConditionsLink() {
        return termsAndConditionsLink;
    }

    public WebElement getContactUsLink() {
        return contactUsLink;
    }

    public WebElement getReturnsLink() {
        return returnsLink;
    }

    public WebElement getSiteMapLink() {
        return siteMapLink;
    }

    public WebElement getBrandsLink() {
        return brandsLink;
    }

    public WebElement getGiftCertificatesLink() {
        return giftCertificatesLink;
    }

    public WebElement getAffiliateLink() {
        return affiliateLink;
    }

    public WebElement getSpecialsLink() {
        return specialsLink;
    }

    public WebElement getMyAccountLink() {
        return myAccountLink;
    }

    public WebElement getOrderHistoryLink() {
        return orderHistoryLink;
    }

    public WebElement getWishlistLink() {
        return wishlistLink;
    }

    public WebElement getNewsletterLink() {
        return newsletterLink;
    }

    public WebElement getCurrencyLabel() {
        return currencyLabel;
    }

}
