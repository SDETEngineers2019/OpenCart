package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.BaseDriver;

import java.io.IOException;

public class Hooks {

    @Before // This method runs before every scenario
    public void beforeScenario(){
        System.out.println("Scenario has started");
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
