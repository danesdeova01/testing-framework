package helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {

    public static WebDriver webDriver;


    //Membuka Google Chrome
    public static void startWebDriver(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().fullscreen();
        webDriver.get("https://www.saucedemo.com/");
    }

    //Menutup Chrome
    public static void quitDriver(){
        webDriver.quit();
    }
}
