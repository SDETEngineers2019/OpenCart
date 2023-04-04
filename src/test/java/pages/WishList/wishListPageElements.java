package pages.WishList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.MyMethods;

public class wishListPageElements extends MyMethods {

    public wishListPageElements() {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='search']")
    private WebElement searchBox;
    @FindBy(xpath = "(//button[@type='button'])[4]")
    private WebElement searchIcon;
    @FindBy(xpath = "//img[@class='img-responsive']")
    private WebElement product;
    @FindBy(xpath = "(//button[@data-original-title='Add to Wish List'])[2]")
    private WebElement wishListButtonInRelatedProduct;
    @FindBy(xpath = "//a[text()='wish list']")
    private WebElement wishListLinkInSuccessMessage;
    @FindBy(xpath = "//a[text()='Your Store']")
    private WebElement yourStoreLogo;
    @FindBy(xpath = "(//button[@data-original-title='Add to Wish List'])[1]")
    private WebElement wishListButtonInProduct;
    @FindBy(xpath = "//a[text()='Desktops']")
    private WebElement desktopsButton;
    @FindBy(xpath = "//a[text()='Show All Desktops']")
    private WebElement showAllButton;
    @FindBy(xpath = "(//a[@class='list-group-item'])[2]")
    private WebElement macInLeftSide;
    @FindBy(id = "wishlist-total")
    private WebElement wishListButtonOnHeader;
    @FindBy(xpath = "(//a[text()='Wish List'])[1]")
    private WebElement wishListOnRightColumn;
    @FindBy(xpath = "(//a[text()='Wish List'])[2]")
    private WebElement wishListOnFooter;
    @FindBy(xpath = "//a[text()='My Wish List']")
    private WebElement wishListOnBreadcrumb;
    @FindBy(xpath = "//div[@id='content']/p")
    private WebElement emptyMessage;
    @FindBy(xpath = "//a[text()='Continue']")
    private WebElement continueButton;
    @FindBy(xpath = "//a[@data-original-title='Remove']")
    private WebElement removeButton;
    @FindBy(xpath = "//button[@data-original-title='Add to Cart']")
    private WebElement addToCartButton;

    public WebElement getSearchBox() {
        return searchBox;
    }

    public WebElement getSearchIcon() {
        return searchIcon;
    }

    public WebElement getProduct() {
        return product;
    }

    public WebElement getWishListButtonInRelatedProduct() {
        return wishListButtonInRelatedProduct;
    }

    public WebElement getWishListLinkInSuccessMessage() {
        return wishListLinkInSuccessMessage;
    }

    public WebElement getYourStoreLogo() {
        return yourStoreLogo;
    }

    public WebElement getWishListButtonInProduct() {
        return wishListButtonInProduct;
    }

    public WebElement getDesktopsButton() {
        return desktopsButton;
    }

    public WebElement getShowAllButton() {
        return showAllButton;
    }

    public WebElement getMacInLeftSide() {
        return macInLeftSide;
    }

    public WebElement getWishListButtonOnHeader() {
        return wishListButtonOnHeader;
    }

    public WebElement getWishListOnRightColumn() {
        return wishListOnRightColumn;
    }

    public WebElement getWishListOnFooter() {
        return wishListOnFooter;
    }

    public WebElement getWishListOnBreadcrumb() {
        return wishListOnBreadcrumb;
    }

    public WebElement getEmptyMessage() {
        return emptyMessage;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getRemoveButton() {
        return removeButton;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }
}
