package pages.Search;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class SearchBoxPageElements {

    public SearchBoxPageElements() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='text']") //top of the page
    private WebElement searchBox;
    @FindBy(xpath = "//*[@class='input-group-btn']")//when you input a text click on search button
    private WebElement searchBoxButton;
    @FindBy(id = "input-search")// Search criteria field
    private WebElement searchKeywordInput;

    @FindBy(id = "button-search")//When you select and fill input box ,you click on Search button.
    private WebElement searchKeywordButton;

    @FindBy(id = "list-view") // icon under Search header
    private WebElement listItemsIcon;
    @FindBy(id = "grid-view") //Grid Icon next to list icon
    private WebElement gridItemIcon;
    @FindBy(xpath = "//select[@name='category_id']") //Categories fom search (Select class should be created.)
    private WebElement categoriesDropDown;
    @FindBy(xpath = "//a[text()='Search']")
    private WebElement searchBreadCrumb;

    @FindBy(css = "body:nth-child(2) div.container:nth-child(4) div.row div.col-sm-12 > p:nth-child(7)")
    private WebElement yourShoppingCartIsEmptyMessage;


    public WebElement getYourShoppingCartIsEmptyMessage(){
        return yourShoppingCartIsEmptyMessage;
    }

    public WebElement getSearchBox() {
        return searchBox;
    }

    public WebElement getSearchBoxButton() {
        return searchBoxButton;
    }

    public WebElement getSearchKeywordInput() {
        return searchKeywordInput;
    }

    public WebElement getSearchKeywordButton() {
        return searchKeywordButton;
    }

    public WebElement getListItemsIcon() {
        return listItemsIcon;
    }

    public WebElement getGridItemIcon() {
        return gridItemIcon;
    }

    public WebElement getCategoriesDropDown() {
        return categoriesDropDown;
    }

    public WebElement getSearchBreadCrumb() {
        return searchBreadCrumb;
    }
}

