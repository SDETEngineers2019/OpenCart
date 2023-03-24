package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.time.Duration;

public class MyMethods {

    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(10));
    Robot robot;

    public void sendKeysMethod(WebElement element, String keys){
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(keys);
    }

    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickMethod(WebElement element){
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void verifyContainsText(WebElement element, String value){
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().contains(value));
    }

    public void verifyContainsStringText(String actualValue, String expectedValue){
        Assert.assertTrue(actualValue.contains(expectedValue));
    }

    public void verifyIsSelected(WebElement element){
        waitUntilVisible(element);
        Assert.assertTrue(element.isSelected(), "Test is failed");
    }

    public void isDisplayed(WebElement element){
        waitUntilVisible(element);
        Assert.assertTrue(element.isDisplayed());
    }
    public void verifyURL(String value){
        Assert.assertTrue(BaseDriver.getDriver().getCurrentUrl().contains(value));
    }

    public void verifyTitle(String value){
        Assert.assertTrue(BaseDriver.getDriver().getTitle().contains(value));
    }
}
