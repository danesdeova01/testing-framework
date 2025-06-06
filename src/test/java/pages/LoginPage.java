package pages;

import org.openqa.selenium.By;
import static helper.Utility.webDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class LoginPage {

    By inputUsername = By.id("user-name" );
    By inputPassword = By.id("password");
    By buttonLogin = By.id("login-button");

    public void waitForLoginPage() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputUsername));
    }
    public void setInputUsername(String username){
        waitForLoginPage();
        webDriver.findElement(inputUsername).clear();
        webDriver.findElement(inputUsername).sendKeys(username);
    }
    public void setInputPassword(String password){
        waitForLoginPage();
        webDriver.findElement(inputPassword).clear();
        webDriver.findElement(inputPassword).sendKeys(password);
    }
    public void clickLoginButton(){
        waitForLoginPage();
        webDriver.findElement(buttonLogin).click();
    }

    public boolean isPageDisplayed() {
        try {
            return webDriver.findElement(inputUsername).isDisplayed()
                    && webDriver.findElement(inputPassword).isDisplayed()
                    && webDriver.findElement(buttonLogin).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }


}


