package stepDefinitions;

import helper.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public static void setDriver(){
        Utility.setUp();
    }

    @After
    public static void quitDriver(){
        Utility.quitDriver();
    }
}
