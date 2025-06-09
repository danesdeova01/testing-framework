package helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.sound.midi.Soundbank;

public class Utility {

    public static WebDriver webDriver;



    @Before
    public static void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); //For CI CD running

        //Setup chromedriver via WebDriverManager
        WebDriverManager.chromedriver().setup();
        System.out.println("Intializing WebDriver...");
        webDriver = new ChromeDriver(options);
        System.out.println("WebDriver initialized successfully");

    }

    //Menutup Chrome
    public static void quitDriver(){
        webDriver.quit();
    }
}
