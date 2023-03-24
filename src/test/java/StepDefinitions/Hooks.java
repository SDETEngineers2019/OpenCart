package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.BaseDriver;

public class Hooks {

    @Before // This method runs before every scenario
    public void beforeScenario(){
        System.out.println("Scenario has started");
    }

    @After // This method runs after every scenario
    public void afterScenario(Scenario scenario){

        if(scenario.isFailed()){

            final byte[] byteImage = ((TakesScreenshot)BaseDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(byteImage, "image/png", scenario.getName());

        }
        BaseDriver.quitDriver();
        System.out.println("Scenario has ended");
    }

//    @After // This method runs after every scenario
//    public void afterScenario(){
//        BaseDriver.quitDriver();
//
//        try {
//            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
