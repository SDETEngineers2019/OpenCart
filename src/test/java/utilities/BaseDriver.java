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
            WebDriverManager.chromedriver().setup();
            ChromeOptions opt = new ChromeOptions();
            opt.addArguments("--remote-allow-origins=*");
            opt.setBinary("C:/Program Files/BraveSoftware/Brave-Browser/Application/brave.exe");
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
            driver = new ChromeDriver(opt);
        }
        driver.manage().window().maximize();

        return driver;
    }

    public static void quitDriver() {
        if (driver != null) { // if there is driver the quit
//            driver.quit();
            driver = null; // if there is not this line then failed coz after quit driver must be null again to open
        }
    }
}
