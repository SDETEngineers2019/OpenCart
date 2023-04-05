package pages.ProductCompare;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductCompareWebElements {

    @FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement searchBox;

    @FindBy(xpath = "(//button[@type='button'])[4]")
    private WebElement searchBoxButton;

    @FindBy(xpath = "//img[@class='img-responsive']")// imac icon
    private WebElement imacProduct;

    @FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[1]")
    private WebElement compareProductButton;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement successMessage;

    @FindBy(xpath = "//button[@id='list-view']")
    private WebElement ListButton;

    @FindBy(xpath = "//a[text()='Product Compare (1)']")
    private WebElement productCompare1;

    @FindBy(xpath = "//button[@id='grid-view']")
    private WebElement gridButton;

    @FindBy(xpath = "//a[text()='Desktops']")
    private WebElement desktopButton;

    @FindBy(xpath = "//a[text()='Show All Desktops']")
    private WebElement showAllDesktop;

    @FindBy(xpath = "//a[text()='product comparison']")
    private WebElement productComparisonLink;

    @FindBy(xpath = "//a[text()='Product Compare (2)']")
    private WebElement productCompare2;

    @FindBy(xpath = "(//a[@class='list-group-item'])[1]") //_PC(0)
    private WebElement productCompare0;

    @FindBy(xpath = "//div[@class='pull-right']")
    private WebElement continueButton;

    @FindBy(xpath = "//div[@class='image']")//imac image
    private  WebElement imacImg;

    @FindBy(xpath = "//img[@class='img-responsive']")//iphone image
    private WebElement iphoneImg;

    @FindBy(xpath = "//img[@title='MacBook Air']")//macbook air image
    private WebElement macbookAirImg;

    @FindBy(xpath = "//img[@title='MacBook']")//macbook image
    private WebElement macbookImg;

    @FindBy(xpath = "//img[@title='MacBook Pro']")// macbook Pro image
    private WebElement macbookProImg;

    @FindBy(xpath = "//button[text()='Add to Cart']")
    private WebElement addToCartButton;

    @FindBy(xpath = "(//a[text()='Remove'])[1]")// remove for imac
    private  WebElement imacRemoveButton;

    @FindBy(xpath = "//*[@id=\"product-compare\"]/ul/li[2]/a")// product compare page link
    private WebElement productComparePageLink;





}
