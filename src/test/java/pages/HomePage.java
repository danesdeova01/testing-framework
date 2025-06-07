package pages;

import org.openqa.selenium.By;
import static helper.Utility.webDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage {

    private final By iconShoppingCart = By.id("shopping_cart_container");

    public boolean verifyPageIsDisplayed(WebDriverWait wait) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(iconShoppingCart));
            return webDriver.findElement(iconShoppingCart).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
