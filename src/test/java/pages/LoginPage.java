package pages;

import org.openqa.selenium.By;
import static helper.Utility.webDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class LoginPage {

    private final By inputUsername = By.id("user-name");
    private final By inputPassword = By.id("password");
    private final By buttonLogin = By.id("login-button");

    private final WebDriverWait wait;

    public LoginPage() {
        // Inisialisasi WebDriverWait sekali untuk digunakan di seluruh method
        this.wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    public void waitForUsernameField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputUsername));
    }

    public void waitForPasswordField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputPassword));
    }

    public void waitForLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonLogin));
    }

    public void setInputUsername(String username){
        waitForUsernameField();
        WebElement element = webDriver.findElement(inputUsername);
        element.clear();
        element.sendKeys(username);
    }

    public void setInputPassword(String password){
        waitForPasswordField();
        WebElement element = webDriver.findElement(inputPassword);
        element.clear();
        element.sendKeys(password);
    }

    public void clickLoginButton(){
        waitForLoginButton();
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
