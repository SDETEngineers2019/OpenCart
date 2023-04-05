package pages.AddToCart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.MyMethods;

public class AddToCartPageElements extends MyMethods {
    public AddToCartPageElements() {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }
//    search box element can be called from SearchBoxPageElements class

    @FindBy(xpath = "//input[@name='search']") // search box at home page when logged in
    private WebElement searchBox;

    @FindBy(xpath = "(//button[@type='button'])[4]") // search icon at home page when logged in
    private WebElement searchIcon;

    @FindBy(xpath = "//a[text()='iMac']")   // the product displayed when iMac is searched for in the search box at homepage
    private WebElement searchProductIMac;

    @FindBy(xpath = "//button[text()=\"Add to Cart\"]") // add to cart button in the displayed 'Product Display' page
    private WebElement AddToCartButtonInDisplayedProductPage;

    @FindBy(css = "div[class=\"alert alert-success alert-dismissible\"]")   // success message displayed when the product is added to the cart
    private WebElement successMessageForAddToCartButton;

    @FindBy(xpath = "//a[text()=\"shopping cart\"]")    // shopping cart link in the success message
    private WebElement shoppingCartLinkInSuccessMessage;

    @FindBy(xpath = "(//img[@class='img-thumbnail'])[2]")    // image Of the product added to the cart
    private WebElement imageOfProductAddedToCart;

    @FindBy(xpath = "//span[text()='Wish List (1)']")    // wish list header option at home page when logged in
    private WebElement wishListHeaderOption;

    @FindBy(xpath = "(//button[@type=\"button\"])[7]")    // add to cart icon option in the displayed My Wish List page
    private WebElement addToCartIconOnMyWishListPage;

    @FindBy(xpath = "//span[text()='Shopping Cart']")    // shopping cart header option at home page when logged in
    private WebElement shoppingCartHeaderOption;

    @FindBy(xpath = "//span[text()='Add to Cart']") // add to cart button in the search results page
    private WebElement AddToCartButtonInSearchResults;

    @FindBy(css = "button[data-loading-text='Loading...']") // it is the cart button in black color beside the search icon button
    private WebElement CartButtonInBlackColor;

    @FindBy(xpath = "//strong[contains(.,'View Cart') and .//i[contains(@class,'fa-shopping-cart')]]") //  view cart option in the displayed box
    private WebElement viewCartOptionInDisplayedBox;

    public WebElement getSearchBox() {
        return searchBox;
    }

    public WebElement getSearchIcon() {
        return searchIcon;
    }

    public WebElement getSearchProductIMac() {
        return searchProductIMac;
    }

    public WebElement getAddToCartButtonInDisplayedProductPage() {
        return AddToCartButtonInDisplayedProductPage;
    }

    public WebElement getSuccessMessageForAddToCartButton() {
        return successMessageForAddToCartButton;
    }

    public WebElement getShoppingCartLinkInSuccessMessage() {
        return shoppingCartLinkInSuccessMessage;
    }

    public WebElement getImageOfProductAddedToCart() {
        return imageOfProductAddedToCart;
    }

    public WebElement getWishListHeaderOption() {
        return wishListHeaderOption;
    }

    public WebElement getAddToCartIconOnMyWishListPage() {
        return addToCartIconOnMyWishListPage;
    }

    public WebElement getShoppingCartHeaderOption() {
        return shoppingCartHeaderOption;
    }

    public WebElement getAddToCartButtonInSearchResults() {
        return AddToCartButtonInSearchResults;
    }

    public WebElement getCartButtonInBlackColor() {
        return CartButtonInBlackColor;
    }

    public WebElement getViewCartOptionInDisplayedBox() {
        return viewCartOptionInDisplayedBox;
    }
}
