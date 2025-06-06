package stepDefinitions;

import helper.Utility;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks {

    @BeforeAll
    public static void setDriver(){
        Utility.startWebDriver();
    }

    @AfterAll
    public static void quitDriver(){
        Utility.quitDriver();
    }
}
