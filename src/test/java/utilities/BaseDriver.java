package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*"); // To solve the error with Chrome v111
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) { // if there is driver the quit
//            driver.quit();
            driver = null; // if there is not this line then failed coz after quit driver must be null again to open
        }
    }
}
